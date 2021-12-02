package com.github.alonwang.lpcintellijplugin;

import com.github.alonwang.lpcintellijplugin.parser.LPCLexer;
import com.github.alonwang.lpcintellijplugin.parser.LPCParser;
import com.github.alonwang.lpcintellijplugin.psi.LPCPSIFileRoot;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LPCParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE =
            new IFileElementType(LPCLanguage.INSTANCE);

    public static TokenIElementType ID;

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(LPCLanguage.INSTANCE,
                LPCParser.tokenNames,
                LPCParser.ruleNames);
        List<TokenIElementType> tokenIElementTypes =
                PSIElementTypeFactory.getTokenIElementTypes(LPCLanguage.INSTANCE);
        ID = tokenIElementTypes.get(LPCLexer.Identifier);
    }

    public static final TokenSet COMMENTS =
            PSIElementTypeFactory.createTokenSet(
                    LPCLanguage.INSTANCE,
                    LPCLexer.BlockComment,
                    LPCLexer.LineComment);

    public static final TokenSet WHITESPACE =
            PSIElementTypeFactory.createTokenSet(
                    LPCLanguage.INSTANCE,
                    LPCLexer.Whitespace);

    public static final TokenSet STRING =
            PSIElementTypeFactory.createTokenSet(
                    LPCLanguage.INSTANCE,
                    LPCLexer.String);
    @Override
    public @NotNull Lexer createLexer(Project project) {
        LPCLexer lexer = new LPCLexer(null);
        return new ANTLRLexerAdaptor(LPCLanguage.INSTANCE, lexer);

    }

    @Override
    public PsiParser createParser(Project project) {
        final LPCParser parser=new LPCParser(null);
        return new ANTLRParserAdaptor(LPCLanguage.INSTANCE,parser) {
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                // start rule depends on root passed in; sometimes we want to create an ID node etc...
                if ( root instanceof IFileElementType ) {
                    return ((LPCParser) parser).lpc_program();
                }
                // let's hope it's an ID as needed by "rename function"
                return ((LPCParser) parser).defination();
            }
        };
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return STRING;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        IElementType elType = node.getElementType();
        if ( elType instanceof TokenIElementType ) {
            return new ANTLRPsiNode(node);
        }
        if ( !(elType instanceof RuleIElementType) ) {
            return new ANTLRPsiNode(node);
        }
        RuleIElementType ruleElType = (RuleIElementType) elType;
        switch ( ruleElType.getRuleIndex() ) {
            //TODO
            default :
                return new ANTLRPsiNode(node);
        }
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new LPCPSIFileRoot(viewProvider);
    }
}
