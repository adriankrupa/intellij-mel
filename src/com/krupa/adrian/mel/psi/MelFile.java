package com.krupa.adrian.mel.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.krupa.adrian.mel.MelFileType;
import com.krupa.adrian.mel.MelLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MelFile extends PsiFileBase {
    public MelFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MelLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return MelFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Mel File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
