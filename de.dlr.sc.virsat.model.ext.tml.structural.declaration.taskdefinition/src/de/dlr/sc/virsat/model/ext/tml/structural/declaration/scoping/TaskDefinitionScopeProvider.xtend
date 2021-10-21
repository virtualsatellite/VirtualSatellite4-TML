/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.scoping

import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskInputDefinition
import de.dlr.sc.virsat.model.ext.tml.structural.structural.TaskOutputDefinition
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class TaskDefinitionScopeProvider extends AbstractTaskDefinitionScopeProvider {

	override getScope(EObject context, EReference reference) {
		// input + output type scope
		if (contextOfInputOrOutput(context, reference)) {
			val dataTypes = getDMFDataTypeList(context)
			return Scopes.scopeFor(dataTypes, IScope.NULLSCOPE);
		}

		val scopes = super.getScope(context, reference);
		return scopes;

	}
	
	private def contextOfInputOrOutput(EObject context, EReference reference) {
		var ret = context instanceof TaskInputDefinition || context instanceof TaskOutputDefinition;
		ret = ret && (reference.name.equals(de.dlr.sc.virsat.model.ext.tml.structural.model.TaskInputDefinition.PROPERTY_DATATYPE) 
					|| reference.name.equals(de.dlr.sc.virsat.model.ext.tml.structural.model.TaskOutputDefinition.PROPERTY_DATATYPE));
		return ret
	}

	private def List<DataType> getDMFDataTypeList(EObject context) {
		val dataTypes = ResourceUtil.getAllDObjectsInCurrentTree(context, typeof(DataType));
		return dataTypes.map(d | d as DataType)
						.filter[!isAbstractType]
						.toList
	}

}
