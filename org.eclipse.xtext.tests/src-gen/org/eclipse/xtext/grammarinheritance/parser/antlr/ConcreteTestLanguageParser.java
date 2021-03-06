/*
 * generated by Xtext
 */
package org.eclipse.xtext.grammarinheritance.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.grammarinheritance.parser.antlr.internal.InternalConcreteTestLanguageParser;
import org.eclipse.xtext.grammarinheritance.services.ConcreteTestLanguageGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ConcreteTestLanguageParser extends AbstractAntlrParser {

	@Inject
	private ConcreteTestLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalConcreteTestLanguageParser createParser(XtextTokenStream stream) {
		return new InternalConcreteTestLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RootRule";
	}

	public ConcreteTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ConcreteTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
