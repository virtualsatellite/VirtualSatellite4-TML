/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.tasking.source.cpp

import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.generator.impl.GenerationConfigurationProvider
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskingEnvironment
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskDefinition
import de.dlr.sc.virsat.model.ext.tml.util.dmf.TaskingEnvironmentHelper

/**
 * @author nepa_ay
 *
 */
class CppEnvironmentConfigurationLoaderTemplate extends AbstractTaskingTemplate {
	
	protected TaskingEnvironment taskingEnvironment;
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected TaskingEnvironmentHelper taskingEnvironmentHelper = TaskingEnvironmentHelper.getInstance()
		
	new(TaskingEnvironment taskingEnvironment) {
		this.taskingEnvironment = taskingEnvironment;
		if (!taskingEnvironmentHelper.isInitilaized) {
			taskingEnvironmentHelper.init(taskingEnvironment)
		}
	}
	
	private def getClassName(){
		return gcp.configurationLoaderClassName;
	}
		
	def getNewPrefix(String prefix, String ownerName){
		var ret = prefix
		if(!prefix.equals("")){
			ret += "."
		}
		return ret + ownerName
	}
		
	def CharSequence readAttribute(Attribute att,  String paramName, String prefix) '''
			«IF att.isArray»
				«IF att.is2DArray»«read2DAttribute(att, paramName, prefix)»
				«ELSE»«read1DAttribute(att, paramName, prefix)»
				«ENDIF»
			«ELSE»
				«readScalarAttribute(att, paramName, prefix)»
			«ENDIF»
		'''
	
	private def getTypeCastPrefix(Attribute att){
		if(att.typeOf instanceof Enumeration) {
			return "*((int*)&";
		} else {
			 switch (att.typeOf.name){
				
				case T_STRING_CHAR : return "((const char*&)"

				case T_STRING_UCHAR : return "*((int*)&"
				case T_STRING_INT8_T : return "*((int*)&"
				case T_STRING_INT16_T : return "*((int*)&"
				
				case T_STRING_LONG : return "*((long long*)&"
				case T_STRING_INT64_T : return "*((long long int*)&"
								
				case T_STRING_UINT8_T : return "*((unsigned int*)&"
				case T_STRING_UINT16_T : return "*((unsigned int*)&"	
							
				case T_STRING_ULONG : return "*((long long unsigned int*)&"
				case T_STRING_UINT64_T : return "*((long long unsigned int*)&"
				
				default : return ""
			}
		}
	}
	
	private def getTypeCastPostfix(Attribute att){
		var ret = "";
		if(att.typeOf instanceof Enumeration
			|| att.typeOf.name.equals(T_STRING_CHAR)
			|| att.typeOf.name.equals(T_STRING_UCHAR)
			|| att.typeOf.name.equals(T_STRING_INT8_T)
			|| att.typeOf.name.equals(T_STRING_INT16_T)
			|| att.typeOf.name.equals(T_STRING_LONG)
			|| att.typeOf.name.equals(T_STRING_INT64_T)
			|| att.typeOf.name.equals(T_STRING_UINT8_T)
			|| att.typeOf.name.equals(T_STRING_UINT16_T)
			|| att.typeOf.name.equals(T_STRING_ULONG)
			|| att.typeOf.name.equals(T_STRING_UINT64_T))
		{
			ret += ")"
		}
		return ret;
	}
	
	def readScalarAttribute(Attribute att,  String paramName, String prefix)'''
			«IF att.typeOf instanceof BasicTypeDefinition || att.typeOf instanceof Enumeration»
				if (!root«getClassName(paramName)».lookupValue("«att.name»", «att.getTypeCastPrefix»«prefix»«IF !prefix.equals("")».«ENDIF»«getObjectName(paramName)».«att.name»«att.getTypeCastPostfix»)) {
					cerr << "One Parameter not found: «att.name» for «paramName»" << endl;
					return PARAMETERS_NOT_COMPLETE;
				}
			«ELSE»
				const Setting &root«getClassName(att.name)» = rootParameters["«att.name»"];
				«FOR nestedAtt : att.nestedAttributes.filter[a| !a.isIsConst ]»
					«readAttribute(nestedAtt, att.name, getNewPrefix(prefix, paramName))»
				«ENDFOR»
			«ENDIF»
		'''
	
	def read1DAttribute(Attribute att,  String paramName, String prefix)'''
			const Setting &array_«att.name» = rootParameters["«att.name»"];
			if(!array_«att.name».isArray()){
				cerr << "One Parameter not found: «att.name» for «paramName»" << endl;
				return PARAMETERS_NOT_COMPLETE;
			}else{
				for(int i=0; i<array_«att.name».getLength(); i++){
					«prefix»«IF !prefix.equals("")».«ENDIF»«paramName».«att.name»[i] = static_cast<«getCppDataTypeName(att)»>(array_«att.name»[i]);
				}
			}
		'''
	
