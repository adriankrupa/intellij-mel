// This is a generated file. Not intended for manual editing.
package com.krupa.adrian.mel.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.krupa.adrian.mel.psi.impl.*;

public interface MelTypes {

  IElementType PROPERTY = new MelElementType("PROPERTY");

  IElementType COMMENT = new MelTokenType("COMMENT");
  IElementType CRLF = new MelTokenType("CRLF");
  IElementType KEY = new MelTokenType("KEY");
  IElementType SEPARATOR = new MelTokenType("SEPARATOR");
  IElementType VALUE = new MelTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new MelPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
