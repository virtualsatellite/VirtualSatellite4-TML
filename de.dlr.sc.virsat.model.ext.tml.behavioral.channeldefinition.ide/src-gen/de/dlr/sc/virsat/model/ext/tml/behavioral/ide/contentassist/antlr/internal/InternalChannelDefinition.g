/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalChannelDefinition;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.dlr.sc.virsat.model.ext.tml.behavioral.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.dlr.sc.virsat.model.ext.tml.behavioral.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.dlr.sc.virsat.model.ext.tml.behavioral.services.ChannelDefinitionGrammarAccess;

}
@parser::members {
	private ChannelDefinitionGrammarAccess grammarAccess;

	public void setGrammarAccess(ChannelDefinitionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleChannelBehaviorDefinition
entryRuleChannelBehaviorDefinition
:
{ before(grammarAccess.getChannelBehaviorDefinitionRule()); }
	 ruleChannelBehaviorDefinition
{ after(grammarAccess.getChannelBehaviorDefinitionRule()); } 
	 EOF 
;

// Rule ChannelBehaviorDefinition
ruleChannelBehaviorDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup()); }
		(rule__ChannelBehaviorDefinition__Group__0)
		{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBehavioralParameterDefinition
entryRuleBehavioralParameterDefinition
:
{ before(grammarAccess.getBehavioralParameterDefinitionRule()); }
	 ruleBehavioralParameterDefinition
{ after(grammarAccess.getBehavioralParameterDefinitionRule()); } 
	 EOF 
;

// Rule BehavioralParameterDefinition
ruleBehavioralParameterDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup()); }
		(rule__BehavioralParameterDefinition__Group__0)
		{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule EnumStorageType
ruleEnumStorageType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumStorageTypeAccess().getAlternatives()); }
		(rule__EnumStorageType__Alternatives)
		{ after(grammarAccess.getEnumStorageTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule EnumValueType
ruleEnumValueType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumValueTypeAccess().getAlternatives()); }
		(rule__EnumValueType__Alternatives)
		{ after(grammarAccess.getEnumValueTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_5_0()); }
		(rule__ChannelBehaviorDefinition__Group_5_0__0)
		{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getSemicolonKeyword_5_1()); }
		';'
		{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getSemicolonKeyword_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumStorageType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumStorageTypeAccess().getDOUBLE_BUFFEREnumLiteralDeclaration_0()); }
		('DOUBLE_BUFFER')
		{ after(grammarAccess.getEnumStorageTypeAccess().getDOUBLE_BUFFEREnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEnumStorageTypeAccess().getFIFOEnumLiteralDeclaration_1()); }
		('FIFO')
		{ after(grammarAccess.getEnumStorageTypeAccess().getFIFOEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getEnumStorageTypeAccess().getLIFOEnumLiteralDeclaration_2()); }
		('LIFO')
		{ after(grammarAccess.getEnumStorageTypeAccess().getLIFOEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getEnumStorageTypeAccess().getEVENT_ONLYEnumLiteralDeclaration_3()); }
		('EVENT_ONLY')
		{ after(grammarAccess.getEnumStorageTypeAccess().getEVENT_ONLYEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getEnumStorageTypeAccess().getCUSTOMEnumLiteralDeclaration_4()); }
		('CUSTOM')
		{ after(grammarAccess.getEnumStorageTypeAccess().getCUSTOMEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumValueType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumValueTypeAccess().getINTEGEREnumLiteralDeclaration_0()); }
		('INTEGER')
		{ after(grammarAccess.getEnumValueTypeAccess().getINTEGEREnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEnumValueTypeAccess().getFLOATEnumLiteralDeclaration_1()); }
		('FLOAT')
		{ after(grammarAccess.getEnumValueTypeAccess().getFLOATEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getEnumValueTypeAccess().getSTRINGEnumLiteralDeclaration_2()); }
		('STRING')
		{ after(grammarAccess.getEnumValueTypeAccess().getSTRINGEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group__0__Impl
	rule__ChannelBehaviorDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getChannelKeyword_0()); }
	'Channel'
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getChannelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group__1__Impl
	rule__ChannelBehaviorDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getNameAssignment_1()); }
	(rule__ChannelBehaviorDefinition__NameAssignment_1)
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group__2__Impl
	rule__ChannelBehaviorDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group__3__Impl
	rule__ChannelBehaviorDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeAssignment_3()); }
	(rule__ChannelBehaviorDefinition__StorageTypeAssignment_3)
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group__4__Impl
	rule__ChannelBehaviorDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_4()); }
	(rule__ChannelBehaviorDefinition__Group_4__0)?
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getAlternatives_5()); }
	(rule__ChannelBehaviorDefinition__Alternatives_5)
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChannelBehaviorDefinition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group_4__0__Impl
	rule__ChannelBehaviorDefinition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getImplementationKeyword_4_0()); }
	'implementation:'
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getImplementationKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameAssignment_4_1()); }
	(rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1)
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChannelBehaviorDefinition__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group_5_0__0__Impl
	rule__ChannelBehaviorDefinition__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0()); }
	'{'
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getLeftCurlyBracketKeyword_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group_5_0__1__Impl
	rule__ChannelBehaviorDefinition__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersAssignment_5_0_1()); }
	(rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1)*
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersAssignment_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChannelBehaviorDefinition__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getRightCurlyBracketKeyword_5_0_2()); }
	'}'
	{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getRightCurlyBracketKeyword_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BehavioralParameterDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehavioralParameterDefinition__Group__0__Impl
	rule__BehavioralParameterDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticAssignment_0()); }
	(rule__BehavioralParameterDefinition__IsStaticAssignment_0)?
	{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehavioralParameterDefinition__Group__1__Impl
	rule__BehavioralParameterDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getNameAssignment_1()); }
	(rule__BehavioralParameterDefinition__NameAssignment_1)
	{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehavioralParameterDefinition__Group__2__Impl
	rule__BehavioralParameterDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_2()); }
	(rule__BehavioralParameterDefinition__Group_2__0)?
	{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehavioralParameterDefinition__Group__3__Impl
	rule__BehavioralParameterDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_3()); }
	(rule__BehavioralParameterDefinition__Group_3__0)?
	{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehavioralParameterDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BehavioralParameterDefinition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehavioralParameterDefinition__Group_2__0__Impl
	rule__BehavioralParameterDefinition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getColonKeyword_2_0()); }
	':'
	{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehavioralParameterDefinition__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeAssignment_2_1()); }
	(rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1)
	{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BehavioralParameterDefinition__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehavioralParameterDefinition__Group_3__0__Impl
	rule__BehavioralParameterDefinition__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getEqualsSignKeyword_3_0()); }
	'='
	{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getEqualsSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BehavioralParameterDefinition__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getValueAssignment_3_1()); }
	(rule__BehavioralParameterDefinition__ValueAssignment_3_1)
	{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getValueAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChannelBehaviorDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__StorageTypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeEnumStorageTypeEnumRuleCall_3_0()); }
		ruleEnumStorageType
		{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getStorageTypeEnumStorageTypeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__ImplNameAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameEStringParserRuleCall_4_1_0()); }
		ruleEString
		{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getImplNameEStringParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChannelBehaviorDefinition__ParametersAssignment_5_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersBehavioralParameterDefinitionParserRuleCall_5_0_1_0()); }
		ruleBehavioralParameterDefinition
		{ after(grammarAccess.getChannelBehaviorDefinitionAccess().getParametersBehavioralParameterDefinitionParserRuleCall_5_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__IsStaticAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0()); }
		(
			{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0()); }
			'static'
			{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0()); }
		)
		{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getIsStaticStaticKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__ValueTypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeEnumValueTypeEnumRuleCall_2_1_0()); }
		ruleEnumValueType
		{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getValueTypeEnumValueTypeEnumRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BehavioralParameterDefinition__ValueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBehavioralParameterDefinitionAccess().getValueEStringParserRuleCall_3_1_0()); }
		ruleEString
		{ after(grammarAccess.getBehavioralParameterDefinitionAccess().getValueEStringParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
