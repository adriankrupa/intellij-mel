package com.krupa.adrian.mel.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.krupa.adrian.mel.MelIcons;
import com.krupa.adrian.mel.psi.MelElementFactory;
import com.krupa.adrian.mel.psi.MelProperty;
import com.krupa.adrian.mel.psi.MelTypes;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MelPsiImplUtil {
    public static String getKey(MelProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(MelTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ "," ");
        } else {
            return null;
        }
    }

    public static String getValue(MelProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(MelTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(MelProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(MelProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(MelTypes.KEY);
        if (keyNode != null) {
            MelProperty property = MelElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(MelProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(MelTypes.KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final MelProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return MelIcons.FILE;
            }
        };
    }
}
