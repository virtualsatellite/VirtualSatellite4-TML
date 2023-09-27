/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking3.source.cpp

import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppEnvironmentTemplate
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInstance
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment

class CppTasking3EnvironmentTemplate extends CppEnvironmentTemplate {

	protected final String SCHEDULER_NAME = "scheduler"
	
	new(TaskingEnvironment taskingEnvironment) {
		super(taskingEnvironment)
	}
	
	override getTaskConstructorArgs(TaskInstance task){
		var str = "";
		str += "&"+getTaskParameterName(task.name);
		str += ', '
		str += SCHEDULER_NAME;
		if(task.typeOf.schedulePolicy == EnumSchedulePolicy::PRIORITY){
			str += ", "+task.priority
		}
		if(!task.outputs.isNullOrEmpty){
			str += ", ";
			for(output : task.outputs){
				for(channel : output.channels) {
					str = str + "&" + channel.name + ",";
				}
			}
		}
		if(str.endsWith(",")){
			str = str.substring(0, str.length-1);
		}
		return str;
	}
	

	// The tasks
	override declareTasks() '''
		«FOR task : taskingEnvironment.tasks»
			«getElementName(task.typeOf)» «task.name»;
		«ENDFOR»
	'''

		
	override addTaskInputsIntoTask()'''
		«FOR task : taskingEnvironment.tasks»
			«FOR input : task.inputs»
				«task.name».configureInput(«getAbstractName(task.typeOf.name)»::«getInputKeyName(input.typeOf.name)», «input.trigger.name»);
			«ENDFOR»
		«ENDFOR»
	'''
	
	override assignTaskInputs() '''
		«FOR task : taskingEnvironment.tasks»
			«FOR input : task.inputs»
				«task.name».getInput(«getInputKeyName(input.name)»).configure(«input.activationThreshold», «input.isFinal»);
			«ENDFOR»
		«ENDFOR»
	'''
	
	def getPolicyString(){
		switch (taskingEnvironment.schedularPolicy) {
			case FIFO: {
				return "Tasking::SchedulePolicyFifo"
			}
			case LIFO: {
				return "Tasking::SchedulePolicyLifo"
			}
			case PRIORITY: {
				return "Tasking::SchedulePolicyPriority"
			}
			default: {
				return "!no supported policy!"
			}
		}
		
	}
		

	override compileAbstractHeader() '''
		«getGenerationAbstractHeaderDescription("CppTasking3EnvironmentTemplate.xtend")»
	
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
		
			//Schedular
			Tasking::SchedulerProvider<«taskingEnvironment.numberOfExecutors», «getPolicyString»> «SCHEDULER_NAME»;
		
		    //The Modules
		    «declareTasks»
		
		    //The Channels
		    «declareChannels»
		
			//The TaskEvents
			«declareTaskEvents»
		
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

	
	override compileAbstractSource()'''
	
		«getGenerationAbstractSourceDescription("CppTasking3EnvironmentTemplate.xtend")»
	
		
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
			«FOR trigger : taskingEnvironment.timeEvents SEPARATOR ','»
				«trigger.name»(«SCHEDULER_NAME»)
			«ENDFOR»

		{
			//Set timing in TaskEvents
			«FOR trigger : taskingEnvironment.timeEvents»
				«trigger.name».setTiming(«trigger.period», «trigger.offset»);
			«ENDFOR»
			
			//Add TaskInputs to Tasks
			«addTaskInputsIntoTask»
			
			// TaskInputs
			«assignTaskInputs»
			
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
			
			//Init modules
			«FOR task : taskingEnvironment.tasks»
				«IF !task.typeOf.inputs.isNullOrEmpty»
					«task.name».initialize();
				«ENDIF»
			«ENDFOR»
		}
		
		// Start Software
		void «gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::start«gcp.projectName»() {
			
			«SCHEDULER_NAME».start(true);
			
			//Start modules..
		}
		
		// Terminate Software
		void «gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::terminate(void){
			std::cout << "«gcp.projectName»::«getAbstractName(taskingEnvironment.name)»::terminate\n" << std::endl;
		
			//Terminate all modules
			
			//Terminate all tasks
			«SCHEDULER_NAME».terminate();
			«FOR task : taskingEnvironment.tasks»
				«task.name».terminate();
			«ENDFOR»
		#ifdef TIMESTOP_TASKING
			TimeStop::writeFile();
		#endif
		}
		
	'''

	override compileHeader() '''
	
		«getGenerationHeaderDescription("CppTasking3EnvironmentTemplate.xtend")»
	
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
		«getGenerationHeaderDescription("CppTasking3EnvironmentTemplate.xtend")»
		
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
	