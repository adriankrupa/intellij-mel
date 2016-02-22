package com.krupa.adrian.mel;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.encoding.EncodingRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.nio.charset.Charset;

public class MelFileType extends LanguageFileType {
    public static final LanguageFileType INSTANCE = new MelFileType();

    protected MelFileType() {
        super(MelLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return MelConstants.MEL;
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Mel files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mel";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MelIcons.ICON;
    }

    @Override
    public String getCharset(@NotNull VirtualFile file, @NotNull final byte[] content) {
        Charset charset = EncodingRegistry.getInstance().getDefaultCharsetForPropertiesFiles(file);
        if (charset == null) {
            charset = CharsetToolkit.getDefaultSystemCharset();
        }
        return charset.name();
    }
}
