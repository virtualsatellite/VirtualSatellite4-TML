/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking3.source.cpp

import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppTaskDefinitionTemplate
import de.dlr.sc.virsat.model.ext.tml.structural.structural.EnumSchedulePolicy
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment

class CppTasking3TaskDefinitionTemplate extends CppTaskDefinitionTemplate {

	new(TaskingEnvironment taskingEnvironment, TaskDefinition taskDefinition) {
		super(taskingEnvironment, taskDefinition)
	}

	protected final String SCHEDULER_PARAM_NAME = "scheduler"
	protected final String PRIORITY_PARAM_NAME = "priority"
	
	override getConstructorArgs()'''
				«getAbstractName(taskDefinition.name)»::Parameters* arg_parameters,
				Tasking::Scheduler& «SCHEDULER_PARAM_NAME»,
				«IF taskDefinition.schedulePolicy == EnumSchedulePolicy::PRIORITY»unsigned int «PRIORITY_PARAM_NAME»,«ENDIF»
					«FOR output : taskDefinition.outputs»
					«gcp.abstractChannelClassName»<«output.dataType.name»>* arg_ch«getClassName(output.name)»,
					«ENDFOR»
		'''
		
	override getConstrutorArgs_superClass()'''
			arg_parameters,«FOR output : taskDefinition.outputs»arg_ch«getClassName(output.name)»,«ENDFOR»
		'''
		
