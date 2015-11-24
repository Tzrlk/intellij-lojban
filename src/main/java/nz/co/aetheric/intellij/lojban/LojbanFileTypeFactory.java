package nz.co.aetheric.intellij.lojban;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Creates Lojban file types.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class LojbanFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
		fileTypeConsumer.consume(LojbanFileType.INSTANCE, "lojban");
	}

}
