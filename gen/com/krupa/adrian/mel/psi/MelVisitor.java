// This is a generated file. Not intended for manual editing.
package com.krupa.adrian.mel.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class MelVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull MelProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull MelNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
