/*
 * generated by Xtext 2.22.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.parser.antlr;

import com.google.inject.Inject;
import de.dlr.sc.virsat.model.ext.tml.structural.parser.antlr.internal.InternalDeclarationLangaugeParser;
import de.dlr.sc.virsat.model.ext.tml.structural.services.DeclarationLangaugeGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DeclarationLangaugeParser extends AbstractAntlrParser {

	@Inject
	private DeclarationLangaugeGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDeclarationLangaugeParser createParser(XtextTokenStream stream) {
		return new InternalDeclarationLangaugeParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Attribute";
	}

	public DeclarationLangaugeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DeclarationLangaugeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
