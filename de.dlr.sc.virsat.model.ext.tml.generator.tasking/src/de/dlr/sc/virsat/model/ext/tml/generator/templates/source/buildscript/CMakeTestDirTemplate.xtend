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
import java.util.ArrayList

class CMakeTestDirTemplate extends AbstractBuildScriptTemplate {

	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected ArrayList<String> testSourceFiles;
	
	new(ArrayList<String> testSourceFiles) {
		this.testSourceFiles = testSourceFiles;
	}
	
	override compileScript()'''
		# Configuration script for the folder.
		# Execute cmake one level up to (re)generate the
		# Projectfiles/Makefiles
			
		set(GTEST_PATH ../../«gcp.contribFolder.removeFileSepChars»/Tasking/contrib)
		set(GTEST_SRC ${GTEST_PATH}/gtest/gtest-all.cc)
		set(GTEST_MAIN ${GTEST_PATH}/gtest/gtest_main.cc)
		include_directories(
			${GTEST_PATH}
		)
		
		add_executable( test_${PROJECT_NAME}
			${GTEST_SRC}
			${GTEST_MAIN}
			
			«FOR filename : testSourceFiles.filter[f|!f.isNullOrEmpty]»
			«filename»
			«ENDFOR»
		)
		
		target_link_libraries ( test_${PROJECT_NAME}
			${CMAKE_THREAD_LIBS_INIT}
			${PROJECTNAME}
			tasking
			tasking-channels
			rt
			${GTEST_LIBRARY_DEBUG} 
			${GTEST_MAIN_LIBRARY_DEBUG}
		)
		
		add_test(tests-${PROJECT_NAME} test_${PROJECT_NAME} --gtest_output=xml:${CMAKE_CURRENT_BINARY_DIR}/xunit.xml)
		# Adding custom test target "check" because it is the only way to show the full output of test errors on console
		add_custom_target(check-${PROJECT_NAME} COMMAND ${CMAKE_CTEST_COMMAND} --force-new-ctest-process --output-on-failure)
		
		«IF gcp.useLibconfig»file(COPY «gcp.testConfigFilename» DESTINATION ${CMAKE_CURRENT_BINARY_DIR})«ENDIF»
	'''

}