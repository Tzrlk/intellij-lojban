package nz.co.aetheric.intellij.lojban;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Defines the token type needed for grammar parsing.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanTokenType extends IElementType {

	public LojbanTokenType(@NotNull @NonNls String debugName) {
		super(debugName, LojbanLanguage.INSTANCE);
	}

	@Override
	public String toString() {
		return "LojbanTokenType." + super.toString();
	}

}
