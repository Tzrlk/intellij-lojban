package nz.co.aetheric.intellij.lojban;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Adaptor for the lexer grammar.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanLexerAdapter extends FlexAdapter {

	public LojbanLexerAdapter() {
		super(new LojbanLexer((Reader) null));
	}

}
