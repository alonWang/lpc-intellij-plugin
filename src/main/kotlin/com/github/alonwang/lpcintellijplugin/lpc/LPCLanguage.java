package com.github.alonwang.lpcintellijplugin.lpc;

import com.intellij.lang.Language;

public class LPCLanguage extends Language {
    public static final LPCLanguage INSTANCE = new LPCLanguage();

    private LPCLanguage() {
        super("LPC");
    }
}
