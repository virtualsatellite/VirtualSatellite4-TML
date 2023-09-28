/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.TMLGenerator
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Channel
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment
import de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.TimeEventImpl
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper
import org.eclipse.core.runtime.Status
import org.eclipse.ui.statushandlers.StatusAdapter
import org.eclipse.ui.statushandlers.StatusManager

class CppEnvironmentTemplate extends AbstractTaskingTemplate {

	protected TaskingEnvironment taskingEnvironment;
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.instance
	
	new(TaskingEnvironment taskingEnvironment) {
		this.taskingEnvironment = taskingEnvironment;
		if (!taskingEnvironmentHelper.isInitilaized) {
			taskingEnvironmentHelper.init(taskingEnvironment)
		}
		initIncludes;
	}

	protected def void initIncludes() {
		taskingEnvironment.tasks.forEach [ task |
			addIncludes('"' + getElementName(task.typeOf) + '.h"')
		];
		taskingEnvironmentHelper.dataTypes.forEach[dt| addIncludes('"' + getElementName(dt) + '.h"')];
		taskingEnvironmentHelper.enumerations.forEach[dt| addIncludes('"' + getElementName(dt) + '.h"')];
		taskingEnvironmentHelper.channelBehaviorDefinitions.forEach[ch| addIncludes('"' + getElementName(ch) + '.h"')
		];
	}

	protected def getTaskInputName(String taskName, String inputName) {
		return taskName + "Input_" + inputName;
	}

	protected def getTaskParameterName(String taskName) {
		return "parameters" + getClassName(taskName);
	}

	protected def getChannelSize(Channel channel) {
		val behaviorParameters = channel.channelBehavior.parameterInstances;
		val hasSize = channelHasSize(channel.channelBehavior.typeOf);
		if (hasSize) {
			val sizeParameter = behaviorParameters.findFirst[p|p.typeOf.name.compareToIgnoreCase("size") === 0];
			/*TODO: Solve the problem of uninitialized size parameter for channels. 
			 * user should get warning if no value for size parameter in model is given.*/
			if (sizeParameter !== null) {
				if (sizeParameter.value === null) {
					return getDefaultChannelSize(channel);
				} else {
					return Integer.parseInt(sizeParameter.value);
				}
			} else {
				return getDefaultChannelSize(channel);
			}
		}
		return -1
	}

	protected def getDefaultChannelSize(Channel channel) {
		var defaultSize = 10;
		val sizeParameterDef = channel.channelBehavior.typeOf.parameters.findFirst [ p |
			p.name.compareToIgnoreCase("size") === 0
		];
		if (sizeParameterDef.value === null) {
			var status = new Status(Status.ERROR, TMLGenerator.GENERATION_EXTENSION_ID,
				"CppEnvironmentTemplate: Channel parameter " + channel.name +
					" has no specified value or default value");
			StatusManager.manager.handle( new StatusAdapter(status), StatusManager.LOG.bitwiseOr(StatusManager.SHOW));
		}
		defaultSize = Integer.parseInt(sizeParameterDef.value);
		System.err.println("Size parameter for channel (" + channel.name + ") not defined in model.");
		System.err.println("Continuing with default value: " + defaultSize.toString());
		return defaultSize;
	}

	protected def getTaskConstructorArgs(TaskInstance task) {
		var str = "";
		str = str + "&" + getTaskParameterName(task.name);
		if (!task.outputs.isNullOrEmpty) {
			str += ",";
			for (output : task.outputs) {
				for (channel : output.channels) {
					str = str + "&" + channel.name + ",";
				}
			}
		}
		if (str.endsWith(",")) {
			str = str.substring(0, str.length - 1);
		}
		return str;
	}

	// TaskChannels
	def declareChannels() '''
		«FOR channel : taskingEnvironment.channels»
			«val ch_size = getChannelSize(channel)»
			«IF ch_size > 0»
				«getElementName(channel.channelBehavior.typeOf)»<«getElementName(channel.dataType)», «ch_size»> «channel.name»;
			«ELSE»
				«getElementName(channel.channelBehavior.typeOf)»<«getElementName(channel.dataType)»> «channel.name»;
			«ENDIF»
		«ENDFOR»
	'''

	// Time-Events
	def declareTaskEvents() '''
		«FOR trigger : taskingEnvironment.timeEvents»
			Tasking::TaskEvent «trigger.name»;
		«ENDFOR»
	'''

	// The tasks
	def declareTasks() '''
		«FOR task : taskingEnvironment.tasks»
			«getElementName(task.typeOf)» «task.name»;
		«ENDFOR»
	'''

	def declareTaskParameters() '''
		«FOR task : taskingEnvironment.tasks»
			«getAbstractName(task.typeOf.name)»::Parameters «getTaskParameterName(task.name)»;
		«ENDFOR»
	'''

