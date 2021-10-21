/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator;

import java.util.ArrayList;

import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IBuildScriptTemplate;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment;

/**
 * @author nepa_ay
 * CmakeTemplate provider
 */
public interface IBuildScriptTemplateProvider {
	/**
	 * Get CmakeTemplate for the root directory.
	 * @param taskingEnvironment tasking environment part object.
	 * @return CmakeTemplate instance.
	 */
	IBuildScriptTemplate getCMakeTemplate(TaskingEnvironment taskingEnvironment);
	
	/**
	 * Get CmakeTemplate for the src directory.
	 * @param taskingEnvironment tasking environment part object.
	 * @return CmakeSrcDirTemplate instance.
	 */
	IBuildScriptTemplate getCMakeSrcDirTemplate(TaskingEnvironment taskingEnvironment);

	/**
	 * Get CmakeTemplate for the src-gen directory.
	 * @param taskingEnvironment tasking environment part object.
	 * @return CmakeSrcDirTemplate instance.
	 */
	IBuildScriptTemplate getCMakeSrcGenDirTemplate(TaskingEnvironment taskingEnvironment);
	
	/**
	 * Generate CmakeTemplate in contrib dir
	 * @return CmakeTemplate instance.
	 */
	IBuildScriptTemplate getCMakeContribDirTemplate();
	
	/**
	 * Generate CmakeTemplate in test dir
	 * @param testSourceFiles list of unit-test source filename 
	 * @return CmakeTemplate instance.
	 */
	IBuildScriptTemplate getCMakeTestDirTemplate(ArrayList<String> testSourceFiles);
		
	/**
	 * Get SConstruct for the root directory.
	 * @return SConstructTemplate instance.
	 */
	IBuildScriptTemplate getSConstructTemplate();
	
	/**
	 * Get SConscript for the root directory.
	 * @return SConscriptTemplate instance.
	 */
	IBuildScriptTemplate getSConscriptTemplate();
	
	/**
	 * Get SConscript for the test directory.	 
	 * @param testSourceFiles list of unit-test source filename 
	 * @return SConscriptTestDirTemplate instance.
	 */
	IBuildScriptTemplate getSConscriptTestDirTemplate(ArrayList<String> testSourceFiles);
	
	/**
	 * Get SConscript for the contrib directory.
	 * @return SConscriptTemplate instance.
	 */
	IBuildScriptTemplate getSConscriptContribDirTemplate();
	
}
