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
import de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.ExternalTypeImpl
import org.eclipse.emf.common.util.EList
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType

class CppDataTypeTemplate extends AbstractTaskingTemplate {

	protected DataType datatype = null;
	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;

	new(DataType dataType) {
		datatype = dataType;
		initIncludes(datatype);
	}
	
	private def void initIncludes(DataType datatype){
		for(att : datatype.attributes){
			includeType(att.typeOf, gcp)
		}
		if ( datatype.superType !== null ) {
			includeType(datatype.superType, gcp)
			if(datatype.superType instanceof ExternalTypeImpl){
				if(!datatype.superType.attributes.isNullOrEmpty) {
					for(att : datatype.superType.attributes){
						includeType(att.typeOf, gcp);
					}
				}
			}
		}
	}
	
	def CharSequence usePacketizer(Attribute att, String nested, boolean write) '''
			«IF !att.isIsConst»
				«IF att.typeOf instanceof Enumeration»
					serialBuf.«IF write»writeEnum«ELSE»readEnum«ENDIF»(«IF nested!==null»«nested».«ENDIF»«att.name»);
				«ELSEIF att.typeOf instanceof BasicTypeDefinition»
					«IF hasAppropriateSize(att)»
						«IF !att.isArray»
							serialBuf.«IF write»write«ELSE»read«ENDIF»(«IF nested !== null»«nested».«ENDIF»«att.name»);
						«ELSEIF att.is1DArray»
							for(int i = 0; i < «att.dimensions.get(0).size»; i++){
								serialBuf.«IF write»write«ELSE»read«ENDIF»(«IF nested !== null»«nested».«ENDIF»«att.name»[i]);
							}
						«ELSEIF att.is2DArray»
							for(int i = 0; i < «att.dimensions.get(0).size»; i++){
								for(int j = 0; j < «att.dimensions.get(1).size»; j++){
									serialBuf.«IF write»write«ELSE»read«ENDIF»(«IF nested!==null»«nested».«ENDIF»«att.name»[i][j]);
								}
							}
						«ELSE»
							//do not handle more than two dimensional array...
						«ENDIF»
					«ENDIF»
				«ELSE /*If complex type..*/»
					«IF !att.isArray»
						«FOR nestedAtt : att.getNestedAttributes»
							«IF nested !== null»
								«usePacketizer(nestedAtt, nested+"."+att.name, write)»
							«ELSE»
								«usePacketizer(nestedAtt, att.name, write)»
							«ENDIF»
						«ENDFOR»
					«ENDIF»
				«ENDIF»
			«ENDIF»
		'''

	def String declareUnsignedCharAsInt(Attribute att) {
		var result = "";
		if(att.hasAppropriateSize && !att.isIsConst){
			if (!(att.typeOf instanceof BasicTypeDefinition) && 
				!(att.typeOf instanceof Enumeration)) {
				for (nestedAtt : att.getNestedAttributes) {
					result += declareUnsignedCharAsInt(nestedAtt)
				}
			} 
			else {
				if (att.typeOf.name.equals(T_STRING_UCHAR) || att.typeOf.name.equals(T_STRING_UINT8_T)){
					if(!att.isArray){
						result += '''int «att.name»;'''
					}
					else if(att.is1DArray ){
						result += '''int «att.name»[«att.dimensions.get(0).size»];'''
					}
					else if(att.is2DArray){
						result += '''int «att.name»[«att.dimensions.get(0).size»][«att.dimensions.get(1).size»];'''
					}
				}
			}
		}
		return result
	}
	
	def String assignIntAsUnsignedChar(Attribute att) {
		var result = "";
		if(att.hasAppropriateSize && !att.isIsConst) {
			if (!(att.typeOf instanceof BasicTypeDefinition) && !(att.typeOf instanceof Enumeration)) {
				for (nestedAtt : att.getNestedAttributes) {
					result += declareUnsignedCharAsInt(nestedAtt)
				}
			}
			else {
				if (att.typeOf.name.equals(T_STRING_UCHAR) || att.typeOf.name.equals(T_STRING_UINT8_T)){
					if(!att.isArray){
						result += '''this->«att.name» = «att.name»;'''	
					}
					else if(att.is1DArray){
						result += get1DIteration(att);
					}
					else if(att.is2DArray){
						result += get2DIteration(att);
					}
				}
			}
		}
		return result
	}
	
	def CharSequence get1DIteration(Attribute att)'''
			for(int i=0; i<«att.dimensions.get(0).size»; i++){
				this->«att.name»[i] = «att.name»[i];
			}
		'''
	
