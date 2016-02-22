package com.krupa.adrian.mel;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MelLanguage extends Language {
    public static final Language INSTANCE = new MelLanguage();

    private MelLanguage() {
        super("mel", "text/mel", "text/x-mel", "application/x-mel");
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return MelConstants.MEL;
    }

    @Nullable
    @Override
    public LanguageFileType getAssociatedFileType() {
        return MelFileType.INSTANCE;
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }


}
