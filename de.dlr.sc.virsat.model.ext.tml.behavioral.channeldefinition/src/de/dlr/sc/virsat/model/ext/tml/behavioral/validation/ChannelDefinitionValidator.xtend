/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
 package de.dlr.sc.virsat.model.ext.tml.behavioral.validation

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition
import de.dlr.sc.virsat.model.dvlm.general.GeneralPackage
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ChannelDefinitionValidator extends AbstractChannelDefinitionValidator {
	
	public static val INVALID_NAME = 'invalidName'

	@Check
	def checkGreetingStartsWithCapital(ChannelBehaviorDefinition channelBehaviorDefinition) {
		if (!Character.isUpperCase(channelBehaviorDefinition.name.charAt(0))) {
			error('Name should start with a capital', 
					GeneralPackage.Literals.INAME__NAME,
					INVALID_NAME)
		}
	}
	
}
