/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.ITestTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * @author nepa_ay
 * Template provider for the test cases
 */
public interface ITestTemplateProvider {
	
	/**
	 * Create the template for task-environment test
	 * @param taskingEnvironment Tasking environment for which test file should be generated.
	 * @return the template object
	 */
	ITestTemplate getTestEnvironmentTemplate(TaskingEnvironment taskingEnvironment);
	
	/**
	 * Create the template for Channel Behavior test
	 * @param taskingEnvironment underlying tasking-environment 
	 * @param channelBehaviorDefinition channel behavior definition for which test files should be generated.
	 * @return the template object
	 */
	ITestTemplate getTestChannelBehaviorTemplate(TaskingEnvironment taskingEnvironment, ChannelBehaviorDefinition channelBehaviorDefinition);

	/**
	 * Create the template for ConfigurationLoader test
	 * @param taskingEnvironment Tasking environment for which the Task-Message test file should be generated.
	 * @return the template object
	 */
	ITestTemplate getTestConfigurationLoaderTemplate(TaskingEnvironment taskingEnvironment);
	
	/**
	 * Create the template for TestTask class
	 * @param taskingEnvironment Tasking environment for which the TestTask class should be generated.
	 * @return the template object
	 */
	ITestTemplate getTestTaskTemplate(TaskingEnvironment taskingEnvironment);
}
