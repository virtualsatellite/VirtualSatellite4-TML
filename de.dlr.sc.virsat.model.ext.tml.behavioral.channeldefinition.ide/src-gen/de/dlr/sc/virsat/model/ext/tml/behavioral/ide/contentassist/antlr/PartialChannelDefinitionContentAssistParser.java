/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.ide.contentassist.antlr;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.partialEditing.IPartialEditingContentAssistParser;
import org.eclipse.xtext.util.PolymorphicDispatcher;

public class PartialChannelDefinitionContentAssistParser extends ChannelDefinitionParser implements IPartialEditingContentAssistParser {

	private AbstractRule rule;

	@Override
	public void initializeFor(AbstractRule rule) {
		this.rule = rule;
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		if (rule == null || rule.eIsProxy())
			return Collections.emptyList();
		String methodName = "entryRule" + rule.getName();
		PolymorphicDispatcher<Collection<FollowElement>> dispatcher = 
			new PolymorphicDispatcher<Collection<FollowElement>>(methodName, 0, 0, Collections.singletonList(parser));
		dispatcher.invoke();
		return parser.getFollowElements();
	}

}
