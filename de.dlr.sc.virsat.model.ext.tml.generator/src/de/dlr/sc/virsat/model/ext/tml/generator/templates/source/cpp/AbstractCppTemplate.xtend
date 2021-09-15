/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
 package de.dlr.sc.virsat.model.ext.tml.generator.templates.source.cpp

import de.dlr.sc.virsat.model.ext.tml.generator.templates.AbstractTemplate
import de.dlr.sc.virsat.model.ext.tml.generator.templates.source.ISourceTemplate
import java.util.ArrayList
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType
import de.dlr.sc.virsat.model.ext.tml.structural.structural.BasicTypeDefinition
import de.dlr.sc.virsat.model.ext.tml.generator.IGenerationConfigurationProvider

abstract class AbstractCppTemplate extends AbstractTemplate implements ISourceTemplate {
	
	protected ArrayList<String> includes = new ArrayList();
	
	// Include handling
	protected def getIncludes() {
		var includeString = "";
		for (inc : includes) {
			includeString += '#include ' + inc + ' \n'
		}
		return includeString;
	}
	
	protected def void addIncludes(String header){
		if(!includes.contains(header)){
			includes.add(header);
		}
	}
	
	protected def void includeType(IType type, IGenerationConfigurationProvider gcp) {
		if(type instanceof BasicTypeDefinition) {
			if(!type.customSource) {
				if(type.source!==null) {
					val header = '<'+type.source+'>';
					if(!includes.contains(header)){
						includes.add(header);
					}
				}
			} 
			else {
				if(type.source!==null){
					val header = '"'+type.source+'.h"';
					if(!includes.contains(header)){
						includes.add(header);
					}
				}
			}
		} 
		else {
			val header = '"' + type.name + '.h"';
			if (!includes.contains(header)) {
				includes.add(header);
			}
		}
	}
}
