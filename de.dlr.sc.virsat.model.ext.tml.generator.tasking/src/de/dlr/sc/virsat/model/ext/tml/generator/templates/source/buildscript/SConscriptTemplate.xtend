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

class SConscriptTemplate extends AbstractBuildScriptTemplate {

	protected IGenerationConfigurationProvider generationConfigurationProvider = GenerationConfigurationProvider.instance;
	
	new() {
	}

	override compileScript()'''
		#!/usr/bin/env python
		
		import os
		
		Import('envGlobal')
		
		if 'CONTRIBPATH' not in envGlobal:
			envGlobal['CONTRIBPATH'] = os.path.join(envGlobal['ROOTPATH'], '«generationConfigurationProvider.contribFolder»')
		if 'TASKINGPATH' not in envGlobal:
			envGlobal['TASKINGPATH'] = os.path.join(envGlobal['CONTRIBPATH'], 'Tasking')

		envGlobal['SRCPATH'] = os.path.join(envGlobal['ROOTPATH'], '«generationConfigurationProvider.srcPath»')
		envGlobal['SRCGENPATH'] = os.path.join(envGlobal['ROOTPATH'], '«generationConfigurationProvider.srcGenPath»')
		envGlobal['TESTPATH'] = os.path.join(envGlobal['SRCGENPATH'], '«generationConfigurationProvider.getTestPath»')
		
		# Define dependencies -------------------------------------------------------------------------------------
		# Add subdirectories
		envGlobal.SConscript([os.path.join(envGlobal['CONTRIBPATH'], 'SConscript')], exports = 'envGlobal')
		#----------------------------------------------------------------------------------------------------------
		
		# Compile source files ------------------------------------------------------------------------------------
		envGlobal.Append(CPPPATH=[envGlobal['SRCPATH']])
		envGlobal.Append(CPPPATH=[os.path.join(envGlobal['SRCPATH'], '«generationConfigurationProvider.typeDefinitionFolder»')])
		envGlobal.Append(CPPPATH=[os.path.join(envGlobal['SRCPATH'], '«generationConfigurationProvider.channelDefinitionFolder»')])
		envGlobal.Append(CPPPATH=[os.path.join(envGlobal['SRCPATH'], '«generationConfigurationProvider.taskDefinitionFolder»')])
		
		envGlobal.Append(CPPPATH=[envGlobal['SRCGENPATH']])
		envGlobal.Append(CPPPATH=[os.path.join(envGlobal['SRCGENPATH'], '«generationConfigurationProvider.typeDefinitionFolder»')])
		envGlobal.Append(CPPPATH=[os.path.join(envGlobal['SRCGENPATH'], '«generationConfigurationProvider.channelDefinitionFolder»')])
		envGlobal.Append(CPPPATH=[os.path.join(envGlobal['SRCGENPATH'], '«generationConfigurationProvider.taskDefinitionFolder»')])
		
		sourcefiles = []
		sourcefiles.append(Glob(os.path.join(envGlobal['SRCPATH'], '*.c*')))
		sourcefiles.append(Glob(os.path.join(envGlobal['SRCPATH'], '«generationConfigurationProvider.taskDefinitionFolder»', '*.c*')))
		sourcefiles.append(Glob(os.path.join(envGlobal['SRCGENPATH'], '*.c*')))
		sourcefiles.append(Glob(os.path.join(envGlobal['SRCGENPATH'], '«generationConfigurationProvider.taskDefinitionFolder»', '*.c*')))
		
		library = envGlobal.StaticLibrary(target = '«generationConfigurationProvider.projectName»', source = sourcefiles)
		install_lib = envGlobal.Install(envGlobal['LIBPATH'], library)
		envGlobal.Alias('install', install_lib)
		#----------------------------------------------------------------------------------------------------------
		
		# Compile test files --------------------------------------------------------------------------------------
		envGlobal.SConscript([os.path.join(envGlobal['TESTPATH'], 'SConscript')], exports = 'envGlobal')
		#----------------------------------------------------------------------------------------------------------
		
		# Finalize aliases ----------------------------------------------------------------------------------------
		envGlobal.Alias('all', 'install')
		envGlobal.Default(['all'])
		#----------------------------------------------------------------------------------------------------------
	'''
}