	def getPolicyString(){
		switch (taskDefinition.schedulePolicy) {
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
			«getGenerationAbstractHeaderDescription("CppTasking3TaskDefinitionTemplate.xtend")»
			
			#ifndef «getConstantsName(getAbstractName(taskDefinition.name))»_H_
			#define «getConstantsName(getAbstractName(taskDefinition.name))»_H_
			
			#include <stdlib.h>
			#include <iostream>
			#include <mutex>
			
			#include "task.h"
			#include "taskInput.h"
			#include "«gcp.abstractChannelClassName».h"
			
			«getIncludes»
			
			namespace «gcp.projectName» {
				using namespace DataTypes; 
					
				class «getAbstractName(taskDefinition.name)»«IF isTask»: public Tasking::TaskProvider<«taskDefinition.inputs.size()», Tasking::«getPolicyString»>«ENDIF» {
				public:
				
				«var key = 0»
				« FOR input : taskDefinition.inputs »
					static const unsigned int «getInputKeyName(input.name)» = «key++»;
				«ENDFOR»
				
				«IF !taskDefinition.inputs.nullOrEmpty»
					class Inputs{
						public:
							«FOR input : taskDefinition.taskInputsWithDataType»
								«input.dataType.name» *«input.name»;
							«ENDFOR»
							Inputs() {}; 
					};
				«ENDIF»
				
				class Outputs{
					public:
						unsigned int errorCode; 
						« FOR output : taskDefinition.outputs »
							«getClassName(output.dataType.name)» *«getObjectName(output.name)»;
						«ENDFOR»
						Outputs():errorCode(0){}; 
				};
				
				class Parameters{
					public:
						«IF !taskingEnvironment.globalParameters.isNullOrEmpty»
							//Global parameters...
							«getAttributesDeclaration(taskingEnvironment.globalParameters, false)»
						«ENDIF»
						«IF !taskDefinition.parameters.isNullOrEmpty»//Local parameters...
							«getAttributesDeclaration(taskDefinition.parameters, false)»
						«ENDIF»
						Parameters() {}; 
				};
				«getAbstractName(taskDefinition.name)»(«getConstructorArgs.removeLastChar»);
				
				virtual ~«getAbstractName(taskDefinition.name)»();
				void initialize();
				virtual void init(Parameters *parameters) = 0; 
				virtual void execute(void) = 0;
				virtual void terminate(void) = 0;
				   «IF isTask»
				   	virtual void output(const Inputs &inputs, Outputs &outputs) = 0;
				   	virtual void update(const Inputs &inputs) = 0;
				«ENDIF»
				Tasking::TaskInput getInput(unsigned int);
				
				protected:
					«IF !taskDefinition.taskInputsWithDataType.isNullOrEmpty»				
						//Input channels..
						« FOR input : taskDefinition.taskInputsWithDataType »
							«gcp.abstractChannelClassName»<«input.dataType.name»>* input_ch«getClassName(input.name)»;
						«ENDFOR»
					«ENDIF»
					«IF !taskDefinition.outputs.isNullOrEmpty»
						
						//Ouput channels..
						« FOR output : taskDefinition.outputs »
							«gcp.abstractChannelClassName»<«output.dataType.name»>* output_ch«getClassName(output.name)»;
						«ENDFOR»
					«ENDIF»
					
					Parameters* parameters;
					«IF !taskDefinition.taskInputsWithDataType.nullOrEmpty»
						Inputs inputs;
					«ENDIF»
					Outputs outputs;
					
					std::mutex mutex_«getAbstractName(taskDefinition.name)»;
				};
			
			} // namespace ATON
			#endif /* «getConstantsName(getAbstractName(taskDefinition.name))»_H_ */
		'''

	override compileAbstractSource()'''
			«getGenerationAbstractHeaderDescription("CppTasking3TaskDefinitionTemplate.xtend")»
			 
			#include "«getAbstractName(taskDefinition.name)».h"
			
			«gcp.projectName»::«getAbstractName(taskDefinition.name)»::«getAbstractName(taskDefinition.name)»(«getConstructorArgs.removeLastChar») :
				«IF isTask()»
					Tasking::TaskProvider(«SCHEDULER_PARAM_NAME», «IF taskDefinition.schedulePolicy == EnumSchedulePolicy::PRIORITY»Tasking::SchedulePolicyPriority::Settings(«PRIORITY_PARAM_NAME»)«ENDIF»),
				«ENDIF»
				«IF !taskDefinition.taskInputsWithDataType.isNullOrEmpty»
					//Input channels..
					«FOR input : taskDefinition.taskInputsWithDataType»
						input_ch«getClassName(input.name)»(NULL),
					«ENDFOR»
				«ENDIF»
				«IF !taskDefinition.outputs.isNullOrEmpty »
					//Ouput channels..
					« FOR output : taskDefinition.outputs »
						output_ch«getClassName(output.name)»(arg_ch«getClassName(output.name)»),
					«ENDFOR»
				«ENDIF»
				//Parameters
				parameters(arg_parameters)
				{
			}
			
			«gcp.projectName»::«getAbstractName(taskDefinition.name)»::~«getAbstractName(taskDefinition.name)»(void) {
				// Nothing to do
			}
			
			void «gcp.projectName»::«getAbstractName(taskDefinition.name)»::initialize() {
				// Initialize «getAbstractName(taskDefinition.name)»
				std::cout << "Initializing «getAbstractName(taskDefinition.name)»...";
				init(parameters);
				«IF !taskDefinition.taskInputsWithDataType.isNullOrEmpty»
					// Get input channels
					if(m_inputs > 0) {
						« FOR input : taskDefinition.taskInputsWithDataType »
							if(m_inputList[«getInputKeyName(input.name)»] != NULL) {
								input_ch«getClassName(input.name)» = reinterpret_cast<«gcp.abstractChannelClassName»<«input.dataType.name»>*>(getInput(«getInputKeyName(input.name)»)->getChannel());
							}
						«ENDFOR»
					}
				«ENDIF»
				
				std::cout << "done!" << std::endl;
			}
			
			
			Tasking::TaskInput &«gcp.projectName»::«getAbstractName(taskDefinition.name)»::getInput(unsigned int key) {
				return inputs[key];
			}		
		'''

	override compileHeader() '''
			«getGenerationHeaderDescription("CppTasking3TaskDefinitionTemplate.xtend")»
			#ifndef «getConstantsName(taskDefinition.name)»_H_
			#define «getConstantsName(taskDefinition.name)»_H_
			
			#include "«getAbstractName(taskDefinition.name)».h"
					
			namespace «gcp.projectName» {
			
			class «taskDefinition.name»: public «getAbstractName(taskDefinition.name)» {
				public:
			
					«taskDefinition.name»(«constructorArgs.removeLastChar»);
					  	virtual ~«taskDefinition.name»();
					
					void init(Parameters *parameters); 
					void execute(void);
					void terminate(void);
					«IF isTask»
						void output(const Inputs &inputs, Outputs &outputs);
						void update(const Inputs &inputs);
					«ENDIF»
					
				private:
					// declare private fields here!
			};
			
			} // namespace «gcp.projectName»
			#endif /* «getConstantsName(taskDefinition.name)»_H_ */
		'''

	override compileSource() '''
				«getGenerationHeaderDescription("CppTasking3TaskDefinitionTemplate.xtend")»
			
				#include "«taskDefinition.name».h"
				
				«gcp.projectName»::«taskDefinition.name»::«taskDefinition.name»(«getConstructorArgs.removeLastChar»)
					: «getAbstractName(taskDefinition.name)»(«getConstrutorArgs_superClass.removeLastChar») {
					
				}
				
				«gcp.projectName»::«taskDefinition.name»::~«taskDefinition.name»() {
					
				}
				
				void «gcp.projectName»::«taskDefinition.name»::init(Parameters *parameters) {
					this->parameters = parameters;
				}
				
				void «gcp.projectName»::«taskDefinition.name»::execute(void) {
					std::lock_guard<std::mutex> lock(mutex_«getAbstractName(taskDefinition.name)»);
					
					//execute module...
				}
				
				void «gcp.projectName»::«taskDefinition.name»::terminate(void) {
				
				}
				
				«IF isTask»
					void «gcp.projectName»::«taskDefinition.name»::output(const Inputs &inputs, Outputs &outputs) {
						
					}
					
					void «gcp.projectName»::«taskDefinition.name»::update(const Inputs &inputs) {
						
					}
				«ENDIF»
		'''
}
