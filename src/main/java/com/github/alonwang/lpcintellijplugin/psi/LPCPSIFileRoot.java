package com.github.alonwang.lpcintellijplugin.psi;

import com.github.alonwang.lpcintellijplugin.LPCFileType;
import com.github.alonwang.lpcintellijplugin.LPCIcons;
import com.github.alonwang.lpcintellijplugin.LPCLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.model.psi.PsiSymbolReference;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LPCPSIFileRoot extends PsiFileBase implements ScopeNode {
    public LPCPSIFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, LPCLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return LPCFileType.INSTANCE;
    }

    @Override
    public @NotNull TextRange getTextRangeInParent() {
        return super.getTextRangeInParent();
    }
    @Override
    public ScopeNode getContext() {
        return null;
    }

    @Override
    public @NotNull Iterable<? extends @NotNull PsiSymbolReference> getOwnReferences() {
        return super.getOwnReferences();
    }

    @Override
    public String toString() {
        return "LPC Language file";
    }

    @Override
    public Icon getIcon(int flags) {
        return LPCIcons.FILE;
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
        //TODO 怎么解析的
        return null;
    }

}
