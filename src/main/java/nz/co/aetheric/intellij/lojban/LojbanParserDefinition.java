package nz.co.aetheric.intellij.lojban;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

/**
 * Defines the parser?
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanParserDefinition implements ParserDefinition {

	public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);

	public static final IFileElementType FILE = new IFileElementType(Language.findInstance(LojbanLanguage.class));

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		return new LojbanLexerAdapter();
	}

	@Override
	public PsiParser createParser(Project project) {
		return new LojbanParser();
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	@NotNull
	@Override
	public TokenSet getWhitespaceTokens() {
		return WHITE_SPACES;
	}

	@NotNull
	@Override
	public TokenSet getCommentTokens() {
		return TokenSet.EMPTY;
	}

	@NotNull
	@Override
	public TokenSet getStringLiteralElements() {
		return TokenSet.EMPTY;
	}

	@NotNull
	@Override
	public PsiElement createElement(ASTNode astNode) {
		return LojbanTypes.Factory.createElement(astNode);
	}

	@Override
	public PsiFile createFile(FileViewProvider fileViewProvider) {
		return new LojbanFile(fileViewProvider);
	}

	@Override
	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
		return SpaceRequirements.MAY;
	}

}
