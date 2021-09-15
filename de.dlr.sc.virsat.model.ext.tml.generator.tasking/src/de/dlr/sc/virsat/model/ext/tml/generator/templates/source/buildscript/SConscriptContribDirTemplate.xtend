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

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider

class SConscriptContribDirTemplate extends AbstractBuildScriptTemplate {

	protected IGenerationConfigurationProvider generationConfigurationProvider = GenerationConfigurationProvider.instance;
	
	new() {
	}

	override compileScript()'''
		#!/usr/bin/env python
		
		import os
		
		Import('envGlobal')
		
		if 'CONTRIBPATH' not in envGlobal:
			envGlobal['CONTRIBPATH'] = os.path.abspath('.')
		if 'TASKINGPATH' not in envGlobal:
			envGlobal['TASKINGPATH'] = os.path.join(envGlobal['CONTRIBPATH'], 'Tasking')
			
		# Compile Tasking framework files -------------------------------------------------------------------------
		envGlobal.SConscript([os.path.join(envGlobal['TASKINGPATH'], 'SConscript')], exports = 'envGlobal')
		#----------------------------------------------------------------------------------------------------------
			
		«IF generationConfigurationProvider.useLibconfig»
			if 'LIBCONFIGPATH' not in envGlobal:
				envGlobal['LIBCONFIGPATH'] = os.path.join(envGlobal['CONTRIBPATH'], '«generationConfigurationProvider.libconfigFolder»')
			
			env = envGlobal.Clone()
			env['CFLAGS'] = ['-c']
			env['CCFLAGS'] = ['-g', '-pedantic', '-Wall', '-fprofile-arcs', '-ftest-coverage', '-std=c++11', '-lgcov', '-rdynamic']
			env['CPPPATH'] = [env['LIBCONFIGPATH'],]
			
			# Compile LibConfig files ---------------------------------------------------------------------------------
			configFiles = []
			configFiles.append(Glob(os.path.join(env['LIBCONFIGPATH'], '*.c++')))
			configFiles.append(Glob(os.path.join(env['LIBCONFIGPATH'], '*.c')))
			
			libConfigLib = env.StaticLibrary('libConfig', configFiles)    
			installLibConfig = env.Install(env['LIBPATH'], libConfigLib)
			#----------------------------------------------------------------------------------------------------------
		«ENDIF»
	'''
}