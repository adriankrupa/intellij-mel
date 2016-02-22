package com.krupa.adrian.mel;

import com.intellij.lexer.FlexAdapter;

public class MelLexerAdapter extends FlexAdapter {
    public MelLexerAdapter() {
        super(new MelLexer(null));
    }
}
