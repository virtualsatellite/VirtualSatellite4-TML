/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript

import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.CppFileNameProvider
import de.dlr.sc.virsat.model.ext.tml.generator.IFileNameProvider
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper;

class CMakeSrcDirTemplate extends AbstractBuildScriptTemplate {

	protected TaskingEnvironment taskingEnvironment;
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected IFileNameProvider fileNameProvider = new CppFileNameProvider();
	protected TaskingEnvironmentHelper generationHelper = TaskingEnvironmentHelper.getInstance()
	
	new (TaskingEnvironment taskingEnvironment) {
		this.taskingEnvironment = taskingEnvironment;
	}
	
	override compileScript()'''
		# Configuration script for the folder.
		# Execute cmake one level up to (re)generate the
		# Projectfiles/Makefiles
		
		add_library(${PROJECTNAME} STATIC
		    «fileNameProvider.getSourceFileName(taskingEnvironment.name)»
		    «FOR taskDefinition : generationHelper.getTaskDefinitions()»
		    	«gcp.taskDefinitionFolder.removeFileSepChars»/«fileNameProvider.getSourceFileName(taskDefinition.name)»
			«ENDFOR»			
		)
		
		target_link_libraries (${PROJECTNAME}
		    gen_${PROJECTNAME}
		    «IF gcp.useLibconfig»libconfig_${PROJECTNAME}«ENDIF»
			tasking
			tasking-channels
			${CMAKE_THREAD_LIBS_INIT}
			rt
		)
	'''

}