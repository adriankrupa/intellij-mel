// This is a generated file. Not intended for manual editing.
package com.krupa.adrian.mel.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.krupa.adrian.mel.psi.MelTypes.*;
import com.krupa.adrian.mel.psi.*;
import com.intellij.navigation.ItemPresentation;

public class MelPropertyImpl extends MelNamedElementImpl implements MelProperty {

  public MelPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MelVisitor) ((MelVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

  public String getKey() {
    return MelPsiImplUtil.getKey(this);
  }

  public String getValue() {
    return MelPsiImplUtil.getValue(this);
  }

  public String getName() {
    return MelPsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return MelPsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return MelPsiImplUtil.getNameIdentifier(this);
  }

  public ItemPresentation getPresentation() {
    return MelPsiImplUtil.getPresentation(this);
  }

}
