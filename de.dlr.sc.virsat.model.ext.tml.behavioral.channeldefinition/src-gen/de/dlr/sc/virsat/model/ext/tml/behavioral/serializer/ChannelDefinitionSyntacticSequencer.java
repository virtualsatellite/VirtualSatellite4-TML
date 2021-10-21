/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.serializer;

import com.google.inject.Inject;
import de.dlr.sc.virsat.model.ext.tml.behavioral.services.ChannelDefinitionGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ChannelDefinitionSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ChannelDefinitionGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ChannelBehaviorDefinition_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ChannelDefinitionGrammarAccess) access;
		match_ChannelBehaviorDefinition_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getChannelBehaviorDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getChannelBehaviorDefinitionAccess().getRightCurlyBracketKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getChannelBehaviorDefinitionAccess().getSemicolonKeyword_5_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ChannelBehaviorDefinition_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__.equals(syntax))
				emit_ChannelBehaviorDefinition_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ';'
	 *
	 * This ambiguous syntax occurs at:
	 *     implName=EString (ambiguity) (rule end)
	 *     storageType=EnumStorageType (ambiguity) (rule end)
	 */
	protected void emit_ChannelBehaviorDefinition_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
