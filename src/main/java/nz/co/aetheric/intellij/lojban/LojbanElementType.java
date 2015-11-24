package nz.co.aetheric.intellij.lojban;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Defines an element type needed for language parsing.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanElementType extends IElementType {

	public LojbanElementType(@NotNull @NonNls String debugName) {
		super(debugName, LojbanLanguage.INSTANCE);
	}

}
