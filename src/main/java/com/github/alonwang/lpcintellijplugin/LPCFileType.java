package com.github.alonwang.lpcintellijplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LPCFileType extends LanguageFileType {
    public static final LPCFileType INSTANCE = new LPCFileType();

    protected LPCFileType() {
        super(LPCLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "LPC File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "LPC language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "c";
    }

    @Override
    public @Nullable Icon getIcon() {
        return LPCIcons.FILE;
    }
}
