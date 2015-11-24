package nz.co.aetheric.intellij.lojban;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * Lojban file definition.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanFile extends PsiFileBase {

	public LojbanFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, LojbanLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return LojbanFileType.INSTANCE;
	}

	@Override
	public String toString() {
		return "Lojban File";
	}

}
