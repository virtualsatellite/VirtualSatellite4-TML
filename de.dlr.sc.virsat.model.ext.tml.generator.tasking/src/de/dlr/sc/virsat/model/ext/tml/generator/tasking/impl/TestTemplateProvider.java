/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.tasking.impl;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.generator.ITestTemplateProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.ITestTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.test.TestChannelBehaviorTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.test.TestConfigurationLoaderTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.test.TestEnviromentTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.test.TestTaskTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * Provides test template
 * @author nepa_ay
 *
 */
public class TestTemplateProvider implements ITestTemplateProvider {

	@Override
	public ITestTemplate getTestEnvironmentTemplate(TaskingEnvironment taskingEnvironment) {
		return new TestEnviromentTemplate(taskingEnvironment);
	}
	
	@Override
	public ITestTemplate getTestChannelBehaviorTemplate(TaskingEnvironment taskingEnvironment, ChannelBehaviorDefinition channelBehaviorDefinition) {
		return new TestChannelBehaviorTemplate(taskingEnvironment, channelBehaviorDefinition);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.ITestTemplateProvider#getTestConfigurationLoaderTemplate(java.util.ArrayList)
	 */
	@Override
	public ITestTemplate getTestConfigurationLoaderTemplate(TaskingEnvironment taskingEnvironment) {
		return new TestConfigurationLoaderTemplate(taskingEnvironment);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.ITestTemplateProvider#getTestTaskTemplate(de.dlr.sc.virsat.model.ext.tml.generator.s.TaskingEnvironment)
	 */
	@Override
	public ITestTemplate getTestTaskTemplate(TaskingEnvironment taskingEnvironment) {
		return new TestTaskTemplate(taskingEnvironment);
	}
}
