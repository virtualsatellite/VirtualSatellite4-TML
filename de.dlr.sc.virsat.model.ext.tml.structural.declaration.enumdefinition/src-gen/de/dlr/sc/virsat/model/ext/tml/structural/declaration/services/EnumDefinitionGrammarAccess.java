/*
 * generated by Xtext 2.22.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EnumDefinitionGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EnumerationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition.Enumeration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cLiteralsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cLiteralsEnumerationLiteralParserRuleCall_3_0_0 = (RuleCall)cLiteralsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cLiteralsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cLiteralsEnumerationLiteralParserRuleCall_3_1_1_0 = (RuleCall)cLiteralsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Enumeration:
		//	'Enum' name=EString '{' (literals+=EnumerationLiteral ("," literals+=EnumerationLiteral)*)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Enum' name=EString '{' (literals+=EnumerationLiteral ("," literals+=EnumerationLiteral)*)? '}'
		public Group getGroup() { return cGroup; }
		
		//'Enum'
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(literals+=EnumerationLiteral ("," literals+=EnumerationLiteral)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//literals+=EnumerationLiteral
		public Assignment getLiteralsAssignment_3_0() { return cLiteralsAssignment_3_0; }
		
		//EnumerationLiteral
		public RuleCall getLiteralsEnumerationLiteralParserRuleCall_3_0_0() { return cLiteralsEnumerationLiteralParserRuleCall_3_0_0; }
		
		//("," literals+=EnumerationLiteral)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//literals+=EnumerationLiteral
		public Assignment getLiteralsAssignment_3_1_1() { return cLiteralsAssignment_3_1_1; }
		
		//EnumerationLiteral
		public RuleCall getLiteralsEnumerationLiteralParserRuleCall_3_1_1_0() { return cLiteralsEnumerationLiteralParserRuleCall_3_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition.EString");
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
	public class EnumerationLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition.EnumerationLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cKeyNumAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cKeyNumEIntParserRuleCall_1_1_0 = (RuleCall)cKeyNumAssignment_1_1.eContents().get(0);
		
		//EnumerationLiteral:
		//	name=EString ('=' keyNum=EInt)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=EString ('=' keyNum=EInt)?
		public Group getGroup() { return cGroup; }
		
		//name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }
		
		//('=' keyNum=EInt)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_0() { return cEqualsSignKeyword_1_0; }
		
		//keyNum=EInt
		public Assignment getKeyNumAssignment_1_1() { return cKeyNumAssignment_1_1; }
		
		//EInt
		public RuleCall getKeyNumEIntParserRuleCall_1_1_0() { return cKeyNumEIntParserRuleCall_1_1_0; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	
	private final EnumerationElements pEnumeration;
	private final EStringElements pEString;
	private final EnumerationLiteralElements pEnumerationLiteral;
	private final EIntElements pEInt;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EnumDefinitionGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEnumeration = new EnumerationElements();
		this.pEString = new EStringElements();
		this.pEnumerationLiteral = new EnumerationLiteralElements();
		this.pEInt = new EIntElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.dlr.sc.virsat.model.ext.tml.structural.declaration.EnumDefinition".equals(grammar.getName())) {
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

	
	//Enumeration:
	//	'Enum' name=EString '{' (literals+=EnumerationLiteral ("," literals+=EnumerationLiteral)*)?
	//	'}';
	public EnumerationElements getEnumerationAccess() {
		return pEnumeration;
	}
	
	public ParserRule getEnumerationRule() {
		return getEnumerationAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EnumerationLiteral:
	//	name=EString ('=' keyNum=EInt)?;
	public EnumerationLiteralElements getEnumerationLiteralAccess() {
		return pEnumerationLiteral;
	}
	
	public ParserRule getEnumerationLiteralRule() {
		return getEnumerationLiteralAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
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
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
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
