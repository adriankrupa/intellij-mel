package com.krupa.adrian.mel.psi;

import com.intellij.psi.tree.IElementType;
import com.krupa.adrian.mel.MelLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MelElementType extends IElementType {
    public MelElementType(@NotNull @NonNls String debugName) {
        super(debugName, MelLanguage.INSTANCE);
    }
}
