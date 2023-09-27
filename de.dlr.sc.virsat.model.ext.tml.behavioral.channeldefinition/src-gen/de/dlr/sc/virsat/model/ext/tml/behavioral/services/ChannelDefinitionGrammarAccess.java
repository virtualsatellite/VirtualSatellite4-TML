/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.behavioral.services;

import java.util.List;

import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ChannelDefinitionGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ChannelBehaviorDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.ChannelBehaviorDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChannelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStorageTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStorageTypeEnumStorageTypeEnumRuleCall_3_0 = (RuleCall)cStorageTypeAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cImplementationKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cImplNameAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cImplNameEStringParserRuleCall_4_1_0 = (RuleCall)cImplNameAssignment_4_1.eContents().get(0);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Assignment cParametersAssignment_5_0_1 = (Assignment)cGroup_5_0.eContents().get(1);
		private final RuleCall cParametersBehavioralParameterDefinitionParserRuleCall_5_0_1_0 = (RuleCall)cParametersAssignment_5_0_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_0_2 = (Keyword)cGroup_5_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_5_1 = (Keyword)cAlternatives_5.eContents().get(1);
		
		//ChannelBehaviorDefinition:
		//	'Channel' name=EString ':' storageType=EnumStorageType ('implementation:' implName=EString)? ('{'
		//	parameters+=BehavioralParameterDefinition* '}' | ';');
		@Override public ParserRule getRule() { return rule; }
		
		//'Channel' name=EString ':' storageType=EnumStorageType ('implementation:' implName=EString)? ('{'
		//parameters+=BehavioralParameterDefinition* '}' | ';')
		public Group getGroup() { return cGroup; }
		
		//'Channel'
		public Keyword getChannelKeyword_0() { return cChannelKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//storageType=EnumStorageType
		public Assignment getStorageTypeAssignment_3() { return cStorageTypeAssignment_3; }
		
		//EnumStorageType
		public RuleCall getStorageTypeEnumStorageTypeEnumRuleCall_3_0() { return cStorageTypeEnumStorageTypeEnumRuleCall_3_0; }
		
		//('implementation:' implName=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'implementation:'
		public Keyword getImplementationKeyword_4_0() { return cImplementationKeyword_4_0; }
		
		//implName=EString
		public Assignment getImplNameAssignment_4_1() { return cImplNameAssignment_4_1; }
		
		//EString
		public RuleCall getImplNameEStringParserRuleCall_4_1_0() { return cImplNameEStringParserRuleCall_4_1_0; }
		
		//'{' parameters+=BehavioralParameterDefinition* '}' | ';'
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//'{' parameters+=BehavioralParameterDefinition* '}'
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_0_0() { return cLeftCurlyBracketKeyword_5_0_0; }
		
		//parameters+=BehavioralParameterDefinition*
		public Assignment getParametersAssignment_5_0_1() { return cParametersAssignment_5_0_1; }
		
		//BehavioralParameterDefinition
		public RuleCall getParametersBehavioralParameterDefinitionParserRuleCall_5_0_1_0() { return cParametersBehavioralParameterDefinitionParserRuleCall_5_0_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_0_2() { return cRightCurlyBracketKeyword_5_0_2; }
		
		//';'
		public Keyword getSemicolonKeyword_5_1() { return cSemicolonKeyword_5_1; }
	}
	public class BehavioralParameterDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.BehavioralParameterDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsStaticAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsStaticStaticKeyword_0_0 = (Keyword)cIsStaticAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueTypeEnumValueTypeEnumRuleCall_2_1_0 = (RuleCall)cValueTypeAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_3_1_0 = (RuleCall)cValueAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//BehavioralParameterDefinition:
		//	isStatic?='static'? name=EString (':' valueType=EnumValueType)? ('=' value=EString)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//isStatic?='static'? name=EString (':' valueType=EnumValueType)? ('=' value=EString)? ';'
		public Group getGroup() { return cGroup; }
		
		//isStatic?='static'?
		public Assignment getIsStaticAssignment_0() { return cIsStaticAssignment_0; }
		
		//'static'
		public Keyword getIsStaticStaticKeyword_0_0() { return cIsStaticStaticKeyword_0_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//(':' valueType=EnumValueType)?
		public Group getGroup_2() { return cGroup_2; }
		
		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }
		
		//valueType=EnumValueType
		public Assignment getValueTypeAssignment_2_1() { return cValueTypeAssignment_2_1; }
		
		//EnumValueType
		public RuleCall getValueTypeEnumValueTypeEnumRuleCall_2_1_0() { return cValueTypeEnumValueTypeEnumRuleCall_2_1_0; }
		
		//('=' value=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0() { return cEqualsSignKeyword_3_0; }
		
		//value=EString
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }
		
		//EString
		public RuleCall getValueEStringParserRuleCall_3_1_0() { return cValueEStringParserRuleCall_3_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	public class EnumStorageTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EnumStorageType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDOUBLE_BUFFEREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDOUBLE_BUFFERDOUBLE_BUFFERKeyword_0_0 = (Keyword)cDOUBLE_BUFFEREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFIFOEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFIFOFIFOKeyword_1_0 = (Keyword)cFIFOEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLIFOEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLIFOLIFOKeyword_2_0 = (Keyword)cLIFOEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cEVENT_ONLYEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cEVENT_ONLYEVENT_ONLYKeyword_3_0 = (Keyword)cEVENT_ONLYEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cCUSTOMEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cCUSTOMCUSTOMKeyword_4_0 = (Keyword)cCUSTOMEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum EnumStorageType:
		//	DOUBLE_BUFFER | FIFO | LIFO | EVENT_ONLY | CUSTOM;
		public EnumRule getRule() { return rule; }
		
		//DOUBLE_BUFFER | FIFO | LIFO | EVENT_ONLY | CUSTOM
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DOUBLE_BUFFER
		public EnumLiteralDeclaration getDOUBLE_BUFFEREnumLiteralDeclaration_0() { return cDOUBLE_BUFFEREnumLiteralDeclaration_0; }
		
		//"DOUBLE_BUFFER"
		public Keyword getDOUBLE_BUFFERDOUBLE_BUFFERKeyword_0_0() { return cDOUBLE_BUFFERDOUBLE_BUFFERKeyword_0_0; }
		
		//FIFO
		public EnumLiteralDeclaration getFIFOEnumLiteralDeclaration_1() { return cFIFOEnumLiteralDeclaration_1; }
		
		//"FIFO"
		public Keyword getFIFOFIFOKeyword_1_0() { return cFIFOFIFOKeyword_1_0; }
		
		//LIFO
		public EnumLiteralDeclaration getLIFOEnumLiteralDeclaration_2() { return cLIFOEnumLiteralDeclaration_2; }
		
		//"LIFO"
		public Keyword getLIFOLIFOKeyword_2_0() { return cLIFOLIFOKeyword_2_0; }
		
		//EVENT_ONLY
		public EnumLiteralDeclaration getEVENT_ONLYEnumLiteralDeclaration_3() { return cEVENT_ONLYEnumLiteralDeclaration_3; }
		
		//"EVENT_ONLY"
		public Keyword getEVENT_ONLYEVENT_ONLYKeyword_3_0() { return cEVENT_ONLYEVENT_ONLYKeyword_3_0; }
		
		//CUSTOM
		public EnumLiteralDeclaration getCUSTOMEnumLiteralDeclaration_4() { return cCUSTOMEnumLiteralDeclaration_4; }
		
		//"CUSTOM"
		public Keyword getCUSTOMCUSTOMKeyword_4_0() { return cCUSTOMCUSTOMKeyword_4_0; }
	}
	public class EnumValueTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition.EnumValueType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINTEGEREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINTEGERINTEGERKeyword_0_0 = (Keyword)cINTEGEREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFLOATEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFLOATFLOATKeyword_1_0 = (Keyword)cFLOATEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSTRINGEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSTRINGSTRINGKeyword_2_0 = (Keyword)cSTRINGEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum EnumValueType:
		//	INTEGER | FLOAT | STRING;
		public EnumRule getRule() { return rule; }
		
		//INTEGER | FLOAT | STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INTEGER
		public EnumLiteralDeclaration getINTEGEREnumLiteralDeclaration_0() { return cINTEGEREnumLiteralDeclaration_0; }
		
		//"INTEGER"
		public Keyword getINTEGERINTEGERKeyword_0_0() { return cINTEGERINTEGERKeyword_0_0; }
		
		//FLOAT
		public EnumLiteralDeclaration getFLOATEnumLiteralDeclaration_1() { return cFLOATEnumLiteralDeclaration_1; }
		
		//"FLOAT"
		public Keyword getFLOATFLOATKeyword_1_0() { return cFLOATFLOATKeyword_1_0; }
		
		//STRING
		public EnumLiteralDeclaration getSTRINGEnumLiteralDeclaration_2() { return cSTRINGEnumLiteralDeclaration_2; }
		
		//"STRING"
		public Keyword getSTRINGSTRINGKeyword_2_0() { return cSTRINGSTRINGKeyword_2_0; }
	}
	
	private final ChannelBehaviorDefinitionElements pChannelBehaviorDefinition;
	private final BehavioralParameterDefinitionElements pBehavioralParameterDefinition;
	private final EnumStorageTypeElements eEnumStorageType;
	private final EnumValueTypeElements eEnumValueType;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ChannelDefinitionGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pChannelBehaviorDefinition = new ChannelBehaviorDefinitionElements();
		this.pBehavioralParameterDefinition = new BehavioralParameterDefinitionElements();
		this.eEnumStorageType = new EnumStorageTypeElements();
		this.eEnumValueType = new EnumValueTypeElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.dlr.sc.virsat.model.ext.tml.behavioral.ChannelDefinition".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ChannelBehaviorDefinition:
	//	'Channel' name=EString ':' storageType=EnumStorageType ('implementation:' implName=EString)? ('{'
	//	parameters+=BehavioralParameterDefinition* '}' | ';');
	public ChannelBehaviorDefinitionElements getChannelBehaviorDefinitionAccess() {
		return pChannelBehaviorDefinition;
	}
	
	public ParserRule getChannelBehaviorDefinitionRule() {
		return getChannelBehaviorDefinitionAccess().getRule();
	}
	
	//BehavioralParameterDefinition:
	//	isStatic?='static'? name=EString (':' valueType=EnumValueType)? ('=' value=EString)? ';';
	public BehavioralParameterDefinitionElements getBehavioralParameterDefinitionAccess() {
		return pBehavioralParameterDefinition;
	}
	
	public ParserRule getBehavioralParameterDefinitionRule() {
		return getBehavioralParameterDefinitionAccess().getRule();
	}
	
	//enum EnumStorageType:
	//	DOUBLE_BUFFER | FIFO | LIFO | EVENT_ONLY | CUSTOM;
	public EnumStorageTypeElements getEnumStorageTypeAccess() {
		return eEnumStorageType;
	}
	
	public EnumRule getEnumStorageTypeRule() {
		return getEnumStorageTypeAccess().getRule();
	}
	
	//enum EnumValueType:
	//	INTEGER | FLOAT | STRING;
	public EnumValueTypeElements getEnumValueTypeAccess() {
		return eEnumValueType;
	}
	
	public EnumRule getEnumValueTypeRule() {
		return getEnumValueTypeAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
