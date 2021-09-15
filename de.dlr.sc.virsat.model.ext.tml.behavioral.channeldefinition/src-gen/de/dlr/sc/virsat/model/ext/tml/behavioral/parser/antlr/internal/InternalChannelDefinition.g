/*******************************************************************************
 * Copyright (c) 2008-2021 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalChannelDefinition;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.dlr.sc.virsat.model.ext.tml.behavioral.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.dlr.sc.virsat.model.ext.tml.behavioral.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dlr.sc.virsat.model.ext.tml.behavioral.services.ChannelDefinitionGrammarAccess;

}

@parser::members {

 	private ChannelDefinitionGrammarAccess grammarAccess;

    public InternalChannelDefinitionParser(TokenStream input, ChannelDefinitionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ChannelBehaviorDefinition";
   	}

   	@Override
   	protected ChannelDefinitionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleChannelBehaviorDefinition
entryRuleChannelBehaviorDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChannelBehaviorDefinitionRule()); }
	iv_ruleChannelBehaviorDefinition=ruleChannelBehaviorDefinition
	{ $current=$iv_ruleChannelBehaviorDefinition.current; }
	EOF;

// Rule ChannelBehaviorDefinition
ruleChannelBehaviorDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Channel'
		{
			newLeafNode(otherlv_0, grammarAccess.getChannelBehaviorDefinitionAccess().getChannelKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChannelBehaviorDefinitionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChannelBehaviorDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getChannelBehaviorDefinitionAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeEnumStorageTypeEnumRuleCall_3_0());
				}
				lv_storageType_3_0=ruleEnumStorageType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChannelBehaviorDefinitionRule());
					}
					set(
						$current,
						"storageType",
						lv_storageType_3_0,
						"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EnumStorageType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='implementation:'
			{
				newLeafNode(otherlv_4, grammarAccess.getChannelBehaviorDefinitionAccess().getImplementationKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameEStringParserRuleCall_4_1_0());
					}
					lv_implName_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getChannelBehaviorDefinitionRule());
						}
						set(
							$current,
							"implName",
							lv_implName_5_0,
							"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				otherlv_6='{'
				{
					newLeafNode(otherlv_6, grammarAccess.getChannelBehaviorDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersBehavioralParameterDefinitionParserRuleCall_5_0_1_0());
						}
						lv_parameters_7_0=ruleBehavioralParameterDefinition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getChannelBehaviorDefinitionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_7_0,
								"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.BehavioralParameterDefinition");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_8='}'
				{
					newLeafNode(otherlv_8, grammarAccess.getChannelBehaviorDefinitionAccess().getRightCurlyBracketKeyword_5_0_2());
				}
			)
			    |
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getChannelBehaviorDefinitionAccess().getSemicolonKeyword_5_1());
			}
		)
	)
;

// Entry rule entryRuleBehavioralParameterDefinition
entryRuleBehavioralParameterDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBehavioralParameterDefinitionRule()); }
	iv_ruleBehavioralParameterDefinition=ruleBehavioralParameterDefinition
	{ $current=$iv_ruleBehavioralParameterDefinition.current; }
	EOF;

// Rule BehavioralParameterDefinition
ruleBehavioralParameterDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isStatic_0_0='static'
				{
					newLeafNode(lv_isStatic_0_0, grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBehavioralParameterDefinitionRule());
					}
					setWithLastConsumed($current, "isStatic", true, "static");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getBehavioralParameterDefinitionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehavioralParameterDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getBehavioralParameterDefinitionAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeEnumValueTypeEnumRuleCall_2_1_0());
					}
					lv_valueType_3_0=ruleEnumValueType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBehavioralParameterDefinitionRule());
						}
						set(
							$current,
							"valueType",
							lv_valueType_3_0,
							"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EnumValueType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_4='='
			{
				newLeafNode(otherlv_4, grammarAccess.getBehavioralParameterDefinitionAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBehavioralParameterDefinitionAccess().getValueEStringParserRuleCall_3_1_0());
					}
					lv_value_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBehavioralParameterDefinitionRule());
						}
						set(
							$current,
							"value",
							lv_value_5_0,
							"de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getBehavioralParameterDefinitionAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Rule EnumStorageType
ruleEnumStorageType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='DOUBLE_BUFFER'
			{
				$current = grammarAccess.getEnumStorageTypeAccess().getDOUBLE_BUFFEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEnumStorageTypeAccess().getDOUBLE_BUFFEREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='FIFO'
			{
				$current = grammarAccess.getEnumStorageTypeAccess().getFIFOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEnumStorageTypeAccess().getFIFOEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='LIFO'
			{
				$current = grammarAccess.getEnumStorageTypeAccess().getLIFOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEnumStorageTypeAccess().getLIFOEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='EVENT_ONLY'
			{
				$current = grammarAccess.getEnumStorageTypeAccess().getEVENT_ONLYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getEnumStorageTypeAccess().getEVENT_ONLYEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='CUSTOM'
			{
				$current = grammarAccess.getEnumStorageTypeAccess().getCUSTOMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getEnumStorageTypeAccess().getCUSTOMEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule EnumValueType
ruleEnumValueType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='INTEGER'
			{
				$current = grammarAccess.getEnumValueTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEnumValueTypeAccess().getINTEGEREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='FLOAT'
			{
				$current = grammarAccess.getEnumValueTypeAccess().getFLOATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEnumValueTypeAccess().getFLOATEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='STRING'
			{
				$current = grammarAccess.getEnumValueTypeAccess().getSTRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEnumValueTypeAccess().getSTRINGEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
