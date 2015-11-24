package nz.co.aetheric.intellij.lojban;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

/**
 * Creates syntax highlighters.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

	@NotNull
	@Override
	public SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
		return new LojbanSyntaxHighlighter();
	}

}
