/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.test

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp.test.AbstractTestTemplate
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper

class TestChannelBehaviorTemplate extends AbstractTestTemplate {
	
	ChannelBehaviorDefinition channelBehaviorDefinition;
	
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.instance
	
	new (TaskingEnvironment taskingEnvironment, ChannelBehaviorDefinition channelBehaviorDefinition) {
		this.channelBehaviorDefinition = channelBehaviorDefinition;
		if (!taskingEnvironmentHelper.isInitilaized) {
			taskingEnvironmentHelper.init(taskingEnvironment)
		}
	}
	
	def printChannelParameterValues(){
		'''«FOR param : channelBehaviorDefinition.parameters SEPARATOR ", "»«getChannelParameterValue(param)»«ENDFOR»'''	
	}	
	
	def printTaskInputInstance(DataType datatype)'''
		Tasking::TaskInput input«datatype.name»(0, false);
	'''
	
	def printChannelInstance(DataType datatype)'''
		«channelBehaviorDefinition.name»<«datatype.name»«IF channelHasSize(channelBehaviorDefinition)», SIZE«ENDIF»> ch«datatype.name»«IF !channelBehaviorDefinition.parameters.isNullOrEmpty»(«printChannelParameterValues»)«ENDIF»;
	'''
	
	def printDatatypeInstance(DataType datatype)'''
		«datatype.name» «datatype.name.getObjectName»;
	'''
	
	def printTaskInput(DataType datatype)'''
		//Preparing Input for Datatype - «datatype.name»
		«datatype.printTaskInputInstance»
		«datatype.printChannelInstance»
		input«datatype.name».associate(&ch«datatype.name»);
		testTask.add(TestTask::«datatype.name.constantsName.getInputKeyName», &input«datatype.name»);
	'''
	
	def printPushToChannel(DataType datatype)'''
		ch«datatype.name».push(&«datatype.name.getObjectName»);
	'''
	
	def printPopFromChannel(DataType datatype)'''
			«««»»«datatype.name»* «datatype.name.getObjectName»Obj = ch«datatype.name».pop();
		ch«datatype.name».pop();
	'''
	
	override compileHeader() '''
		#ifndef «getConstantsName("test"+channelBehaviorDefinition.name)»_H_
		#define «getConstantsName("test"+channelBehaviorDefinition.name)»_H_
		
		#include "gtest/gtest.h"
		#include "task.h"
		#include "tasking.h"
		#include "taskInput.h"
		
		«FOR dt : taskingEnvironmentHelper.dataTypes»
			#include "«dt.name».h"
		«ENDFOR»
		
		#include "testTask.h"
		#include "«channelBehaviorDefinition.name».h"
		
		#endif /* «getConstantsName("test"+channelBehaviorDefinition.name)»_H_ */
	'''
	
	override compileSource() '''
		#include "test«channelBehaviorDefinition.name».h"
		
		namespace «gcp.projectName» {
			using namespace DataTypes;
			
			«FOR dt : taskingEnvironmentHelper.dataTypes»
				TEST(«channelBehaviorDefinition.name»Test, ChannelTest_«dt.name»){
					const unsigned int SIZE = 10;
					
					«dt.printChannelInstance»
					EXPECT_EQ(ch«dt.name».isEmpty(), true);
					
					«dt.printDatatypeInstance»
					«dt.printPushToChannel»
					EXPECT_EQ(ch«dt.name».isEmpty(), false);
					
					«dt.printPopFromChannel»
					EXPECT_EQ(ch«dt.name».isEmpty(), true);
				}
				
				TEST(«channelBehaviorDefinition.name»Test, ChannelTest_TaskInput_«dt.name»){
					TestTask testTask;
					const unsigned int SIZE = 10;
				
					«dt.printTaskInput»
					
					Tasking::initialize(); // Initialize of all tasks
					Tasking::start(); // Starting the scheduler
					
					EXPECT_EQ(testTask.m_executed, false);
					
					«dt.printDatatypeInstance»
					«dt.printPushToChannel»
					
					Tasking::waitUntilEmpty(); // Wait until all tasks are performed				
					Tasking::terminate(); // Terminate the scheduler
					Tasking::resetForTest();
					
					EXPECT_EQ(testTask.m_executed, true);
				}
				
			«ENDFOR»
		}
	'''
		
}