	// The Task Inputs
	def declareTaskInputs() '''
		«FOR task : taskingEnvironment.tasks»
			«FOR input : task.inputs»
				Tasking::TaskInput «getTaskInputName(task.name, input.name)»;
			«ENDFOR»
		«ENDFOR»
	'''

	def assignTaskInputs() '''
		«FOR task : taskingEnvironment.tasks»
			«FOR input : task.inputs»
				«getTaskInputName(task.name, input.name)»(«input.activationThreshold», «input.isFinal»),
			«ENDFOR»
		«ENDFOR»
	'''

	def getChannelName(String inputName) {
		for (channel : taskingEnvironment.channels) {
			for (input : channel.inputs) {
				if (inputName.equals(input.name)) {
					return channel.name;
				}
			}
		}
		return "";
	}

	def getTimeEventName(String inputName) {
		for (timeevent : taskingEnvironment.timeEvents) {
			for (input : timeevent.inputs) {
				if (inputName.equals(input.name)) {
					return timeevent.name;
				}
			}
		}
		return "";
	}

	def associateChannelsToTaskInputs() '''
		«FOR task : taskingEnvironment.tasks»
			«FOR input : task.inputs»
				«IF input.trigger instanceof TimeEventImpl»
					«getTaskInputName(task.name, input.name)».associate(&«getTimeEventName(input.name)»);
				«ELSE»
					«getTaskInputName(task.name, input.name)».associate(&«getChannelName(input.name)»);
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
	'''

	def addTaskInputsIntoTask() '''
		«FOR task : taskingEnvironment.tasks»
			«FOR input : task.inputs»
				«task.name».add(«getAbstractName(task.typeOf.name)»::«getInputKeyName(input.typeOf.name)», &«getTaskInputName(task.name, input.name)»);
			«ENDFOR»
		«ENDFOR»
	'''

	def initChannelInstances() '''
		«FOR channel : taskingEnvironment.channels»
			«channel.name»(«FOR param : channel.channelBehavior.parameterInstances SEPARATOR ", "»«param.value»«ENDFOR»),
		«ENDFOR»
	'''

	override compileAbstractHeader() '''
			«getGenerationAbstractHeaderDescription("CppEnvironmentTemplate.xtend")»
		
			#ifndef «getConstantsName(getAbstractName(taskingEnvironment.name))»_H_
			#define «getConstantsName(getAbstractName(taskingEnvironment.name))»_H_
		
				
			#include <stdlib.h>
			#include <unistd.h>
			#include <iostream>
			#include <time.h>
			
			#include "tasking.h"
			#include "task.h"
			#include "taskEvent.h"
			#include "taskInput.h"
			
			«getIncludes»
			«IF gcp.useLibconfig»
				#include "«gcp.configurationLoaderClassName».h"
			«ENDIF»
			namespace «gcp.projectName» {
			
			  using namespace DataTypes;
			  
			  class «getAbstractName(taskingEnvironment.name)» {
			  protected:
			
			    //The Modules
			    «declareTasks»
			
			    //The Channels
			    «declareChannels»
			
				//The TaskEvents
				«declareTaskEvents»
				   
				   //The TaskInputs
				   «declareTaskInputs»
			
			    //The Task Parameters
			    «declareTaskParameters»
			    
			    //Configure the start configuration in the concrete class
			    virtual void setStartConfiguration()=0;
			    
			    //Intialize Messages
			    virtual void initMessages()=0;
			    
			    //Init software
			    void init«gcp.projectName»();
			    
			    //Start Execution
			    void start«gcp.projectName»();
			
			  public:
			    /**
			     * Constructor to set initial parameters from s-function
			     * The parameters are for the Navigation filter (see ICD)
			     *
			     * @param diagQ
			     * @param diagRchi0
			     * @param deltaRchi
			     * @param diagRth
			     * @param R_c2b
			     * @param R_i2m
			     * @param dt
			     * @param simStartTime
			     * @param x0
			     * @param p0
			     */
			    «getAbstractName(taskingEnvironment.name)»(«IF gcp.useLibconfig»const char * configFile«ENDIF»);
			    virtual~«getAbstractName(taskingEnvironment.name)»(void);
			   
			   //Telecommand 
			   void tcReset«gcp.projectName»();
			   		
			    /**
			     * Called when software is stopped.
			     */
			    virtual void terminate(void);
			
			#ifdef PLAY_BACK
			    /// Manager for sleep time
			    // ATON::TimeManager timeManager;
			#endif
					
			
			
			  }; /* End of «getAbstractName(taskingEnvironment.name)» */
			}/* namespace «gcp.projectName» */
			#endif /* «getConstantsName(getAbstractName(taskingEnvironment.name))»_H_ */
	'''

