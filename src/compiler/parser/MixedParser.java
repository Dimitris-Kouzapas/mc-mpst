// Generated from src/compiler/parser/Mixed.g4 by ANTLR 4.7.2

package compiler.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MixedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOAD=1, FILE=2, MODULE=3, MODULES=4, PROJECT=5, CHECK=6, VERIFY=7, SEMANTICS=8, 
		GRAPH=9, USAGE=10, HELP=11, VERBOSE=12, TEMP=13, TMP=14, LIST=15, LS=16, 
		CLEAR=17, HISTORY=18, HS=19, ENV=20, EXEC=21, LAST=22, RM=23, EXTRACT=24, 
		QUIT=25, EXIT=26, END=27, SEND=28, RECEIVE=29, CHOICE=30, OR=31, IF=32, 
		LET=33, IN=34, TRUE=35, FALSE=36, PLUS=37, MINUS=38, MUL=39, DIV=40, MOD=41, 
		NEQ=42, LT=43, LEQ=44, GT=45, GEQ=46, AND=47, LBRA=48, RBRA=49, LPAR=50, 
		RPAR=51, COMMA=52, COLON=53, SEMICOLON=54, EQEQ=55, EQUAL=56, DOT=57, 
		TO=58, LABEL=59, ID=60, INT=61, ARG=62, WHITESPACE=63, COMMENT=64;
	public static final int
		RULE_module = 0, RULE_command = 1, RULE_statement = 2, RULE_projectstatement = 3, 
		RULE_semantics = 4, RULE_graph = 5, RULE_expression = 6, RULE_terminal = 7, 
		RULE_printmodule = 8, RULE_load = 9, RULE_extract = 10, RULE_typecheck = 11, 
		RULE_protocoldecl = 12, RULE_project = 13, RULE_dir = 14, RULE_filename = 15, 
		RULE_role = 16, RULE_ground = 17, RULE_rvariable = 18, RULE_end = 19, 
		RULE_globalprotocol = 20, RULE_globaltypedecl = 21, RULE_globaltype = 22, 
		RULE_guardedglobaltype = 23, RULE_globalcontinuation = 24, RULE_globalsum = 25, 
		RULE_pass = 26, RULE_grec = 27, RULE_parametrised = 28, RULE_abstraction = 29, 
		RULE_parameter = 30, RULE_parametrisedtype = 31, RULE_pcontinuation = 32, 
		RULE_pglobalsum = 33, RULE_parametrisedpass = 34, RULE_application = 35, 
		RULE_iapplication = 36, RULE_conditional = 37, RULE_sumexpr = 38, RULE_mulexpr = 39, 
		RULE_expr = 40, RULE_value = 41, RULE_variable = 42, RULE_relexpr = 43, 
		RULE_logexpr = 44, RULE_bexpr = 45, RULE_sumop = 46, RULE_mulop = 47, 
		RULE_relop = 48, RULE_logop = 49, RULE_compareop = 50, RULE_localcontextdecl = 51, 
		RULE_localcontext = 52, RULE_roledecl = 53, RULE_localtype = 54, RULE_guardedlocaltype = 55, 
		RULE_localcontinuation = 56, RULE_localsum = 57, RULE_localaction = 58, 
		RULE_send = 59, RULE_receive = 60, RULE_recurse = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "command", "statement", "projectstatement", "semantics", "graph", 
			"expression", "terminal", "printmodule", "load", "extract", "typecheck", 
			"protocoldecl", "project", "dir", "filename", "role", "ground", "rvariable", 
			"end", "globalprotocol", "globaltypedecl", "globaltype", "guardedglobaltype", 
			"globalcontinuation", "globalsum", "pass", "grec", "parametrised", "abstraction", 
			"parameter", "parametrisedtype", "pcontinuation", "pglobalsum", "parametrisedpass", 
			"application", "iapplication", "conditional", "sumexpr", "mulexpr", "expr", 
			"value", "variable", "relexpr", "logexpr", "bexpr", "sumop", "mulop", 
			"relop", "logop", "compareop", "localcontextdecl", "localcontext", "roledecl", 
			"localtype", "guardedlocaltype", "localcontinuation", "localsum", "localaction", 
			"send", "receive", "recurse"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'load'", "'file'", "'module'", "'modules'", "'project'", "'check'", 
			"'verify'", "'semantics'", "'graph'", "'usage'", "'help'", "'verbose'", 
			"'temp'", "'tmp'", "'list'", "'ls'", "'clear'", "'history'", "'hs'", 
			"'env'", "'exec'", "'last'", "'rm'", "'extract'", "'quit'", "'exit'", 
			"'end'", "'!'", "'?'", "'choice'", "'or'", "'if'", "'let'", "'in'", "'true'", 
			"'false'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!='", "'<'", "'<='", 
			"'>'", "'>='", "'and'", "'{'", "'}'", "'('", "')'", "','", "':'", "';'", 
			"'=='", "'='", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOAD", "FILE", "MODULE", "MODULES", "PROJECT", "CHECK", "VERIFY", 
			"SEMANTICS", "GRAPH", "USAGE", "HELP", "VERBOSE", "TEMP", "TMP", "LIST", 
			"LS", "CLEAR", "HISTORY", "HS", "ENV", "EXEC", "LAST", "RM", "EXTRACT", 
			"QUIT", "EXIT", "END", "SEND", "RECEIVE", "CHOICE", "OR", "IF", "LET", 
			"IN", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "NEQ", "LT", 
			"LEQ", "GT", "GEQ", "AND", "LBRA", "RBRA", "LPAR", "RPAR", "COMMA", "COLON", 
			"SEMICOLON", "EQEQ", "EQUAL", "DOT", "TO", "LABEL", "ID", "INT", "ARG", 
			"WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "Mixed.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MixedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MixedParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOAD) | (1L << FILE) | (1L << MODULE) | (1L << MODULES) | (1L << PROJECT) | (1L << CHECK) | (1L << VERIFY) | (1L << SEMANTICS) | (1L << GRAPH) | (1L << USAGE) | (1L << HELP) | (1L << VERBOSE) | (1L << LIST) | (1L << LS) | (1L << CLEAR) | (1L << HISTORY) | (1L << HS) | (1L << EXEC) | (1L << LAST) | (1L << RM) | (1L << EXTRACT) | (1L << QUIT) | (1L << EXIT) | (1L << LET) | (1L << ID))) != 0)) {
				{
				{
				setState(124);
				command();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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

	public static class CommandContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MixedParser.SEMICOLON, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			statement();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(133);
				match(SEMICOLON);
				}
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
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public PrintmoduleContext printmodule() {
			return getRuleContext(PrintmoduleContext.class,0);
		}
		public ExtractContext extract() {
			return getRuleContext(ExtractContext.class,0);
		}
		public TypecheckContext typecheck() {
			return getRuleContext(TypecheckContext.class,0);
		}
		public ProtocoldeclContext protocoldecl() {
			return getRuleContext(ProtocoldeclContext.class,0);
		}
		public ParametrisedContext parametrised() {
			return getRuleContext(ParametrisedContext.class,0);
		}
		public ProjectstatementContext projectstatement() {
			return getRuleContext(ProjectstatementContext.class,0);
		}
		public SemanticsContext semantics() {
			return getRuleContext(SemanticsContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USAGE:
			case HELP:
			case VERBOSE:
			case CLEAR:
			case HISTORY:
			case HS:
			case EXEC:
			case LAST:
			case RM:
			case QUIT:
			case EXIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				terminal();
				}
				break;
			case LOAD:
			case FILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				load();
				}
				break;
			case MODULE:
			case MODULES:
			case LIST:
			case LS:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				printmodule();
				}
				break;
			case EXTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				extract();
				}
				break;
			case CHECK:
			case VERIFY:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				typecheck();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				protocoldecl();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				parametrised();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				projectstatement();
				}
				break;
			case SEMANTICS:
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				semantics();
				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 10);
				{
				setState(145);
				graph();
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

	public static class ProjectstatementContext extends ParserRuleContext {
		public ProjectContext project() {
			return getRuleContext(ProjectContext.class,0);
		}
		public ProjectstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterProjectstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitProjectstatement(this);
		}
	}

	public final ProjectstatementContext projectstatement() throws RecognitionException {
		ProjectstatementContext _localctx = new ProjectstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_projectstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			project();
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

	public static class SemanticsContext extends ParserRuleContext {
		public TerminalNode SEMANTICS() { return getToken(MixedParser.SEMANTICS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SemanticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semantics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterSemantics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitSemantics(this);
		}
	}

	public final SemanticsContext semantics() throws RecognitionException {
		SemanticsContext _localctx = new SemanticsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_semantics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(SEMANTICS);
			setState(151);
			expression();
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

	public static class GraphContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(MixedParser.GRAPH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGraph(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(GRAPH);
			setState(154);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ProjectContext project() {
			return getRuleContext(ProjectContext.class,0);
		}
		public ProtocoldeclContext protocoldecl() {
			return getRuleContext(ProtocoldeclContext.class,0);
		}
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(MixedParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MixedParser.RPAR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				project();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				protocoldecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(LPAR);
				setState(160);
				expression();
				setState(161);
				match(RPAR);
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

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode CLEAR() { return getToken(MixedParser.CLEAR, 0); }
		public TerminalNode QUIT() { return getToken(MixedParser.QUIT, 0); }
		public TerminalNode EXIT() { return getToken(MixedParser.EXIT, 0); }
		public TerminalNode LAST() { return getToken(MixedParser.LAST, 0); }
		public TerminalNode USAGE() { return getToken(MixedParser.USAGE, 0); }
		public TerminalNode ARG() { return getToken(MixedParser.ARG, 0); }
		public TerminalNode HELP() { return getToken(MixedParser.HELP, 0); }
		public TerminalNode HISTORY() { return getToken(MixedParser.HISTORY, 0); }
		public TerminalNode INT() { return getToken(MixedParser.INT, 0); }
		public TerminalNode HS() { return getToken(MixedParser.HS, 0); }
		public TerminalNode VERBOSE() { return getToken(MixedParser.VERBOSE, 0); }
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public TerminalNode EXEC() { return getToken(MixedParser.EXEC, 0); }
		public TerminalNode RM() { return getToken(MixedParser.RM, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_terminal);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(CLEAR);
				}
				break;
			case QUIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(QUIT);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(EXIT);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(LAST);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(USAGE);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARG) {
					{
					setState(170);
					match(ARG);
					}
				}

				}
				break;
			case HELP:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(HELP);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARG) {
					{
					setState(174);
					match(ARG);
					}
				}

				}
				break;
			case HISTORY:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				match(HISTORY);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(178);
					match(INT);
					}
				}

				}
				break;
			case HS:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				match(HS);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(182);
					match(INT);
					}
				}

				}
				break;
			case VERBOSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(185);
				match(VERBOSE);
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(186);
					match(ID);
					}
					break;
				}
				}
				break;
			case EXEC:
				enterOuterAlt(_localctx, 10);
				{
				setState(189);
				match(EXEC);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(190);
					match(INT);
					}
				}

				}
				break;
			case RM:
				enterOuterAlt(_localctx, 11);
				{
				setState(193);
				match(RM);
				setState(194);
				match(ID);
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

	public static class PrintmoduleContext extends ParserRuleContext {
		public TerminalNode MODULES() { return getToken(MixedParser.MODULES, 0); }
		public TerminalNode MODULE() { return getToken(MixedParser.MODULE, 0); }
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public TerminalNode LIST() { return getToken(MixedParser.LIST, 0); }
		public TerminalNode LS() { return getToken(MixedParser.LS, 0); }
		public PrintmoduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printmodule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterPrintmodule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitPrintmodule(this);
		}
	}

	public final PrintmoduleContext printmodule() throws RecognitionException {
		PrintmoduleContext _localctx = new PrintmoduleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printmodule);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULES:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(MODULES);
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(MODULE);
				setState(199);
				match(ID);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(LIST);
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(201);
					match(ID);
					}
					break;
				}
				}
				break;
			case LS:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(LS);
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(205);
					match(ID);
					}
					break;
				}
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

	public static class LoadContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(MixedParser.LOAD, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public TerminalNode FILE() { return getToken(MixedParser.FILE, 0); }
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitLoad(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_load);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOAD:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(LOAD);
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(211);
					dir();
					}
					break;
				}
				setState(214);
				filename();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(FILE);
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(216);
					dir();
					}
					break;
				}
				setState(219);
				filename();
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

	public static class ExtractContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(MixedParser.EXTRACT, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public ExtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitExtract(this);
		}
	}

	public final ExtractContext extract() throws RecognitionException {
		ExtractContext _localctx = new ExtractContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_extract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(EXTRACT);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(223);
				dir();
				}
				break;
			}
			setState(226);
			filename();
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

	public static class TypecheckContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(MixedParser.CHECK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(MixedParser.EQEQ, 0); }
		public TerminalNode VERIFY() { return getToken(MixedParser.VERIFY, 0); }
		public TypecheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterTypecheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitTypecheck(this);
		}
	}

	public final TypecheckContext typecheck() throws RecognitionException {
		TypecheckContext _localctx = new TypecheckContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typecheck);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(CHECK);
				setState(229);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(CHECK);
				setState(231);
				expression();
				setState(232);
				match(EQEQ);
				setState(233);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(VERIFY);
				setState(236);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(VERIFY);
				setState(238);
				expression();
				setState(239);
				match(EQEQ);
				setState(240);
				expression();
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

	public static class ProtocoldeclContext extends ParserRuleContext {
		public GlobalprotocolContext globalprotocol() {
			return getRuleContext(GlobalprotocolContext.class,0);
		}
		public LocalcontextdeclContext localcontextdecl() {
			return getRuleContext(LocalcontextdeclContext.class,0);
		}
		public ProtocoldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocoldecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterProtocoldecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitProtocoldecl(this);
		}
	}

	public final ProtocoldeclContext protocoldecl() throws RecognitionException {
		ProtocoldeclContext _localctx = new ProtocoldeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_protocoldecl);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				globalprotocol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				localcontextdecl();
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

	public static class ProjectContext extends ParserRuleContext {
		public TerminalNode PROJECT() { return getToken(MixedParser.PROJECT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitProject(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_project);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(PROJECT);
			setState(249);
			expression();
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

	public static class DirContext extends ParserRuleContext {
		public List<FilenameContext> filename() {
			return getRuleContexts(FilenameContext.class);
		}
		public FilenameContext filename(int i) {
			return getRuleContext(FilenameContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(MixedParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MixedParser.DIV, i);
		}
		public DirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitDir(this);
		}
	}

	public final DirContext dir() throws RecognitionException {
		DirContext _localctx = new DirContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dir);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(251);
					filename();
					setState(252);
					match(DIV);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(256); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MixedParser.DOT, 0); }
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitFilename(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_filename);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(DOT);
				setState(261);
				filename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(ID);
				setState(263);
				filename();
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

	public static class RoleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitRole(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ID);
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

	public static class GroundContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public TerminalNode LABEL() { return getToken(MixedParser.LABEL, 0); }
		public GroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ground; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGround(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGround(this);
		}
	}

	public final GroundContext ground() throws RecognitionException {
		GroundContext _localctx = new GroundContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ground);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==LABEL || _la==ID) ) {
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

	public static class RvariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public RvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterRvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitRvariable(this);
		}
	}

	public final RvariableContext rvariable() throws RecognitionException {
		RvariableContext _localctx = new RvariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rvariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(MixedParser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(END);
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

	public static class GlobalprotocolContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MixedParser.EQUAL, 0); }
		public GlobaltypedeclContext globaltypedecl() {
			return getRuleContext(GlobaltypedeclContext.class,0);
		}
		public GlobalprotocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalprotocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGlobalprotocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGlobalprotocol(this);
		}
	}

	public final GlobalprotocolContext globalprotocol() throws RecognitionException {
		GlobalprotocolContext _localctx = new GlobalprotocolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_globalprotocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ID);
			setState(275);
			match(EQUAL);
			setState(276);
			globaltypedecl();
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

	public static class GlobaltypedeclContext extends ParserRuleContext {
		public GlobaltypeContext globaltype() {
			return getRuleContext(GlobaltypeContext.class,0);
		}
		public GlobaltypedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globaltypedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGlobaltypedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGlobaltypedecl(this);
		}
	}

	public final GlobaltypedeclContext globaltypedecl() throws RecognitionException {
		GlobaltypedeclContext _localctx = new GlobaltypedeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_globaltypedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			globaltype();
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

	public static class GlobaltypeContext extends ParserRuleContext {
		public GlobalsumContext globalsum() {
			return getRuleContext(GlobalsumContext.class,0);
		}
		public GuardedglobaltypeContext guardedglobaltype() {
			return getRuleContext(GuardedglobaltypeContext.class,0);
		}
		public GlobaltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globaltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGlobaltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGlobaltype(this);
		}
	}

	public final GlobaltypeContext globaltype() throws RecognitionException {
		GlobaltypeContext _localctx = new GlobaltypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_globaltype);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHOICE:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				globalsum();
				}
				break;
			case END:
			case LPAR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				guardedglobaltype();
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

	public static class GuardedglobaltypeContext extends ParserRuleContext {
		public PassContext pass() {
			return getRuleContext(PassContext.class,0);
		}
		public GrecContext grec() {
			return getRuleContext(GrecContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(MixedParser.LPAR, 0); }
		public GlobaltypeContext globaltype() {
			return getRuleContext(GlobaltypeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MixedParser.RPAR, 0); }
		public GuardedglobaltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedglobaltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGuardedglobaltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGuardedglobaltype(this);
		}
	}

	public final GuardedglobaltypeContext guardedglobaltype() throws RecognitionException {
		GuardedglobaltypeContext _localctx = new GuardedglobaltypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_guardedglobaltype);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				pass();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				grec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(LPAR);
				setState(288);
				globaltype();
				setState(289);
				match(RPAR);
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

	public static class GlobalcontinuationContext extends ParserRuleContext {
		public GlobaltypeContext globaltype() {
			return getRuleContext(GlobaltypeContext.class,0);
		}
		public RvariableContext rvariable() {
			return getRuleContext(RvariableContext.class,0);
		}
		public GlobalcontinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalcontinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGlobalcontinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGlobalcontinuation(this);
		}
	}

	public final GlobalcontinuationContext globalcontinuation() throws RecognitionException {
		GlobalcontinuationContext _localctx = new GlobalcontinuationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_globalcontinuation);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				globaltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				rvariable();
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

	public static class GlobalsumContext extends ParserRuleContext {
		public TerminalNode CHOICE() { return getToken(MixedParser.CHOICE, 0); }
		public List<PassContext> pass() {
			return getRuleContexts(PassContext.class);
		}
		public PassContext pass(int i) {
			return getRuleContext(PassContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MixedParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MixedParser.OR, i);
		}
		public GlobalsumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalsum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGlobalsum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGlobalsum(this);
		}
	}

	public final GlobalsumContext globalsum() throws RecognitionException {
		GlobalsumContext _localctx = new GlobalsumContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_globalsum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(CHOICE);
			setState(298);
			pass();
			setState(299);
			match(OR);
			setState(300);
			pass();
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					match(OR);
					setState(302);
					pass();
					}
					} 
				}
				setState(307);
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
			exitRule();
		}
		return _localctx;
	}

	public static class PassContext extends ParserRuleContext {
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public TerminalNode TO() { return getToken(MixedParser.TO, 0); }
		public TerminalNode COLON() { return getToken(MixedParser.COLON, 0); }
		public GroundContext ground() {
			return getRuleContext(GroundContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MixedParser.SEMICOLON, 0); }
		public GlobalcontinuationContext globalcontinuation() {
			return getRuleContext(GlobalcontinuationContext.class,0);
		}
		public PassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterPass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitPass(this);
		}
	}

	public final PassContext pass() throws RecognitionException {
		PassContext _localctx = new PassContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			role();
			setState(309);
			match(TO);
			setState(310);
			role();
			setState(311);
			match(COLON);
			setState(312);
			ground();
			setState(313);
			match(SEMICOLON);
			setState(314);
			globalcontinuation();
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

	public static class GrecContext extends ParserRuleContext {
		public RvariableContext rvariable() {
			return getRuleContext(RvariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MixedParser.DOT, 0); }
		public GlobaltypeContext globaltype() {
			return getRuleContext(GlobaltypeContext.class,0);
		}
		public GrecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGrec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGrec(this);
		}
	}

	public final GrecContext grec() throws RecognitionException {
		GrecContext _localctx = new GrecContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_grec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			rvariable();
			setState(317);
			match(DOT);
			setState(318);
			globaltype();
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

	public static class ParametrisedContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(MixedParser.LET, 0); }
		public List<AbstractionContext> abstraction() {
			return getRuleContexts(AbstractionContext.class);
		}
		public AbstractionContext abstraction(int i) {
			return getRuleContext(AbstractionContext.class,i);
		}
		public TerminalNode IN() { return getToken(MixedParser.IN, 0); }
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MixedParser.EQUAL, 0); }
		public IapplicationContext iapplication() {
			return getRuleContext(IapplicationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MixedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MixedParser.COMMA, i);
		}
		public ParametrisedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrised; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterParametrised(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitParametrised(this);
		}
	}

	public final ParametrisedContext parametrised() throws RecognitionException {
		ParametrisedContext _localctx = new ParametrisedContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametrised);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(LET);
			setState(321);
			abstraction();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(322);
				match(COMMA);
				setState(323);
				abstraction();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(IN);
			setState(330);
			match(ID);
			setState(331);
			match(EQUAL);
			setState(332);
			iapplication();
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

	public static class AbstractionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MixedParser.EQUAL, 0); }
		public ParametrisedtypeContext parametrisedtype() {
			return getRuleContext(ParametrisedtypeContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public AbstractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterAbstraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitAbstraction(this);
		}
	}

	public final AbstractionContext abstraction() throws RecognitionException {
		AbstractionContext _localctx = new AbstractionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_abstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ID);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==INT) {
				{
				{
				setState(335);
				parameter();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(EQUAL);
			setState(342);
			parametrisedtype();
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

	public static class ParameterContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameter);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				variable();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				value();
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

	public static class ParametrisedtypeContext extends ParserRuleContext {
		public PglobalsumContext pglobalsum() {
			return getRuleContext(PglobalsumContext.class,0);
		}
		public ParametrisedpassContext parametrisedpass() {
			return getRuleContext(ParametrisedpassContext.class,0);
		}
		public TerminalNode END() { return getToken(MixedParser.END, 0); }
		public TerminalNode LPAR() { return getToken(MixedParser.LPAR, 0); }
		public ParametrisedtypeContext parametrisedtype() {
			return getRuleContext(ParametrisedtypeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MixedParser.RPAR, 0); }
		public ParametrisedtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrisedtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterParametrisedtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitParametrisedtype(this);
		}
	}

	public final ParametrisedtypeContext parametrisedtype() throws RecognitionException {
		ParametrisedtypeContext _localctx = new ParametrisedtypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parametrisedtype);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHOICE:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				pglobalsum();
				}
				break;
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				parametrisedpass();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				match(END);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(LPAR);
				setState(352);
				parametrisedtype();
				setState(353);
				match(RPAR);
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

	public static class PcontinuationContext extends ParserRuleContext {
		public ParametrisedtypeContext parametrisedtype() {
			return getRuleContext(ParametrisedtypeContext.class,0);
		}
		public ApplicationContext application() {
			return getRuleContext(ApplicationContext.class,0);
		}
		public PcontinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pcontinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterPcontinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitPcontinuation(this);
		}
	}

	public final PcontinuationContext pcontinuation() throws RecognitionException {
		PcontinuationContext _localctx = new PcontinuationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pcontinuation);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				parametrisedtype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				application();
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

	public static class PglobalsumContext extends ParserRuleContext {
		public TerminalNode CHOICE() { return getToken(MixedParser.CHOICE, 0); }
		public List<ParametrisedpassContext> parametrisedpass() {
			return getRuleContexts(ParametrisedpassContext.class);
		}
		public ParametrisedpassContext parametrisedpass(int i) {
			return getRuleContext(ParametrisedpassContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MixedParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MixedParser.OR, i);
		}
		public PglobalsumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pglobalsum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterPglobalsum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitPglobalsum(this);
		}
	}

	public final PglobalsumContext pglobalsum() throws RecognitionException {
		PglobalsumContext _localctx = new PglobalsumContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pglobalsum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(CHOICE);
			setState(362);
			parametrisedpass();
			setState(363);
			match(OR);
			setState(364);
			parametrisedpass();
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(365);
					match(OR);
					setState(366);
					parametrisedpass();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class ParametrisedpassContext extends ParserRuleContext {
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public TerminalNode TO() { return getToken(MixedParser.TO, 0); }
		public TerminalNode COLON() { return getToken(MixedParser.COLON, 0); }
		public GroundContext ground() {
			return getRuleContext(GroundContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MixedParser.SEMICOLON, 0); }
		public PcontinuationContext pcontinuation() {
			return getRuleContext(PcontinuationContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ParametrisedpassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrisedpass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterParametrisedpass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitParametrisedpass(this);
		}
	}

	public final ParametrisedpassContext parametrisedpass() throws RecognitionException {
		ParametrisedpassContext _localctx = new ParametrisedpassContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parametrisedpass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(372);
				conditional();
				}
			}

			setState(375);
			role();
			setState(376);
			match(TO);
			setState(377);
			role();
			setState(378);
			match(COLON);
			setState(379);
			ground();
			setState(380);
			match(SEMICOLON);
			setState(381);
			pcontinuation();
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

	public static class ApplicationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public List<SumexprContext> sumexpr() {
			return getRuleContexts(SumexprContext.class);
		}
		public SumexprContext sumexpr(int i) {
			return getRuleContext(SumexprContext.class,i);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitApplication(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_application);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(ID);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(384);
				sumexpr(0);
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IapplicationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public IapplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iapplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterIapplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitIapplication(this);
		}
	}

	public final IapplicationContext iapplication() throws RecognitionException {
		IapplicationContext _localctx = new IapplicationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_iapplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(ID);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(391);
				value();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MixedParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(MixedParser.LPAR, 0); }
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MixedParser.RPAR, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(IF);
			setState(398);
			match(LPAR);
			setState(399);
			relexpr(0);
			setState(400);
			match(RPAR);
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

	public static class SumexprContext extends ParserRuleContext {
		public MulexprContext mulexpr() {
			return getRuleContext(MulexprContext.class,0);
		}
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public SumopContext sumop() {
			return getRuleContext(SumopContext.class,0);
		}
		public SumexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterSumexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitSumexpr(this);
		}
	}

	public final SumexprContext sumexpr() throws RecognitionException {
		return sumexpr(0);
	}

	private SumexprContext sumexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumexprContext _localctx = new SumexprContext(_ctx, _parentState);
		SumexprContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_sumexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(403);
			mulexpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumexpr);
					setState(405);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(406);
					sumop();
					setState(407);
					mulexpr(0);
					}
					} 
				}
				setState(413);
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

	public static class MulexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MulexprContext mulexpr() {
			return getRuleContext(MulexprContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public MulexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterMulexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitMulexpr(this);
		}
	}

	public final MulexprContext mulexpr() throws RecognitionException {
		return mulexpr(0);
	}

	private MulexprContext mulexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulexprContext _localctx = new MulexprContext(_ctx, _parentState);
		MulexprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_mulexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(415);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulexpr);
					setState(417);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(418);
					mulop();
					setState(419);
					expr();
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(MixedParser.LPAR, 0); }
		public SumexprContext sumexpr() {
			return getRuleContext(SumexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MixedParser.RPAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(LPAR);
				setState(427);
				sumexpr(0);
				setState(428);
				match(RPAR);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				variable();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MixedParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(INT);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(ID);
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

	public static class RelexprContext extends ParserRuleContext {
		public LogexprContext logexpr() {
			return getRuleContext(LogexprContext.class,0);
		}
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public RelexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterRelexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitRelexpr(this);
		}
	}

	public final RelexprContext relexpr() throws RecognitionException {
		return relexpr(0);
	}

	private RelexprContext relexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelexprContext _localctx = new RelexprContext(_ctx, _parentState);
		RelexprContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_relexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(439);
			logexpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relexpr);
					setState(441);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(442);
					relop();
					setState(443);
					logexpr(0);
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class LogexprContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public LogexprContext logexpr() {
			return getRuleContext(LogexprContext.class,0);
		}
		public LogopContext logop() {
			return getRuleContext(LogopContext.class,0);
		}
		public LogexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterLogexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitLogexpr(this);
		}
	}

	public final LogexprContext logexpr() throws RecognitionException {
		return logexpr(0);
	}

	private LogexprContext logexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogexprContext _localctx = new LogexprContext(_ctx, _parentState);
		LogexprContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_logexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(451);
			bexpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logexpr);
					setState(453);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(454);
					logop();
					setState(455);
					bexpr();
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class BexprContext extends ParserRuleContext {
		public List<SumexprContext> sumexpr() {
			return getRuleContexts(SumexprContext.class);
		}
		public SumexprContext sumexpr(int i) {
			return getRuleContext(SumexprContext.class,i);
		}
		public CompareopContext compareop() {
			return getRuleContext(CompareopContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(MixedParser.LPAR, 0); }
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MixedParser.RPAR, 0); }
		public TerminalNode TRUE() { return getToken(MixedParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MixedParser.FALSE, 0); }
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitBexpr(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_bexpr);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				sumexpr(0);
				setState(463);
				compareop();
				setState(464);
				sumexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(LPAR);
				setState(467);
				relexpr(0);
				setState(468);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(FALSE);
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

	public static class SumopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MixedParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MixedParser.MINUS, 0); }
		public SumopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterSumop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitSumop(this);
		}
	}

	public final SumopContext sumop() throws RecognitionException {
		SumopContext _localctx = new SumopContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sumop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(MixedParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MixedParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MixedParser.MOD, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(MixedParser.EQEQ, 0); }
		public TerminalNode NEQ() { return getToken(MixedParser.NEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !(_la==NEQ || _la==EQEQ) ) {
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

	public static class LogopContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MixedParser.AND, 0); }
		public TerminalNode OR() { return getToken(MixedParser.OR, 0); }
		public LogopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterLogop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitLogop(this);
		}
	}

	public final LogopContext logop() throws RecognitionException {
		LogopContext _localctx = new LogopContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_logop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	public static class CompareopContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(MixedParser.EQEQ, 0); }
		public TerminalNode NEQ() { return getToken(MixedParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(MixedParser.LEQ, 0); }
		public TerminalNode LT() { return getToken(MixedParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(MixedParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(MixedParser.GT, 0); }
		public CompareopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterCompareop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitCompareop(this);
		}
	}

	public final CompareopContext compareop() throws RecognitionException {
		CompareopContext _localctx = new CompareopContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_compareop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEQ) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ) | (1L << EQEQ))) != 0)) ) {
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

	public static class LocalcontextdeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MixedParser.EQUAL, 0); }
		public LocalcontextContext localcontext() {
			return getRuleContext(LocalcontextContext.class,0);
		}
		public LocalcontextdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localcontextdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterLocalcontextdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitLocalcontextdecl(this);
		}
	}

	public final LocalcontextdeclContext localcontextdecl() throws RecognitionException {
		LocalcontextdeclContext _localctx = new LocalcontextdeclContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_localcontextdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(ID);
			setState(485);
			match(EQUAL);
			setState(486);
			localcontext();
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

	public static class LocalcontextContext extends ParserRuleContext {
		public TerminalNode LBRA() { return getToken(MixedParser.LBRA, 0); }
		public List<RoledeclContext> roledecl() {
			return getRuleContexts(RoledeclContext.class);
		}
		public RoledeclContext roledecl(int i) {
			return getRuleContext(RoledeclContext.class,i);
		}
		public TerminalNode RBRA() { return getToken(MixedParser.RBRA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MixedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MixedParser.COMMA, i);
		}
		public LocalcontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localcontext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterLocalcontext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitLocalcontext(this);
		}
	}

	public final LocalcontextContext localcontext() throws RecognitionException {
		LocalcontextContext _localctx = new LocalcontextContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_localcontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(LBRA);
			setState(489);
			roledecl();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(490);
				match(COMMA);
				setState(491);
				roledecl();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			match(RBRA);
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

	public static class RoledeclContext extends ParserRuleContext {
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MixedParser.COLON, 0); }
		public LocaltypeContext localtype() {
			return getRuleContext(LocaltypeContext.class,0);
		}
		public RoledeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roledecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterRoledecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitRoledecl(this);
		}
	}

	public final RoledeclContext roledecl() throws RecognitionException {
		RoledeclContext _localctx = new RoledeclContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_roledecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			role();
			setState(500);
			match(COLON);
			setState(501);
			localtype();
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

	public static class LocaltypeContext extends ParserRuleContext {
		public LocalsumContext localsum() {
			return getRuleContext(LocalsumContext.class,0);
		}
		public GuardedlocaltypeContext guardedlocaltype() {
			return getRuleContext(GuardedlocaltypeContext.class,0);
		}
		public LocaltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterLocaltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitLocaltype(this);
		}
	}

	public final LocaltypeContext localtype() throws RecognitionException {
		LocaltypeContext _localctx = new LocaltypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_localtype);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
			case RBRA:
			case RPAR:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CHOICE:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				localsum();
				}
				break;
			case END:
			case LPAR:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				guardedlocaltype();
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

	public static class GuardedlocaltypeContext extends ParserRuleContext {
		public LocalactionContext localaction() {
			return getRuleContext(LocalactionContext.class,0);
		}
		public RecurseContext recurse() {
			return getRuleContext(RecurseContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(MixedParser.LPAR, 0); }
		public LocaltypeContext localtype() {
			return getRuleContext(LocaltypeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MixedParser.RPAR, 0); }
		public GuardedlocaltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedlocaltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterGuardedlocaltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitGuardedlocaltype(this);
		}
	}

	public final GuardedlocaltypeContext guardedlocaltype() throws RecognitionException {
		GuardedlocaltypeContext _localctx = new GuardedlocaltypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_guardedlocaltype);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				localaction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				recurse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(LPAR);
				setState(512);
				localtype();
				setState(513);
				match(RPAR);
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

	public static class LocalcontinuationContext extends ParserRuleContext {
		public LocaltypeContext localtype() {
			return getRuleContext(LocaltypeContext.class,0);
		}
		public RvariableContext rvariable() {
			return getRuleContext(RvariableContext.class,0);
		}
		public LocalcontinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localcontinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterLocalcontinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitLocalcontinuation(this);
		}
	}

	public final LocalcontinuationContext localcontinuation() throws RecognitionException {
		LocalcontinuationContext _localctx = new LocalcontinuationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_localcontinuation);
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				localtype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				rvariable();
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

	public static class LocalsumContext extends ParserRuleContext {
		public TerminalNode CHOICE() { return getToken(MixedParser.CHOICE, 0); }
		public List<LocalactionContext> localaction() {
			return getRuleContexts(LocalactionContext.class);
		}
		public LocalactionContext localaction(int i) {
			return getRuleContext(LocalactionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MixedParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MixedParser.OR, i);
		}
		public LocalsumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterLocalsum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitLocalsum(this);
		}
	}

	public final LocalsumContext localsum() throws RecognitionException {
		LocalsumContext _localctx = new LocalsumContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_localsum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(CHOICE);
			setState(522);
			localaction();
			setState(523);
			match(OR);
			setState(524);
			localaction();
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					match(OR);
					setState(526);
					localaction();
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class LocalactionContext extends ParserRuleContext {
		public SendContext send() {
			return getRuleContext(SendContext.class,0);
		}
		public ReceiveContext receive() {
			return getRuleContext(ReceiveContext.class,0);
		}
		public LocalactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterLocalaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitLocalaction(this);
		}
	}

	public final LocalactionContext localaction() throws RecognitionException {
		LocalactionContext _localctx = new LocalactionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_localaction);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				send();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				receive();
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

	public static class SendContext extends ParserRuleContext {
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public TerminalNode SEND() { return getToken(MixedParser.SEND, 0); }
		public GroundContext ground() {
			return getRuleContext(GroundContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MixedParser.SEMICOLON, 0); }
		public LocalcontinuationContext localcontinuation() {
			return getRuleContext(LocalcontinuationContext.class,0);
		}
		public SendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterSend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitSend(this);
		}
	}

	public final SendContext send() throws RecognitionException {
		SendContext _localctx = new SendContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_send);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			role();
			setState(537);
			match(SEND);
			setState(538);
			ground();
			setState(539);
			match(SEMICOLON);
			setState(540);
			localcontinuation();
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

	public static class ReceiveContext extends ParserRuleContext {
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public TerminalNode RECEIVE() { return getToken(MixedParser.RECEIVE, 0); }
		public GroundContext ground() {
			return getRuleContext(GroundContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MixedParser.SEMICOLON, 0); }
		public LocalcontinuationContext localcontinuation() {
			return getRuleContext(LocalcontinuationContext.class,0);
		}
		public ReceiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterReceive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitReceive(this);
		}
	}

	public final ReceiveContext receive() throws RecognitionException {
		ReceiveContext _localctx = new ReceiveContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_receive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			role();
			setState(543);
			match(RECEIVE);
			setState(544);
			ground();
			setState(545);
			match(SEMICOLON);
			setState(546);
			localcontinuation();
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

	public static class RecurseContext extends ParserRuleContext {
		public RvariableContext rvariable() {
			return getRuleContext(RvariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MixedParser.DOT, 0); }
		public LocaltypeContext localtype() {
			return getRuleContext(LocaltypeContext.class,0);
		}
		public RecurseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recurse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).enterRecurse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MixedListener ) ((MixedListener)listener).exitRecurse(this);
		}
	}

	public final RecurseContext recurse() throws RecognitionException {
		RecurseContext _localctx = new RecurseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_recurse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			rvariable();
			setState(549);
			match(DOT);
			setState(550);
			localtype();
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
		case 38:
			return sumexpr_sempred((SumexprContext)_localctx, predIndex);
		case 39:
			return mulexpr_sempred((MulexprContext)_localctx, predIndex);
		case 43:
			return relexpr_sempred((RelexprContext)_localctx, predIndex);
		case 44:
			return logexpr_sempred((LogexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sumexpr_sempred(SumexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulexpr_sempred(MulexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relexpr_sempred(RelexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logexpr_sempred(LogexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u022b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\2\3\2\3\3\3\3\5\3"+
		"\u0089\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0095\n\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a6\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\3\t\3\t\5\t\u00b2\n\t\3\t\3\t\5\t"+
		"\u00b6\n\t\3\t\3\t\5\t\u00ba\n\t\3\t\3\t\5\t\u00be\n\t\3\t\3\t\5\t\u00c2"+
		"\n\t\3\t\3\t\5\t\u00c6\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00cd\n\n\3\n\3\n\5"+
		"\n\u00d1\n\n\5\n\u00d3\n\n\3\13\3\13\5\13\u00d7\n\13\3\13\3\13\3\13\5"+
		"\13\u00dc\n\13\3\13\5\13\u00df\n\13\3\f\3\f\5\f\u00e3\n\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f5\n\r\3\16"+
		"\3\16\5\16\u00f9\n\16\3\17\3\17\3\17\3\20\3\20\3\20\6\20\u0101\n\20\r"+
		"\20\16\20\u0102\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010b\n\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\5\30\u011d\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0126\n\31\3"+
		"\32\3\32\5\32\u012a\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0132\n\33"+
		"\f\33\16\33\u0135\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0147\n\36\f\36\16\36\u014a\13"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u0153\n\37\f\37\16\37\u0156"+
		"\13\37\3\37\3\37\3\37\3 \3 \5 \u015d\n \3!\3!\3!\3!\3!\3!\3!\5!\u0166"+
		"\n!\3\"\3\"\5\"\u016a\n\"\3#\3#\3#\3#\3#\3#\7#\u0172\n#\f#\16#\u0175\13"+
		"#\3$\5$\u0178\n$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\7%\u0184\n%\f%\16%\u0187"+
		"\13%\3&\3&\7&\u018b\n&\f&\16&\u018e\13&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\7(\u019c\n(\f(\16(\u019f\13(\3)\3)\3)\3)\3)\3)\3)\7)\u01a8"+
		"\n)\f)\16)\u01ab\13)\3*\3*\3*\3*\3*\3*\5*\u01b3\n*\3+\3+\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\7-\u01c0\n-\f-\16-\u01c3\13-\3.\3.\3.\3.\3.\3.\3.\7.\u01cc"+
		"\n.\f.\16.\u01cf\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01db\n/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\7\66\u01ef\n\66\f\66\16\66\u01f2\13\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\38\38\38\58\u01fd\n8\39\39\39\39\39\39\39\59\u0206\n9\3"+
		":\3:\5:\u020a\n:\3;\3;\3;\3;\3;\3;\7;\u0212\n;\f;\16;\u0215\13;\3<\3<"+
		"\5<\u0219\n<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\2\6NP"+
		"XZ@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\b\3\2=>\3\2\'(\3\2)+\4\2,,99\4\2!!\61"+
		"\61\4\2,\6099\2\u023e\2\u0081\3\2\2\2\4\u0086\3\2\2\2\6\u0094\3\2\2\2"+
		"\b\u0096\3\2\2\2\n\u0098\3\2\2\2\f\u009b\3\2\2\2\16\u00a5\3\2\2\2\20\u00c5"+
		"\3\2\2\2\22\u00d2\3\2\2\2\24\u00de\3\2\2\2\26\u00e0\3\2\2\2\30\u00f4\3"+
		"\2\2\2\32\u00f8\3\2\2\2\34\u00fa\3\2\2\2\36\u0100\3\2\2\2 \u010a\3\2\2"+
		"\2\"\u010c\3\2\2\2$\u010e\3\2\2\2&\u0110\3\2\2\2(\u0112\3\2\2\2*\u0114"+
		"\3\2\2\2,\u0118\3\2\2\2.\u011c\3\2\2\2\60\u0125\3\2\2\2\62\u0129\3\2\2"+
		"\2\64\u012b\3\2\2\2\66\u0136\3\2\2\28\u013e\3\2\2\2:\u0142\3\2\2\2<\u0150"+
		"\3\2\2\2>\u015c\3\2\2\2@\u0165\3\2\2\2B\u0169\3\2\2\2D\u016b\3\2\2\2F"+
		"\u0177\3\2\2\2H\u0181\3\2\2\2J\u0188\3\2\2\2L\u018f\3\2\2\2N\u0194\3\2"+
		"\2\2P\u01a0\3\2\2\2R\u01b2\3\2\2\2T\u01b4\3\2\2\2V\u01b6\3\2\2\2X\u01b8"+
		"\3\2\2\2Z\u01c4\3\2\2\2\\\u01da\3\2\2\2^\u01dc\3\2\2\2`\u01de\3\2\2\2"+
		"b\u01e0\3\2\2\2d\u01e2\3\2\2\2f\u01e4\3\2\2\2h\u01e6\3\2\2\2j\u01ea\3"+
		"\2\2\2l\u01f5\3\2\2\2n\u01fc\3\2\2\2p\u0205\3\2\2\2r\u0209\3\2\2\2t\u020b"+
		"\3\2\2\2v\u0218\3\2\2\2x\u021a\3\2\2\2z\u0220\3\2\2\2|\u0226\3\2\2\2~"+
		"\u0080\5\4\3\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\2"+
		"\2\3\u0085\3\3\2\2\2\u0086\u0088\5\6\4\2\u0087\u0089\78\2\2\u0088\u0087"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\5\3\2\2\2\u008a\u0095\5\20\t\2\u008b"+
		"\u0095\5\24\13\2\u008c\u0095\5\22\n\2\u008d\u0095\5\26\f\2\u008e\u0095"+
		"\5\30\r\2\u008f\u0095\5\32\16\2\u0090\u0095\5:\36\2\u0091\u0095\5\b\5"+
		"\2\u0092\u0095\5\n\6\2\u0093\u0095\5\f\7\2\u0094\u008a\3\2\2\2\u0094\u008b"+
		"\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3\2\2\2\u0094"+
		"\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\7\3\2\2\2\u0096\u0097\5\34\17\2\u0097\t"+
		"\3\2\2\2\u0098\u0099\7\n\2\2\u0099\u009a\5\16\b\2\u009a\13\3\2\2\2\u009b"+
		"\u009c\7\13\2\2\u009c\u009d\5\16\b\2\u009d\r\3\2\2\2\u009e\u00a6\5\34"+
		"\17\2\u009f\u00a6\5\32\16\2\u00a0\u00a6\7>\2\2\u00a1\u00a2\7\64\2\2\u00a2"+
		"\u00a3\5\16\b\2\u00a3\u00a4\7\65\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009e\3"+
		"\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6"+
		"\17\3\2\2\2\u00a7\u00c6\7\23\2\2\u00a8\u00c6\7\33\2\2\u00a9\u00c6\7\34"+
		"\2\2\u00aa\u00c6\7\30\2\2\u00ab\u00ad\7\f\2\2\u00ac\u00ae\7@\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00c6\3\2\2\2\u00af\u00b1\7\r"+
		"\2\2\u00b0\u00b2\7@\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00c6\3\2\2\2\u00b3\u00b5\7\24\2\2\u00b4\u00b6\7?\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c6\3\2\2\2\u00b7\u00b9\7\25\2\2\u00b8"+
		"\u00ba\7?\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c6\3\2"+
		"\2\2\u00bb\u00bd\7\16\2\2\u00bc\u00be\7>\2\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c6\3\2\2\2\u00bf\u00c1\7\27\2\2\u00c0\u00c2\7"+
		"?\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\3\2\2\2\u00c3"+
		"\u00c4\7\31\2\2\u00c4\u00c6\7>\2\2\u00c5\u00a7\3\2\2\2\u00c5\u00a8\3\2"+
		"\2\2\u00c5\u00a9\3\2\2\2\u00c5\u00aa\3\2\2\2\u00c5\u00ab\3\2\2\2\u00c5"+
		"\u00af\3\2\2\2\u00c5\u00b3\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5\u00bb\3\2"+
		"\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\21\3\2\2\2\u00c7\u00d3"+
		"\7\6\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00d3\7>\2\2\u00ca\u00cc\7\21\2\2\u00cb"+
		"\u00cd\7>\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d3\3\2"+
		"\2\2\u00ce\u00d0\7\22\2\2\u00cf\u00d1\7>\2\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d2\u00c8\3\2"+
		"\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\23\3\2\2\2\u00d4\u00d6"+
		"\7\3\2\2\u00d5\u00d7\5\36\20\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00df\5 \21\2\u00d9\u00db\7\4\2\2\u00da\u00dc"+
		"\5\36\20\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00df\5 \21\2\u00de\u00d4\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\25"+
		"\3\2\2\2\u00e0\u00e2\7\32\2\2\u00e1\u00e3\5\36\20\2\u00e2\u00e1\3\2\2"+
		"\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5 \21\2\u00e5\27"+
		"\3\2\2\2\u00e6\u00e7\7\b\2\2\u00e7\u00f5\5\16\b\2\u00e8\u00e9\7\b\2\2"+
		"\u00e9\u00ea\5\16\b\2\u00ea\u00eb\79\2\2\u00eb\u00ec\5\16\b\2\u00ec\u00f5"+
		"\3\2\2\2\u00ed\u00ee\7\t\2\2\u00ee\u00f5\5\16\b\2\u00ef\u00f0\7\t\2\2"+
		"\u00f0\u00f1\5\16\b\2\u00f1\u00f2\79\2\2\u00f2\u00f3\5\16\b\2\u00f3\u00f5"+
		"\3\2\2\2\u00f4\u00e6\3\2\2\2\u00f4\u00e8\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4"+
		"\u00ef\3\2\2\2\u00f5\31\3\2\2\2\u00f6\u00f9\5*\26\2\u00f7\u00f9\5h\65"+
		"\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\33\3\2\2\2\u00fa\u00fb"+
		"\7\7\2\2\u00fb\u00fc\5\16\b\2\u00fc\35\3\2\2\2\u00fd\u00fe\5 \21\2\u00fe"+
		"\u00ff\7*\2\2\u00ff\u0101\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\37\3\2\2\2\u0104\u010b"+
		"\7;\2\2\u0105\u010b\7>\2\2\u0106\u0107\7;\2\2\u0107\u010b\5 \21\2\u0108"+
		"\u0109\7>\2\2\u0109\u010b\5 \21\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2"+
		"\2\2\u010a\u0106\3\2\2\2\u010a\u0108\3\2\2\2\u010b!\3\2\2\2\u010c\u010d"+
		"\7>\2\2\u010d#\3\2\2\2\u010e\u010f\t\2\2\2\u010f%\3\2\2\2\u0110\u0111"+
		"\7>\2\2\u0111\'\3\2\2\2\u0112\u0113\7\35\2\2\u0113)\3\2\2\2\u0114\u0115"+
		"\7>\2\2\u0115\u0116\7:\2\2\u0116\u0117\5,\27\2\u0117+\3\2\2\2\u0118\u0119"+
		"\5.\30\2\u0119-\3\2\2\2\u011a\u011d\5\64\33\2\u011b\u011d\5\60\31\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d/\3\2\2\2\u011e\u0126\5\66\34"+
		"\2\u011f\u0126\58\35\2\u0120\u0126\5(\25\2\u0121\u0122\7\64\2\2\u0122"+
		"\u0123\5.\30\2\u0123\u0124\7\65\2\2\u0124\u0126\3\2\2\2\u0125\u011e\3"+
		"\2\2\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0126"+
		"\61\3\2\2\2\u0127\u012a\5.\30\2\u0128\u012a\5&\24\2\u0129\u0127\3\2\2"+
		"\2\u0129\u0128\3\2\2\2\u012a\63\3\2\2\2\u012b\u012c\7 \2\2\u012c\u012d"+
		"\5\66\34\2\u012d\u012e\7!\2\2\u012e\u0133\5\66\34\2\u012f\u0130\7!\2\2"+
		"\u0130\u0132\5\66\34\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\65\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\5\"\22\2\u0137\u0138\7<\2\2\u0138\u0139\5\"\22\2\u0139\u013a\7"+
		"\67\2\2\u013a\u013b\5$\23\2\u013b\u013c\78\2\2\u013c\u013d\5\62\32\2\u013d"+
		"\67\3\2\2\2\u013e\u013f\5&\24\2\u013f\u0140\7;\2\2\u0140\u0141\5.\30\2"+
		"\u01419\3\2\2\2\u0142\u0143\7#\2\2\u0143\u0148\5<\37\2\u0144\u0145\7\66"+
		"\2\2\u0145\u0147\5<\37\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014c\7$\2\2\u014c\u014d\7>\2\2\u014d\u014e\7:\2\2\u014e\u014f"+
		"\5J&\2\u014f;\3\2\2\2\u0150\u0154\7>\2\2\u0151\u0153\5> \2\u0152\u0151"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7:\2\2\u0158\u0159\5@!"+
		"\2\u0159=\3\2\2\2\u015a\u015d\5V,\2\u015b\u015d\5T+\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015b\3\2\2\2\u015d?\3\2\2\2\u015e\u0166\5D#\2\u015f\u0166"+
		"\5F$\2\u0160\u0166\7\35\2\2\u0161\u0162\7\64\2\2\u0162\u0163\5@!\2\u0163"+
		"\u0164\7\65\2\2\u0164\u0166\3\2\2\2\u0165\u015e\3\2\2\2\u0165\u015f\3"+
		"\2\2\2\u0165\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0166A\3\2\2\2\u0167\u016a"+
		"\5@!\2\u0168\u016a\5H%\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		"C\3\2\2\2\u016b\u016c\7 \2\2\u016c\u016d\5F$\2\u016d\u016e\7!\2\2\u016e"+
		"\u0173\5F$\2\u016f\u0170\7!\2\2\u0170\u0172\5F$\2\u0171\u016f\3\2\2\2"+
		"\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174E\3"+
		"\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\5L\'\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\5\"\22\2\u017a\u017b\7"+
		"<\2\2\u017b\u017c\5\"\22\2\u017c\u017d\7\67\2\2\u017d\u017e\5$\23\2\u017e"+
		"\u017f\78\2\2\u017f\u0180\5B\"\2\u0180G\3\2\2\2\u0181\u0185\7>\2\2\u0182"+
		"\u0184\5N(\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2"+
		"\2\u0185\u0186\3\2\2\2\u0186I\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018c"+
		"\7>\2\2\u0189\u018b\5T+\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018dK\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\u018f\u0190\7\"\2\2\u0190\u0191\7\64\2\2\u0191\u0192\5X-\2\u0192\u0193"+
		"\7\65\2\2\u0193M\3\2\2\2\u0194\u0195\b(\1\2\u0195\u0196\5P)\2\u0196\u019d"+
		"\3\2\2\2\u0197\u0198\f\4\2\2\u0198\u0199\5^\60\2\u0199\u019a\5P)\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0197\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019eO\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1"+
		"\b)\1\2\u01a1\u01a2\5R*\2\u01a2\u01a9\3\2\2\2\u01a3\u01a4\f\4\2\2\u01a4"+
		"\u01a5\5`\61\2\u01a5\u01a6\5R*\2\u01a6\u01a8\3\2\2\2\u01a7\u01a3\3\2\2"+
		"\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aaQ"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\64\2\2\u01ad\u01ae\5N(\2\u01ae"+
		"\u01af\7\65\2\2\u01af\u01b3\3\2\2\2\u01b0\u01b3\5T+\2\u01b1\u01b3\5V,"+
		"\2\u01b2\u01ac\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3S"+
		"\3\2\2\2\u01b4\u01b5\7?\2\2\u01b5U\3\2\2\2\u01b6\u01b7\7>\2\2\u01b7W\3"+
		"\2\2\2\u01b8\u01b9\b-\1\2\u01b9\u01ba\5Z.\2\u01ba\u01c1\3\2\2\2\u01bb"+
		"\u01bc\f\4\2\2\u01bc\u01bd\5b\62\2\u01bd\u01be\5Z.\2\u01be\u01c0\3\2\2"+
		"\2\u01bf\u01bb\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2Y\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\b.\1\2\u01c5\u01c6"+
		"\5\\/\2\u01c6\u01cd\3\2\2\2\u01c7\u01c8\f\4\2\2\u01c8\u01c9\5d\63\2\u01c9"+
		"\u01ca\5\\/\2\u01ca\u01cc\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cc\u01cf\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce[\3\2\2\2\u01cf\u01cd"+
		"\3\2\2\2\u01d0\u01d1\5N(\2\u01d1\u01d2\5f\64\2\u01d2\u01d3\5N(\2\u01d3"+
		"\u01db\3\2\2\2\u01d4\u01d5\7\64\2\2\u01d5\u01d6\5X-\2\u01d6\u01d7\7\65"+
		"\2\2\u01d7\u01db\3\2\2\2\u01d8\u01db\7%\2\2\u01d9\u01db\7&\2\2\u01da\u01d0"+
		"\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"]\3\2\2\2\u01dc\u01dd\t\3\2\2\u01dd_\3\2\2\2\u01de\u01df\t\4\2\2\u01df"+
		"a\3\2\2\2\u01e0\u01e1\t\5\2\2\u01e1c\3\2\2\2\u01e2\u01e3\t\6\2\2\u01e3"+
		"e\3\2\2\2\u01e4\u01e5\t\7\2\2\u01e5g\3\2\2\2\u01e6\u01e7\7>\2\2\u01e7"+
		"\u01e8\7:\2\2\u01e8\u01e9\5j\66\2\u01e9i\3\2\2\2\u01ea\u01eb\7\62\2\2"+
		"\u01eb\u01f0\5l\67\2\u01ec\u01ed\7\66\2\2\u01ed\u01ef\5l\67\2\u01ee\u01ec"+
		"\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7\63\2\2\u01f4k\3\2\2\2"+
		"\u01f5\u01f6\5\"\22\2\u01f6\u01f7\7\67\2\2\u01f7\u01f8\5n8\2\u01f8m\3"+
		"\2\2\2\u01f9\u01fd\3\2\2\2\u01fa\u01fd\5t;\2\u01fb\u01fd\5p9\2\u01fc\u01f9"+
		"\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fdo\3\2\2\2\u01fe"+
		"\u0206\5v<\2\u01ff\u0206\5|?\2\u0200\u0206\5(\25\2\u0201\u0202\7\64\2"+
		"\2\u0202\u0203\5n8\2\u0203\u0204\7\65\2\2\u0204\u0206\3\2\2\2\u0205\u01fe"+
		"\3\2\2\2\u0205\u01ff\3\2\2\2\u0205\u0200\3\2\2\2\u0205\u0201\3\2\2\2\u0206"+
		"q\3\2\2\2\u0207\u020a\5n8\2\u0208\u020a\5&\24\2\u0209\u0207\3\2\2\2\u0209"+
		"\u0208\3\2\2\2\u020as\3\2\2\2\u020b\u020c\7 \2\2\u020c\u020d\5v<\2\u020d"+
		"\u020e\7!\2\2\u020e\u0213\5v<\2\u020f\u0210\7!\2\2\u0210\u0212\5v<\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214u\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0219\5x=\2\u0217\u0219"+
		"\5z>\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219w\3\2\2\2\u021a\u021b"+
		"\5\"\22\2\u021b\u021c\7\36\2\2\u021c\u021d\5$\23\2\u021d\u021e\78\2\2"+
		"\u021e\u021f\5r:\2\u021fy\3\2\2\2\u0220\u0221\5\"\22\2\u0221\u0222\7\37"+
		"\2\2\u0222\u0223\5$\23\2\u0223\u0224\78\2\2\u0224\u0225\5r:\2\u0225{\3"+
		"\2\2\2\u0226\u0227\5&\24\2\u0227\u0228\7;\2\2\u0228\u0229\5n8\2\u0229"+
		"}\3\2\2\2\61\u0081\u0088\u0094\u00a5\u00ad\u00b1\u00b5\u00b9\u00bd\u00c1"+
		"\u00c5\u00cc\u00d0\u00d2\u00d6\u00db\u00de\u00e2\u00f4\u00f8\u0102\u010a"+
		"\u011c\u0125\u0129\u0133\u0148\u0154\u015c\u0165\u0169\u0173\u0177\u0185"+
		"\u018c\u019d\u01a9\u01b2\u01c1\u01cd\u01da\u01f0\u01fc\u0205\u0209\u0213"+
		"\u0218";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}