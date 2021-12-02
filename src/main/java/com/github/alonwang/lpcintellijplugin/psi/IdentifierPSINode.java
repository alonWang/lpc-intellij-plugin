package com.github.alonwang.lpcintellijplugin.psi;

import com.github.alonwang.lpcintellijplugin.LPCLanguage;
import com.github.alonwang.lpcintellijplugin.LPCParserDefinition;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import org.antlr.intellij.adaptor.psi.ANTLRPsiLeafNode;
import org.antlr.intellij.adaptor.psi.Trees;
import org.jetbrains.annotations.NotNull;

public class IdentifierPSINode extends ANTLRPsiLeafNode implements PsiNamedElement {
    public IdentifierPSINode(IElementType type, CharSequence text) {
        super(type, text);
    }

    @Override
    public String getName() {
        return getText();
    }
    @Override
    public PsiElement setName(@NlsSafe @NotNull String name) throws IncorrectOperationException {
        if ( getParent()==null ) return this;
        PsiElement newID = Trees.createLeafFromText(getProject(),
                LPCLanguage.INSTANCE,
                getContext(),
                name,
                LPCParserDefinition.ID);
        if ( newID!=null ) {
            return this.replace(newID); // use replace on leaves but replaceChild on ID nodes that are part of defs/decls.
        }
        return this;
    }
}
