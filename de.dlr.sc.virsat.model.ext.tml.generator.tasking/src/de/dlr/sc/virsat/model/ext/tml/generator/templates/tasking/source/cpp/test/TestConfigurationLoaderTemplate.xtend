/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp.test

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp.test.AbstractTestTemplate
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper

/**
 * @author nepa_ay
 *
 */
class TestConfigurationLoaderTemplate extends AbstractTestTemplate {
	
	TaskingEnvironment taskingEnvironment;
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.instance
	
	new(TaskingEnvironment taskingEnvironment) {
		this.taskingEnvironment = taskingEnvironment;
		if (!taskingEnvironmentHelper.isInitilaized) {
			taskingEnvironmentHelper.init(taskingEnvironment)
		}
	}
		
	override compileHeader() '''
		#include <stdlib.h>
				
		#include "gtest/gtest.h"
		#include "../../«gcp.contribFolder.removeFileSepChars»/«gcp.libconfigFolder.removeFileSepChars»/libconfig.h++"
		«FOR taskDefinition : taskingEnvironmentHelper.taskDefinitions»
			«IF !taskDefinition.parameters.nullOrEmpty»
				#include "«getAbstractName(taskDefinition.name)».h"
			«ENDIF»
		«ENDFOR»
		#include "«gcp.configurationLoaderClassName».h"
	'''
	
	override compileSource() '''
		#include "test«gcp.configurationLoaderClassName».h"
		
		namespace «gcp.projectName» {
			const char * «gcp.configurationLoaderClassName.acronym»_TEST_CONFIG_FILE = "./«gcp.testConfigFilename»";
			«gcp.configurationLoaderClassName» configurationLoader;
			
			«FOR task : taskingEnvironment.tasks»
				TEST(ConfigurationLoaderTest, «task.name.className»){
					configurationLoader.loadFile(«gcp.configurationLoaderClassName.acronym»_TEST_CONFIG_FILE);
					«gcp.projectName»::«task.typeOf.name.abstractName»::Parameters parameters«task.typeOf.name.className»;
					configurationLoader.getParameters(parameters«task.typeOf.name.className», "«task.name.className»");
					
					//Create Reference-Output
					«gcp.projectName»::«task.typeOf.name.abstractName»::Parameters parameters;
					«FOR att : task.typeOf.parameters»
						«IF att.is1DArray»
							for(int i=0; i<«att.dimensions.get(0).size»; i++){
								parameters.«att.name»[i] = «getDefaultValue(att, true)»;
							}
						«ELSEIF att.is2DArray»
							for(int i=0; i<«att.dimensions.get(0).size»; i++){
								for(int j=0; j<«att.dimensions.get(1).size»; j++){
									parameters.«att.name»[i][j] = «getDefaultValue(att, true)»;
								}
							}
						«ELSE»
							parameters.«att.name» = «getDefaultValue(att, true)»;
						«ENDIF»
					«ENDFOR»
					
					//TestOutput:
					«FOR att : task.typeOf.parameters»
						«IF att.is1DArray»
							EXPECT_EQ(parameters.«att.name»[0], parameters«task.typeOf.name.className».«att.name»[0]);
							EXPECT_EQ(parameters.«att.name»[«att.dimensions.get(0).size - 1»], parameters«task.typeOf.name.className».«att.name»[«att.dimensions.get(0).size - 1»]);
						«ELSEIF att.is2DArray»
							EXPECT_EQ(parameters.«att.name»[0][0], parameters«task.typeOf.name.className».«att.name»[0][0]);
							EXPECT_EQ(parameters.«att.name»[«att.dimensions.get(0).size - 1»][«att.dimensions.get(1).size - 1»], parameters«task.typeOf.name.className».«att.name»[«att.dimensions.get(0).size - 1»][«att.dimensions.get(1).size - 1»]);
						«ELSEIF att.typeOf instanceof BasicTypeDefinition || att.typeOf instanceof Enumeration»
							«IF att.typeOf.name == T_STRING_CHAR»
								EXPECT_EQ(*(parameters.«att.name»), *(parameters«task.typeOf.name.className».«att.name»));
							«ELSE»
								EXPECT_EQ(parameters.«att.name», parameters«task.typeOf.name.className».«att.name»);
							«ENDIF»
						«ENDIF»
					«ENDFOR»
				}
		«ENDFOR»
		}
	'''
	
}
