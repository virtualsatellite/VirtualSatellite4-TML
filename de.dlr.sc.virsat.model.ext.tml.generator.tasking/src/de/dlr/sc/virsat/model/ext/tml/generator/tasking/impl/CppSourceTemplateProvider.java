/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.tasking.impl;

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition;
import de.dlr.sc.virsat.model.ext.tml.generator.ISourceTemplateProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.ISourceTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppAbstractChannelTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppChannelBehaviorTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppDataTypeTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppEnumerationTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppEnvironmentConfigurationLoaderTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppEnvironmentTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppQueueTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.CppTaskDefinitionTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * Template provider for cpp source files
 * @author fran_tb
 *
 */
public class CppSourceTemplateProvider implements ISourceTemplateProvider {

	@Override
	public ISourceTemplate getDatatypeTemplate(DataType datatype) {
		return new CppDataTypeTemplate(datatype);
	}

	@Override
	public ISourceTemplate getTaskDefinitionTemplate(TaskingEnvironment taskingEnvironment, TaskDefinition taskDefinition) {
		return new CppTaskDefinitionTemplate(taskingEnvironment, taskDefinition);
	}

	@Override
	public ISourceTemplate getEnumerationTemplate(Enumeration enumtype) {
		return new CppEnumerationTemplate(enumtype);
	}

	@Override
	public ISourceTemplate getTaskingEnvironmentTemplate(TaskingEnvironment taskingEnv) {
		return new CppEnvironmentTemplate(taskingEnv);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.ISourceTemplateProvider#getChannelTemplate()
	 */
	@Override
	public ISourceTemplate getChannelBehaviorDefinitionTemplate(ChannelBehaviorDefinition channelBehaviorDef) {
		return new CppChannelBehaviorTemplate(channelBehaviorDef);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.ISourceTemplateProvider#getChannelBehaviorQueueTemplate(de.dlr.sc.virsat.model.ext.tml.generator.s.ChannelBehaviorDefinition)
	 */
	@Override
	public ISourceTemplate getChannelQueueTemplate() {
		return new CppQueueTemplate();
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.ISourceTemplateProvider#getAbstractChannelTemplate()
	 */
	@Override
	public ISourceTemplate getAbstractChannelTemplate() {
		return new CppAbstractChannelTemplate();
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.ISourceTemplateProvider#getTaskingEnvironmentConfigurationLoaderTemplate(java.util.List)
	 */
	@Override
	public ISourceTemplate getTMLConfigurationLoaderTemplate(TaskingEnvironment taskingEnvironment) {
		return new CppEnvironmentConfigurationLoaderTemplate(taskingEnvironment);
	}


}

