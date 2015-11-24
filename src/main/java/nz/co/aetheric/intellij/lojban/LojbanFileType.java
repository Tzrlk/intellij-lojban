package nz.co.aetheric.intellij.lojban;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Defines the file type for lojban language files.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanFileType extends LanguageFileType {

	public static final LojbanFileType INSTANCE = new LojbanFileType();

	private LojbanFileType() {
		super(LojbanLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "Lojban File";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Lojban text file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "lojbo";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return LojbanIcons.FILE;
	}

}
