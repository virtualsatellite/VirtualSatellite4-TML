/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.EnumValueType
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration
import de.dlr.sc.virsat.model.ext.tml.structural.structural.impl.EnumerationImpl
import org.eclipse.emf.common.util.EList
import de.dlr.sc.virsat.model.dvlm.general.IName

abstract class AbstractTemplate {
	
	protected final int MAX_SERIALIZABLE_ARRAY_SIZE = 100;
	
	protected final String T_STRING_BOOL = "bool";
	protected final String T_STRING_CHAR = "char";
	protected final String T_STRING_DOUBLE = "double";
	protected final String T_STRING_FLOAT = "float";
	protected final String T_STRING_INT = "int";
	protected final String T_STRING_INT16_T = "int16_t";
	protected final String T_STRING_INT64_T = "int64_t";
	protected final String T_STRING_INT8_T = "int8_t";
	protected final String T_STRING_LONG = "long";
	protected final String T_STRING_UCHAR = "uchar";	
	protected final String T_STRING_UINT = "uint";	
	protected final String T_STRING_UINT16_T = "uint16_t";
	protected final String T_STRING_UINT64_T = "uint64_t";
	protected final String T_STRING_UINT8_T = "uint8_t";
	protected final String T_STRING_ULONG = "ulong";
				
	def getCppDataTypeName(Attribute att) {
		switch (att.typeOf.name){
			case T_STRING_CHAR : return "char *"
			case T_STRING_UCHAR : return "unsigned char"
			case T_STRING_UINT : return "unsigned int"
			case T_STRING_ULONG : return "unsigned long"
			default : {
				if(att.typeOf instanceof Enumeration){
					getNamespaceName(att.typeOf.name) + "::" + att.typeOf.name
				} else {
					att.typeOf.name
				}
			}
		}
	}
	
	def getBasicTypeInitialValue(Attribute att) {
		getDefaultValue(att.typeOf.name)
	}
	
	def getElementName(IName element) {
		return element.name
	}
	
	// Create Names
	def getAbstractName(String name){
		return 'A'+name;
	}

	def getObjectName(String className) {
		var firstChar = className.substring(0, 1).toLowerCase;
		return firstChar + className.substring(1, className.length)
	}

	def getClassName(String objectName) {
		var firstChar = objectName.substring(0, 1).toUpperCase;
		return firstChar + objectName.substring(1, objectName.length)
	}

	def getConstantsName(String className) {
		var constantName = className;
		if (!constantName.toUpperCase().equals(constantName)) {
			var uC = 0;
			for (var i = 1; i < className.length; i++) {
				if (Character.isUpperCase(className.charAt(i))) {
					constantName = new StringBuffer(constantName).insert(i + uC, "_").toString();
					uC++;
				}
			}
		}
		return constantName.toUpperCase
	}

	def getAcronym(String className) {
		var acro = "";
		for (var i = 1; i < className.length; i++) {
			var charI = className.charAt(i)
			if (Character.isUpperCase(charI)) {
				acro += charI
			}
		}
		return acro
	}
	
	def getNamespaceName(String enumName){
		return "NS"+getClassName(enumName);
	}
	
	def CharSequence removeLastChar(CharSequence chars) {
		if(chars === null){
			return "";
		} else {
			if(chars.length > 0){
				val c = removeLineDelimiter(chars)
				if (c.length > 0){
					return c.subSequence(0, c.length-1);
				}
				return c;
			}
			return chars;
		}
	}

	def CharSequence removeLineDelimiter(CharSequence chars){
		return chars.subSequence(0, chars.length-2);
	}
	
	def String removeFileSepChars(String filename){
		var fn = filename;
		if(fn.startsWith('\\') || fn.startsWith('/'))
			fn = fn.substring(1);
		
		if(fn.endsWith('\\') || fn.endsWith('/'))
			fn = fn.substring(0, fn.length-1);
		
		return fn;
	}
		  
   	protected def getInputKeyName(String inputName) {
    	return "INPUT_KEY_"+getConstantsName(inputName);
	}
	
	protected def boolean channelHasSize(ChannelBehaviorDefinition channelBehaviorDefinition) {
		return channelHasSize(channelBehaviorDefinition.parameters);
	}
	
	private def boolean channelHasSize(EList<BehavioralParameterDefinition> behavioralParameterDefinitions) {
		val sizeParameter = behavioralParameterDefinitions.findFirst[p|p.name.compareToIgnoreCase("size") === 0];
		if(sizeParameter !== null){
			return true;
		}
		return false;
	}
	
	protected def declareAttribute(Attribute att, boolean declareAsStatic)'''
		«IF att !== null»
			«IF att.isIsConst»«IF declareAsStatic»static «ENDIF»const «ENDIF»«getCppDataTypeName(att)» «IF att.isIsConst»«getConstantsName(att.name)»«ELSE»«att.name»«ENDIF»«FOR dim : att.dimensions»[«dim.size»]«ENDFOR»«IF !att.valueLiteral.isNullOrEmpty» = «att.value»«ENDIF»;
			«IF !att.maxValueLiteral.isNullOrEmpty»static const «getCppDataTypeName(att)» MAX_«getConstantsName(att.name)» = «att.maxValueLiteral»;«ENDIF»
			«IF !att.minValueLiteral.isNullOrEmpty»static const «getCppDataTypeName(att)» MIN_«getConstantsName(att.name)» = «att.minValueLiteral»;«ENDIF»
		«ENDIF»
	'''
	
	protected def getAttributesDeclaration(EList<Attribute> attributes, boolean declareAsStatic) '''
		«FOR att : attributes»
			«declareAttribute(att, declareAsStatic)»
		«ENDFOR»	
	'''
				
