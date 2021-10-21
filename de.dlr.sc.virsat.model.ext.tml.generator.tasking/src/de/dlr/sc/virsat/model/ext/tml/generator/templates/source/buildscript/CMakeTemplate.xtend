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
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment

class CMakeTemplate extends AbstractBuildScriptTemplate {

	protected TaskingEnvironment taskingEnvironment;
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected IFileNameProvider fileNameProvider = new CppFileNameProvider();
	
	new(TaskingEnvironment taskingEnvironment) {
		this.taskingEnvironment = taskingEnvironment;
	}

	override compileScript()'''
		# Automatically generated. Do not edit!
		# Template: CMakeListsTemplate.xtend
		cmake_minimum_required(VERSION 2.8)
				
		set(PROJECTNAME "«gcp.projectName»")
		project("«gcp.projectName»" C CXX)
		message(STATUS "### ${PROJECT_NAME} ###")
			
		set(CMAKE_BUILD_TYPE Debug CACHE STRING "Build Type: Debug or Flight")
		# Debugging information enabled
		set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -g")
		set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -pedantic -Wall")
		# Coverage analysis
		set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fprofile-arcs -ftest-coverage")
		# Mutex support ISO C++ 2011
		set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")
			
		set(CMAKE_EXE_LINKER_FLAGS "${CMAKE_EXE_LINKER_FLAGS} -fprofile-arcs -ftest-coverage -lgcov")
						    
		find_package(Threads REQUIRED)
		
		include_directories(
			«gcp.contribFolder.removeFileSepChars»/Tasking/include
			«gcp.contribFolder.removeFileSepChars»/Tasking/include/arch/linux
			«gcp.contribFolder.removeFileSepChars»/Tasking/channels/include/channels
			«IF gcp.useLibconfig»«gcp.contribFolder.removeFileSepChars»/«gcp.libconfigFolder»«ENDIF»
			«gcp.getSrcPath.removeFileSepChars»
			«gcp.getSrcPath.removeFileSepChars»/«gcp.getTaskDefinitionFolder.removeFileSepChars»
			«gcp.getSrcPath.removeFileSepChars»/«gcp.typeDefinitionFolder.removeFileSepChars»
			«gcp.getSrcPath.removeFileSepChars»/«gcp.channelDefinitionFolder.removeFileSepChars»
			«gcp.getSrcGenPath.removeFileSepChars»
			«gcp.getSrcGenPath.removeFileSepChars»/«gcp.getTaskDefinitionFolder.removeFileSepChars»
			«gcp.getSrcGenPath.removeFileSepChars»/«gcp.typeDefinitionFolder.removeFileSepChars»
			«gcp.getSrcGenPath.removeFileSepChars»/«gcp.channelDefinitionFolder.removeFileSepChars»
		)
				
		add_subdirectory(«gcp.contribFolder.removeFileSepChars»)
		add_subdirectory(src-gen)
		add_subdirectory(src)
				
		# build test
		enable_testing()
		add_subdirectory(src-gen/test)
		add_dependencies(test_${PROJECT_NAME} ${PROJECT_NAME})
	'''

}