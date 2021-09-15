/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.parser.antlr;

import com.google.inject.Inject;
import de.dlr.sc.virsat.model.ext.tml.behavioral.parser.antlr.internal.InternalChannelDefinitionParser;
import de.dlr.sc.virsat.model.ext.tml.behavioral.services.ChannelDefinitionGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ChannelDefinitionParser extends AbstractAntlrParser {

	@Inject
	private ChannelDefinitionGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalChannelDefinitionParser createParser(XtextTokenStream stream) {
		return new InternalChannelDefinitionParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ChannelBehaviorDefinition";
	}

	public ChannelDefinitionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ChannelDefinitionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