	override compileAbstractSource() '''
		
			«getGenerationAbstractSourceDescription("CppEnvironmentTemplate.xtend")»
		
			
			#include "stdlib.h"
			#include <sstream>
			#include "«getAbstractName(taskingEnvironment.name)».h"
		
			#ifdef TIMESTOP_TASKING
			#include "TimeStop.h"
			#endif
			
			#define WAIT_FOR_EXECUTION
			
			«gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::«getAbstractName(taskingEnvironment.name)»(«IF gcp.useLibconfig»const char * configFile«ENDIF») :
			
			// Modules
			«FOR task : taskingEnvironment.tasks»
				«task.name»(«getTaskConstructorArgs(task)»),
				«ENDFOR»
				
				// Channels
				«FOR channel : taskingEnvironment.channels»
					«channel.name»(«FOR param : channel.channelBehavior.parameterInstances SEPARATOR ", "»«param.value»«ENDFOR»),
				«ENDFOR»
				
				//TaskEvents
				«FOR trigger : taskingEnvironment.timeEvents»
					«trigger.name»(),
				«ENDFOR»
		
			// TaskInputs
			«assignTaskInputs.removeLastChar»
			{
				//Set timing in TaskEvents
				«FOR trigger : taskingEnvironment.timeEvents»
					«trigger.name».setTiming(«trigger.period», «trigger.offset»);
				«ENDFOR»
				
				//Associate channels to TaskInputs
				«associateChannelsToTaskInputs»
				
				//Add TaskInputs to Tasks
				«addTaskInputsIntoTask»
				
				«IF gcp.useLibconfig»
					//Load Parameters
					«gcp.configurationLoaderClassName.className» configurationLoader;
					configurationLoader.loadFile(configFile);
					«FOR task : taskingEnvironment.tasks»
						configurationLoader.getParameters(«task.name.getTaskParameterName», "«task.name.className»");
					«ENDFOR»
				«ENDIF»
			}
			
			// Destructor
			«gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::~«getAbstractName(taskingEnvironment.name)»(void) {
				
			}
			
			// Init Software
			void «gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::init«gcp.projectName»() {
				std::cout << "«gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::init\n" << std::endl;
				Tasking::initialize();
				
				//Init modules
				«FOR task : taskingEnvironment.tasks»
					«IF task.typeOf.inputs.isNullOrEmpty»
						«task.name».initialize();
					«ENDIF»
				«ENDFOR»
			}
			
			// Start Software
			void «gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::start«gcp.projectName»() {
				Tasking::reset();
				Tasking::start();
				
				//Start modules..
			}
			
			// Terminate Software
			void «gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::terminate(void){
				std::cout << "«gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::terminate\n" << std::endl;
			
				//Terminate all modules
				
				//Terminate all tasks
				Tasking::terminate();
				«FOR task : taskingEnvironment.tasks»
					«task.name».terminate();
				«ENDFOR»
			#ifdef TIMESTOP_TASKING
				TimeStop::writeFile();
			#endif
			}
			
		'''

	override compileHeader() '''
		
			«getGenerationHeaderDescription("CppEnvironmentTemplate.xtend")»
		
			#ifndef «getConstantsName(taskingEnvironment.name)»_H_
			#define «getConstantsName(taskingEnvironment.name)»_H_
			
			
			#include "«getAbstractName(taskingEnvironment.name)».h"
						
			namespace «gcp.projectName»{
			
				class «taskingEnvironment.name» : public «getAbstractName(taskingEnvironment.name)»{
					
					private:
						void setStartConfiguration();
						
						void initMessages();
					
					public:
						«taskingEnvironment.name»(«IF gcp.useLibconfig»const char * configFile«ENDIF»);
						virtual ~«taskingEnvironment.name»();
						void configureStep(const double time);
						void start();
						void init();
					
				};
			}	
			#endif /* «getConstantsName(taskingEnvironment.name)»_H_ */	
	'''

	override compileSource() '''
		«getGenerationHeaderDescription("CppEnvironmentTemplate.xtend")»
		
		#include "«taskingEnvironment.name».h"
		
		
		«gcp.projectName»::«taskingEnvironment.name»::«taskingEnvironment.name»(«IF gcp.useLibconfig»const char * configFile«ENDIF») : «getAbstractName(taskingEnvironment.name)»(«IF gcp.useLibconfig»configFile«ENDIF») {
			setStartConfiguration();
		}
		
		«gcp.projectName»::«taskingEnvironment.name»::~«taskingEnvironment.name»(){
			//terminate();
		}
		
		void «gcp.projectName»::«taskingEnvironment.name»::init(){
			//Prepare scheular for execution
			init«gcp.projectName»();
			initMessages();
			
			//Do custom init here (if needed)
		}
		
		void «gcp.projectName»::«taskingEnvironment.name»::start(){
			//Start schedular
			start«gcp.projectName»();
			
			//Do custom start here (if needed)
		}
		
		
		void «gcp.projectName»::«taskingEnvironment.name»::setStartConfiguration(void) {
			
		}
		
		void «gcp.projectName»::«taskingEnvironment.name»::initMessages(void) {
			
		}
	'''
}
