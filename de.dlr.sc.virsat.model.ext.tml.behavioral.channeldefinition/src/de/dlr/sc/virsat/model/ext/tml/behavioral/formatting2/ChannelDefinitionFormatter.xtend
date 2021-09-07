/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
 package de.dlr.sc.virsat.model.ext.tml.behavioral.formatting2

import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.BehavioralParameterDefinition
import de.dlr.sc.virsat.model.ext.tml.behavioral.behavioral.ChannelBehaviorDefinition
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument


class ChannelDefinitionFormatter extends AbstractFormatter2 {
	
	//@Inject extension ChannelDefinitionGrammarAccess

	def dispatch void format(ChannelBehaviorDefinition channelBehaviorDefinition, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (BehavioralParameterDefinition parameters : channelBehaviorDefinition.getParameters()) {
			parameters.format;
		}
	}
	
	// TODO: implement for 
}
