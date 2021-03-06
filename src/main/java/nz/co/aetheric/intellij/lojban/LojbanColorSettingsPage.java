package nz.co.aetheric.intellij.lojban;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * Defines the settings page for highlighting colours.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanColorSettingsPage implements ColorSettingsPage {

	private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
			new AttributesDescriptor("Key", LojbanSyntaxHighlighter.KEY),
			new AttributesDescriptor("Separator", LojbanSyntaxHighlighter.SEPARATOR),
			new AttributesDescriptor("Value", LojbanSyntaxHighlighter.VALUE),
	};

	@Nullable
	@Override
	public Icon getIcon() {
		return LojbanIcons.FILE;
	}

	@NotNull
	@Override
	public SyntaxHighlighter getHighlighter() {
		return new LojbanSyntaxHighlighter();
	}

	@NotNull
	@Override
	public String getDemoText() {
		return "# You are reading the \".properties\" entry.\n" +
				"! The exclamation mark can also mark text as comments.\n" +
				"website = http://en.wikipedia.org/\n" +
				"language = English\n" +
				"# The backslash below tells the application to continue reading\n" +
				"# the value onto the next line.\n" +
				"message = Welcome to \\\n" +
				"          Wikipedia!\n" +
				"# Add spaces to the key\n" +
				"key\\ with\\ spaces = This is the value that could be looked up with the key \"key with spaces\".\n" +
				"# Unicode\n" +
				"tab : \\u0009";
	}

	@Nullable
	@Override
	public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
		return null;
	}

	@NotNull
	@Override
	public AttributesDescriptor[] getAttributeDescriptors() {
		return DESCRIPTORS;
	}

	@NotNull
	@Override
	public ColorDescriptor[] getColorDescriptors() {
		return ColorDescriptor.EMPTY_ARRAY;
	}

	@NotNull
	@Override
	public String getDisplayName() {
		return "Simple";
	}

}
