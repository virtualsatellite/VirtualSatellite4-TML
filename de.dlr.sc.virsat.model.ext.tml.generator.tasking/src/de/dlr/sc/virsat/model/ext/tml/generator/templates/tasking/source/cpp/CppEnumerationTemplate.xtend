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
import de.dlr.sc.virsat.model.ext.tml.structural.structural.Enumeration

class CppEnumerationTemplate extends AbstractTaskingTemplate {

	protected IGenerationConfigurationProvider gcp = GenerationConfigurationProvider.instance;
	protected Enumeration enumeration;
	
	new(Enumeration enumeration){
		this.enumeration = enumeration;
	}
	
	private def String inLineCommands() '''					
			//return the enum as integer
			inline std::ostream& operator << (std::ostream& os, const «enumeration.name»& obj)
			{
			   os << static_cast<std::underlying_type<«enumeration.name»>::type>(obj);
			   return os;
			}
			  
			inline std::istream& operator >> (std::istream& is, «enumeration.name»& obj)
			{
			   unsigned int tmp = 0;
			   if (is >> tmp)
			     obj = static_cast<«enumeration.name»>(tmp);
			   return is;
			}
			  
			inline int toInt(const «enumeration.name»& obj){
			   return static_cast<std::underlying_type<«enumeration.name»>::type>(obj);
			}
			
			inline const char* getLiteralString(«enumeration.name» «getObjectName(enumeration.name)»){
				switch(«getObjectName(enumeration.name)»){
				 		«FOR literal : enumeration.literals»
				 			case «literal.name»: return "«literal.name»";
				 		«ENDFOR»
			
					default: return "No valid value!";
				};
			}
		'''
	
	private def allKeyDefined() {
		var ret = true;
		if(!enumeration.literals.nullOrEmpty){
			var key = 0;
			for(literal : enumeration.literals){
				if(literal.keyNum === 0 && key !== 0){
					return false
				}
				key++;
			}
		} else {
			ret = false;
		}
		return ret;
	}
	
	private def getFirstKey() {
		var ret = 0;
		if(!enumeration.literals.nullOrEmpty) {
			ret = enumeration.literals.get(0).keyNum;
		}
		return ret;
	}
	
	override String compileHeader() '''
			#ifndef «getConstantsName(getAbstractName(enumeration.name))»_H_
			#define «getConstantsName(getAbstractName(enumeration.name))»_H_
			
			«getGenerationHeaderDescription("CppDataTypeTemplate.xtend")»
			
			#include <type_traits>
			#include <ostream>
			#include <stdint.h>
			#include <iostream>
			
			namespace «gcp.projectName» {
				namespace DataTypes {
					namespace «getNamespaceName(enumeration.name)» {
							
						enum «enumeration.name» {
							«IF allKeyDefined»
								«FOR literal : enumeration.literals SEPARATOR ','»
									«literal.name» = «literal.keyNum»
								«ENDFOR»
							«ELSE»
								«var key = getFirstKey»
								«FOR literal : enumeration.literals SEPARATOR ','»
									«literal.name» = «key++»
								«ENDFOR»
							«ENDIF»
						};
						«inLineCommands»
					}
				}
			}
			#endif /*  «getConstantsName(getAbstractName(enumeration.name))»_H_ */
		'''

	override String compileAbstractHeader() '''
		'''

	override compileAbstractSource() ''''''

	override compileSource() ''''''
	
	
}
	