	def read2DAttribute(Attribute att,  String paramName, String prefix)'''
			const Setting &matrix_«att.name» = rootParameters["«att.name»"];
			if(!matrix_«att.name».isList()){
				cerr << "One Parameter not found: «att.name» for «paramName»" << endl;
				return PARAMETERS_NOT_COMPLETE;
			}else{
				«FOR i : 0 .. att.dimensions.get(0).size - 1»
					const Setting &array_«att.name»«i» = matrix_«att.name»[«i»];
					for(int i=0; i<«att.dimensions.get(1).size»; i++){
						«prefix»«IF !prefix.equals("")».«ENDIF»«paramName».«att.name»[«i»][i] = static_cast<«getCppDataTypeName(att)»>(array_«att.name»«i»[i]);
					}
				«ENDFOR»
			}
		'''

	def printGetParametersMethod(TaskDefinition taskDefinition)'''
			int «gcp.projectName»::«getClassName»::getParameters(«getAbstractName(taskDefinition.name)»::Parameters &parameters, const char * instanceName){
				try {
					const Setting &rootParameters = cfg.getRoot()[instanceName];
					if (rootParameters.getLength() != «taskDefinition.parameters.length») {
						cerr << "Wrong number of Parameters for «taskDefinition.name»!" << endl;
						return PARAMETERS_NOT_COMPLETE;
					}
					
					//Parsing Class Parameters
					«FOR att : taskDefinition.parameters.filter[a| !a.isIsConst ]»
						«readAttribute(att,  "parameters", "")»
					«ENDFOR»
					
					return SUCCESS;
				}
				catch (const SettingNotFoundException &nfex) {
					cerr << "«taskDefinition.name» Parameters not found in configuration file." << endl;
					return PARAMETERS_NOT_COMPLETE;
				}
							
				try {
					const Setting &rootParameters = cfg.getRoot()["«gcp.projectName»"];
					if (rootParameters.getLength() != «taskingEnvironment.globalParameters.length») {
						cerr << "Wrong number of Parameters for «gcp.projectName»!" << endl;
						return PARAMETERS_NOT_COMPLETE;
					}
					
					//Parsing Class Parameters
					«FOR att : taskingEnvironment.globalParameters.filter[a| !a.isIsConst ]»
						«readAttribute(att,  "parameters", "")»
					«ENDFOR»
					
					return SUCCESS;
				} 
				catch (const SettingNotFoundException &nfex) {
					cerr << "«gcp.projectName» Parameters not found in configuration file." << endl;
					return PARAMETERS_NOT_COMPLETE;
				}
			}
		'''
	
	override compileAbstractHeader() '''
			#ifndef «getClassName.constantsName»_H_
			#define «getClassName.constantsName»_H_
			
			«getGenerationAbstractHeaderDescription("CppEnvironmentConfigurationLoaderTemplate.xtend")»
			
			#include "../../«gcp.contribFolder.removeFileSepChars»/«gcp.libconfigFolder.removeFileSepChars»/libconfig.h++"
			«FOR taskDefinition : taskingEnvironmentHelper.taskDefinitions»
				#include "«getAbstractName(taskDefinition.name)».h"
			«ENDFOR»
			
			namespace «gcp.projectName» {
			
				class «getClassName» {
					
					libconfig::Config cfg;
					
					public:
						«getClassName»();
						~«getClassName»();
						int loadFile(const char * file);
						«FOR taskDefinition : taskingEnvironmentHelper.taskDefinitions»
							int getParameters(«getAbstractName(taskDefinition.name)»::Parameters &parameters, const char * instanceName);
						«ENDFOR»
						
					enum Status {SUCCESS = 0, FILE_NOT_FOUND = 1, INVALID_FILE = 2, PARAMETERS_NOT_COMPLETE = 3};
				};
			}
			#endif /* «getClassName.constantsName»_H_ */
		'''
	
	override compileAbstractSource() '''
			«getGenerationAbstractSourceDescription("CppEnvironmentConfigurationLoaderTemplate.xtend")»
			
			#include "«getClassName».h"
			#include <iostream>
			#include <sstream>
			
			using namespace std;
			using namespace libconfig;
				
			«gcp.projectName»::«getClassName»::«getClassName»(): cfg() {
			}
			
			«gcp.projectName»::«getClassName»::~«getClassName»(){
			}
			
			int «gcp.projectName»::«getClassName»::loadFile(const char * file) {
				try {
					cfg.readFile(file);
				} catch (const FileIOException &fioex) {
					std::cerr << "I/O error while opening file." << std::endl;
					return FILE_NOT_FOUND;
				} catch (const ParseException &pex) {
					std::cerr << "Parse error at " << pex.getFile() << ":" << pex.getLine() << " - " << pex.getError() << std::endl;
					return INVALID_FILE;
				}
				return SUCCESS;
			}
			
			«FOR taskDefinition : taskingEnvironmentHelper.taskDefinitions»
				«printGetParametersMethod(taskDefinition)»
			«ENDFOR»
		'''
	
	override compileHeader() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override compileSource() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}
	