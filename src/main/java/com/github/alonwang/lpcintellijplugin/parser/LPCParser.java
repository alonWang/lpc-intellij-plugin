// Generated from /Users/alonwang/IdeaProjects/lpc-intellij-plugin/src/main/java/LPC.g4 by ANTLR 4.9.2
package com.github.alonwang.lpcintellijplugin.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LPCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TypeModifier=17, 
		Assign=18, PlusPlus=19, MinusMinus=20, And=21, AndAnd=22, Caret=23, Or=24, 
		OrOr=25, Equal=26, LeftShift=27, RightShift=28, Not=29, NotEqual=30, Compare=31, 
		LessEqual=32, Great=33, GreatEqual=34, Arrow=35, BasicType=36, Break=37, 
		Catch=38, Class=39, Colon=40, ColonColon=41, Continue=42, DefinedName=43, 
		Efun=44, Ellipsis=45, Else=46, If=47, Inherit=48, Return=49, For=50, Foreach=51, 
		In=52, Switch=53, Case=54, While=55, Do=56, Default=57, New=58, ParseCommand=59, 
		Question=60, Range=61, SScanf=62, MappingOpen=63, ArrayOpen=64, FunctionOpen=65, 
		Number=66, Parameter=67, ComplexDefine=68, ComplexInclude=69, ComplexPreprocessor=70, 
		Real=71, DigitSequence=72, Identifier=73, String=74, StringPrefix=75, 
		CharacterConstant=76, TimeExpression=77, BlockComment=78, LineComment=79, 
		Whitespace=80, Newline=81;
	public static final int
		RULE_lpc_program = 0, RULE_program = 1, RULE_possible_semi_colon = 2, 
		RULE_defination = 3, RULE_function_defination = 4, RULE_modifier_change = 5, 
		RULE_type_modifier_list = 6, RULE_type_decl = 7, RULE_member_list = 8, 
		RULE_member_name_list = 9, RULE_member_name = 10, RULE_name_list = 11, 
		RULE_new_name = 12, RULE_expr0 = 13, RULE_time_expression = 14, RULE_expr_or_block = 15, 
		RULE_comma_expr = 16, RULE_parse_command = 17, RULE_sscanf = 18, RULE_lvalue_list = 19, 
		RULE_cast = 20, RULE_basic_type = 21, RULE_atomic_type = 22, RULE_expr4 = 23, 
		RULE_catch_statement = 24, RULE_expr_list = 25, RULE_expr_list3 = 26, 
		RULE_expr_list4 = 27, RULE_assoc_pair = 28, RULE_expr_list2 = 29, RULE_expr_list_node = 30, 
		RULE_string = 31, RULE_string_con2 = 32, RULE_string_con1 = 33, RULE_function_call = 34, 
		RULE_function_name_call = 35, RULE_function_arrow_call = 36, RULE_function_name = 37, 
		RULE_opt_class_init = 38, RULE_class_init = 39, RULE_efun_override = 40, 
		RULE_block_or_semi = 41, RULE_block = 42, RULE_statements = 43, RULE_local_declare_statement = 44, 
		RULE_local_name_list = 45, RULE_new_local_def = 46, RULE_new_local_name = 47, 
		RULE_statement = 48, RULE_while_statement = 49, RULE_do_statement = 50, 
		RULE_switch_statement = 51, RULE_local_declarations = 52, RULE_case_statement = 53, 
		RULE_switch_block = 54, RULE_case_label = 55, RULE_constant = 56, RULE_foreach_loop = 57, 
		RULE_foreach_vars = 58, RULE_for_loop = 59, RULE_foreach_var = 60, RULE_first_for_expr = 61, 
		RULE_single_new_local_def_with_init = 62, RULE_single_new_local_def = 63, 
		RULE_for_expr = 64, RULE_returnStatement = 65, RULE_cond = 66, RULE_optional_else_part = 67, 
		RULE_argument = 68, RULE_argument_list = 69, RULE_new_arg = 70, RULE_inheritance = 71, 
		RULE_data_type = 72, RULE_opt_basic_type = 73, RULE_optional_star = 74, 
		RULE_identifier = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"lpc_program", "program", "possible_semi_colon", "defination", "function_defination", 
			"modifier_change", "type_modifier_list", "type_decl", "member_list", 
			"member_name_list", "member_name", "name_list", "new_name", "expr0", 
			"time_expression", "expr_or_block", "comma_expr", "parse_command", "sscanf", 
			"lvalue_list", "cast", "basic_type", "atomic_type", "expr4", "catch_statement", 
			"expr_list", "expr_list3", "expr_list4", "assoc_pair", "expr_list2", 
			"expr_list_node", "string", "string_con2", "string_con1", "function_call", 
			"function_name_call", "function_arrow_call", "function_name", "opt_class_init", 
			"class_init", "efun_override", "block_or_semi", "block", "statements", 
			"local_declare_statement", "local_name_list", "new_local_def", "new_local_name", 
			"statement", "while_statement", "do_statement", "switch_statement", "local_declarations", 
			"case_statement", "switch_block", "case_label", "constant", "foreach_loop", 
			"foreach_vars", "for_loop", "foreach_var", "first_for_expr", "single_new_local_def_with_init", 
			"single_new_local_def", "for_expr", "returnStatement", "cond", "optional_else_part", 
			"argument", "argument_list", "new_arg", "inheritance", "data_type", "opt_basic_type", 
			"optional_star", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "','", "'<'", "'*'", "'%'", 
			"'/'", "'+'", "'-'", "'~'", "'$'", "'['", "']'", null, null, "'++'", 
			"'--'", "'&'", "'&&'", "'^'", "'|'", "'||'", "'=='", "'<<'", "'>>'", 
			"'!'", "'!='", null, "'<='", "'>'", "'>='", "'->'", null, "'break'", 
			"'catch'", "'class'", "':'", "'::'", "'continue'", "'foo'", "'efun'", 
			"'...'", "'else'", "'if'", "'inherit'", "'return'", "'for'", "'foreach'", 
			"'in'", "'switch'", "'case'", "'while'", "'do'", "'default'", "'new'", 
			"'parse_command'", "'?'", "'..'", "'sscanf'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'@'", null, "'time_expression'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TypeModifier", "Assign", "PlusPlus", "MinusMinus", 
			"And", "AndAnd", "Caret", "Or", "OrOr", "Equal", "LeftShift", "RightShift", 
			"Not", "NotEqual", "Compare", "LessEqual", "Great", "GreatEqual", "Arrow", 
			"BasicType", "Break", "Catch", "Class", "Colon", "ColonColon", "Continue", 
			"DefinedName", "Efun", "Ellipsis", "Else", "If", "Inherit", "Return", 
			"For", "Foreach", "In", "Switch", "Case", "While", "Do", "Default", "New", 
			"ParseCommand", "Question", "Range", "SScanf", "MappingOpen", "ArrayOpen", 
			"FunctionOpen", "Number", "Parameter", "ComplexDefine", "ComplexInclude", 
			"ComplexPreprocessor", "Real", "DigitSequence", "Identifier", "String", 
			"StringPrefix", "CharacterConstant", "TimeExpression", "BlockComment", 
			"LineComment", "Whitespace", "Newline"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LPC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LPCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Lpc_programContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LPCParser.EOF, 0); }
		public Lpc_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lpc_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterLpc_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitLpc_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitLpc_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lpc_programContext lpc_program() throws RecognitionException {
		Lpc_programContext _localctx = new Lpc_programContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lpc_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			program(0);
			setState(153);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public DefinationContext defination() {
			return getRuleContext(DefinationContext.class,0);
		}
		public Possible_semi_colonContext possible_semi_colon() {
			return getRuleContext(Possible_semi_colonContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		return program(0);
	}

	private ProgramContext program(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgramContext _localctx = new ProgramContext(_ctx, _parentState);
		ProgramContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_program, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgramContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_program);
					setState(156);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(157);
					defination();
					setState(158);
					possible_semi_colon();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Possible_semi_colonContext extends ParserRuleContext {
		public Possible_semi_colonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possible_semi_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterPossible_semi_colon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitPossible_semi_colon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitPossible_semi_colon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Possible_semi_colonContext possible_semi_colon() throws RecognitionException {
		Possible_semi_colonContext _localctx = new Possible_semi_colonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_possible_semi_colon);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinationContext extends ParserRuleContext {
		public Function_definationContext function_defination() {
			return getRuleContext(Function_definationContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Modifier_changeContext modifier_change() {
			return getRuleContext(Modifier_changeContext.class,0);
		}
		public DefinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterDefination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitDefination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitDefination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinationContext defination() throws RecognitionException {
		DefinationContext _localctx = new DefinationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defination);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				function_defination();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				data_type();
				setState(171);
				name_list();
				setState(172);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				inheritance();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				type_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				modifier_change();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Optional_starContext optional_star() {
			return getRuleContext(Optional_starContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public Block_or_semiContext block_or_semi() {
			return getRuleContext(Block_or_semiContext.class,0);
		}
		public Function_definationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_defination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterFunction_defination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitFunction_defination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitFunction_defination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definationContext function_defination() throws RecognitionException {
		Function_definationContext _localctx = new Function_definationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_defination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			data_type();
			setState(180);
			optional_star();
			setState(181);
			identifier();
			setState(182);
			match(T__1);
			setState(183);
			argument();
			setState(184);
			match(T__2);
			setState(185);
			block_or_semi();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modifier_changeContext extends ParserRuleContext {
		public Type_modifier_listContext type_modifier_list() {
			return getRuleContext(Type_modifier_listContext.class,0);
		}
		public TerminalNode Colon() { return getToken(LPCParser.Colon, 0); }
		public Modifier_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier_change; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterModifier_change(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitModifier_change(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitModifier_change(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modifier_changeContext modifier_change() throws RecognitionException {
		Modifier_changeContext _localctx = new Modifier_changeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifier_change);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			type_modifier_list();
			setState(188);
			match(Colon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_modifier_listContext extends ParserRuleContext {
		public TerminalNode TypeModifier() { return getToken(LPCParser.TypeModifier, 0); }
		public Type_modifier_listContext type_modifier_list() {
			return getRuleContext(Type_modifier_listContext.class,0);
		}
		public Type_modifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_modifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterType_modifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitType_modifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitType_modifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_modifier_listContext type_modifier_list() throws RecognitionException {
		Type_modifier_listContext _localctx = new Type_modifier_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_modifier_list);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case BasicType:
			case Class:
			case Colon:
			case DefinedName:
			case Inherit:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TypeModifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(TypeModifier);
				setState(192);
				type_modifier_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declContext extends ParserRuleContext {
		public Type_modifier_listContext type_modifier_list() {
			return getRuleContext(Type_modifier_listContext.class,0);
		}
		public TerminalNode Class() { return getToken(LPCParser.Class, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitType_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			type_modifier_list();
			setState(196);
			match(Class);
			setState(197);
			identifier();
			setState(198);
			match(T__3);
			setState(199);
			member_list(0);
			setState(200);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_listContext extends ParserRuleContext {
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Member_name_listContext member_name_list() {
			return getRuleContext(Member_name_listContext.class,0);
		}
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterMember_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitMember_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitMember_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_listContext member_list() throws RecognitionException {
		return member_list(0);
	}

	private Member_listContext member_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Member_listContext _localctx = new Member_listContext(_ctx, _parentState);
		Member_listContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_member_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Member_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_member_list);
					setState(203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(204);
					data_type();
					setState(205);
					member_name_list();
					setState(206);
					match(T__0);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Member_name_listContext extends ParserRuleContext {
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public Member_name_listContext member_name_list() {
			return getRuleContext(Member_name_listContext.class,0);
		}
		public Member_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterMember_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitMember_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitMember_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_name_listContext member_name_list() throws RecognitionException {
		Member_name_listContext _localctx = new Member_name_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_member_name_list);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				member_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				member_name();
				setState(215);
				match(T__5);
				setState(216);
				member_name_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_nameContext extends ParserRuleContext {
		public Optional_starContext optional_star() {
			return getRuleContext(Optional_starContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterMember_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitMember_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitMember_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			optional_star();
			setState(221);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_listContext extends ParserRuleContext {
		public New_nameContext new_name() {
			return getRuleContext(New_nameContext.class,0);
		}
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public Name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterName_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitName_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitName_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_listContext name_list() throws RecognitionException {
		Name_listContext _localctx = new Name_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_list);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				new_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				new_name();
				setState(225);
				match(T__5);
				setState(226);
				name_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_nameContext extends ParserRuleContext {
		public Optional_starContext optional_star() {
			return getRuleContext(Optional_starContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(LPCParser.Assign, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public New_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterNew_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitNew_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitNew_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_nameContext new_name() throws RecognitionException {
		New_nameContext _localctx = new New_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_new_name);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				optional_star();
				setState(231);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				optional_star();
				setState(234);
				identifier();
				setState(235);
				match(Assign);
				setState(236);
				expr0(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr0Context extends ParserRuleContext {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TerminalNode Assign() { return getToken(LPCParser.Assign, 0); }
		public List<Expr0Context> expr0() {
			return getRuleContexts(Expr0Context.class);
		}
		public Expr0Context expr0(int i) {
			return getRuleContext(Expr0Context.class,i);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(LPCParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(LPCParser.MinusMinus, 0); }
		public TerminalNode Not() { return getToken(LPCParser.Not, 0); }
		public SscanfContext sscanf() {
			return getRuleContext(SscanfContext.class,0);
		}
		public Parse_commandContext parse_command() {
			return getRuleContext(Parse_commandContext.class,0);
		}
		public Time_expressionContext time_expression() {
			return getRuleContext(Time_expressionContext.class,0);
		}
		public TerminalNode Number() { return getToken(LPCParser.Number, 0); }
		public TerminalNode Real() { return getToken(LPCParser.Real, 0); }
		public TerminalNode Question() { return getToken(LPCParser.Question, 0); }
		public TerminalNode Colon() { return getToken(LPCParser.Colon, 0); }
		public TerminalNode OrOr() { return getToken(LPCParser.OrOr, 0); }
		public TerminalNode AndAnd() { return getToken(LPCParser.AndAnd, 0); }
		public TerminalNode Or() { return getToken(LPCParser.Or, 0); }
		public TerminalNode Caret() { return getToken(LPCParser.Caret, 0); }
		public TerminalNode And() { return getToken(LPCParser.And, 0); }
		public TerminalNode Equal() { return getToken(LPCParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(LPCParser.NotEqual, 0); }
		public TerminalNode Compare() { return getToken(LPCParser.Compare, 0); }
		public TerminalNode LeftShift() { return getToken(LPCParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(LPCParser.RightShift, 0); }
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterExpr0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitExpr0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitExpr0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		return expr0(0);
	}

	private Expr0Context expr0(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr0Context _localctx = new Expr0Context(_ctx, _parentState);
		Expr0Context _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr0, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(241);
				expr4(0);
				setState(242);
				match(Assign);
				setState(243);
				expr0(29);
				}
				break;
			case 2:
				{
				setState(245);
				cast();
				setState(246);
				expr0(14);
				}
				break;
			case 3:
				{
				setState(248);
				match(PlusPlus);
				setState(249);
				expr4(0);
				}
				break;
			case 4:
				{
				setState(250);
				match(MinusMinus);
				setState(251);
				expr4(0);
				}
				break;
			case 5:
				{
				setState(252);
				match(Not);
				setState(253);
				expr0(11);
				}
				break;
			case 6:
				{
				setState(254);
				match(T__12);
				setState(255);
				expr0(10);
				}
				break;
			case 7:
				{
				setState(256);
				match(T__11);
				setState(257);
				expr0(9);
				}
				break;
			case 8:
				{
				setState(258);
				expr4(0);
				setState(259);
				match(PlusPlus);
				}
				break;
			case 9:
				{
				setState(261);
				expr4(0);
				setState(262);
				match(MinusMinus);
				}
				break;
			case 10:
				{
				setState(264);
				expr4(0);
				}
				break;
			case 11:
				{
				setState(265);
				sscanf();
				}
				break;
			case 12:
				{
				setState(266);
				parse_command();
				}
				break;
			case 13:
				{
				setState(267);
				time_expression();
				}
				break;
			case 14:
				{
				setState(268);
				match(Number);
				}
				break;
			case 15:
				{
				setState(269);
				match(Real);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(272);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(273);
						match(Question);
						setState(274);
						expr0(0);
						setState(275);
						match(Colon);
						setState(276);
						expr0(29);
						}
						break;
					case 2:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(278);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(279);
						match(OrOr);
						setState(280);
						expr0(28);
						}
						break;
					case 3:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(281);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(282);
						match(AndAnd);
						setState(283);
						expr0(27);
						}
						break;
					case 4:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(284);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(285);
						match(Or);
						setState(286);
						expr0(26);
						}
						break;
					case 5:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(287);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(288);
						match(Caret);
						setState(289);
						expr0(25);
						}
						break;
					case 6:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(290);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(291);
						match(And);
						setState(292);
						expr0(24);
						}
						break;
					case 7:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(293);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(294);
						match(Equal);
						setState(295);
						expr0(23);
						}
						break;
					case 8:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(296);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(297);
						match(NotEqual);
						setState(298);
						expr0(22);
						}
						break;
					case 9:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(299);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(300);
						match(Compare);
						setState(301);
						expr0(21);
						}
						break;
					case 10:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(302);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(303);
						match(T__6);
						setState(304);
						expr0(20);
						}
						break;
					case 11:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(305);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(306);
						match(LeftShift);
						setState(307);
						expr0(19);
						}
						break;
					case 12:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(308);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(309);
						match(RightShift);
						setState(310);
						expr0(18);
						}
						break;
					case 13:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(311);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(312);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(313);
						expr0(17);
						}
						break;
					case 14:
						{
						_localctx = new Expr0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(314);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(315);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(316);
						expr0(16);
						}
						break;
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Time_expressionContext extends ParserRuleContext {
		public TerminalNode TimeExpression() { return getToken(LPCParser.TimeExpression, 0); }
		public Expr_or_blockContext expr_or_block() {
			return getRuleContext(Expr_or_blockContext.class,0);
		}
		public Time_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterTime_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitTime_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitTime_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_expressionContext time_expression() throws RecognitionException {
		Time_expressionContext _localctx = new Time_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_time_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(TimeExpression);
			setState(323);
			expr_or_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_or_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public Expr_or_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterExpr_or_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitExpr_or_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitExpr_or_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_or_blockContext expr_or_block() throws RecognitionException {
		Expr_or_blockContext _localctx = new Expr_or_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_or_block);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				block();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(T__1);
				setState(327);
				comma_expr(0);
				setState(328);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comma_exprContext extends ParserRuleContext {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public Comma_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterComma_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitComma_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitComma_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_exprContext comma_expr() throws RecognitionException {
		return comma_expr(0);
	}

	private Comma_exprContext comma_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Comma_exprContext _localctx = new Comma_exprContext(_ctx, _parentState);
		Comma_exprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_comma_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(333);
			expr0(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Comma_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comma_expr);
					setState(335);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(336);
					match(T__5);
					setState(337);
					expr0(0);
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Parse_commandContext extends ParserRuleContext {
		public TerminalNode ParseCommand() { return getToken(LPCParser.ParseCommand, 0); }
		public List<Expr0Context> expr0() {
			return getRuleContexts(Expr0Context.class);
		}
		public Expr0Context expr0(int i) {
			return getRuleContext(Expr0Context.class,i);
		}
		public Lvalue_listContext lvalue_list() {
			return getRuleContext(Lvalue_listContext.class,0);
		}
		public Parse_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterParse_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitParse_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitParse_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_commandContext parse_command() throws RecognitionException {
		Parse_commandContext _localctx = new Parse_commandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parse_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ParseCommand);
			setState(344);
			match(T__1);
			setState(345);
			expr0(0);
			setState(346);
			match(T__5);
			setState(347);
			expr0(0);
			setState(348);
			match(T__5);
			setState(349);
			expr0(0);
			setState(350);
			lvalue_list();
			setState(351);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SscanfContext extends ParserRuleContext {
		public TerminalNode SScanf() { return getToken(LPCParser.SScanf, 0); }
		public List<Expr0Context> expr0() {
			return getRuleContexts(Expr0Context.class);
		}
		public Expr0Context expr0(int i) {
			return getRuleContext(Expr0Context.class,i);
		}
		public Lvalue_listContext lvalue_list() {
			return getRuleContext(Lvalue_listContext.class,0);
		}
		public SscanfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sscanf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterSscanf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitSscanf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitSscanf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SscanfContext sscanf() throws RecognitionException {
		SscanfContext _localctx = new SscanfContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sscanf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(SScanf);
			setState(354);
			match(T__1);
			setState(355);
			expr0(0);
			setState(356);
			match(T__5);
			setState(357);
			expr0(0);
			setState(358);
			lvalue_list();
			setState(359);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lvalue_listContext extends ParserRuleContext {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Lvalue_listContext lvalue_list() {
			return getRuleContext(Lvalue_listContext.class,0);
		}
		public Lvalue_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterLvalue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitLvalue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitLvalue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lvalue_listContext lvalue_list() throws RecognitionException {
		Lvalue_listContext _localctx = new Lvalue_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lvalue_list);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(T__5);
				setState(363);
				expr4(0);
				setState(364);
				lvalue_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Optional_starContext optional_star() {
			return getRuleContext(Optional_starContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__1);
			setState(369);
			basic_type();
			setState(370);
			optional_star();
			setState(371);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_typeContext extends ParserRuleContext {
		public Atomic_typeContext atomic_type() {
			return getRuleContext(Atomic_typeContext.class,0);
		}
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitBasic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitBasic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_basic_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			atomic_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atomic_typeContext extends ParserRuleContext {
		public TerminalNode BasicType() { return getToken(LPCParser.BasicType, 0); }
		public TerminalNode Class() { return getToken(LPCParser.Class, 0); }
		public TerminalNode DefinedName() { return getToken(LPCParser.DefinedName, 0); }
		public Atomic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterAtomic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitAtomic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitAtomic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atomic_typeContext atomic_type() throws RecognitionException {
		Atomic_typeContext _localctx = new Atomic_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atomic_type);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BasicType:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(BasicType);
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(Class);
				setState(377);
				match(DefinedName);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr4Context extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode DefinedName() { return getToken(LPCParser.DefinedName, 0); }
		public TerminalNode Identifier() { return getToken(LPCParser.Identifier, 0); }
		public TerminalNode Parameter() { return getToken(LPCParser.Parameter, 0); }
		public List<Comma_exprContext> comma_expr() {
			return getRuleContexts(Comma_exprContext.class);
		}
		public Comma_exprContext comma_expr(int i) {
			return getRuleContext(Comma_exprContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CharacterConstant() { return getToken(LPCParser.CharacterConstant, 0); }
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public TerminalNode BasicType() { return getToken(LPCParser.BasicType, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FunctionOpen() { return getToken(LPCParser.FunctionOpen, 0); }
		public TerminalNode Colon() { return getToken(LPCParser.Colon, 0); }
		public TerminalNode MappingOpen() { return getToken(LPCParser.MappingOpen, 0); }
		public Expr_list3Context expr_list3() {
			return getRuleContext(Expr_list3Context.class,0);
		}
		public TerminalNode ArrayOpen() { return getToken(LPCParser.ArrayOpen, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Function_arrow_callContext function_arrow_call() {
			return getRuleContext(Function_arrow_callContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(LPCParser.Arrow, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Range() { return getToken(LPCParser.Range, 0); }
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitExpr4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitExpr4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		return expr4(0);
	}

	private Expr4Context expr4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr4Context _localctx = new Expr4Context(_ctx, _parentState);
		Expr4Context _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(381);
				function_call();
				}
				break;
			case 2:
				{
				setState(382);
				match(DefinedName);
				}
				break;
			case 3:
				{
				setState(383);
				match(Identifier);
				}
				break;
			case 4:
				{
				setState(384);
				match(Parameter);
				}
				break;
			case 5:
				{
				setState(385);
				match(T__13);
				setState(386);
				match(T__1);
				setState(387);
				comma_expr(0);
				setState(388);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(390);
				string();
				}
				break;
			case 7:
				{
				setState(391);
				match(CharacterConstant);
				}
				break;
			case 8:
				{
				setState(392);
				match(T__1);
				setState(393);
				comma_expr(0);
				setState(394);
				match(T__2);
				}
				break;
			case 9:
				{
				setState(396);
				catch_statement();
				}
				break;
			case 10:
				{
				setState(397);
				match(BasicType);
				setState(398);
				match(T__1);
				setState(399);
				argument();
				setState(400);
				match(T__2);
				setState(401);
				block();
				}
				break;
			case 11:
				{
				setState(403);
				match(FunctionOpen);
				setState(404);
				comma_expr(0);
				setState(405);
				match(Colon);
				setState(406);
				match(T__2);
				}
				break;
			case 12:
				{
				setState(408);
				match(MappingOpen);
				setState(409);
				expr_list3();
				setState(410);
				match(T__15);
				setState(411);
				match(T__2);
				}
				break;
			case 13:
				{
				setState(413);
				match(ArrayOpen);
				setState(414);
				expr_list();
				setState(415);
				match(T__4);
				setState(416);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(481);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(420);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(421);
						function_arrow_call();
						}
						break;
					case 2:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(422);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(423);
						match(Arrow);
						setState(424);
						identifier();
						}
						break;
					case 3:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(425);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(426);
						match(T__14);
						setState(427);
						comma_expr(0);
						setState(428);
						match(Range);
						setState(429);
						match(T__6);
						setState(430);
						comma_expr(0);
						setState(431);
						match(T__15);
						}
						break;
					case 4:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(433);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(434);
						match(T__14);
						setState(435);
						comma_expr(0);
						setState(436);
						match(Range);
						setState(437);
						comma_expr(0);
						setState(438);
						match(T__15);
						}
						break;
					case 5:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(440);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(441);
						match(T__14);
						setState(442);
						match(T__6);
						setState(443);
						comma_expr(0);
						setState(444);
						match(Range);
						setState(445);
						comma_expr(0);
						setState(446);
						match(T__15);
						}
						break;
					case 6:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(448);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(449);
						match(T__14);
						setState(450);
						match(T__6);
						setState(451);
						comma_expr(0);
						setState(452);
						match(Range);
						setState(453);
						match(T__6);
						setState(454);
						comma_expr(0);
						setState(455);
						match(T__15);
						}
						break;
					case 7:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(457);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(458);
						match(T__14);
						setState(459);
						comma_expr(0);
						setState(460);
						match(Range);
						setState(461);
						match(T__15);
						}
						break;
					case 8:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(463);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(464);
						match(T__14);
						setState(465);
						match(T__6);
						setState(466);
						comma_expr(0);
						setState(467);
						match(Range);
						setState(468);
						match(T__15);
						}
						break;
					case 9:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(470);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(471);
						match(T__14);
						setState(472);
						match(T__6);
						setState(473);
						comma_expr(0);
						setState(474);
						match(T__15);
						}
						break;
					case 10:
						{
						_localctx = new Expr4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(476);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(477);
						match(T__14);
						setState(478);
						comma_expr(0);
						setState(479);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Catch_statementContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(LPCParser.Catch, 0); }
		public Expr_or_blockContext expr_or_block() {
			return getRuleContext(Expr_or_blockContext.class,0);
		}
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitCatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitCatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(Catch);
			setState(487);
			expr_or_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public Expr_list2Context expr_list2() {
			return getRuleContext(Expr_list2Context.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitExpr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_list);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				expr_list2(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				expr_list2(0);
				setState(492);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_list3Context extends ParserRuleContext {
		public Expr_list4Context expr_list4() {
			return getRuleContext(Expr_list4Context.class,0);
		}
		public Expr_list3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterExpr_list3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitExpr_list3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitExpr_list3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_list3Context expr_list3() throws RecognitionException {
		Expr_list3Context _localctx = new Expr_list3Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_list3);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				expr_list4(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				expr_list4(0);
				setState(499);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_list4Context extends ParserRuleContext {
		public Assoc_pairContext assoc_pair() {
			return getRuleContext(Assoc_pairContext.class,0);
		}
		public Expr_list4Context expr_list4() {
			return getRuleContext(Expr_list4Context.class,0);
		}
		public Expr_list4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterExpr_list4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitExpr_list4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitExpr_list4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_list4Context expr_list4() throws RecognitionException {
		return expr_list4(0);
	}

	private Expr_list4Context expr_list4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_list4Context _localctx = new Expr_list4Context(_ctx, _parentState);
		Expr_list4Context _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr_list4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(504);
			assoc_pair();
			}
			_ctx.stop = _input.LT(-1);
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_list4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_list4);
					setState(506);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(507);
					match(T__5);
					setState(508);
					assoc_pair();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Assoc_pairContext extends ParserRuleContext {
		public List<Expr0Context> expr0() {
			return getRuleContexts(Expr0Context.class);
		}
		public Expr0Context expr0(int i) {
			return getRuleContext(Expr0Context.class,i);
		}
		public TerminalNode Colon() { return getToken(LPCParser.Colon, 0); }
		public Assoc_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterAssoc_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitAssoc_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitAssoc_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assoc_pairContext assoc_pair() throws RecognitionException {
		Assoc_pairContext _localctx = new Assoc_pairContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assoc_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			expr0(0);
			setState(515);
			match(Colon);
			setState(516);
			expr0(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_list2Context extends ParserRuleContext {
		public Expr_list_nodeContext expr_list_node() {
			return getRuleContext(Expr_list_nodeContext.class,0);
		}
		public Expr_list2Context expr_list2() {
			return getRuleContext(Expr_list2Context.class,0);
		}
		public Expr_list2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterExpr_list2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitExpr_list2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitExpr_list2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_list2Context expr_list2() throws RecognitionException {
		return expr_list2(0);
	}

	private Expr_list2Context expr_list2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_list2Context _localctx = new Expr_list2Context(_ctx, _parentState);
		Expr_list2Context _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expr_list2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(519);
			expr_list_node();
			}
			_ctx.stop = _input.LT(-1);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_list2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_list2);
					setState(521);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(522);
					match(T__5);
					setState(523);
					expr_list_node();
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_list_nodeContext extends ParserRuleContext {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(LPCParser.Ellipsis, 0); }
		public Expr_list_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterExpr_list_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitExpr_list_node(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitExpr_list_node(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_list_nodeContext expr_list_node() throws RecognitionException {
		Expr_list_nodeContext _localctx = new Expr_list_nodeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_list_node);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				expr0(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				expr0(0);
				setState(531);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public String_con2Context string_con2() {
			return getRuleContext(String_con2Context.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			string_con2(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_con2Context extends ParserRuleContext {
		public TerminalNode String() { return getToken(LPCParser.String, 0); }
		public String_con2Context string_con2() {
			return getRuleContext(String_con2Context.class,0);
		}
		public String_con2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_con2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterString_con2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitString_con2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitString_con2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_con2Context string_con2() throws RecognitionException {
		return string_con2(0);
	}

	private String_con2Context string_con2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_con2Context _localctx = new String_con2Context(_ctx, _parentState);
		String_con2Context _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_string_con2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(538);
			match(String);
			}
			_ctx.stop = _input.LT(-1);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_con2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_con2);
					setState(540);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(541);
					match(String);
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class String_con1Context extends ParserRuleContext {
		public String_con2Context string_con2() {
			return getRuleContext(String_con2Context.class,0);
		}
		public List<String_con1Context> string_con1() {
			return getRuleContexts(String_con1Context.class);
		}
		public String_con1Context string_con1(int i) {
			return getRuleContext(String_con1Context.class,i);
		}
		public String_con1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_con1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterString_con1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitString_con1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitString_con1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_con1Context string_con1() throws RecognitionException {
		return string_con1(0);
	}

	private String_con1Context string_con1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_con1Context _localctx = new String_con1Context(_ctx, _parentState);
		String_con1Context _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_string_con1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				setState(548);
				string_con2(0);
				}
				break;
			case T__1:
				{
				setState(549);
				match(T__1);
				setState(550);
				string_con1(0);
				setState(551);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_con1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_con1);
					setState(555);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(556);
					match(T__10);
					setState(557);
					string_con1(2);
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Efun_overrideContext efun_override() {
			return getRuleContext(Efun_overrideContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode New() { return getToken(LPCParser.New, 0); }
		public TerminalNode Class() { return getToken(LPCParser.Class, 0); }
		public TerminalNode DefinedName() { return getToken(LPCParser.DefinedName, 0); }
		public Opt_class_initContext opt_class_init() {
			return getRuleContext(Opt_class_initContext.class,0);
		}
		public Function_name_callContext function_name_call() {
			return getRuleContext(Function_name_callContext.class,0);
		}
		public Function_arrow_callContext function_arrow_call() {
			return getRuleContext(Function_arrow_callContext.class,0);
		}
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_call);
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				efun_override();
				setState(564);
				match(T__1);
				setState(565);
				expr_list();
				setState(566);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(New);
				setState(569);
				match(T__1);
				setState(570);
				expr_list();
				setState(571);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(New);
				setState(574);
				match(T__1);
				setState(575);
				match(Class);
				setState(576);
				match(DefinedName);
				setState(577);
				opt_class_init(0);
				setState(578);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(DefinedName);
				setState(581);
				match(T__1);
				setState(582);
				expr_list();
				setState(583);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(585);
				function_name_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(586);
				function_arrow_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(587);
				match(T__1);
				setState(588);
				match(T__7);
				setState(589);
				comma_expr(0);
				setState(590);
				match(T__2);
				setState(591);
				match(T__1);
				setState(592);
				expr_list();
				setState(593);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_name_callContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Function_name_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterFunction_name_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitFunction_name_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitFunction_name_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_name_callContext function_name_call() throws RecognitionException {
		Function_name_callContext _localctx = new Function_name_callContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_name_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			function_name();
			setState(598);
			match(T__1);
			setState(599);
			expr_list();
			setState(600);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_arrow_callContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(LPCParser.Arrow, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Function_arrow_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arrow_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterFunction_arrow_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitFunction_arrow_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitFunction_arrow_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_arrow_callContext function_arrow_call() throws RecognitionException {
		Function_arrow_callContext _localctx = new Function_arrow_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_arrow_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(Arrow);
			setState(603);
			identifier();
			setState(604);
			match(T__1);
			setState(605);
			expr_list();
			setState(606);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LPCParser.Identifier, 0); }
		public TerminalNode ColonColon() { return getToken(LPCParser.ColonColon, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode BasicType() { return getToken(LPCParser.BasicType, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_name);
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				match(ColonColon);
				setState(610);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				match(BasicType);
				setState(612);
				match(ColonColon);
				setState(613);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				identifier();
				setState(615);
				match(ColonColon);
				setState(616);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opt_class_initContext extends ParserRuleContext {
		public Opt_class_initContext opt_class_init() {
			return getRuleContext(Opt_class_initContext.class,0);
		}
		public Class_initContext class_init() {
			return getRuleContext(Class_initContext.class,0);
		}
		public Opt_class_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_class_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterOpt_class_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitOpt_class_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitOpt_class_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_class_initContext opt_class_init() throws RecognitionException {
		return opt_class_init(0);
	}

	private Opt_class_initContext opt_class_init(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Opt_class_initContext _localctx = new Opt_class_initContext(_ctx, _parentState);
		Opt_class_initContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_opt_class_init, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Opt_class_initContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_opt_class_init);
					setState(621);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(622);
					match(T__5);
					setState(623);
					class_init();
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Class_initContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(LPCParser.Colon, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public Class_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterClass_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitClass_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitClass_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_initContext class_init() throws RecognitionException {
		Class_initContext _localctx = new Class_initContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_class_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			identifier();
			setState(630);
			match(Colon);
			setState(631);
			expr0(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Efun_overrideContext extends ParserRuleContext {
		public TerminalNode Efun() { return getToken(LPCParser.Efun, 0); }
		public TerminalNode ColonColon() { return getToken(LPCParser.ColonColon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode New() { return getToken(LPCParser.New, 0); }
		public Efun_overrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_efun_override; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterEfun_override(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitEfun_override(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitEfun_override(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Efun_overrideContext efun_override() throws RecognitionException {
		Efun_overrideContext _localctx = new Efun_overrideContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_efun_override);
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				match(Efun);
				setState(634);
				match(ColonColon);
				setState(635);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(Efun);
				setState(637);
				match(ColonColon);
				setState(638);
				match(New);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_or_semiContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_or_semiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_or_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterBlock_or_semi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitBlock_or_semi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitBlock_or_semi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_or_semiContext block_or_semi() throws RecognitionException {
		Block_or_semiContext _localctx = new Block_or_semiContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_block_or_semi);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				block();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(T__3);
			setState(646);
			statements();
			setState(647);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Local_declare_statementContext local_declare_statement() {
			return getRuleContext(Local_declare_statementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_statements);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				statement();
				setState(651);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				local_declare_statement();
				setState(654);
				statements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declare_statementContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Local_name_listContext local_name_list() {
			return getRuleContext(Local_name_listContext.class,0);
		}
		public Local_declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_declare_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterLocal_declare_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitLocal_declare_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitLocal_declare_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_declare_statementContext local_declare_statement() throws RecognitionException {
		Local_declare_statementContext _localctx = new Local_declare_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_local_declare_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			basic_type();
			setState(659);
			local_name_list();
			setState(660);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_name_listContext extends ParserRuleContext {
		public New_local_defContext new_local_def() {
			return getRuleContext(New_local_defContext.class,0);
		}
		public Local_name_listContext local_name_list() {
			return getRuleContext(Local_name_listContext.class,0);
		}
		public Local_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterLocal_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitLocal_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitLocal_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_name_listContext local_name_list() throws RecognitionException {
		Local_name_listContext _localctx = new Local_name_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_local_name_list);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				new_local_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				new_local_def();
				setState(664);
				match(T__5);
				setState(665);
				local_name_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_local_defContext extends ParserRuleContext {
		public Optional_starContext optional_star() {
			return getRuleContext(Optional_starContext.class,0);
		}
		public New_local_nameContext new_local_name() {
			return getRuleContext(New_local_nameContext.class,0);
		}
		public TerminalNode Assign() { return getToken(LPCParser.Assign, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public New_local_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_local_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterNew_local_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitNew_local_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitNew_local_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_local_defContext new_local_def() throws RecognitionException {
		New_local_defContext _localctx = new New_local_defContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_new_local_def);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				optional_star();
				setState(670);
				new_local_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				optional_star();
				setState(673);
				new_local_name();
				setState(674);
				match(Assign);
				setState(675);
				expr0(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_local_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LPCParser.Identifier, 0); }
		public TerminalNode DefinedName() { return getToken(LPCParser.DefinedName, 0); }
		public New_local_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_local_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterNew_local_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitNew_local_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitNew_local_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_local_nameContext new_local_name() throws RecognitionException {
		New_local_nameContext _localctx = new New_local_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_new_local_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_la = _input.LA(1);
			if ( !(_la==DefinedName || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Foreach_loopContext foreach_loop() {
			return getRuleContext(Foreach_loopContext.class,0);
		}
		public TerminalNode Break() { return getToken(LPCParser.Break, 0); }
		public TerminalNode Continue() { return getToken(LPCParser.Continue, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		try {
			setState(697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__11:
			case T__12:
			case T__13:
			case PlusPlus:
			case MinusMinus:
			case Not:
			case Arrow:
			case BasicType:
			case Catch:
			case ColonColon:
			case DefinedName:
			case Efun:
			case New:
			case ParseCommand:
			case SScanf:
			case MappingOpen:
			case ArrayOpen:
			case FunctionOpen:
			case Number:
			case Parameter:
			case Real:
			case Identifier:
			case String:
			case CharacterConstant:
			case TimeExpression:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				comma_expr(0);
				setState(682);
				match(T__0);
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				cond();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				while_statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 4);
				{
				setState(686);
				do_statement();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 5);
				{
				setState(687);
				switch_statement();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 6);
				{
				setState(688);
				returnStatement();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 7);
				{
				setState(689);
				block();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 8);
				{
				setState(690);
				for_loop();
				}
				break;
			case Foreach:
				enterOuterAlt(_localctx, 9);
				{
				setState(691);
				foreach_loop();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 10);
				{
				setState(692);
				match(T__0);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 11);
				{
				setState(693);
				match(Break);
				setState(694);
				match(T__0);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 12);
				{
				setState(695);
				match(Continue);
				setState(696);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(LPCParser.While, 0); }
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(While);
			setState(700);
			match(T__1);
			setState(701);
			comma_expr(0);
			setState(702);
			match(T__2);
			setState(703);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_statementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(LPCParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(LPCParser.While, 0); }
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(Do);
			setState(706);
			statement();
			setState(707);
			match(While);
			setState(708);
			match(T__1);
			setState(709);
			comma_expr(0);
			setState(710);
			match(T__2);
			setState(711);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(LPCParser.Switch, 0); }
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public Local_declarationsContext local_declarations() {
			return getRuleContext(Local_declarationsContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Switch_blockContext switch_block() {
			return getRuleContext(Switch_blockContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(Switch);
			setState(714);
			match(T__1);
			setState(715);
			comma_expr(0);
			setState(716);
			match(T__2);
			setState(717);
			match(T__3);
			setState(718);
			local_declarations(0);
			setState(719);
			case_statement();
			setState(720);
			switch_block();
			setState(721);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declarationsContext extends ParserRuleContext {
		public Local_declarationsContext local_declarations() {
			return getRuleContext(Local_declarationsContext.class,0);
		}
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Local_name_listContext local_name_list() {
			return getRuleContext(Local_name_listContext.class,0);
		}
		public Local_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterLocal_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitLocal_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitLocal_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_declarationsContext local_declarations() throws RecognitionException {
		return local_declarations(0);
	}

	private Local_declarationsContext local_declarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Local_declarationsContext _localctx = new Local_declarationsContext(_ctx, _parentState);
		Local_declarationsContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_local_declarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Local_declarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_local_declarations);
					setState(724);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(725);
					basic_type();
					setState(726);
					local_name_list();
					setState(727);
					match(T__0);
					}
					} 
				}
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Case_statementContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(LPCParser.Case, 0); }
		public List<Case_labelContext> case_label() {
			return getRuleContexts(Case_labelContext.class);
		}
		public Case_labelContext case_label(int i) {
			return getRuleContext(Case_labelContext.class,i);
		}
		public TerminalNode Colon() { return getToken(LPCParser.Colon, 0); }
		public TerminalNode Range() { return getToken(LPCParser.Range, 0); }
		public TerminalNode Default() { return getToken(LPCParser.Default, 0); }
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitCase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitCase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_case_statement);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(Case);
				setState(735);
				case_label();
				setState(736);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				match(Case);
				setState(739);
				case_label();
				setState(740);
				match(Range);
				setState(741);
				case_label();
				setState(742);
				match(Colon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				match(Default);
				setState(745);
				match(Colon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_blockContext extends ParserRuleContext {
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Switch_blockContext switch_block() {
			return getRuleContext(Switch_blockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Switch_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterSwitch_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitSwitch_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitSwitch_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_switch_block);
		try {
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
			case Default:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				case_statement();
				setState(749);
				switch_block();
				}
				break;
			case T__0:
			case T__1:
			case T__3:
			case T__11:
			case T__12:
			case T__13:
			case PlusPlus:
			case MinusMinus:
			case Not:
			case Arrow:
			case BasicType:
			case Break:
			case Catch:
			case ColonColon:
			case Continue:
			case DefinedName:
			case Efun:
			case If:
			case Return:
			case For:
			case Foreach:
			case Switch:
			case While:
			case Do:
			case New:
			case ParseCommand:
			case SScanf:
			case MappingOpen:
			case ArrayOpen:
			case FunctionOpen:
			case Number:
			case Parameter:
			case Real:
			case Identifier:
			case String:
			case CharacterConstant:
			case TimeExpression:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				statement();
				setState(752);
				switch_block();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_labelContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode CharacterConstant() { return getToken(LPCParser.CharacterConstant, 0); }
		public String_con1Context string_con1() {
			return getRuleContext(String_con1Context.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitCase_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_case_label);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				constant(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				match(CharacterConstant);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				string_con1(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode Number() { return getToken(LPCParser.Number, 0); }
		public TerminalNode Not() { return getToken(LPCParser.Not, 0); }
		public TerminalNode Or() { return getToken(LPCParser.Or, 0); }
		public TerminalNode Caret() { return getToken(LPCParser.Caret, 0); }
		public TerminalNode And() { return getToken(LPCParser.And, 0); }
		public TerminalNode Equal() { return getToken(LPCParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(LPCParser.NotEqual, 0); }
		public TerminalNode Compare() { return getToken(LPCParser.Compare, 0); }
		public TerminalNode LeftShift() { return getToken(LPCParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(LPCParser.RightShift, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		return constant(0);
	}

	private ConstantContext constant(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstantContext _localctx = new ConstantContext(_ctx, _parentState);
		ConstantContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_constant, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(763);
				match(T__1);
				setState(764);
				constant(0);
				setState(765);
				match(T__2);
				}
				break;
			case Number:
				{
				setState(767);
				match(Number);
				}
				break;
			case T__11:
				{
				setState(768);
				match(T__11);
				setState(769);
				match(Number);
				}
				break;
			case Not:
				{
				setState(770);
				match(Not);
				setState(771);
				match(Number);
				}
				break;
			case T__12:
				{
				setState(772);
				match(T__12);
				setState(773);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(818);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(776);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(777);
						match(Or);
						setState(778);
						constant(20);
						}
						break;
					case 2:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(779);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(780);
						match(Caret);
						setState(781);
						constant(19);
						}
						break;
					case 3:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(782);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(783);
						match(And);
						setState(784);
						constant(18);
						}
						break;
					case 4:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(785);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(786);
						match(Equal);
						setState(787);
						constant(17);
						}
						break;
					case 5:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(788);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(789);
						match(NotEqual);
						setState(790);
						constant(16);
						}
						break;
					case 6:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(791);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(792);
						match(Compare);
						setState(793);
						constant(15);
						}
						break;
					case 7:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(794);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(795);
						match(T__6);
						setState(796);
						constant(14);
						}
						break;
					case 8:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(797);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(798);
						match(LeftShift);
						setState(799);
						constant(13);
						}
						break;
					case 9:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(800);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(801);
						match(RightShift);
						setState(802);
						constant(12);
						}
						break;
					case 10:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(803);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(804);
						match(T__7);
						setState(805);
						constant(10);
						}
						break;
					case 11:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(806);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(807);
						match(T__8);
						setState(808);
						constant(9);
						}
						break;
					case 12:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(809);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(810);
						match(T__9);
						setState(811);
						constant(8);
						}
						break;
					case 13:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(812);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(813);
						match(T__11);
						setState(814);
						constant(7);
						}
						break;
					case 14:
						{
						_localctx = new ConstantContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constant);
						setState(815);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(816);
						match(T__10);
						setState(817);
						constant(6);
						}
						break;
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreach_loopContext extends ParserRuleContext {
		public TerminalNode Foreach() { return getToken(LPCParser.Foreach, 0); }
		public Foreach_varsContext foreach_vars() {
			return getRuleContext(Foreach_varsContext.class,0);
		}
		public TerminalNode In() { return getToken(LPCParser.In, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Foreach_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterForeach_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitForeach_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitForeach_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_loopContext foreach_loop() throws RecognitionException {
		Foreach_loopContext _localctx = new Foreach_loopContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_foreach_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(Foreach);
			setState(824);
			match(T__1);
			setState(825);
			foreach_vars();
			setState(826);
			match(In);
			setState(827);
			expr0(0);
			setState(828);
			match(T__2);
			setState(829);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_varsContext extends ParserRuleContext {
		public List<Foreach_varContext> foreach_var() {
			return getRuleContexts(Foreach_varContext.class);
		}
		public Foreach_varContext foreach_var(int i) {
			return getRuleContext(Foreach_varContext.class,i);
		}
		public Foreach_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterForeach_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitForeach_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitForeach_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_varsContext foreach_vars() throws RecognitionException {
		Foreach_varsContext _localctx = new Foreach_varsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_foreach_vars);
		try {
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				foreach_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				foreach_var();
				setState(833);
				match(T__5);
				setState(834);
				foreach_var();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(LPCParser.For, 0); }
		public First_for_exprContext first_for_expr() {
			return getRuleContext(First_for_exprContext.class,0);
		}
		public List<For_exprContext> for_expr() {
			return getRuleContexts(For_exprContext.class);
		}
		public For_exprContext for_expr(int i) {
			return getRuleContext(For_exprContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(For);
			setState(839);
			match(T__1);
			setState(840);
			first_for_expr();
			setState(841);
			match(T__0);
			setState(842);
			for_expr();
			setState(843);
			match(T__0);
			setState(844);
			for_expr();
			setState(845);
			match(T__2);
			setState(846);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_varContext extends ParserRuleContext {
		public TerminalNode DefinedName() { return getToken(LPCParser.DefinedName, 0); }
		public Single_new_local_defContext single_new_local_def() {
			return getRuleContext(Single_new_local_defContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(LPCParser.Identifier, 0); }
		public Foreach_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterForeach_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitForeach_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitForeach_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_varContext foreach_var() throws RecognitionException {
		Foreach_varContext _localctx = new Foreach_varContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_foreach_var);
		try {
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DefinedName:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				match(DefinedName);
				}
				break;
			case BasicType:
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				single_new_local_def();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class First_for_exprContext extends ParserRuleContext {
		public For_exprContext for_expr() {
			return getRuleContext(For_exprContext.class,0);
		}
		public Single_new_local_def_with_initContext single_new_local_def_with_init() {
			return getRuleContext(Single_new_local_def_with_initContext.class,0);
		}
		public First_for_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_for_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterFirst_for_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitFirst_for_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitFirst_for_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final First_for_exprContext first_for_expr() throws RecognitionException {
		First_for_exprContext _localctx = new First_for_exprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_first_for_expr);
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				for_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				single_new_local_def_with_init();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_new_local_def_with_initContext extends ParserRuleContext {
		public Single_new_local_defContext single_new_local_def() {
			return getRuleContext(Single_new_local_defContext.class,0);
		}
		public TerminalNode Assign() { return getToken(LPCParser.Assign, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public Single_new_local_def_with_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_new_local_def_with_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterSingle_new_local_def_with_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitSingle_new_local_def_with_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitSingle_new_local_def_with_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_new_local_def_with_initContext single_new_local_def_with_init() throws RecognitionException {
		Single_new_local_def_with_initContext _localctx = new Single_new_local_def_with_initContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_single_new_local_def_with_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			single_new_local_def();
			setState(858);
			match(Assign);
			setState(859);
			expr0(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_new_local_defContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Optional_starContext optional_star() {
			return getRuleContext(Optional_starContext.class,0);
		}
		public New_local_nameContext new_local_name() {
			return getRuleContext(New_local_nameContext.class,0);
		}
		public Single_new_local_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_new_local_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterSingle_new_local_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitSingle_new_local_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitSingle_new_local_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_new_local_defContext single_new_local_def() throws RecognitionException {
		Single_new_local_defContext _localctx = new Single_new_local_defContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_single_new_local_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			basic_type();
			setState(862);
			optional_star();
			setState(863);
			new_local_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_exprContext extends ParserRuleContext {
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public For_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterFor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitFor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitFor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_exprContext for_expr() throws RecognitionException {
		For_exprContext _localctx = new For_exprContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_for_expr);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
			case T__11:
			case T__12:
			case T__13:
			case PlusPlus:
			case MinusMinus:
			case Not:
			case Arrow:
			case BasicType:
			case Catch:
			case ColonColon:
			case DefinedName:
			case Efun:
			case New:
			case ParseCommand:
			case SScanf:
			case MappingOpen:
			case ArrayOpen:
			case FunctionOpen:
			case Number:
			case Parameter:
			case Real:
			case Identifier:
			case String:
			case CharacterConstant:
			case TimeExpression:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				comma_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(LPCParser.Return, 0); }
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_returnStatement);
		try {
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				match(Return);
				setState(870);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				match(Return);
				setState(872);
				comma_expr(0);
				setState(873);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(LPCParser.If, 0); }
		public Comma_exprContext comma_expr() {
			return getRuleContext(Comma_exprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Optional_else_partContext optional_else_part() {
			return getRuleContext(Optional_else_partContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(If);
			setState(878);
			match(T__1);
			setState(879);
			comma_expr(0);
			setState(880);
			match(T__2);
			setState(881);
			statement();
			setState(882);
			optional_else_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_else_partContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(LPCParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Optional_else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterOptional_else_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitOptional_else_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitOptional_else_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_else_partContext optional_else_part() throws RecognitionException {
		Optional_else_partContext _localctx = new Optional_else_partContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_optional_else_part);
		try {
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(Else);
				setState(886);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(LPCParser.Ellipsis, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_argument);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				argument_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(891);
				argument_list(0);
				setState(892);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public New_argContext new_arg() {
			return getRuleContext(New_argContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		return argument_list(0);
	}

	private Argument_listContext argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Argument_listContext _localctx = new Argument_listContext(_ctx, _parentState);
		Argument_listContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(897);
			new_arg();
			}
			_ctx.stop = _input.LT(-1);
			setState(904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Argument_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argument_list);
					setState(899);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(900);
					match(T__5);
					setState(901);
					new_arg();
					}
					} 
				}
				setState(906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class New_argContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Optional_starContext optional_star() {
			return getRuleContext(Optional_starContext.class,0);
		}
		public New_local_nameContext new_local_name() {
			return getRuleContext(New_local_nameContext.class,0);
		}
		public New_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterNew_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitNew_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitNew_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_argContext new_arg() throws RecognitionException {
		New_argContext _localctx = new New_argContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_new_arg);
		try {
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				basic_type();
				setState(908);
				optional_star();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				basic_type();
				setState(911);
				optional_star();
				setState(912);
				new_local_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(914);
				new_local_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceContext extends ParserRuleContext {
		public Type_modifier_listContext type_modifier_list() {
			return getRuleContext(Type_modifier_listContext.class,0);
		}
		public TerminalNode Inherit() { return getToken(LPCParser.Inherit, 0); }
		public String_con1Context string_con1() {
			return getRuleContext(String_con1Context.class,0);
		}
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitInheritance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			type_modifier_list();
			setState(918);
			match(Inherit);
			setState(919);
			string_con1(0);
			setState(920);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Type_modifier_listContext type_modifier_list() {
			return getRuleContext(Type_modifier_listContext.class,0);
		}
		public Opt_basic_typeContext opt_basic_type() {
			return getRuleContext(Opt_basic_typeContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			type_modifier_list();
			setState(923);
			opt_basic_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opt_basic_typeContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Opt_basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterOpt_basic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitOpt_basic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitOpt_basic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_basic_typeContext opt_basic_type() throws RecognitionException {
		Opt_basic_typeContext _localctx = new Opt_basic_typeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_opt_basic_type);
		try {
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BasicType:
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				basic_type();
				}
				break;
			case T__7:
			case DefinedName:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_starContext extends ParserRuleContext {
		public Optional_starContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterOptional_star(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitOptional_star(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitOptional_star(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_starContext optional_star() throws RecognitionException {
		Optional_starContext _localctx = new Optional_starContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_optional_star);
		try {
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode DefinedName() { return getToken(LPCParser.DefinedName, 0); }
		public TerminalNode Identifier() { return getToken(LPCParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPCListener ) ((LPCListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPCVisitor ) return ((LPCVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_la = _input.LA(1);
			if ( !(_la==DefinedName || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return program_sempred((ProgramContext)_localctx, predIndex);
		case 8:
			return member_list_sempred((Member_listContext)_localctx, predIndex);
		case 13:
			return expr0_sempred((Expr0Context)_localctx, predIndex);
		case 16:
			return comma_expr_sempred((Comma_exprContext)_localctx, predIndex);
		case 23:
			return expr4_sempred((Expr4Context)_localctx, predIndex);
		case 27:
			return expr_list4_sempred((Expr_list4Context)_localctx, predIndex);
		case 29:
			return expr_list2_sempred((Expr_list2Context)_localctx, predIndex);
		case 32:
			return string_con2_sempred((String_con2Context)_localctx, predIndex);
		case 33:
			return string_con1_sempred((String_con1Context)_localctx, predIndex);
		case 38:
			return opt_class_init_sempred((Opt_class_initContext)_localctx, predIndex);
		case 52:
			return local_declarations_sempred((Local_declarationsContext)_localctx, predIndex);
		case 56:
			return constant_sempred((ConstantContext)_localctx, predIndex);
		case 69:
			return argument_list_sempred((Argument_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean program_sempred(ProgramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean member_list_sempred(Member_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr0_sempred(Expr0Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 28);
		case 3:
			return precpred(_ctx, 27);
		case 4:
			return precpred(_ctx, 26);
		case 5:
			return precpred(_ctx, 25);
		case 6:
			return precpred(_ctx, 24);
		case 7:
			return precpred(_ctx, 23);
		case 8:
			return precpred(_ctx, 22);
		case 9:
			return precpred(_ctx, 21);
		case 10:
			return precpred(_ctx, 20);
		case 11:
			return precpred(_ctx, 19);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 16);
		case 15:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean comma_expr_sempred(Comma_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr4_sempred(Expr4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 22);
		case 18:
			return precpred(_ctx, 17);
		case 19:
			return precpred(_ctx, 16);
		case 20:
			return precpred(_ctx, 15);
		case 21:
			return precpred(_ctx, 14);
		case 22:
			return precpred(_ctx, 13);
		case 23:
			return precpred(_ctx, 12);
		case 24:
			return precpred(_ctx, 11);
		case 25:
			return precpred(_ctx, 10);
		case 26:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean expr_list4_sempred(Expr_list4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_list2_sempred(Expr_list2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean string_con2_sempred(String_con2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean string_con1_sempred(String_con1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean opt_class_init_sempred(Opt_class_initContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean local_declarations_sempred(Local_declarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean constant_sempred(ConstantContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 19);
		case 34:
			return precpred(_ctx, 18);
		case 35:
			return precpred(_ctx, 17);
		case 36:
			return precpred(_ctx, 16);
		case 37:
			return precpred(_ctx, 15);
		case 38:
			return precpred(_ctx, 14);
		case 39:
			return precpred(_ctx, 13);
		case 40:
			return precpred(_ctx, 12);
		case 41:
			return precpred(_ctx, 11);
		case 42:
			return precpred(_ctx, 9);
		case 43:
			return precpred(_ctx, 8);
		case 44:
			return precpred(_ctx, 7);
		case 45:
			return precpred(_ctx, 6);
		case 46:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argument_list_sempred(Argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u03aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\u00a3"+
		"\n\3\f\3\16\3\u00a6\13\3\3\4\3\4\5\4\u00aa\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00b4\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\5\b\u00c4\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u00d3\n\n\f\n\16\n\u00d6\13\n\3\13\3\13\3\13\3\13\3\13\5\13\u00dd"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00e7\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00f1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0111\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0140\n\17\f\17\16\17\u0143\13\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u014d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0155"+
		"\n\22\f\22\16\22\u0158\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0171\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\5\30\u017d\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u01a5\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01e4\n\31\f\31\16\31\u01e7\13"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u01f1\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01f8\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0200"+
		"\n\35\f\35\16\35\u0203\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\7\37\u020f\n\37\f\37\16\37\u0212\13\37\3 \3 \3 \3 \5 \u0218\n"+
		" \3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0221\n\"\f\"\16\"\u0224\13\"\3#\3#\3"+
		"#\3#\3#\3#\5#\u022c\n#\3#\3#\3#\7#\u0231\n#\f#\16#\u0234\13#\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\5$\u0256\n$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u026d\n\'\3(\3(\3(\3(\7(\u0273"+
		"\n(\f(\16(\u0276\13(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\5*\u0282\n*\3+\3+\5"+
		"+\u0286\n+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\5-\u0293\n-\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\5/\u029e\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u02a8\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02bc\n\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u02dc\n\66"+
		"\f\66\16\66\u02df\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\5\67\u02ed\n\67\38\38\38\38\38\38\38\58\u02f6\n8\39\39\3"+
		"9\59\u02fb\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0309\n:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\7:\u0335\n:\f:\16:\u0338"+
		"\13:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\5<\u0347\n<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3>\3>\3>\5>\u0356\n>\3?\3?\5?\u035a\n?\3@\3@\3@\3@\3"+
		"A\3A\3A\3A\3B\3B\5B\u0366\nB\3C\3C\3C\3C\3C\3C\5C\u036e\nC\3D\3D\3D\3"+
		"D\3D\3D\3D\3E\3E\3E\5E\u037a\nE\3F\3F\3F\3F\3F\5F\u0381\nF\3G\3G\3G\3"+
		"G\3G\3G\7G\u0389\nG\fG\16G\u038c\13G\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0396"+
		"\nH\3I\3I\3I\3I\3I\3J\3J\3J\3K\3K\5K\u03a2\nK\3L\3L\5L\u03a6\nL\3M\3M"+
		"\3M\2\17\4\22\34\"\608<BDNjr\u008cN\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\2\5"+
		"\3\2\n\f\3\2\r\16\4\2--KK\2\u03ea\2\u009a\3\2\2\2\4\u009d\3\2\2\2\6\u00a9"+
		"\3\2\2\2\b\u00b3\3\2\2\2\n\u00b5\3\2\2\2\f\u00bd\3\2\2\2\16\u00c3\3\2"+
		"\2\2\20\u00c5\3\2\2\2\22\u00cc\3\2\2\2\24\u00dc\3\2\2\2\26\u00de\3\2\2"+
		"\2\30\u00e6\3\2\2\2\32\u00f0\3\2\2\2\34\u0110\3\2\2\2\36\u0144\3\2\2\2"+
		" \u014c\3\2\2\2\"\u014e\3\2\2\2$\u0159\3\2\2\2&\u0163\3\2\2\2(\u0170\3"+
		"\2\2\2*\u0172\3\2\2\2,\u0177\3\2\2\2.\u017c\3\2\2\2\60\u01a4\3\2\2\2\62"+
		"\u01e8\3\2\2\2\64\u01f0\3\2\2\2\66\u01f7\3\2\2\28\u01f9\3\2\2\2:\u0204"+
		"\3\2\2\2<\u0208\3\2\2\2>\u0217\3\2\2\2@\u0219\3\2\2\2B\u021b\3\2\2\2D"+
		"\u022b\3\2\2\2F\u0255\3\2\2\2H\u0257\3\2\2\2J\u025c\3\2\2\2L\u026c\3\2"+
		"\2\2N\u026e\3\2\2\2P\u0277\3\2\2\2R\u0281\3\2\2\2T\u0285\3\2\2\2V\u0287"+
		"\3\2\2\2X\u0292\3\2\2\2Z\u0294\3\2\2\2\\\u029d\3\2\2\2^\u02a7\3\2\2\2"+
		"`\u02a9\3\2\2\2b\u02bb\3\2\2\2d\u02bd\3\2\2\2f\u02c3\3\2\2\2h\u02cb\3"+
		"\2\2\2j\u02d5\3\2\2\2l\u02ec\3\2\2\2n\u02f5\3\2\2\2p\u02fa\3\2\2\2r\u0308"+
		"\3\2\2\2t\u0339\3\2\2\2v\u0346\3\2\2\2x\u0348\3\2\2\2z\u0355\3\2\2\2|"+
		"\u0359\3\2\2\2~\u035b\3\2\2\2\u0080\u035f\3\2\2\2\u0082\u0365\3\2\2\2"+
		"\u0084\u036d\3\2\2\2\u0086\u036f\3\2\2\2\u0088\u0379\3\2\2\2\u008a\u0380"+
		"\3\2\2\2\u008c\u0382\3\2\2\2\u008e\u0395\3\2\2\2\u0090\u0397\3\2\2\2\u0092"+
		"\u039c\3\2\2\2\u0094\u03a1\3\2\2\2\u0096\u03a5\3\2\2\2\u0098\u03a7\3\2"+
		"\2\2\u009a\u009b\5\4\3\2\u009b\u009c\7\2\2\3\u009c\3\3\2\2\2\u009d\u00a4"+
		"\b\3\1\2\u009e\u009f\f\4\2\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\5\6\4\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\5\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00aa\7\3\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\7\3\2\2\2\u00ab\u00b4\5\n\6\2\u00ac\u00ad\5\u0092J\2\u00ad\u00ae\5\30"+
		"\r\2\u00ae\u00af\7\3\2\2\u00af\u00b4\3\2\2\2\u00b0\u00b4\5\u0090I\2\u00b1"+
		"\u00b4\5\20\t\2\u00b2\u00b4\5\f\7\2\u00b3\u00ab\3\2\2\2\u00b3\u00ac\3"+
		"\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\t\3\2\2\2\u00b5\u00b6\5\u0092J\2\u00b6\u00b7\5\u0096L\2\u00b7\u00b8\5"+
		"\u0098M\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba\5\u008aF\2\u00ba\u00bb\7\5\2"+
		"\2\u00bb\u00bc\5T+\2\u00bc\13\3\2\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf"+
		"\7*\2\2\u00bf\r\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c2\7\23\2\2\u00c2"+
		"\u00c4\5\16\b\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\17\3\2\2"+
		"\2\u00c5\u00c6\5\16\b\2\u00c6\u00c7\7)\2\2\u00c7\u00c8\5\u0098M\2\u00c8"+
		"\u00c9\7\6\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb\7\7\2\2\u00cb\21\3\2\2"+
		"\2\u00cc\u00d4\b\n\1\2\u00cd\u00ce\f\3\2\2\u00ce\u00cf\5\u0092J\2\u00cf"+
		"\u00d0\5\24\13\2\u00d0\u00d1\7\3\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3"+
		"\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\23\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dd\5\26\f\2\u00d8\u00d9\5\26"+
		"\f\2\u00d9\u00da\7\b\2\2\u00da\u00db\5\24\13\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\25\3\2\2\2\u00de\u00df\5\u0096"+
		"L\2\u00df\u00e0\5\u0098M\2\u00e0\27\3\2\2\2\u00e1\u00e7\5\32\16\2\u00e2"+
		"\u00e3\5\32\16\2\u00e3\u00e4\7\b\2\2\u00e4\u00e5\5\30\r\2\u00e5\u00e7"+
		"\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7\31\3\2\2\2\u00e8"+
		"\u00e9\5\u0096L\2\u00e9\u00ea\5\u0098M\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec"+
		"\5\u0096L\2\u00ec\u00ed\5\u0098M\2\u00ed\u00ee\7\24\2\2\u00ee\u00ef\5"+
		"\34\17\2\u00ef\u00f1\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1"+
		"\33\3\2\2\2\u00f2\u00f3\b\17\1\2\u00f3\u00f4\5\60\31\2\u00f4\u00f5\7\24"+
		"\2\2\u00f5\u00f6\5\34\17\37\u00f6\u0111\3\2\2\2\u00f7\u00f8\5*\26\2\u00f8"+
		"\u00f9\5\34\17\20\u00f9\u0111\3\2\2\2\u00fa\u00fb\7\25\2\2\u00fb\u0111"+
		"\5\60\31\2\u00fc\u00fd\7\26\2\2\u00fd\u0111\5\60\31\2\u00fe\u00ff\7\37"+
		"\2\2\u00ff\u0111\5\34\17\r\u0100\u0101\7\17\2\2\u0101\u0111\5\34\17\f"+
		"\u0102\u0103\7\16\2\2\u0103\u0111\5\34\17\13\u0104\u0105\5\60\31\2\u0105"+
		"\u0106\7\25\2\2\u0106\u0111\3\2\2\2\u0107\u0108\5\60\31\2\u0108\u0109"+
		"\7\26\2\2\u0109\u0111\3\2\2\2\u010a\u0111\5\60\31\2\u010b\u0111\5&\24"+
		"\2\u010c\u0111\5$\23\2\u010d\u0111\5\36\20\2\u010e\u0111\7D\2\2\u010f"+
		"\u0111\7I\2\2\u0110\u00f2\3\2\2\2\u0110\u00f7\3\2\2\2\u0110\u00fa\3\2"+
		"\2\2\u0110\u00fc\3\2\2\2\u0110\u00fe\3\2\2\2\u0110\u0100\3\2\2\2\u0110"+
		"\u0102\3\2\2\2\u0110\u0104\3\2\2\2\u0110\u0107\3\2\2\2\u0110\u010a\3\2"+
		"\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0141\3\2\2\2\u0112\u0113\f\36"+
		"\2\2\u0113\u0114\7>\2\2\u0114\u0115\5\34\17\2\u0115\u0116\7*\2\2\u0116"+
		"\u0117\5\34\17\37\u0117\u0140\3\2\2\2\u0118\u0119\f\35\2\2\u0119\u011a"+
		"\7\33\2\2\u011a\u0140\5\34\17\36\u011b\u011c\f\34\2\2\u011c\u011d\7\30"+
		"\2\2\u011d\u0140\5\34\17\35\u011e\u011f\f\33\2\2\u011f\u0120\7\32\2\2"+
		"\u0120\u0140\5\34\17\34\u0121\u0122\f\32\2\2\u0122\u0123\7\31\2\2\u0123"+
		"\u0140\5\34\17\33\u0124\u0125\f\31\2\2\u0125\u0126\7\27\2\2\u0126\u0140"+
		"\5\34\17\32\u0127\u0128\f\30\2\2\u0128\u0129\7\34\2\2\u0129\u0140\5\34"+
		"\17\31\u012a\u012b\f\27\2\2\u012b\u012c\7 \2\2\u012c\u0140\5\34\17\30"+
		"\u012d\u012e\f\26\2\2\u012e\u012f\7!\2\2\u012f\u0140\5\34\17\27\u0130"+
		"\u0131\f\25\2\2\u0131\u0132\7\t\2\2\u0132\u0140\5\34\17\26\u0133\u0134"+
		"\f\24\2\2\u0134\u0135\7\35\2\2\u0135\u0140\5\34\17\25\u0136\u0137\f\23"+
		"\2\2\u0137\u0138\7\36\2\2\u0138\u0140\5\34\17\24\u0139\u013a\f\22\2\2"+
		"\u013a\u013b\t\2\2\2\u013b\u0140\5\34\17\23\u013c\u013d\f\21\2\2\u013d"+
		"\u013e\t\3\2\2\u013e\u0140\5\34\17\22\u013f\u0112\3\2\2\2\u013f\u0118"+
		"\3\2\2\2\u013f\u011b\3\2\2\2\u013f\u011e\3\2\2\2\u013f\u0121\3\2\2\2\u013f"+
		"\u0124\3\2\2\2\u013f\u0127\3\2\2\2\u013f\u012a\3\2\2\2\u013f\u012d\3\2"+
		"\2\2\u013f\u0130\3\2\2\2\u013f\u0133\3\2\2\2\u013f\u0136\3\2\2\2\u013f"+
		"\u0139\3\2\2\2\u013f\u013c\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\35\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145"+
		"\7O\2\2\u0145\u0146\5 \21\2\u0146\37\3\2\2\2\u0147\u014d\5V,\2\u0148\u0149"+
		"\7\4\2\2\u0149\u014a\5\"\22\2\u014a\u014b\7\5\2\2\u014b\u014d\3\2\2\2"+
		"\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014d!\3\2\2\2\u014e\u014f\b"+
		"\22\1\2\u014f\u0150\5\34\17\2\u0150\u0156\3\2\2\2\u0151\u0152\f\3\2\2"+
		"\u0152\u0153\7\b\2\2\u0153\u0155\5\34\17\2\u0154\u0151\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157#\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015a\7=\2\2\u015a\u015b\7\4\2\2\u015b\u015c\5\34"+
		"\17\2\u015c\u015d\7\b\2\2\u015d\u015e\5\34\17\2\u015e\u015f\7\b\2\2\u015f"+
		"\u0160\5\34\17\2\u0160\u0161\5(\25\2\u0161\u0162\7\5\2\2\u0162%\3\2\2"+
		"\2\u0163\u0164\7@\2\2\u0164\u0165\7\4\2\2\u0165\u0166\5\34\17\2\u0166"+
		"\u0167\7\b\2\2\u0167\u0168\5\34\17\2\u0168\u0169\5(\25\2\u0169\u016a\7"+
		"\5\2\2\u016a\'\3\2\2\2\u016b\u0171\3\2\2\2\u016c\u016d\7\b\2\2\u016d\u016e"+
		"\5\60\31\2\u016e\u016f\5(\25\2\u016f\u0171\3\2\2\2\u0170\u016b\3\2\2\2"+
		"\u0170\u016c\3\2\2\2\u0171)\3\2\2\2\u0172\u0173\7\4\2\2\u0173\u0174\5"+
		",\27\2\u0174\u0175\5\u0096L\2\u0175\u0176\7\5\2\2\u0176+\3\2\2\2\u0177"+
		"\u0178\5.\30\2\u0178-\3\2\2\2\u0179\u017d\7&\2\2\u017a\u017b\7)\2\2\u017b"+
		"\u017d\7-\2\2\u017c\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017d/\3\2\2\2\u017e"+
		"\u017f\b\31\1\2\u017f\u01a5\5F$\2\u0180\u01a5\7-\2\2\u0181\u01a5\7K\2"+
		"\2\u0182\u01a5\7E\2\2\u0183\u0184\7\20\2\2\u0184\u0185\7\4\2\2\u0185\u0186"+
		"\5\"\22\2\u0186\u0187\7\5\2\2\u0187\u01a5\3\2\2\2\u0188\u01a5\5@!\2\u0189"+
		"\u01a5\7N\2\2\u018a\u018b\7\4\2\2\u018b\u018c\5\"\22\2\u018c\u018d\7\5"+
		"\2\2\u018d\u01a5\3\2\2\2\u018e\u01a5\5\62\32\2\u018f\u0190\7&\2\2\u0190"+
		"\u0191\7\4\2\2\u0191\u0192\5\u008aF\2\u0192\u0193\7\5\2\2\u0193\u0194"+
		"\5V,\2\u0194\u01a5\3\2\2\2\u0195\u0196\7C\2\2\u0196\u0197\5\"\22\2\u0197"+
		"\u0198\7*\2\2\u0198\u0199\7\5\2\2\u0199\u01a5\3\2\2\2\u019a\u019b\7A\2"+
		"\2\u019b\u019c\5\66\34\2\u019c\u019d\7\22\2\2\u019d\u019e\7\5\2\2\u019e"+
		"\u01a5\3\2\2\2\u019f\u01a0\7B\2\2\u01a0\u01a1\5\64\33\2\u01a1\u01a2\7"+
		"\7\2\2\u01a2\u01a3\7\5\2\2\u01a3\u01a5\3\2\2\2\u01a4\u017e\3\2\2\2\u01a4"+
		"\u0180\3\2\2\2\u01a4\u0181\3\2\2\2\u01a4\u0182\3\2\2\2\u01a4\u0183\3\2"+
		"\2\2\u01a4\u0188\3\2\2\2\u01a4\u0189\3\2\2\2\u01a4\u018a\3\2\2\2\u01a4"+
		"\u018e\3\2\2\2\u01a4\u018f\3\2\2\2\u01a4\u0195\3\2\2\2\u01a4\u019a\3\2"+
		"\2\2\u01a4\u019f\3\2\2\2\u01a5\u01e5\3\2\2\2\u01a6\u01a7\f\30\2\2\u01a7"+
		"\u01e4\5J&\2\u01a8\u01a9\f\23\2\2\u01a9\u01aa\7%\2\2\u01aa\u01e4\5\u0098"+
		"M\2\u01ab\u01ac\f\22\2\2\u01ac\u01ad\7\21\2\2\u01ad\u01ae\5\"\22\2\u01ae"+
		"\u01af\7?\2\2\u01af\u01b0\7\t\2\2\u01b0\u01b1\5\"\22\2\u01b1\u01b2\7\22"+
		"\2\2\u01b2\u01e4\3\2\2\2\u01b3\u01b4\f\21\2\2\u01b4\u01b5\7\21\2\2\u01b5"+
		"\u01b6\5\"\22\2\u01b6\u01b7\7?\2\2\u01b7\u01b8\5\"\22\2\u01b8\u01b9\7"+
		"\22\2\2\u01b9\u01e4\3\2\2\2\u01ba\u01bb\f\20\2\2\u01bb\u01bc\7\21\2\2"+
		"\u01bc\u01bd\7\t\2\2\u01bd\u01be\5\"\22\2\u01be\u01bf\7?\2\2\u01bf\u01c0"+
		"\5\"\22\2\u01c0\u01c1\7\22\2\2\u01c1\u01e4\3\2\2\2\u01c2\u01c3\f\17\2"+
		"\2\u01c3\u01c4\7\21\2\2\u01c4\u01c5\7\t\2\2\u01c5\u01c6\5\"\22\2\u01c6"+
		"\u01c7\7?\2\2\u01c7\u01c8\7\t\2\2\u01c8\u01c9\5\"\22\2\u01c9\u01ca\7\22"+
		"\2\2\u01ca\u01e4\3\2\2\2\u01cb\u01cc\f\16\2\2\u01cc\u01cd\7\21\2\2\u01cd"+
		"\u01ce\5\"\22\2\u01ce\u01cf\7?\2\2\u01cf\u01d0\7\22\2\2\u01d0\u01e4\3"+
		"\2\2\2\u01d1\u01d2\f\r\2\2\u01d2\u01d3\7\21\2\2\u01d3\u01d4\7\t\2\2\u01d4"+
		"\u01d5\5\"\22\2\u01d5\u01d6\7?\2\2\u01d6\u01d7\7\22\2\2\u01d7\u01e4\3"+
		"\2\2\2\u01d8\u01d9\f\f\2\2\u01d9\u01da\7\21\2\2\u01da\u01db\7\t\2\2\u01db"+
		"\u01dc\5\"\22\2\u01dc\u01dd\7\22\2\2\u01dd\u01e4\3\2\2\2\u01de\u01df\f"+
		"\13\2\2\u01df\u01e0\7\21\2\2\u01e0\u01e1\5\"\22\2\u01e1\u01e2\7\22\2\2"+
		"\u01e2\u01e4\3\2\2\2\u01e3\u01a6\3\2\2\2\u01e3\u01a8\3\2\2\2\u01e3\u01ab"+
		"\3\2\2\2\u01e3\u01b3\3\2\2\2\u01e3\u01ba\3\2\2\2\u01e3\u01c2\3\2\2\2\u01e3"+
		"\u01cb\3\2\2\2\u01e3\u01d1\3\2\2\2\u01e3\u01d8\3\2\2\2\u01e3\u01de\3\2"+
		"\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\61\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\7(\2\2\u01e9\u01ea\5 \21\2"+
		"\u01ea\63\3\2\2\2\u01eb\u01f1\3\2\2\2\u01ec\u01f1\5<\37\2\u01ed\u01ee"+
		"\5<\37\2\u01ee\u01ef\7\b\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0"+
		"\u01ec\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f1\65\3\2\2\2\u01f2\u01f8\3\2\2"+
		"\2\u01f3\u01f8\58\35\2\u01f4\u01f5\58\35\2\u01f5\u01f6\7\b\2\2\u01f6\u01f8"+
		"\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f8"+
		"\67\3\2\2\2\u01f9\u01fa\b\35\1\2\u01fa\u01fb\5:\36\2\u01fb\u0201\3\2\2"+
		"\2\u01fc\u01fd\f\3\2\2\u01fd\u01fe\7\b\2\2\u01fe\u0200\5:\36\2\u01ff\u01fc"+
		"\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"9\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\5\34\17\2\u0205\u0206\7*\2\2"+
		"\u0206\u0207\5\34\17\2\u0207;\3\2\2\2\u0208\u0209\b\37\1\2\u0209\u020a"+
		"\5> \2\u020a\u0210\3\2\2\2\u020b\u020c\f\3\2\2\u020c\u020d\7\b\2\2\u020d"+
		"\u020f\5> \2\u020e\u020b\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2"+
		"\2\u0210\u0211\3\2\2\2\u0211=\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0218"+
		"\5\34\17\2\u0214\u0215\5\34\17\2\u0215\u0216\7/\2\2\u0216\u0218\3\2\2"+
		"\2\u0217\u0213\3\2\2\2\u0217\u0214\3\2\2\2\u0218?\3\2\2\2\u0219\u021a"+
		"\5B\"\2\u021aA\3\2\2\2\u021b\u021c\b\"\1\2\u021c\u021d\7L\2\2\u021d\u0222"+
		"\3\2\2\2\u021e\u021f\f\3\2\2\u021f\u0221\7L\2\2\u0220\u021e\3\2\2\2\u0221"+
		"\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223C\3\2\2\2"+
		"\u0224\u0222\3\2\2\2\u0225\u0226\b#\1\2\u0226\u022c\5B\"\2\u0227\u0228"+
		"\7\4\2\2\u0228\u0229\5D#\2\u0229\u022a\7\5\2\2\u022a\u022c\3\2\2\2\u022b"+
		"\u0225\3\2\2\2\u022b\u0227\3\2\2\2\u022c\u0232\3\2\2\2\u022d\u022e\f\3"+
		"\2\2\u022e\u022f\7\r\2\2\u022f\u0231\5D#\4\u0230\u022d\3\2\2\2\u0231\u0234"+
		"\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233E\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0235\u0236\5R*\2\u0236\u0237\7\4\2\2\u0237\u0238\5\64"+
		"\33\2\u0238\u0239\7\5\2\2\u0239\u0256\3\2\2\2\u023a\u023b\7<\2\2\u023b"+
		"\u023c\7\4\2\2\u023c\u023d\5\64\33\2\u023d\u023e\7\5\2\2\u023e\u0256\3"+
		"\2\2\2\u023f\u0240\7<\2\2\u0240\u0241\7\4\2\2\u0241\u0242\7)\2\2\u0242"+
		"\u0243\7-\2\2\u0243\u0244\5N(\2\u0244\u0245\7\5\2\2\u0245\u0256\3\2\2"+
		"\2\u0246\u0247\7-\2\2\u0247\u0248\7\4\2\2\u0248\u0249\5\64\33\2\u0249"+
		"\u024a\7\5\2\2\u024a\u0256\3\2\2\2\u024b\u0256\5H%\2\u024c\u0256\5J&\2"+
		"\u024d\u024e\7\4\2\2\u024e\u024f\7\n\2\2\u024f\u0250\5\"\22\2\u0250\u0251"+
		"\7\5\2\2\u0251\u0252\7\4\2\2\u0252\u0253\5\64\33\2\u0253\u0254\7\5\2\2"+
		"\u0254\u0256\3\2\2\2\u0255\u0235\3\2\2\2\u0255\u023a\3\2\2\2\u0255\u023f"+
		"\3\2\2\2\u0255\u0246\3\2\2\2\u0255\u024b\3\2\2\2\u0255\u024c\3\2\2\2\u0255"+
		"\u024d\3\2\2\2\u0256G\3\2\2\2\u0257\u0258\5L\'\2\u0258\u0259\7\4\2\2\u0259"+
		"\u025a\5\64\33\2\u025a\u025b\7\5\2\2\u025bI\3\2\2\2\u025c\u025d\7%\2\2"+
		"\u025d\u025e\5\u0098M\2\u025e\u025f\7\4\2\2\u025f\u0260\5\64\33\2\u0260"+
		"\u0261\7\5\2\2\u0261K\3\2\2\2\u0262\u026d\7K\2\2\u0263\u0264\7+\2\2\u0264"+
		"\u026d\5\u0098M\2\u0265\u0266\7&\2\2\u0266\u0267\7+\2\2\u0267\u026d\5"+
		"\u0098M\2\u0268\u0269\5\u0098M\2\u0269\u026a\7+\2\2\u026a\u026b\5\u0098"+
		"M\2\u026b\u026d\3\2\2\2\u026c\u0262\3\2\2\2\u026c\u0263\3\2\2\2\u026c"+
		"\u0265\3\2\2\2\u026c\u0268\3\2\2\2\u026dM\3\2\2\2\u026e\u0274\b(\1\2\u026f"+
		"\u0270\f\3\2\2\u0270\u0271\7\b\2\2\u0271\u0273\5P)\2\u0272\u026f\3\2\2"+
		"\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275O"+
		"\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0278\5\u0098M\2\u0278\u0279\7*\2\2"+
		"\u0279\u027a\5\34\17\2\u027aQ\3\2\2\2\u027b\u027c\7.\2\2\u027c\u027d\7"+
		"+\2\2\u027d\u0282\5\u0098M\2\u027e\u027f\7.\2\2\u027f\u0280\7+\2\2\u0280"+
		"\u0282\7<\2\2\u0281\u027b\3\2\2\2\u0281\u027e\3\2\2\2\u0282S\3\2\2\2\u0283"+
		"\u0286\5V,\2\u0284\u0286\7\3\2\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2"+
		"\2\u0286U\3\2\2\2\u0287\u0288\7\6\2\2\u0288\u0289\5X-\2\u0289\u028a\7"+
		"\7\2\2\u028aW\3\2\2\2\u028b\u0293\3\2\2\2\u028c\u028d\5b\62\2\u028d\u028e"+
		"\5X-\2\u028e\u0293\3\2\2\2\u028f\u0290\5Z.\2\u0290\u0291\5X-\2\u0291\u0293"+
		"\3\2\2\2\u0292\u028b\3\2\2\2\u0292\u028c\3\2\2\2\u0292\u028f\3\2\2\2\u0293"+
		"Y\3\2\2\2\u0294\u0295\5,\27\2\u0295\u0296\5\\/\2\u0296\u0297\7\3\2\2\u0297"+
		"[\3\2\2\2\u0298\u029e\5^\60\2\u0299\u029a\5^\60\2\u029a\u029b\7\b\2\2"+
		"\u029b\u029c\5\\/\2\u029c\u029e\3\2\2\2\u029d\u0298\3\2\2\2\u029d\u0299"+
		"\3\2\2\2\u029e]\3\2\2\2\u029f\u02a0\5\u0096L\2\u02a0\u02a1\5`\61\2\u02a1"+
		"\u02a8\3\2\2\2\u02a2\u02a3\5\u0096L\2\u02a3\u02a4\5`\61\2\u02a4\u02a5"+
		"\7\24\2\2\u02a5\u02a6\5\34\17\2\u02a6\u02a8\3\2\2\2\u02a7\u029f\3\2\2"+
		"\2\u02a7\u02a2\3\2\2\2\u02a8_\3\2\2\2\u02a9\u02aa\t\4\2\2\u02aaa\3\2\2"+
		"\2\u02ab\u02ac\5\"\22\2\u02ac\u02ad\7\3\2\2\u02ad\u02bc\3\2\2\2\u02ae"+
		"\u02bc\5\u0086D\2\u02af\u02bc\5d\63\2\u02b0\u02bc\5f\64\2\u02b1\u02bc"+
		"\5h\65\2\u02b2\u02bc\5\u0084C\2\u02b3\u02bc\5V,\2\u02b4\u02bc\5x=\2\u02b5"+
		"\u02bc\5t;\2\u02b6\u02bc\7\3\2\2\u02b7\u02b8\7\'\2\2\u02b8\u02bc\7\3\2"+
		"\2\u02b9\u02ba\7,\2\2\u02ba\u02bc\7\3\2\2\u02bb\u02ab\3\2\2\2\u02bb\u02ae"+
		"\3\2\2\2\u02bb\u02af\3\2\2\2\u02bb\u02b0\3\2\2\2\u02bb\u02b1\3\2\2\2\u02bb"+
		"\u02b2\3\2\2\2\u02bb\u02b3\3\2\2\2\u02bb\u02b4\3\2\2\2\u02bb\u02b5\3\2"+
		"\2\2\u02bb\u02b6\3\2\2\2\u02bb\u02b7\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc"+
		"c\3\2\2\2\u02bd\u02be\79\2\2\u02be\u02bf\7\4\2\2\u02bf\u02c0\5\"\22\2"+
		"\u02c0\u02c1\7\5\2\2\u02c1\u02c2\5b\62\2\u02c2e\3\2\2\2\u02c3\u02c4\7"+
		":\2\2\u02c4\u02c5\5b\62\2\u02c5\u02c6\79\2\2\u02c6\u02c7\7\4\2\2\u02c7"+
		"\u02c8\5\"\22\2\u02c8\u02c9\7\5\2\2\u02c9\u02ca\7\3\2\2\u02cag\3\2\2\2"+
		"\u02cb\u02cc\7\67\2\2\u02cc\u02cd\7\4\2\2\u02cd\u02ce\5\"\22\2\u02ce\u02cf"+
		"\7\5\2\2\u02cf\u02d0\7\6\2\2\u02d0\u02d1\5j\66\2\u02d1\u02d2\5l\67\2\u02d2"+
		"\u02d3\5n8\2\u02d3\u02d4\7\7\2\2\u02d4i\3\2\2\2\u02d5\u02dd\b\66\1\2\u02d6"+
		"\u02d7\f\3\2\2\u02d7\u02d8\5,\27\2\u02d8\u02d9\5\\/\2\u02d9\u02da\7\3"+
		"\2\2\u02da\u02dc\3\2\2\2\u02db\u02d6\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02dek\3\2\2\2\u02df\u02dd\3\2\2\2"+
		"\u02e0\u02e1\78\2\2\u02e1\u02e2\5p9\2\u02e2\u02e3\7*\2\2\u02e3\u02ed\3"+
		"\2\2\2\u02e4\u02e5\78\2\2\u02e5\u02e6\5p9\2\u02e6\u02e7\7?\2\2\u02e7\u02e8"+
		"\5p9\2\u02e8\u02e9\7*\2\2\u02e9\u02ed\3\2\2\2\u02ea\u02eb\7;\2\2\u02eb"+
		"\u02ed\7*\2\2\u02ec\u02e0\3\2\2\2\u02ec\u02e4\3\2\2\2\u02ec\u02ea\3\2"+
		"\2\2\u02edm\3\2\2\2\u02ee\u02ef\5l\67\2\u02ef\u02f0\5n8\2\u02f0\u02f6"+
		"\3\2\2\2\u02f1\u02f2\5b\62\2\u02f2\u02f3\5n8\2\u02f3\u02f6\3\2\2\2\u02f4"+
		"\u02f6\3\2\2\2\u02f5\u02ee\3\2\2\2\u02f5\u02f1\3\2\2\2\u02f5\u02f4\3\2"+
		"\2\2\u02f6o\3\2\2\2\u02f7\u02fb\5r:\2\u02f8\u02fb\7N\2\2\u02f9\u02fb\5"+
		"D#\2\u02fa\u02f7\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02f9\3\2\2\2\u02fb"+
		"q\3\2\2\2\u02fc\u02fd\b:\1\2\u02fd\u02fe\7\4\2\2\u02fe\u02ff\5r:\2\u02ff"+
		"\u0300\7\5\2\2\u0300\u0309\3\2\2\2\u0301\u0309\7D\2\2\u0302\u0303\7\16"+
		"\2\2\u0303\u0309\7D\2\2\u0304\u0305\7\37\2\2\u0305\u0309\7D\2\2\u0306"+
		"\u0307\7\17\2\2\u0307\u0309\7D\2\2\u0308\u02fc\3\2\2\2\u0308\u0301\3\2"+
		"\2\2\u0308\u0302\3\2\2\2\u0308\u0304\3\2\2\2\u0308\u0306\3\2\2\2\u0309"+
		"\u0336\3\2\2\2\u030a\u030b\f\25\2\2\u030b\u030c\7\32\2\2\u030c\u0335\5"+
		"r:\26\u030d\u030e\f\24\2\2\u030e\u030f\7\31\2\2\u030f\u0335\5r:\25\u0310"+
		"\u0311\f\23\2\2\u0311\u0312\7\27\2\2\u0312\u0335\5r:\24\u0313\u0314\f"+
		"\22\2\2\u0314\u0315\7\34\2\2\u0315\u0335\5r:\23\u0316\u0317\f\21\2\2\u0317"+
		"\u0318\7 \2\2\u0318\u0335\5r:\22\u0319\u031a\f\20\2\2\u031a\u031b\7!\2"+
		"\2\u031b\u0335\5r:\21\u031c\u031d\f\17\2\2\u031d\u031e\7\t\2\2\u031e\u0335"+
		"\5r:\20\u031f\u0320\f\16\2\2\u0320\u0321\7\35\2\2\u0321\u0335\5r:\17\u0322"+
		"\u0323\f\r\2\2\u0323\u0324\7\36\2\2\u0324\u0335\5r:\16\u0325\u0326\f\13"+
		"\2\2\u0326\u0327\7\n\2\2\u0327\u0335\5r:\f\u0328\u0329\f\n\2\2\u0329\u032a"+
		"\7\13\2\2\u032a\u0335\5r:\13\u032b\u032c\f\t\2\2\u032c\u032d\7\f\2\2\u032d"+
		"\u0335\5r:\n\u032e\u032f\f\b\2\2\u032f\u0330\7\16\2\2\u0330\u0335\5r:"+
		"\t\u0331\u0332\f\7\2\2\u0332\u0333\7\r\2\2\u0333\u0335\5r:\b\u0334\u030a"+
		"\3\2\2\2\u0334\u030d\3\2\2\2\u0334\u0310\3\2\2\2\u0334\u0313\3\2\2\2\u0334"+
		"\u0316\3\2\2\2\u0334\u0319\3\2\2\2\u0334\u031c\3\2\2\2\u0334\u031f\3\2"+
		"\2\2\u0334\u0322\3\2\2\2\u0334\u0325\3\2\2\2\u0334\u0328\3\2\2\2\u0334"+
		"\u032b\3\2\2\2\u0334\u032e\3\2\2\2\u0334\u0331\3\2\2\2\u0335\u0338\3\2"+
		"\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337s\3\2\2\2\u0338\u0336"+
		"\3\2\2\2\u0339\u033a\7\65\2\2\u033a\u033b\7\4\2\2\u033b\u033c\5v<\2\u033c"+
		"\u033d\7\66\2\2\u033d\u033e\5\34\17\2\u033e\u033f\7\5\2\2\u033f\u0340"+
		"\5b\62\2\u0340u\3\2\2\2\u0341\u0347\5z>\2\u0342\u0343\5z>\2\u0343\u0344"+
		"\7\b\2\2\u0344\u0345\5z>\2\u0345\u0347\3\2\2\2\u0346\u0341\3\2\2\2\u0346"+
		"\u0342\3\2\2\2\u0347w\3\2\2\2\u0348\u0349\7\64\2\2\u0349\u034a\7\4\2\2"+
		"\u034a\u034b\5|?\2\u034b\u034c\7\3\2\2\u034c\u034d\5\u0082B\2\u034d\u034e"+
		"\7\3\2\2\u034e\u034f\5\u0082B\2\u034f\u0350\7\5\2\2\u0350\u0351\5b\62"+
		"\2\u0351y\3\2\2\2\u0352\u0356\7-\2\2\u0353\u0356\5\u0080A\2\u0354\u0356"+
		"\7K\2\2\u0355\u0352\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356"+
		"{\3\2\2\2\u0357\u035a\5\u0082B\2\u0358\u035a\5~@\2\u0359\u0357\3\2\2\2"+
		"\u0359\u0358\3\2\2\2\u035a}\3\2\2\2\u035b\u035c\5\u0080A\2\u035c\u035d"+
		"\7\24\2\2\u035d\u035e\5\34\17\2\u035e\177\3\2\2\2\u035f\u0360\5,\27\2"+
		"\u0360\u0361\5\u0096L\2\u0361\u0362\5`\61\2\u0362\u0081\3\2\2\2\u0363"+
		"\u0366\3\2\2\2\u0364\u0366\5\"\22\2\u0365\u0363\3\2\2\2\u0365\u0364\3"+
		"\2\2\2\u0366\u0083\3\2\2\2\u0367\u0368\7\63\2\2\u0368\u036e\7\3\2\2\u0369"+
		"\u036a\7\63\2\2\u036a\u036b\5\"\22\2\u036b\u036c\7\3\2\2\u036c\u036e\3"+
		"\2\2\2\u036d\u0367\3\2\2\2\u036d\u0369\3\2\2\2\u036e\u0085\3\2\2\2\u036f"+
		"\u0370\7\61\2\2\u0370\u0371\7\4\2\2\u0371\u0372\5\"\22\2\u0372\u0373\7"+
		"\5\2\2\u0373\u0374\5b\62\2\u0374\u0375\5\u0088E\2\u0375\u0087\3\2\2\2"+
		"\u0376\u037a\3\2\2\2\u0377\u0378\7\60\2\2\u0378\u037a\5b\62\2\u0379\u0376"+
		"\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u0089\3\2\2\2\u037b\u0381\3\2\2\2\u037c"+
		"\u0381\5\u008cG\2\u037d\u037e\5\u008cG\2\u037e\u037f\7/\2\2\u037f\u0381"+
		"\3\2\2\2\u0380\u037b\3\2\2\2\u0380\u037c\3\2\2\2\u0380\u037d\3\2\2\2\u0381"+
		"\u008b\3\2\2\2\u0382\u0383\bG\1\2\u0383\u0384\5\u008eH\2\u0384\u038a\3"+
		"\2\2\2\u0385\u0386\f\3\2\2\u0386\u0387\7\b\2\2\u0387\u0389\5\u008eH\2"+
		"\u0388\u0385\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b"+
		"\3\2\2\2\u038b\u008d\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u038e\5,\27\2\u038e"+
		"\u038f\5\u0096L\2\u038f\u0396\3\2\2\2\u0390\u0391\5,\27\2\u0391\u0392"+
		"\5\u0096L\2\u0392\u0393\5`\61\2\u0393\u0396\3\2\2\2\u0394\u0396\5`\61"+
		"\2\u0395\u038d\3\2\2\2\u0395\u0390\3\2\2\2\u0395\u0394\3\2\2\2\u0396\u008f"+
		"\3\2\2\2\u0397\u0398\5\16\b\2\u0398\u0399\7\62\2\2\u0399\u039a\5D#\2\u039a"+
		"\u039b\7\3\2\2\u039b\u0091\3\2\2\2\u039c\u039d\5\16\b\2\u039d\u039e\5"+
		"\u0094K\2\u039e\u0093\3\2\2\2\u039f\u03a2\5,\27\2\u03a0\u03a2\3\2\2\2"+
		"\u03a1\u039f\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u0095\3\2\2\2\u03a3\u03a6"+
		"\3\2\2\2\u03a4\u03a6\7\n\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a4\3\2\2\2\u03a6"+
		"\u0097\3\2\2\2\u03a7\u03a8\t\4\2\2\u03a8\u0099\3\2\2\2\67\u00a4\u00a9"+
		"\u00b3\u00c3\u00d4\u00dc\u00e6\u00f0\u0110\u013f\u0141\u014c\u0156\u0170"+
		"\u017c\u01a4\u01e3\u01e5\u01f0\u01f7\u0201\u0210\u0217\u0222\u022b\u0232"+
		"\u0255\u026c\u0274\u0281\u0285\u0292\u029d\u02a7\u02bb\u02dd\u02ec\u02f5"+
		"\u02fa\u0308\u0334\u0336\u0346\u0355\u0359\u0365\u036d\u0379\u0380\u038a"+
		"\u0395\u03a1\u03a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}