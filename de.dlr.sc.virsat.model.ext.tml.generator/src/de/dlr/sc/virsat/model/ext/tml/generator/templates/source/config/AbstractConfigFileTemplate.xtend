/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.templates.source.config

import de.dlr.sc.virsat.model.ext.tml.generator.templates.AbstractTemplate
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.IConfigFileTemplate
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration
import org.eclipse.emf.common.util.EList

abstract class AbstractConfigFileTemplate extends AbstractTemplate implements IConfigFileTemplate {	
	
	def String printConfiguration(String className, EList<Attribute> attributes, boolean isTestConfig) '''
		«className»:
		{
			«FOR att : attributes»
				«printConfiguration(att, isTestConfig)»
			«ENDFOR»
		};
	'''
	
	def String printConfiguration(Attribute att, boolean isTestConfig) {
		var result = "";
		if(att.hasAppropriateSize && !att.isIsConst){
			if (!(att.typeOf instanceof BasicTypeDefinition) && 
				!(att.typeOf instanceof Enumeration)) {
				result += printConfiguration(att.name, att.getNestedAttributes, isTestConfig)
			} else {
				result += printLowLevelConfiguration(att, isTestConfig)
			}
		}
		return result
	}
	
	def String printLowLevelConfiguration(Attribute att, boolean isTestConfig) {
		var result = "";
		if(!att.isArray){
			result += '''«att.name» = «getDefaultValue(att, isTestConfig, true)»;'''
		}
		else if(att.is1DArray ){
			result += '''«att.name» = [«getDefaultValueSequence(att, isTestConfig)»];'''
		}
		else if(att.is2DArray){
			result += '''«att.name» = («FOR i : 1 .. att.dimensions.get(1).size»(«getDefaultValueSequence(att, isTestConfig)»)«IF att.dimensions.get(1).size != i»,«ENDIF»«ENDFOR»);'''
		}
		return result
	}
	
	def getDefaultValueSequence(Attribute att, boolean isTestConfig)
	'''«FOR i : 1 .. att.dimensions.get(0).size»«getDefaultValue(att, isTestConfig, true)»«IF att.dimensions.get(0).size != i»,«ENDIF»«ENDFOR»'''
		
}
