/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.dsl.rhythm.parser.antlr;

import com.google.inject.Inject;
import fr.polytech.dsl.rhythm.parser.antlr.internal.InternalGuardinParser;
import fr.polytech.dsl.rhythm.services.GuardinGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GuardinParser extends AbstractAntlrParser {

	@Inject
	private GuardinGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGuardinParser createParser(XtextTokenStream stream) {
		return new InternalGuardinParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Music";
	}

	public GuardinGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GuardinGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
