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
import java.util.ArrayList

class SConscriptTestDirTemplate extends AbstractBuildScriptTemplate {

	protected IGenerationConfigurationProvider generationConfigurationProvider = GenerationConfigurationProvider.instance;
	protected ArrayList<String> testSourceFiles;
	
	new(ArrayList<String> testSourceFiles) {
		this.testSourceFiles = testSourceFiles;
	}

	override compileScript()'''
		#!/usr/bin/env python
		
		import os, errno
		import shutil
				
		Import('envGlobal')
		testEnv = envGlobal.Clone()
		«IF generationConfigurationProvider.useLibconfig» 
			testEnv['CCFLAGS'] = ['-g', '-pedantic', '-Wall', '-fprofile-arcs', '-ftest-coverage', '-std=c++11', '-lgcov', '-rdynamic']	
			try:
			    os.makedirs(envGlobal['BINPATH'])
			except OSError as e:
			    if e.errno != errno.EEXIST:
				raise
			
			# Copy «generationConfigurationProvider.testConfigFilename» to bin directory -------------------------------------------------------------------------
			shutil.copy(os.path.join(envGlobal['TESTPATH'], '«generationConfigurationProvider.testConfigFilename»'), os.path.join(envGlobal['BINPATH'], '«generationConfigurationProvider.testConfigFilename»'))
			#-------------------------------------------------------------------------------------------------------------------------
		«ENDIF»
		
		# Compile test files -----------------------------------------------------------------------------------------------------
		testEnv.Append(CPPPATH=[envGlobal['TESTPATH']])
		testEnv.Append(CPPPATH=[os.path.join(testEnv['TASKINGPATH'], 'contrib')]) # Include gtest header file
				
		testEnv.Append(LIBS=['gtest', 'tasking', 'pthread', '«generationConfigurationProvider.projectName»', «IF generationConfigurationProvider.useLibconfig»'libConfig'«ENDIF»])
		
		testfiles = []
		«FOR filename : testSourceFiles.filter[f|!f.isNullOrEmpty]»
		testfiles.append(os.path.join(envGlobal['TESTPATH'], '«filename»'))
		«ENDFOR»
		program = testEnv.Program('test«generationConfigurationProvider.projectName»', testfiles)
		installTest = envGlobal.Install(envGlobal['BINPATH'], program)
		
		envGlobal.Alias('test', installTest)
		envGlobal.Alias('install', installTest)
		#-------------------------------------------------------------------------------------------------------------------------
	'''
}