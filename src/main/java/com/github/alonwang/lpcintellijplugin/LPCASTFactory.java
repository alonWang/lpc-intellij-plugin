package com.github.alonwang.lpcintellijplugin;

import com.github.alonwang.lpcintellijplugin.parser.LPCLexer;
import com.github.alonwang.lpcintellijplugin.psi.IdentifierPSINode;
import com.intellij.core.CoreASTFactory;
import com.intellij.lang.DefaultASTFactoryImpl;
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.psi.impl.source.tree.LeafElement;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

public class LPCASTFactory extends DefaultASTFactoryImpl {


    @Override
    public @NotNull LeafElement createLeaf(@NotNull IElementType type, @NotNull CharSequence text) {
        if ( type instanceof TokenIElementType &&
                ((TokenIElementType) type).getANTLRTokenType()== LPCLexer.Identifier)
        {
            // found an ID node; here we do not distinguish between definitions and references
            // because we have no context information here. All we know is that
            // we have an identifier node that will be connected somewhere in a tree.
            //
            // You can only rename, find usages, etc... on leaves implementing PsiNamedElement
            //
            // TODO: try not to create one for IDs under def subtree roots like vardef, function
            //TODO
            return new IdentifierPSINode(type, text);
        }
        LeafElement leaf = super.createLeaf(type, text);
        return leaf;
    }
}
