/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
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
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper

/**
 * @author nepa_ay
 *
 */
class TestTaskTemplate extends AbstractTestTemplate {
	
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.instance
	
	new(TaskingEnvironment taskingEnvironment) {
		if (!taskingEnvironmentHelper.isInitilaized) {
			taskingEnvironmentHelper.init(taskingEnvironment)
		}
	}
		
	override compileHeader() '''
		#ifndef TEST_TASK_H_
		#define TEST_TASK_H_
		
		#include "task.h"
		namespace «gcp.projectName» {
		
			class TestTask : public Tasking::Task {
				
				public: 
					TestTask(void) : Task(100, «taskingEnvironmentHelper.dataTypes.length») { }
					
					«var key = 0»
					«FOR datatype : taskingEnvironmentHelper.dataTypes»
						static const unsigned int «datatype.name.constantsName.getInputKeyName» = «key++»;
					«ENDFOR»
					
					void initialize(); 
					
					void execute();
		
					void terminate();
					
					bool m_executed = false;
			};
		}
		#endif /*  TEST_TASK_H_ */
	'''
	
	override compileSource() '''
		#include <iostream>
		#include "testTask.h"
			
		void «gcp.projectName»::TestTask::initialize(){
			m_executed = false;
			   std::cout << "TestTask initialized!" << std::endl;
		}
		
		void «gcp.projectName»::TestTask::execute(){
		    m_executed = true;
		    std::cout << "TestTask executed!" << std::endl;
		}
		
		void «gcp.projectName»::TestTask::terminate(){
		    m_executed = false;
		    std::cout << "TestTask terminated!" << std::endl;
		}
		
	'''
	
	
}
