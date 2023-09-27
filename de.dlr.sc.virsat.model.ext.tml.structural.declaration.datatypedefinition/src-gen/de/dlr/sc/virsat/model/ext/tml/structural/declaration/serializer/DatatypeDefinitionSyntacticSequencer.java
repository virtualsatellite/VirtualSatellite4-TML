/*
 * generated by Xtext 2.26.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.serializer;

import com.google.inject.Inject;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.services.DatatypeDefinitionGrammarAccess;
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
public class DatatypeDefinitionSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DatatypeDefinitionGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute___LeftCurlyBracketKeyword_5_2_0_0___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__a__p;
	protected AbstractElementAlias match_Attribute___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p;
	protected AbstractElementAlias match_Attribute___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2_LeftCurlyBracketKeyword_5_2_0_0_a__p;
	protected AbstractElementAlias match_Attribute___SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p__q;
	protected AbstractElementAlias match_Attribute_____RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__p_LeftCurlyBracketKeyword_5_2_0_0_p__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DatatypeDefinitionGrammarAccess) access;
		match_Attribute___LeftCurlyBracketKeyword_5_2_0_0___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__a__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2())));
		match_Attribute___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p = new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2())));
		match_Attribute___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2_LeftCurlyBracketKeyword_5_2_0_0_a__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2()), new TokenAlias(true, true, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0()));
		match_Attribute___SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p__q = new AlternativeAlias(false, true, new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2()))), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_1()));
		match_Attribute_____RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__p_LeftCurlyBracketKeyword_5_2_0_0_p__p = new GroupAlias(true, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2_4_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getSemicolonKeyword_5_2_4_2())), new TokenAlias(true, false, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_2_0_0()));
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
			if (match_Attribute___LeftCurlyBracketKeyword_5_2_0_0___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__a__p.equals(syntax))
				emit_Attribute___LeftCurlyBracketKeyword_5_2_0_0___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Attribute___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p.equals(syntax))
				emit_Attribute___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Attribute___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2_LeftCurlyBracketKeyword_5_2_0_0_a__p.equals(syntax))
				emit_Attribute___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2_LeftCurlyBracketKeyword_5_2_0_0_a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Attribute___SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p__q.equals(syntax))
				emit_Attribute___SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Attribute_____RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__p_LeftCurlyBracketKeyword_5_2_0_0_p__p.equals(syntax))
				emit_Attribute_____RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__p_LeftCurlyBracketKeyword_5_2_0_0_p__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('{' ('}' ';')*)+
	 *
	 * This ambiguous syntax occurs at:
	 *     dimensions+=ArrayDimension (ambiguity) 'value' ':' valueLiteral=EString
	 *     maxValueLiteral=EString ';' (ambiguity) 'value' ':' valueLiteral=EString
	 *     minValueLiteral=EString ';' (ambiguity) 'value' ':' valueLiteral=EString
	 *     referenceFrame=[ReferenceFrameDefinition|FQN] ';' (ambiguity) 'value' ':' valueLiteral=EString
	 *     typeOf=[IType|FQN] (ambiguity) 'value' ':' valueLiteral=EString
	 *     valueLiteral=EString ';' (ambiguity) 'value' ':' valueLiteral=EString
	 
	 * </pre>
	 */
	protected void emit_Attribute___LeftCurlyBracketKeyword_5_2_0_0___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('{'? ('}' ';')?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     dimensions+=ArrayDimension (ambiguity) 'max' ':' maxValueLiteral=EString
	 *     dimensions+=ArrayDimension (ambiguity) 'min' ':' minValueLiteral=EString
	 *     dimensions+=ArrayDimension (ambiguity) 'referenceFrame' ':' referenceFrame=[ReferenceFrameDefinition|FQN]
	 *     dimensions+=ArrayDimension (ambiguity) 'unit' ':' typeUnit=[UnitDefinition|FQN]
	 *     maxValueLiteral=EString ';' (ambiguity) 'max' ':' maxValueLiteral=EString
	 *     maxValueLiteral=EString ';' (ambiguity) 'min' ':' minValueLiteral=EString
	 *     maxValueLiteral=EString ';' (ambiguity) 'referenceFrame' ':' referenceFrame=[ReferenceFrameDefinition|FQN]
	 *     maxValueLiteral=EString ';' (ambiguity) 'unit' ':' typeUnit=[UnitDefinition|FQN]
	 *     maxValueLiteral=EString ';' (ambiguity) (rule end)
	 *     minValueLiteral=EString ';' (ambiguity) 'max' ':' maxValueLiteral=EString
	 *     minValueLiteral=EString ';' (ambiguity) 'min' ':' minValueLiteral=EString
	 *     minValueLiteral=EString ';' (ambiguity) 'referenceFrame' ':' referenceFrame=[ReferenceFrameDefinition|FQN]
	 *     minValueLiteral=EString ';' (ambiguity) 'unit' ':' typeUnit=[UnitDefinition|FQN]
	 *     minValueLiteral=EString ';' (ambiguity) (rule end)
	 *     referenceFrame=[ReferenceFrameDefinition|FQN] ';' (ambiguity) 'max' ':' maxValueLiteral=EString
	 *     referenceFrame=[ReferenceFrameDefinition|FQN] ';' (ambiguity) 'min' ':' minValueLiteral=EString
	 *     referenceFrame=[ReferenceFrameDefinition|FQN] ';' (ambiguity) 'referenceFrame' ':' referenceFrame=[ReferenceFrameDefinition|FQN]
	 *     referenceFrame=[ReferenceFrameDefinition|FQN] ';' (ambiguity) 'unit' ':' typeUnit=[UnitDefinition|FQN]
	 *     referenceFrame=[ReferenceFrameDefinition|FQN] ';' (ambiguity) (rule end)
	 *     typeOf=[IType|FQN] (ambiguity) 'max' ':' maxValueLiteral=EString
	 *     typeOf=[IType|FQN] (ambiguity) 'min' ':' minValueLiteral=EString
	 *     typeOf=[IType|FQN] (ambiguity) 'referenceFrame' ':' referenceFrame=[ReferenceFrameDefinition|FQN]
	 *     typeOf=[IType|FQN] (ambiguity) 'unit' ':' typeUnit=[UnitDefinition|FQN]
	 *     valueLiteral=EString ';' (ambiguity) 'max' ':' maxValueLiteral=EString
	 *     valueLiteral=EString ';' (ambiguity) 'min' ':' minValueLiteral=EString
	 *     valueLiteral=EString ';' (ambiguity) 'referenceFrame' ':' referenceFrame=[ReferenceFrameDefinition|FQN]
	 *     valueLiteral=EString ';' (ambiguity) 'unit' ':' typeUnit=[UnitDefinition|FQN]
	 *     valueLiteral=EString ';' (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Attribute___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('}' ';' '{'*)+
	 *
	 * This ambiguous syntax occurs at:
	 *     typeUnit=[UnitDefinition|FQN] ';' (ambiguity) 'max' ':' maxValueLiteral=EString
	 *     typeUnit=[UnitDefinition|FQN] ';' (ambiguity) 'min' ':' minValueLiteral=EString
	 *     typeUnit=[UnitDefinition|FQN] ';' (ambiguity) 'referenceFrame' ':' referenceFrame=[ReferenceFrameDefinition|FQN]
	 *     typeUnit=[UnitDefinition|FQN] ';' (ambiguity) 'unit' ':' typeUnit=[UnitDefinition|FQN]
	 *     typeUnit=[UnitDefinition|FQN] ';' (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Attribute___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2_LeftCurlyBracketKeyword_5_2_0_0_a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (';' | ('{'? ('}' ';')?)+)?
	 *
	 * This ambiguous syntax occurs at:
	 *     dimensions+=ArrayDimension (ambiguity) (rule end)
	 *     typeOf=[IType|FQN] (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Attribute___SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_2_0_0_q___RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__q__p__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('}' ';')+ '{'+)+
	 *
	 * This ambiguous syntax occurs at:
	 *     typeUnit=[UnitDefinition|FQN] ';' (ambiguity) 'value' ':' valueLiteral=EString
	 
	 * </pre>
	 */
	protected void emit_Attribute_____RightCurlyBracketKeyword_5_2_4_1_SemicolonKeyword_5_2_4_2__p_LeftCurlyBracketKeyword_5_2_0_0_p__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
