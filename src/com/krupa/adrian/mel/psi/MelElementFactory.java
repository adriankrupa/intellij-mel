package com.krupa.adrian.mel.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import com.krupa.adrian.mel.MelFileType;

public class MelElementFactory {
    public static MelProperty createProperty(Project project, String name, String value) {
        final MelFile file = createFile(project, name + " = " + value);
        return (MelProperty) file.getFirstChild();
    }

    public static MelProperty createProperty(Project project, String name) {
        final MelFile file = createFile(project, name);
        return (MelProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final MelFile file = createFile(project, "\n");
        return file.getFirstChild();
    }

    public static MelFile createFile(Project project, String text) {
        String name = "document.mel";
        return (MelFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, MelFileType.INSTANCE, text);
    }
}
