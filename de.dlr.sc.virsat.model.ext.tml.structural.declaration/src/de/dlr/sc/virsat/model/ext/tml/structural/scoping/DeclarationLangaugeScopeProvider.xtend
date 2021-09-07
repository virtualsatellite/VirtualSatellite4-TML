/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.scoping

import de.dlr.sc.virsat.model.ext.tml.structural.structural.Attribute
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType
import de.dlr.sc.virsat.model.ext.tml.structural.structural.IType
import de.dlr.sc.virsat.model.ext.tml.structural.structural.ReferenceFrameDefinition
import de.dlr.sc.virsat.model.ext.tml.structural.structural.UnitDefinition
import de.dlr.sc.virsat.model.ext.tml.util.ResourceUtil
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
class DeclarationLangaugeScopeProvider extends AbstractDeclarationLangaugeScopeProvider {

	override getScope(EObject context, EReference reference) {

		// property type scope
		// reference frame scope
		if (context instanceof Attribute &&
			reference.name.equals(de.dlr.sc.virsat.model.ext.tml.structural.model.Attribute.PROPERTY_REFERENCEFRAME)) {
			var allElements = getDMFFrameList(context)
			return Scopes.scopeFor(allElements, IScope.NULLSCOPE);

		} else if (context instanceof Attribute &&
			reference.name.equals(de.dlr.sc.virsat.model.ext.tml.structural.model.Attribute.PROPERTY_TYPEUNIT)) {
			var allElements = getDMFUnitList(context)
			return Scopes.scopeFor(allElements, IScope.NULLSCOPE);

		} else if (context instanceof Attribute) {
			var allElements = getDMFTypeList(context)
			return Scopes.scopeFor(allElements, IScope.NULLSCOPE);
		}

		// extends Scope
		if (context instanceof DataType) {
			var allElements = getDMFDataTypeList(context)
			allElements.add(context.eContainer)
			return Scopes.scopeFor(allElements, IScope.NULLSCOPE);
		}

		val scopes = super.getScope(context, reference);
		return scopes;
	}

	private def getDMFDataTypeList(EObject context) {
		return ResourceUtil.getAllDObjectsInCurrentTree(context, typeof(DataType));
	}

	private def getDMFFrameList(EObject context) {
		return ResourceUtil.getAllDObjectsInCurrentTree(context, typeof(ReferenceFrameDefinition));
	}

	private def getDMFTypeList(EObject context) {
		var types = ResourceUtil.getAllDObjectsInCurrentTree(context, typeof(IType));
		return types.filter[t| {
			if (t instanceof DataType) {
				return !t.abstractType
			}
			return true;
		}]
	}

	private def getDMFUnitList(EObject context) {
		return ResourceUtil.getAllDObjectsInCurrentTree(context, typeof(UnitDefinition));
	}

}
