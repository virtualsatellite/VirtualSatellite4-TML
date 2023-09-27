/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.tasking3.impl;

import de.dlr.sc.virsat.model.ext.tml.generator.tasking.impl.CppSourceTemplateProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.ISourceTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking3.source.cpp.CppTasking3EnvironmentTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking3.source.cpp.CppTasking3TaskDefinitionTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * Template provider for cpp source files
 * @author fran_tb
 *
 */
public class CppTasking3SourceTemplateProvider extends CppSourceTemplateProvider {


	@Override
	public ISourceTemplate getTaskDefinitionTemplate(TaskingEnvironment taskingEnvironment, TaskDefinition taskDefinition) {
		return new CppTasking3TaskDefinitionTemplate(taskingEnvironment, taskDefinition);
	}


	@Override
	public ISourceTemplate getTaskingEnvironmentTemplate(TaskingEnvironment taskingEnv) {
		return new CppTasking3EnvironmentTemplate(taskingEnv);
	}

}

