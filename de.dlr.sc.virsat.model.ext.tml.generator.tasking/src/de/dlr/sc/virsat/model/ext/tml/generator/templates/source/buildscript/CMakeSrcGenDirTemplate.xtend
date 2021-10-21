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

import de.dlr.sc.virsat.model.ext.tml.generator.impl.CppFileNameProvider
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.IFileNameProvider
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper

class CMakeSrcGenDirTemplate extends AbstractBuildScriptTemplate {

	protected TaskingEnvironment taskingEnvironment;
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected IFileNameProvider fileNameProvider = new CppFileNameProvider();
	protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.getInstance()
	
	new(TaskingEnvironment taskingEnvironment) {
		this.taskingEnvironment = taskingEnvironment;
	}
	
	override compileScript()'''
		# Configuration script for the folder.
		# Execute cmake one level up to (re)generate the
		# Projectfiles/Makefiles
				
		include_directories(
			../«gcp.contribFolder.removeFileSepChars»/Tasking/include
			../«gcp.contribFolder.removeFileSepChars»/Tasking/include/arch/linux
			../«gcp.contribFolder.removeFileSepChars»/Tasking/channels/include/channels
			«IF gcp.useLibconfig»../«gcp.contribFolder.removeFileSepChars»/«gcp.libconfigFolder»«ENDIF»
			../«gcp.getSrcPath.removeFileSepChars»
			../«gcp.getSrcPath.removeFileSepChars»/«gcp.getTaskDefinitionFolder.removeFileSepChars»
			../«gcp.getSrcPath.removeFileSepChars»/«gcp.typeDefinitionFolder.removeFileSepChars»
			../«gcp.getSrcPath.removeFileSepChars»/«gcp.channelDefinitionFolder.removeFileSepChars»
			«gcp.getTaskDefinitionFolder.removeFileSepChars»
			«gcp.typeDefinitionFolder.removeFileSepChars»
			«gcp.channelDefinitionFolder.removeFileSepChars»
		)
		
		add_library(gen_${PROJECTNAME} STATIC
			«fileNameProvider.getAbstractSourceFileName(taskingEnvironment.name)»
			«FOR taskDefinition : taskingEnvironmentHelper.getTaskDefinitions()»
				«gcp.taskDefinitionFolder.removeFileSepChars»/«fileNameProvider.getAbstractSourceFileName(taskDefinition.name)»
			«ENDFOR»
			«IF gcp.useLibconfig»«gcp.configurationLoaderClassName».cpp«ENDIF»
		)
		
		target_link_libraries (gen_${PROJECTNAME}
		    ${PROJECTNAME}
		    «IF gcp.useLibconfig»libconfig_${PROJECTNAME}«ENDIF»
		)
	'''

}