/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
 package de.dlr.sc.virsat.model.ext.tml.structural.declaration.validation

import org.eclipse.xtext.validation.Check
import de.dlr.sc.virsat.model.ext.tml.structural.structural.DataType
import de.dlr.sc.virsat.model.dvlm.general.GeneralPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DatatypeDefinitionValidator extends AbstractDatatypeDefinitionValidator {
	
	public static val INVALID_NAME = 'invalidName'

	@Check
	def checkGreetingStartsWithCapital(DataType dataType) {
		if (!Character.isUpperCase(dataType.name.charAt(0))) {
			warning('Name should start with a capital', 
					GeneralPackage.Literals.INAME__NAME,
					INVALID_NAME)
		}
	}
	
}
