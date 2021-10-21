/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;

import de.dlr.sc.virsat.model.ext.tml.resource.VirsatTransientValueService;
import de.dlr.sc.virsat.model.ext.tml.structural.structural.StructuralPackage;

/**
 * Ignores serialized value when serializing the data type
 * @author fran_tb
 *
 */
public class DatatypeTransientValueService extends VirsatTransientValueService implements ITransientValueService {

	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		// In case the feature is pointing to the Attribute UUID we will sayy it is transient
		// In the XMI serialization it is not but the xtext language doesn't know it
		// In case it would be set to yes, the language would complain that it cannot be processed
		if (feature.equals(StructuralPackage.Literals.DATA_TYPE__SERIALIZED_DEFINITION)) {
			return true;
		}

		
		// Handle all others as exepcted.
		return super.isTransient(owner, feature, index);
	}
	
}