	protected def EList<Attribute> getNestedAttributes(Attribute att){
		var getAttMethodObj = att.typeOf.class.methods.findFirst[m | m.name === 'getAttributes'];
		if(getAttMethodObj !== null){
			return getAttMethodObj.invoke(att.typeOf) as EList<Attribute>;
		}
	}
		
	protected def int getConstAttributesCount(EList<Attribute> attributes){
		var ret = 0;
		if(!attributes.isNullOrEmpty){
			for(att : attributes) {
				if (!(att.typeOf instanceof BasicTypeDefinition) && 
					!(att.typeOf instanceof Enumeration)){
					ret += getConstAttributesCount(att.getNestedAttributes);
				}
				else {
					if (att.isIsConst){
						ret += 1;
					}
				}
			}
		}
		return ret;
	}

	protected def boolean hasAppropriateSize(Attribute att){
		return hasAppropriateSize(att, MAX_SERIALIZABLE_ARRAY_SIZE);
	}
		
	private def boolean hasAppropriateSize(Attribute att, int max_size){
		if(!att.isArray){
			return true;
		}
		else {
			if(att.is1DArray){
				return att.dimensions.get(0).size <= max_size;
			}
			else if(att.is2DArray) {	
				return att.dimensions.get(0).size*att.dimensions.get(1).size <= (max_size*max_size);
			}
		}
		return false;
	}
	
	protected def boolean isArray(Attribute att){
		return !att.dimensions.isNullOrEmpty;
	}
	
	protected def boolean is1DArray(Attribute att){
		return isArray(att) && att.dimensions.size == 1;
	}
	
	protected def boolean is2DArray(Attribute att){
		return isArray(att) && att.dimensions.size == 2;
	}
	
	protected def getValue(Attribute att) {
		if (!att.valueLiteral.isNullOrEmpty){
			var ret = "";
			if(att.typeOf.name.equalsIgnoreCase(T_STRING_CHAR)) {
				ret += "\""
			}
			ret += att.valueLiteral
			if(att.typeOf.name.equalsIgnoreCase(T_STRING_CHAR)) {
				ret += "\""
			}
			return ret;
		}
		return getDefaultValue(att);
	}
	
	protected def getDefaultValue(Attribute att){
		return getDefaultValue(att, false);
	}
	
	protected def getDefaultValue(Attribute att, boolean isTest){
		return getDefaultValue(att, isTest, false);
	}
	
	protected def getDefaultValue(Attribute att, boolean isTest, boolean isConfigFile){
		if(att.typeOf instanceof Enumeration) {
			val enumeration = att.typeOf as EnumerationImpl
			if(isConfigFile){
				return enumeration.literals.get(0).keyNum;
			} else {
				return '''DataTypes::«getNamespaceName(enumeration.name)»::«enumeration.name»::«enumeration.literals.get(0).name»'''
			}
		}
		else {
			if(isTest){
				return getDefaultValueForTest(att.typeOf.name);
			} else {
				return getDefaultValue(att.typeOf.name);
			}
		}
	}
	
	private def getDefaultValue(String typename){
		switch (typename){
			case T_STRING_BOOL : return false
			
			case T_STRING_CHAR : return "\"\""
			case T_STRING_UCHAR : return "0"
			
			case T_STRING_FLOAT : return "0.0"
			case T_STRING_DOUBLE : return "0.0"
			
			case T_STRING_INT : return "0"
			case T_STRING_INT8_T : return "0"
			case T_STRING_INT16_T : return "0"
			case T_STRING_INT64_T : return "0L"
			case T_STRING_LONG : return "0L"
			
			case T_STRING_UINT : return "0"
			case T_STRING_UINT8_T : return "0"
			case T_STRING_UINT16_T : return "0"
			case T_STRING_UINT64_T : return "0L"
			case T_STRING_ULONG : return "0L"
			default : return "NULL"
		}
	}
	
	private def getDefaultValueForTest(String typename){
		switch (typename){
			case T_STRING_BOOL : return true
			
			case T_STRING_CHAR : return "\"test string\""
			case T_STRING_UCHAR : return "255"
			
			case T_STRING_FLOAT : return "1.234"
			case T_STRING_DOUBLE : return "1.234"
			
			case T_STRING_INT : return "101112"
			case T_STRING_INT8_T : return "255"
			case T_STRING_INT16_T : return "8910"
			case T_STRING_INT64_T : return "2147483647L"
			case T_STRING_LONG : return "-2147483647L"
			
			case T_STRING_UINT : return "5678"
			case T_STRING_UINT8_T : return "256"
			case T_STRING_UINT16_T : return "1234"
			case T_STRING_UINT64_T : return "4294967295L"
			case T_STRING_ULONG : return "4294967295L"
			default : return "NULL"
		}
	}
	
	protected def getChannelParameterValue(BehavioralParameterDefinition behavioralParameterDefinition){
		if(!behavioralParameterDefinition.value.isNullOrEmpty) {
			if (behavioralParameterDefinition.valueType === EnumValueType.STRING) {
				return "\"" + behavioralParameterDefinition.value + "\"";
			} else {
				return behavioralParameterDefinition.value;
			}
		} else {
			return getParameterDefaultValue(behavioralParameterDefinition)
		}
	}
		
	private def getParameterDefaultValue(BehavioralParameterDefinition behavioralParameterDefinition){
		if (behavioralParameterDefinition.valueType === EnumValueType.INTEGER) {
			return getDefaultValue(T_STRING_INT);
		} 
		else if (behavioralParameterDefinition.valueType === EnumValueType.FLOAT) {
			return getDefaultValue(T_STRING_FLOAT);
		}
		else if (behavioralParameterDefinition.valueType === EnumValueType.STRING) {
			return getDefaultValue(T_STRING_CHAR);
		}
	}
}
