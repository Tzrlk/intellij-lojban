package nz.co.aetheric.intellij.lojban;

import com.intellij.lang.Language;

/**
 * Lojban Language definition entry point.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanLanguage extends Language {

	public static final LojbanLanguage INSTANCE = new LojbanLanguage();

	private LojbanLanguage() {
		super("Lojban");
	}

}