	def CharSequence get2DIteration(Attribute att)'''
			for(int i=0; i<«att.dimensions.get(0).size»; i++){
				for(int j=0; j<«att.dimensions.get(1).size»; j++){
					this->«att.name»[i][j] = «att.name»[i][j];
				}
			}
		'''
	
	def String getAttributeStreamElement(	Attribute att, 
											boolean declaration, 
											String nested, 
											String streamOperator,
											String postfix, 
											boolean write, 
											String tmpConstant) {
		var result = "";
		if (att.hasAppropriateSize) 
		{
			if (!(att.typeOf instanceof BasicTypeDefinition) && 
				!(att.typeOf instanceof Enumeration)) {
				for (nestedAtt : att.getNestedAttributes) {
					if (nested !== null) {
						result += getAttributeStreamElement(nestedAtt as Attribute, 
															declaration, 
															nested + "." + att.name, 
															streamOperator, 
															postfix, 
															write, 
															tmpConstant)
					} else {
						result += getAttributeStreamElement(nestedAtt as Attribute, 
															declaration, 
															att.name, 
															streamOperator, 
															postfix,
															write, 
															tmpConstant)
					}
				}
			} else if (att.is1DArray) {
				for (i : 0 .. att.dimensions.get(0).size - 1) {
					result += streamOperator + ' '
	
					if (declaration) {
						result += '"'
					}
					if (nested !== null && (!att.isIsConst || !write)) {
						result += nested + '.'
					}
					if (write && att.isIsConst) {
						result += tmpConstant
					} else {
						result += getArrayAttributeStreamElement(att, i, declaration, write)
					}
					if (declaration) {
						result += '"'
					}
					result += postfix
				}
			} else if (!att.isArray) {
				result += streamOperator + ' '
	
				if (declaration) {
					result += '"'
				}
				if (nested !== null && (!att.isIsConst || !write)) {
					result += nested + '.'
				}
				if (write && att.isIsConst) {
					result += tmpConstant
				} else {
					result += getSimpleAttributeStreamElement(att, write)
				}
				if (declaration) {
					result += '"'
				}
				result += postfix			 
			}
		}
		return result;
	}
	
	def getConstAttributeName(Attribute att){
		return getConstantsName(datatype.name+'_'+att.name);
	}
	
	def String getSimpleAttributeStreamElement(Attribute att, boolean write) 
	'''«IF (att.typeOf.name.equals(T_STRING_UCHAR) || att.typeOf.name.equals(T_STRING_UINT8_T)) && !write»(unsigned int)«ENDIF»«IF att.isIsConst»«getConstantsName(att.name)»«ELSE»«att.name»«ENDIF»'''


	def String getArrayAttributeStreamElement(Attribute att, int index, boolean declaration, boolean write) 
	'''«IF (att.typeOf.name.equals(T_STRING_UCHAR) || att.typeOf.name.equals(T_STRING_UINT8_T)) && !write »(unsigned int)«ENDIF»«att.name»«IF declaration»_«index»«ELSE»[«index»]«ENDIF»'''
	
	
	private def getUsedNamespaces(EList<Attribute> attributes)'''
			«FOR att : attributes»
				«IF att.typeOf instanceof Enumeration»
				using namespace «getNamespaceName(att.typeOf.name)»;«ENDIF»
			«ENDFOR»	
		'''
	
	private def printArgParameter(Attribute att, boolean printType, boolean printValue) {
		var ret = "";
		if (printType){
			ret += '''«getCppDataTypeName(att)» «att.name»'''
		} else {
			if(printValue){
				ret += getBasicTypeInitialValue(att);
			}
			else { 
				ret += att.name
			}
		}
		return ret;
	}
	
	private def printArgParameters(boolean printType, boolean printValue){
		var ret = "";
		if(datatype.superType instanceof ExternalTypeImpl){
			ret += '''«FOR att : datatype.superType.attributes SEPARATOR ", "»«printArgParameter(att, printType, printValue)»«ENDFOR»'''
		}
		return ret;
	}	
	
	private def printArgParameters(boolean printType){
		return printArgParameters(printType, false)
	}
	
