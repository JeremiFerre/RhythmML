/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.dsl.rhythm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GuardinAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/polytech/dsl/rhythm/parser/antlr/internal/InternalGuardin.tokens");
	}
}
