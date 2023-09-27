/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.source.buildscript

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider

class CMakeContribDirTemplate extends AbstractBuildScriptTemplate {

	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	
	new() { }
	
	override compileScript()'''
		# Configuration script for the folder.
		# Execute cmake one level up to (re)generate the
		# Projectfiles/Makefiles
		
		add_subdirectory(Tasking)
		
		«IF gcp.useLibconfig»
		include_directories(
			../«gcp.contribFolder.removeFileSepChars»/«gcp.libconfigFolder»
		)
		
		add_library(libconfig_${PROJECTNAME} STATIC
			«gcp.libconfigFolder»/grammar.c
			«gcp.libconfigFolder»/scanner.c
			«gcp.libconfigFolder»/scanctx.c
			«gcp.libconfigFolder»/strbuf.c
			«gcp.libconfigFolder»/libconfig.c
			«gcp.libconfigFolder»/libconfigcpp.c++
		)
		«ENDIF»
	'''

}