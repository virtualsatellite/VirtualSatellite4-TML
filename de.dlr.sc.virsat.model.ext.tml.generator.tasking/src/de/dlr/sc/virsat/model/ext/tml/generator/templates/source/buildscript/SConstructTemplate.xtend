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

import de.dlr.sc.virsat.model.ext.tml.generator.IFileNameProvider
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.CppFileNameProvider

class SConstructTemplate extends AbstractBuildScriptTemplate {

	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected IFileNameProvider fileNameProvider;
	
	new() {
		this.fileNameProvider = new CppFileNameProvider();
	}

	override compileScript()'''
		#!/usr/bin/env python
		
		import os
		
		## Define project paths -------------------------------------------------------------------------------------
		root_path = os.path.abspath('.')
		build_path_prefix = root_path
		
		# Set paths -------------------------------------------------------------------------------------------------
		contrib_path = os.path.join(root_path, '«gcp.contribFolder»')
		tasking_path = os.path.join(contrib_path, 'Tasking')
		tool_path = os.path.join(tasking_path, 'conf/scons/site_tools')
		build_path = os.path.join(build_path_prefix, '«gcp.buildGenPath»')
		#------------------------------------------------------------------------------------------------------------
		
		## Define build options -------------------------------------------------------------------------------------
		AddOption(
		    '--dbg',
		    action  = 'store_true',
		    help    = 'Debug build. Combinable with the --tc option',
		    default = False)
		#------------------------------------------------------------------------------------------------------------
		
		# Check if scons build tools are available ------------------------------------------------------------------
		if not os.listdir(tool_path):
		    print('scons: \033[1;31m' + 'Aborting build: ' + '\033[0m' + 'Tools submodule not available.')
		    quit(1)
		#------------------------------------------------------------------------------------------------------------
		    
		# All environment settings are collected in env_options -----------------------------------------------------
		env_options = {
		    'toolpath'          : [tool_path],
		    'tools'             : ['default',
		                           'utils_buildformat',
		                           'utils_common',
		                           'utils_git_submodules',
		                           'compiler_hosted_gcc', ],
		    'CXXFLAGS_language' : ['-std=c++11',],
		    'ENV'               : os.environ,
		}
		#------------------------------------------------------------------------------------------------------------
		
		# Override the defaults. If debug build, add GDB info. Else optimize binary ---------------------------------
		if GetOption('dbg'):
		    variant_dir = 'debug'
		    env_options['CCFLAGS_optimize'] = ['-O0', '-ffunction-sections', '-fdata-sections']
		    env_options['CCFLAGS_debug'] = ['-g']
		else:
		    variant_dir = 'release'
		#------------------------------------------------------------------------------------------------------------
		
		# Create the environment with the given configuration -------------------------------------------------------
		envGlobal = Environment(**env_options)
		envGlobal.Tool('settings_buildpath')
		#------------------------------------------------------------------------------------------------------------
		
		# Set environment construction variables --------------------------------------------------------------------
		envGlobal['BASEPATH'] = root_path
		envGlobal['ROOTPATH'] = root_path
		envGlobal['SYSTEMPATH'] = root_path
		envGlobal['BUILDPATH'] = os.path.join(build_path, variant_dir)
		envGlobal['BINPATH'] = os.path.join(envGlobal['BUILDPATH'], 'bin')
		envGlobal['LIBINSTALLPATH'] = os.path.join(envGlobal['BUILDPATH'], 'lib')
		envGlobal['LIBPATH'] = envGlobal['LIBINSTALLPATH']
		envGlobal['CONTRIBPATH'] = contrib_path
		envGlobal['TASKINGPATH'] = tasking_path
		#------------------------------------------------------------------------------------------------------------
		
		# Call the source SConscripts -------------------------------------------------------------------------------
		envGlobal.SConscript('SConscript', exports = 'envGlobal', duplicate = 0)
		#------------------------------------------------------------------------------------------------------------
		
	'''
	
}