	private def CharSequence getConstructor(boolean isAbstract){
		var ret = "";
		if(datatype.superType !== null) {
			if(isAbstract) {
				ret += '''«getAbstractName(datatype.name)»(«printArgParameters(true)») : «datatype.superType.name»(«printArgParameters(false)»){ };'''
				if(datatype.superType instanceof ExternalTypeImpl){
					if(!datatype.superType.attributes.nullOrEmpty){
						ret += '''
							«getAbstractName(datatype.name)»() : «datatype.superType.name»(«printArgParameters(false, true)»){ };'''
					}
				}
			} else {
				ret += '''«datatype.name»(«printArgParameters(true)») : «getAbstractName(datatype.name)»(«printArgParameters(false)»){ };'''
				if(datatype.superType instanceof ExternalTypeImpl){
					if(!datatype.superType.attributes.nullOrEmpty){
						ret += '''
							«datatype.name»() : «getAbstractName(datatype.name)»(){ };'''
					}
				}
			}
		}
		else {
			ret += '''«IF isAbstract»«getAbstractName(datatype.name)»«ELSE»«datatype.name»«ENDIF»(){ };'''
		}
		return ret;
	}
			
	
	override String compileHeader() '''
			«getGenerationHeaderDescription("CppDataTypeTemplate.xtend")»
	
			#ifndef «getConstantsName(datatype.name)»_H_
			#define «getConstantsName(datatype.name)»_H_
					
			#include "«getAbstractName(datatype.name)».h"
				
			namespace «gcp.projectName» {
				namespace DataTypes {
					
						class «datatype.name» : public «getAbstractName(datatype.name)» {
						
						public:
							«getConstructor(false)»
					};
				}
			}
			#endif /*  «getConstantsName(datatype.name)»_H_ */
		'''

	override String compileAbstractHeader() '''
			«getGenerationAbstractHeaderDescription("CppDataTypeTemplate.xtend")»
			
			#ifndef «getConstantsName(getAbstractName(datatype.name))»_H_
			#define «getConstantsName(getAbstractName(datatype.name))»_H_
			
			#include <time.h>
			#include <stdint.h>
			#include <stdio.h>
			#include <stdlib.h>
			#include <string> // std::string
			#include <sstream> // std::istringstream
			#include <fstream> // std::ofstream
			#include <iostream> // std::cout
			«IF false»
				#include "DataPackage.h"
				#include "Packetizer.h"
			«ENDIF»
			
			«getIncludes»
					
			namespace «gcp.projectName» {
				namespace DataTypes {
					
					«getUsedNamespaces(datatype.attributes)»
						
					class «getAbstractName(datatype.name)» «IF (datatype.superType !== null)»: public «datatype.superType.name» «ENDIF»{
						public:
													
							«getConstructor(true)»
							
							«getAttributesDeclaration(datatype.attributes, true)»
							
							void serializeLogHeader(std::ofstream& stream){
								time_t _tm = time(NULL);
								
								struct tm * curtime = localtime( &_tm);
								 
								stream << "%% «datatype.name» - " << asctime(curtime); 
								stream << "% "
									«FOR att : datatype.attributes»
										«getAttributeStreamElement(att, true, null, '<<', ' << \"\\t\" ', false, '')»
									«ENDFOR»
									<< "\n";
							}
							
							void serializeLog(std::ofstream& stream){
								stream
									«FOR att : datatype.attributes»
										«getAttributeStreamElement(att, false, null, '<<', " << \"\\t\" ", false, '')»
									«ENDFOR»
									<< "\n";
							}
							
							void deserializeLog(std::string line) {
								//Tmp variable to ignore constants
								double tmp;
								std::istringstream lineStream(line);
								«FOR att : datatype.attributes»
									«declareUnsignedCharAsInt(att)»
								«ENDFOR»
								
								lineStream 
									«FOR att : datatype.attributes»
										«getAttributeStreamElement(att, false, null, '>>', '', true, 'tmp')»
									«ENDFOR»
								;
								«FOR att : datatype.attributes»
									«assignIntAsUnsignedChar(att)»
								«ENDFOR»
							}
							
							«IF false»
								void serialize(Packetizer& serialBuf) {
									DataPackage::serialize(serialBuf);
									«FOR att : datatype.attributes»
										«usePacketizer(att, null, true)»
									«ENDFOR»
								}
								
								void deserialize(Packetizer& serialBuf) {
									«FOR att : datatype.attributes»
										«usePacketizer(att, null, false)»
									«ENDFOR»
								}
							«ENDIF»
					};
				}
			}
			#endif /*  «getConstantsName(getAbstractName(datatype.name))»_H_ */
		'''
		
	override compileAbstractSource() ''''''
	
	override compileSource() ''''''
		

}
