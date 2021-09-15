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

/**
 * @author nepa_ay
 *
 */
class TestEnviromentTemplate extends AbstractTestTemplate {
	
	TaskingEnvironment taskingEnvironment;
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	
	new(TaskingEnvironment taskingEnvironment) {
		this.taskingEnvironment = taskingEnvironment;
	}
	
	override compileHeader() '''
		#include <stdlib.h>
		
		#include "gtest/gtest.h"
		#include "task.h"
		#include "tasking.h"
		#include "taskInput.h"
		#include "testTasking.h"
		#include "«taskingEnvironment.name».h"
	'''
	
	override compileSource() '''
		#include "test«taskingEnvironment.name».h"
		
		namespace «gcp.projectName» {
				
			TEST(«taskingEnvironment.name»Test, BasicTest){
				«taskingEnvironment.name» taskingEnvironment("«gcp.testConfigFilename»");
				
				taskingEnvironment.init(); // Initilize Tasking Environment
				Tasking::start(); // Start Tasking
				
				Tasking::waitUntilEmpty(); // Wait until all tasks are performed.
				
				taskingEnvironment.terminate(); // Terminate the scheduler
				Tasking::resetForTest();
			}
		}
	'''
	
	
}
