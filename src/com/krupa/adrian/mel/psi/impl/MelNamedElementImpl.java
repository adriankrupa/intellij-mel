package com.krupa.adrian.mel.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.krupa.adrian.mel.psi.MelNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class MelNamedElementImpl extends ASTWrapperPsiElement implements MelNamedElement {
    public MelNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
