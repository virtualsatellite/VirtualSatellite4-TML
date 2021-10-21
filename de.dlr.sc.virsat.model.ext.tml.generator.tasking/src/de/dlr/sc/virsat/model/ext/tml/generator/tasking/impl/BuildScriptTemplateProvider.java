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

import java.util.ArrayList;

import de.dlr.sc.virsat.model.ext.tml.generator.IBuildScriptTemplateProvider;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IBuildScriptTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.CMakeContribDirTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.CMakeSrcDirTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.CMakeSrcGenDirTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.CMakeTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.CMakeTestDirTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.SConscriptContribDirTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.SConstructTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.SConscriptTemplate;
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript.SConscriptTestDirTemplate;
/**
 * Provides templates for build scripts
 * @author nepa_ay
 *
 */
public class BuildScriptTemplateProvider implements IBuildScriptTemplateProvider {

	@Override
	public IBuildScriptTemplate getCMakeTemplate(TaskingEnvironment taskingEnvironment) {
		return new CMakeTemplate(taskingEnvironment);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IBuildScriptTemplateProvider#getSConstructTemplate()
	 */
	@Override
	public IBuildScriptTemplate getSConstructTemplate() {
		return new SConstructTemplate();
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IBuildScriptTemplateProvider#getSConscriptTemplate()
	 */
	@Override
	public IBuildScriptTemplate getSConscriptTemplate() {
		return new SConscriptTemplate();
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IBuildScriptTemplateProvider#getSConscriptTestDirTemplate()
	 */
	@Override
	public IBuildScriptTemplate getSConscriptTestDirTemplate(ArrayList<String> testSourceFiles) {
		return new SConscriptTestDirTemplate(testSourceFiles);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IBuildScriptTemplateProvider#getSConscriptContribDirTemplate()
	 */
	@Override
	public IBuildScriptTemplate getSConscriptContribDirTemplate() {
		return new SConscriptContribDirTemplate();
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IBuildScriptTemplateProvider#getCMakeTestDirTemplate()
	 */
	@Override
	public IBuildScriptTemplate getCMakeTestDirTemplate(ArrayList<String> testSourceFiles) {
		return new CMakeTestDirTemplate(testSourceFiles);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IBuildScriptTemplateProvider#getCMakeSrcDirTemplate(de.dlr.sc.virsat.model.ext.tml.generator.s.TaskingEnvironment)
	 */
	@Override
	public IBuildScriptTemplate getCMakeSrcDirTemplate(TaskingEnvironment taskingEnvironment) {
		return new CMakeSrcDirTemplate(taskingEnvironment);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IBuildScriptTemplateProvider#getCMakeSrcGenDirTemplate(de.dlr.sc.virsat.model.ext.tml.generator.s.TaskingEnvironment)
	 */
	@Override
	public IBuildScriptTemplate getCMakeSrcGenDirTemplate(TaskingEnvironment taskingEnvironment) {
		return new CMakeSrcGenDirTemplate(taskingEnvironment);
	}

	/* (non-Javadoc)
	 * @see de.dlr.sc.virsat.model.ext.tml.generator.IBuildScriptTemplateProvider#getCMakeContribDirTemplate()
	 */
	@Override
	public IBuildScriptTemplate getCMakeContribDirTemplate() {
		return new CMakeContribDirTemplate();
	}

	
	
}
