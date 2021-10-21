/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.config

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IConfigFileTemplate
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment

/**
 * @author nepa_ay
 *
 */
class ConfigFileDefaultTemplate extends de.dlr.sc.virsat.model.ext.tml.generator.templates.source.config.AbstractConfigFileTemplate implements IConfigFileTemplate {
	TaskingEnvironment taskingEnvironment;
	IGenerationConfigurationProvider generationConfigurationProvider = GenerationConfigurationProvider.instance;
	
	new(TaskingEnvironment taskingEnvironment) {
		this.taskingEnvironment = taskingEnvironment;
	}
		
	override compileFileContent() '''
		#---------------------------------------------------------------------------
		# «generationConfigurationProvider.projectName» Configuration File
		#---------------------------------------------------------------------------
		
		«printConfiguration(taskingEnvironment.name, taskingEnvironment.globalParameters, false)»
		 
		«FOR task : taskingEnvironment.tasks»
			«printConfiguration(task.name.className, task.typeOf.parameters, false)»
			 
		«ENDFOR»
	'''
}
