/*
 * generated by Xtext 2.26.0
 */
package de.dlr.sc.virsat.model.ext.tml.structural.declaration.parser.antlr;

import com.google.inject.Inject;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.parser.antlr.internal.InternalDatatypeDefinitionParser;
import de.dlr.sc.virsat.model.ext.tml.structural.declaration.services.DatatypeDefinitionGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DatatypeDefinitionParser extends AbstractAntlrParser {

	@Inject
	private DatatypeDefinitionGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDatatypeDefinitionParser createParser(XtextTokenStream stream) {
		return new InternalDatatypeDefinitionParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "StartRule";
	}

	public DatatypeDefinitionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DatatypeDefinitionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
