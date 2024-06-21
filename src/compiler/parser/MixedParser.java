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
		LOAD=1, FILE=2, MODULE=3, MODULES=4, PROJECT=5, ENCODE=6, CHECK=7, VERIFY=8, 
		SEMANTICS=9, GRAPH=10, USAGE=11, HELP=12, VERBOSE=13, TEMP=14, TMP=15, 
		LIST=16, LS=17, CLEAR=18, HISTORY=19, HS=20, ENV=21, EXEC=22, LAST=23, 
		RM=24, EXTRACT=25, STORE=26, QUIT=27, EXIT=28, END=29, SEND=30, RECEIVE=31, 
		CHOICE=32, OR=33, IF=34, LET=35, IN=36, TRUE=37, FALSE=38, PLUS=39, MINUS=40, 
		MUL=41, DIV=42, MOD=43, NEQ=44, LT=45, LEQ=46, GT=47, GEQ=48, AND=49, 
		LBRA=50, RBRA=51, LPAR=52, RPAR=53, COMMA=54, COLON=55, SEMICOLON=56, 
		EQEQ=57, EQUAL=58, DOT=59, TO=60, LABEL=61, ID=62, INT=63, ARG=64, WHITESPACE=65, 
		COMMENT=66;
	public static final int
		RULE_module = 0, RULE_command = 1, RULE_statement = 2, RULE_projectstatement = 3, 
		RULE_encodestatement = 4, RULE_semantics = 5, RULE_graph = 6, RULE_expression = 7, 
		RULE_terminal = 8, RULE_printmodule = 9, RULE_load = 10, RULE_extract = 11, 
		RULE_typecheck = 12, RULE_store = 13, RULE_protocoldecl = 14, RULE_project = 15, 
		RULE_encode = 16, RULE_dir = 17, RULE_filename = 18, RULE_role = 19, RULE_ground = 20, 
		RULE_rvariable = 21, RULE_end = 22, RULE_globalprotocol = 23, RULE_globaltypedecl = 24, 
		RULE_globaltype = 25, RULE_guardedglobaltype = 26, RULE_globalcontinuation = 27, 
		RULE_globalsum = 28, RULE_pass = 29, RULE_grec = 30, RULE_parametrised = 31, 
		RULE_abstraction = 32, RULE_parameter = 33, RULE_parametrisedtype = 34, 
		RULE_pcontinuation = 35, RULE_pglobalsum = 36, RULE_parametrisedpass = 37, 
		RULE_application = 38, RULE_iapplication = 39, RULE_conditional = 40, 
		RULE_sumexpr = 41, RULE_mulexpr = 42, RULE_expr = 43, RULE_value = 44, 
		RULE_variable = 45, RULE_relexpr = 46, RULE_logexpr = 47, RULE_bexpr = 48, 
		RULE_sumop = 49, RULE_mulop = 50, RULE_relop = 51, RULE_logop = 52, RULE_compareop = 53, 
		RULE_localcontextdecl = 54, RULE_localcontext = 55, RULE_roledecl = 56, 
		RULE_localtype = 57, RULE_guardedlocaltype = 58, RULE_localcontinuation = 59, 
		RULE_localsum = 60, RULE_localaction = 61, RULE_send = 62, RULE_receive = 63, 
		RULE_recurse = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "command", "statement", "projectstatement", "encodestatement", 
			"semantics", "graph", "expression", "terminal", "printmodule", "load", 
			"extract", "typecheck", "store", "protocoldecl", "project", "encode", 
			"dir", "filename", "role", "ground", "rvariable", "end", "globalprotocol", 
			"globaltypedecl", "globaltype", "guardedglobaltype", "globalcontinuation", 
			"globalsum", "pass", "grec", "parametrised", "abstraction", "parameter", 
			"parametrisedtype", "pcontinuation", "pglobalsum", "parametrisedpass", 
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
			null, "'load'", "'file'", "'module'", "'modules'", "'project'", "'translate'", 
			"'check'", "'verify'", "'fsm'", "'graph'", "'usage'", "'help'", "'verbose'", 
			"'temp'", "'tmp'", "'list'", "'ls'", "'clear'", "'history'", "'hs'", 
			"'env'", "'exec'", "'last'", "'rm'", "'extract'", "'store'", "'quit'", 
			"'exit'", "'end'", "'!'", "'?'", "'choice'", "'or'", "'if'", "'let'", 
			"'in'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "'and'", "'{'", "'}'", "'('", "')'", "','", 
			"':'", "';'", "'=='", "'='", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOAD", "FILE", "MODULE", "MODULES", "PROJECT", "ENCODE", "CHECK", 
			"VERIFY", "SEMANTICS", "GRAPH", "USAGE", "HELP", "VERBOSE", "TEMP", "TMP", 
			"LIST", "LS", "CLEAR", "HISTORY", "HS", "ENV", "EXEC", "LAST", "RM", 
			"EXTRACT", "STORE", "QUIT", "EXIT", "END", "SEND", "RECEIVE", "CHOICE", 
			"OR", "IF", "LET", "IN", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "NEQ", "LT", "LEQ", "GT", "GEQ", "AND", "LBRA", "RBRA", "LPAR", 
			"RPAR", "COMMA", "COLON", "SEMICOLON", "EQEQ", "EQUAL", "DOT", "TO", 
			"LABEL", "ID", "INT", "ARG", "WHITESPACE", "COMMENT"
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
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOAD) | (1L << FILE) | (1L << MODULE) | (1L << MODULES) | (1L << PROJECT) | (1L << ENCODE) | (1L << CHECK) | (1L << VERIFY) | (1L << SEMANTICS) | (1L << GRAPH) | (1L << USAGE) | (1L << HELP) | (1L << VERBOSE) | (1L << LIST) | (1L << LS) | (1L << CLEAR) | (1L << HISTORY) | (1L << HS) | (1L << EXEC) | (1L << LAST) | (1L << RM) | (1L << EXTRACT) | (1L << STORE) | (1L << QUIT) | (1L << EXIT) | (1L << LET) | (1L << ID))) != 0)) {
				{
				{
				setState(130);
				command();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			statement();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(139);
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
		public StoreContext store() {
			return getRuleContext(StoreContext.class,0);
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
		public EncodestatementContext encodestatement() {
			return getRuleContext(EncodestatementContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(154);
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
				setState(142);
				terminal();
				}
				break;
			case LOAD:
			case FILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				load();
				}
				break;
			case MODULE:
			case MODULES:
			case LIST:
			case LS:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				printmodule();
				}
				break;
			case EXTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				extract();
				}
				break;
			case CHECK:
			case VERIFY:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				typecheck();
				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				store();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				protocoldecl();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 8);
				{
				setState(149);
				parametrised();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 9);
				{
				setState(150);
				projectstatement();
				}
				break;
			case SEMANTICS:
				enterOuterAlt(_localctx, 10);
				{
				setState(151);
				semantics();
				}
				break;
			case ENCODE:
				enterOuterAlt(_localctx, 11);
				{
				setState(152);
				encodestatement();
				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 12);
				{
				setState(153);
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
	}

	public final ProjectstatementContext projectstatement() throws RecognitionException {
		ProjectstatementContext _localctx = new ProjectstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_projectstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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

	public static class EncodestatementContext extends ParserRuleContext {
		public EncodeContext encode() {
			return getRuleContext(EncodeContext.class,0);
		}
		public EncodestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodestatement; }
	}

	public final EncodestatementContext encodestatement() throws RecognitionException {
		EncodestatementContext _localctx = new EncodestatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_encodestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			encode();
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
	}

	public final SemanticsContext semantics() throws RecognitionException {
		SemanticsContext _localctx = new SemanticsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_semantics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(SEMANTICS);
			setState(161);
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
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(GRAPH);
			setState(164);
			expression();
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(165);
				dir();
				}
				break;
			}
			setState(168);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ProjectContext project() {
			return getRuleContext(ProjectContext.class,0);
		}
		public ProtocoldeclContext protocoldecl() {
			return getRuleContext(ProtocoldeclContext.class,0);
		}
		public EncodeContext encode() {
			return getRuleContext(EncodeContext.class,0);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				project();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				protocoldecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				encode();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(LPAR);
				setState(175);
				expression();
				setState(176);
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
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_terminal);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(CLEAR);
				}
				break;
			case QUIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(QUIT);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(EXIT);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(LAST);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(USAGE);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARG) {
					{
					setState(185);
					match(ARG);
					}
				}

				}
				break;
			case HELP:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(HELP);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARG) {
					{
					setState(189);
					match(ARG);
					}
				}

				}
				break;
			case HISTORY:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				match(HISTORY);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(193);
					match(INT);
					}
				}

				}
				break;
			case HS:
				enterOuterAlt(_localctx, 8);
				{
				setState(196);
				match(HS);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(197);
					match(INT);
					}
				}

				}
				break;
			case VERBOSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				match(VERBOSE);
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(201);
					match(ID);
					}
					break;
				}
				}
				break;
			case EXEC:
				enterOuterAlt(_localctx, 10);
				{
				setState(204);
				match(EXEC);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(205);
					match(INT);
					}
				}

				}
				break;
			case RM:
				enterOuterAlt(_localctx, 11);
				{
				setState(208);
				match(RM);
				setState(209);
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
	}

	public final PrintmoduleContext printmodule() throws RecognitionException {
		PrintmoduleContext _localctx = new PrintmoduleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printmodule);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULES:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(MODULES);
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(MODULE);
				setState(214);
				match(ID);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(LIST);
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(216);
					match(ID);
					}
					break;
				}
				}
				break;
			case LS:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(LS);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(220);
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
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_load);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOAD:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(LOAD);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(226);
					dir();
					}
					break;
				}
				setState(229);
				filename();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(FILE);
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(231);
					dir();
					}
					break;
				}
				setState(234);
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
		public TerminalNode ID() { return getToken(MixedParser.ID, 0); }
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
	}

	public final ExtractContext extract() throws RecognitionException {
		ExtractContext _localctx = new ExtractContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_extract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(EXTRACT);
			setState(238);
			match(ID);
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(239);
				dir();
				}
				break;
			}
			setState(242);
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
	}

	public final TypecheckContext typecheck() throws RecognitionException {
		TypecheckContext _localctx = new TypecheckContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typecheck);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(CHECK);
				setState(245);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(CHECK);
				setState(247);
				expression();
				setState(248);
				match(EQEQ);
				setState(249);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(VERIFY);
				setState(252);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(VERIFY);
				setState(254);
				expression();
				setState(255);
				match(EQEQ);
				setState(256);
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

	public static class StoreContext extends ParserRuleContext {
		public TerminalNode STORE() { return getToken(MixedParser.STORE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store; }
	}

	public final StoreContext store() throws RecognitionException {
		StoreContext _localctx = new StoreContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(STORE);
			setState(261);
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
	}

	public final ProtocoldeclContext protocoldecl() throws RecognitionException {
		ProtocoldeclContext _localctx = new ProtocoldeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_protocoldecl);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				globalprotocol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
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
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_project);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(PROJECT);
			setState(268);
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

	public static class EncodeContext extends ParserRuleContext {
		public TerminalNode ENCODE() { return getToken(MixedParser.ENCODE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EncodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encode; }
	}

	public final EncodeContext encode() throws RecognitionException {
		EncodeContext _localctx = new EncodeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_encode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ENCODE);
			setState(271);
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
	}

	public final DirContext dir() throws RecognitionException {
		DirContext _localctx = new DirContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dir);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(273);
					filename();
					setState(274);
					match(DIV);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(278); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_filename);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(DOT);
				setState(283);
				filename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(ID);
				setState(285);
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
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
	}

	public final GroundContext ground() throws RecognitionException {
		GroundContext _localctx = new GroundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ground);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
	}

	public final RvariableContext rvariable() throws RecognitionException {
		RvariableContext _localctx = new RvariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rvariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
	}

	public final GlobalprotocolContext globalprotocol() throws RecognitionException {
		GlobalprotocolContext _localctx = new GlobalprotocolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_globalprotocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
			setState(297);
			match(EQUAL);
			setState(298);
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
	}

	public final GlobaltypedeclContext globaltypedecl() throws RecognitionException {
		GlobaltypedeclContext _localctx = new GlobaltypedeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_globaltypedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
	}

	public final GlobaltypeContext globaltype() throws RecognitionException {
		GlobaltypeContext _localctx = new GlobaltypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_globaltype);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHOICE:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				globalsum();
				}
				break;
			case END:
			case LPAR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
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
	}

	public final GuardedglobaltypeContext guardedglobaltype() throws RecognitionException {
		GuardedglobaltypeContext _localctx = new GuardedglobaltypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_guardedglobaltype);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				pass();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				grec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(LPAR);
				setState(310);
				globaltype();
				setState(311);
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
	}

	public final GlobalcontinuationContext globalcontinuation() throws RecognitionException {
		GlobalcontinuationContext _localctx = new GlobalcontinuationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_globalcontinuation);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				globaltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
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
	}

	public final GlobalsumContext globalsum() throws RecognitionException {
		GlobalsumContext _localctx = new GlobalsumContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_globalsum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(CHOICE);
			setState(320);
			pass();
			setState(321);
			match(OR);
			setState(322);
			pass();
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(323);
					match(OR);
					setState(324);
					pass();
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	}

	public final PassContext pass() throws RecognitionException {
		PassContext _localctx = new PassContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			role();
			setState(331);
			match(TO);
			setState(332);
			role();
			setState(333);
			match(COLON);
			setState(334);
			ground();
			setState(335);
			match(SEMICOLON);
			setState(336);
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
	}

	public final GrecContext grec() throws RecognitionException {
		GrecContext _localctx = new GrecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_grec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			rvariable();
			setState(339);
			match(DOT);
			setState(340);
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
	}

	public final ParametrisedContext parametrised() throws RecognitionException {
		ParametrisedContext _localctx = new ParametrisedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parametrised);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(LET);
			setState(343);
			abstraction();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(344);
				match(COMMA);
				setState(345);
				abstraction();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(IN);
			setState(352);
			match(ID);
			setState(353);
			match(EQUAL);
			setState(354);
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
	}

	public final AbstractionContext abstraction() throws RecognitionException {
		AbstractionContext _localctx = new AbstractionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_abstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ID);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==INT) {
				{
				{
				setState(357);
				parameter();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(EQUAL);
			setState(364);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameter);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				variable();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
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
	}

	public final ParametrisedtypeContext parametrisedtype() throws RecognitionException {
		ParametrisedtypeContext _localctx = new ParametrisedtypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parametrisedtype);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHOICE:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				pglobalsum();
				}
				break;
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				parametrisedpass();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				match(END);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(LPAR);
				setState(374);
				parametrisedtype();
				setState(375);
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
	}

	public final PcontinuationContext pcontinuation() throws RecognitionException {
		PcontinuationContext _localctx = new PcontinuationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pcontinuation);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				parametrisedtype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
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
	}

	public final PglobalsumContext pglobalsum() throws RecognitionException {
		PglobalsumContext _localctx = new PglobalsumContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pglobalsum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(CHOICE);
			setState(384);
			parametrisedpass();
			setState(385);
			match(OR);
			setState(386);
			parametrisedpass();
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					match(OR);
					setState(388);
					parametrisedpass();
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	}

	public final ParametrisedpassContext parametrisedpass() throws RecognitionException {
		ParametrisedpassContext _localctx = new ParametrisedpassContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parametrisedpass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(394);
				conditional();
				}
			}

			setState(397);
			role();
			setState(398);
			match(TO);
			setState(399);
			role();
			setState(400);
			match(COLON);
			setState(401);
			ground();
			setState(402);
			match(SEMICOLON);
			setState(403);
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
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_application);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(ID);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(406);
				sumexpr(0);
				}
				}
				setState(411);
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
	}

	public final IapplicationContext iapplication() throws RecognitionException {
		IapplicationContext _localctx = new IapplicationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_iapplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(ID);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(413);
				value();
				}
				}
				setState(418);
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
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(IF);
			setState(420);
			match(LPAR);
			setState(421);
			relexpr(0);
			setState(422);
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
	}

	public final SumexprContext sumexpr() throws RecognitionException {
		return sumexpr(0);
	}

	private SumexprContext sumexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumexprContext _localctx = new SumexprContext(_ctx, _parentState);
		SumexprContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_sumexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(425);
			mulexpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumexpr);
					setState(427);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(428);
					sumop();
					setState(429);
					mulexpr(0);
					}
					} 
				}
				setState(435);
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
	}

	public final MulexprContext mulexpr() throws RecognitionException {
		return mulexpr(0);
	}

	private MulexprContext mulexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulexprContext _localctx = new MulexprContext(_ctx, _parentState);
		MulexprContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_mulexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(437);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulexpr);
					setState(439);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(440);
					mulop();
					setState(441);
					expr();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expr);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(LPAR);
				setState(449);
				sumexpr(0);
				setState(450);
				match(RPAR);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
	}

	public final RelexprContext relexpr() throws RecognitionException {
		return relexpr(0);
	}

	private RelexprContext relexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelexprContext _localctx = new RelexprContext(_ctx, _parentState);
		RelexprContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_relexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(461);
			logexpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relexpr);
					setState(463);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(464);
					relop();
					setState(465);
					logexpr(0);
					}
					} 
				}
				setState(471);
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
	}

	public final LogexprContext logexpr() throws RecognitionException {
		return logexpr(0);
	}

	private LogexprContext logexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogexprContext _localctx = new LogexprContext(_ctx, _parentState);
		LogexprContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_logexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(473);
			bexpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logexpr);
					setState(475);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(476);
					logop();
					setState(477);
					bexpr();
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bexpr);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				sumexpr(0);
				setState(485);
				compareop();
				setState(486);
				sumexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(LPAR);
				setState(489);
				relexpr(0);
				setState(490);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
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
	}

	public final SumopContext sumop() throws RecognitionException {
		SumopContext _localctx = new SumopContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sumop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
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
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
	}

	public final LogopContext logop() throws RecognitionException {
		LogopContext _localctx = new LogopContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_logop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
	}

	public final CompareopContext compareop() throws RecognitionException {
		CompareopContext _localctx = new CompareopContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_compareop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
	}

	public final LocalcontextdeclContext localcontextdecl() throws RecognitionException {
		LocalcontextdeclContext _localctx = new LocalcontextdeclContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_localcontextdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(ID);
			setState(507);
			match(EQUAL);
			setState(508);
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
	}

	public final LocalcontextContext localcontext() throws RecognitionException {
		LocalcontextContext _localctx = new LocalcontextContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_localcontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(LBRA);
			setState(511);
			roledecl();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(512);
				match(COMMA);
				setState(513);
				roledecl();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
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
	}

	public final RoledeclContext roledecl() throws RecognitionException {
		RoledeclContext _localctx = new RoledeclContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_roledecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			role();
			setState(522);
			match(COLON);
			setState(523);
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
	}

	public final LocaltypeContext localtype() throws RecognitionException {
		LocaltypeContext _localctx = new LocaltypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_localtype);
		try {
			setState(528);
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
				setState(526);
				localsum();
				}
				break;
			case END:
			case LPAR:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
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
	}

	public final GuardedlocaltypeContext guardedlocaltype() throws RecognitionException {
		GuardedlocaltypeContext _localctx = new GuardedlocaltypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_guardedlocaltype);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				localaction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				recurse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				match(LPAR);
				setState(534);
				localtype();
				setState(535);
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
	}

	public final LocalcontinuationContext localcontinuation() throws RecognitionException {
		LocalcontinuationContext _localctx = new LocalcontinuationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_localcontinuation);
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				localtype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
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
	}

	public final LocalsumContext localsum() throws RecognitionException {
		LocalsumContext _localctx = new LocalsumContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_localsum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(CHOICE);
			setState(544);
			localaction();
			setState(545);
			match(OR);
			setState(546);
			localaction();
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(547);
					match(OR);
					setState(548);
					localaction();
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
	}

	public final LocalactionContext localaction() throws RecognitionException {
		LocalactionContext _localctx = new LocalactionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_localaction);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				send();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
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
	}

	public final SendContext send() throws RecognitionException {
		SendContext _localctx = new SendContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_send);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			role();
			setState(559);
			match(SEND);
			setState(560);
			ground();
			setState(561);
			match(SEMICOLON);
			setState(562);
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
	}

	public final ReceiveContext receive() throws RecognitionException {
		ReceiveContext _localctx = new ReceiveContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_receive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			role();
			setState(565);
			match(RECEIVE);
			setState(566);
			ground();
			setState(567);
			match(SEMICOLON);
			setState(568);
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
	}

	public final RecurseContext recurse() throws RecognitionException {
		RecurseContext _localctx = new RecurseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_recurse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			rvariable();
			setState(571);
			match(DOT);
			setState(572);
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
		case 41:
			return sumexpr_sempred((SumexprContext)_localctx, predIndex);
		case 42:
			return mulexpr_sempred((MulexprContext)_localctx, predIndex);
		case 46:
			return relexpr_sempred((RelexprContext)_localctx, predIndex);
		case 47:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0241\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\7\2\u0086\n\2\f\2\16\2\u0089\13\2\3"+
		"\2\3\2\3\3\3\3\5\3\u008f\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u009d\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00a9"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00bd\n\n\3\n\3\n\5\n\u00c1\n\n\3\n\3\n\5\n\u00c5\n\n"+
		"\3\n\3\n\5\n\u00c9\n\n\3\n\3\n\5\n\u00cd\n\n\3\n\3\n\5\n\u00d1\n\n\3\n"+
		"\3\n\5\n\u00d5\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00dc\n\13\3\13\3\13"+
		"\5\13\u00e0\n\13\5\13\u00e2\n\13\3\f\3\f\5\f\u00e6\n\f\3\f\3\f\3\f\5\f"+
		"\u00eb\n\f\3\f\5\f\u00ee\n\f\3\r\3\r\3\r\5\r\u00f3\n\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0105"+
		"\n\16\3\17\3\17\3\17\3\20\3\20\5\20\u010c\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\6\23\u0117\n\23\r\23\16\23\u0118\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0121\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\5\33\u0133\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u013c\n\34\3\35\3\35\5\35\u0140\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\7\36\u0148\n\36\f\36\16\36\u014b\13\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\7!\u015d\n!"+
		"\f!\16!\u0160\13!\3!\3!\3!\3!\3!\3\"\3\"\7\"\u0169\n\"\f\"\16\"\u016c"+
		"\13\"\3\"\3\"\3\"\3#\3#\5#\u0173\n#\3$\3$\3$\3$\3$\3$\3$\5$\u017c\n$\3"+
		"%\3%\5%\u0180\n%\3&\3&\3&\3&\3&\3&\7&\u0188\n&\f&\16&\u018b\13&\3\'\5"+
		"\'\u018e\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\7(\u019a\n(\f(\16("+
		"\u019d\13(\3)\3)\7)\u01a1\n)\f)\16)\u01a4\13)\3*\3*\3*\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\3+\7+\u01b2\n+\f+\16+\u01b5\13+\3,\3,\3,\3,\3,\3,\3,\7,\u01be"+
		"\n,\f,\16,\u01c1\13,\3-\3-\3-\3-\3-\3-\5-\u01c9\n-\3.\3.\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\7\60\u01d6\n\60\f\60\16\60\u01d9\13\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u01e2\n\61\f\61\16\61\u01e5\13"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01f1\n\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\39\39\3"+
		"9\39\79\u0205\n9\f9\169\u0208\139\39\39\3:\3:\3:\3:\3;\3;\3;\5;\u0213"+
		"\n;\3<\3<\3<\3<\3<\3<\3<\5<\u021c\n<\3=\3=\5=\u0220\n=\3>\3>\3>\3>\3>"+
		"\3>\7>\u0228\n>\f>\16>\u022b\13>\3?\3?\5?\u022f\n?\3@\3@\3@\3@\3@\3@\3"+
		"A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\2\6TV^`C\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\2\b\3\2?@\3\2)*\3\2+-\4\2..;;\4\2##\63\63\4\2.\62;;\2\u0255\2\u0087"+
		"\3\2\2\2\4\u008c\3\2\2\2\6\u009c\3\2\2\2\b\u009e\3\2\2\2\n\u00a0\3\2\2"+
		"\2\f\u00a2\3\2\2\2\16\u00a5\3\2\2\2\20\u00b4\3\2\2\2\22\u00d4\3\2\2\2"+
		"\24\u00e1\3\2\2\2\26\u00ed\3\2\2\2\30\u00ef\3\2\2\2\32\u0104\3\2\2\2\34"+
		"\u0106\3\2\2\2\36\u010b\3\2\2\2 \u010d\3\2\2\2\"\u0110\3\2\2\2$\u0116"+
		"\3\2\2\2&\u0120\3\2\2\2(\u0122\3\2\2\2*\u0124\3\2\2\2,\u0126\3\2\2\2."+
		"\u0128\3\2\2\2\60\u012a\3\2\2\2\62\u012e\3\2\2\2\64\u0132\3\2\2\2\66\u013b"+
		"\3\2\2\28\u013f\3\2\2\2:\u0141\3\2\2\2<\u014c\3\2\2\2>\u0154\3\2\2\2@"+
		"\u0158\3\2\2\2B\u0166\3\2\2\2D\u0172\3\2\2\2F\u017b\3\2\2\2H\u017f\3\2"+
		"\2\2J\u0181\3\2\2\2L\u018d\3\2\2\2N\u0197\3\2\2\2P\u019e\3\2\2\2R\u01a5"+
		"\3\2\2\2T\u01aa\3\2\2\2V\u01b6\3\2\2\2X\u01c8\3\2\2\2Z\u01ca\3\2\2\2\\"+
		"\u01cc\3\2\2\2^\u01ce\3\2\2\2`\u01da\3\2\2\2b\u01f0\3\2\2\2d\u01f2\3\2"+
		"\2\2f\u01f4\3\2\2\2h\u01f6\3\2\2\2j\u01f8\3\2\2\2l\u01fa\3\2\2\2n\u01fc"+
		"\3\2\2\2p\u0200\3\2\2\2r\u020b\3\2\2\2t\u0212\3\2\2\2v\u021b\3\2\2\2x"+
		"\u021f\3\2\2\2z\u0221\3\2\2\2|\u022e\3\2\2\2~\u0230\3\2\2\2\u0080\u0236"+
		"\3\2\2\2\u0082\u023c\3\2\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\2\2\3\u008b\3\3\2\2\2\u008c\u008e"+
		"\5\6\4\2\u008d\u008f\7:\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\5\3\2\2\2\u0090\u009d\5\22\n\2\u0091\u009d\5\26\f\2\u0092\u009d\5\24"+
		"\13\2\u0093\u009d\5\30\r\2\u0094\u009d\5\32\16\2\u0095\u009d\5\34\17\2"+
		"\u0096\u009d\5\36\20\2\u0097\u009d\5@!\2\u0098\u009d\5\b\5\2\u0099\u009d"+
		"\5\f\7\2\u009a\u009d\5\n\6\2\u009b\u009d\5\16\b\2\u009c\u0090\3\2\2\2"+
		"\u009c\u0091\3\2\2\2\u009c\u0092\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0094"+
		"\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c"+
		"\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2"+
		"\2\2\u009d\7\3\2\2\2\u009e\u009f\5 \21\2\u009f\t\3\2\2\2\u00a0\u00a1\5"+
		"\"\22\2\u00a1\13\3\2\2\2\u00a2\u00a3\7\13\2\2\u00a3\u00a4\5\20\t\2\u00a4"+
		"\r\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a8\5\20\t\2\u00a7\u00a9\5$\23"+
		"\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab"+
		"\5&\24\2\u00ab\17\3\2\2\2\u00ac\u00b5\5 \21\2\u00ad\u00b5\5\36\20\2\u00ae"+
		"\u00b5\5\"\22\2\u00af\u00b5\7@\2\2\u00b0\u00b1\7\66\2\2\u00b1\u00b2\5"+
		"\20\t\2\u00b2\u00b3\7\67\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4"+
		"\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2"+
		"\2\2\u00b5\21\3\2\2\2\u00b6\u00d5\7\24\2\2\u00b7\u00d5\7\35\2\2\u00b8"+
		"\u00d5\7\36\2\2\u00b9\u00d5\7\31\2\2\u00ba\u00bc\7\r\2\2\u00bb\u00bd\7"+
		"B\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00d5\3\2\2\2\u00be"+
		"\u00c0\7\16\2\2\u00bf\u00c1\7B\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00d5\3\2\2\2\u00c2\u00c4\7\25\2\2\u00c3\u00c5\7A\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d5\3\2\2\2\u00c6\u00c8\7\26"+
		"\2\2\u00c7\u00c9\7A\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00d5\3\2\2\2\u00ca\u00cc\7\17\2\2\u00cb\u00cd\7@\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d5\3\2\2\2\u00ce\u00d0\7\30\2\2\u00cf"+
		"\u00d1\7A\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\3\2"+
		"\2\2\u00d2\u00d3\7\32\2\2\u00d3\u00d5\7@\2\2\u00d4\u00b6\3\2\2\2\u00d4"+
		"\u00b7\3\2\2\2\u00d4\u00b8\3\2\2\2\u00d4\u00b9\3\2\2\2\u00d4\u00ba\3\2"+
		"\2\2\u00d4\u00be\3\2\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4"+
		"\u00ca\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\23\3\2\2"+
		"\2\u00d6\u00e2\7\6\2\2\u00d7\u00d8\7\5\2\2\u00d8\u00e2\7@\2\2\u00d9\u00db"+
		"\7\22\2\2\u00da\u00dc\7@\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00e2\3\2\2\2\u00dd\u00df\7\23\2\2\u00de\u00e0\7@\2\2\u00df\u00de\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1"+
		"\u00d7\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\25\3\2\2"+
		"\2\u00e3\u00e5\7\3\2\2\u00e4\u00e6\5$\23\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ee\5&\24\2\u00e8\u00ea\7\4\2\2\u00e9"+
		"\u00eb\5$\23\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ee\5&\24\2\u00ed\u00e3\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee"+
		"\27\3\2\2\2\u00ef\u00f0\7\33\2\2\u00f0\u00f2\7@\2\2\u00f1\u00f3\5$\23"+
		"\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\5&\24\2\u00f5\31\3\2\2\2\u00f6\u00f7\7\t\2\2\u00f7\u0105\5\20\t\2\u00f8"+
		"\u00f9\7\t\2\2\u00f9\u00fa\5\20\t\2\u00fa\u00fb\7;\2\2\u00fb\u00fc\5\20"+
		"\t\2\u00fc\u0105\3\2\2\2\u00fd\u00fe\7\n\2\2\u00fe\u0105\5\20\t\2\u00ff"+
		"\u0100\7\n\2\2\u0100\u0101\5\20\t\2\u0101\u0102\7;\2\2\u0102\u0103\5\20"+
		"\t\2\u0103\u0105\3\2\2\2\u0104\u00f6\3\2\2\2\u0104\u00f8\3\2\2\2\u0104"+
		"\u00fd\3\2\2\2\u0104\u00ff\3\2\2\2\u0105\33\3\2\2\2\u0106\u0107\7\34\2"+
		"\2\u0107\u0108\5\20\t\2\u0108\35\3\2\2\2\u0109\u010c\5\60\31\2\u010a\u010c"+
		"\5n8\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\37\3\2\2\2\u010d"+
		"\u010e\7\7\2\2\u010e\u010f\5\20\t\2\u010f!\3\2\2\2\u0110\u0111\7\b\2\2"+
		"\u0111\u0112\5\20\t\2\u0112#\3\2\2\2\u0113\u0114\5&\24\2\u0114\u0115\7"+
		",\2\2\u0115\u0117\3\2\2\2\u0116\u0113\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119%\3\2\2\2\u011a\u0121\7=\2\2\u011b"+
		"\u0121\7@\2\2\u011c\u011d\7=\2\2\u011d\u0121\5&\24\2\u011e\u011f\7@\2"+
		"\2\u011f\u0121\5&\24\2\u0120\u011a\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011c"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\'\3\2\2\2\u0122\u0123\7@\2\2\u0123"+
		")\3\2\2\2\u0124\u0125\t\2\2\2\u0125+\3\2\2\2\u0126\u0127\7@\2\2\u0127"+
		"-\3\2\2\2\u0128\u0129\7\37\2\2\u0129/\3\2\2\2\u012a\u012b\7@\2\2\u012b"+
		"\u012c\7<\2\2\u012c\u012d\5\62\32\2\u012d\61\3\2\2\2\u012e\u012f\5\64"+
		"\33\2\u012f\63\3\2\2\2\u0130\u0133\5:\36\2\u0131\u0133\5\66\34\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\65\3\2\2\2\u0134\u013c\5<\37"+
		"\2\u0135\u013c\5> \2\u0136\u013c\5.\30\2\u0137\u0138\7\66\2\2\u0138\u0139"+
		"\5\64\33\2\u0139\u013a\7\67\2\2\u013a\u013c\3\2\2\2\u013b\u0134\3\2\2"+
		"\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2\2\2\u013c\67"+
		"\3\2\2\2\u013d\u0140\5\64\33\2\u013e\u0140\5,\27\2\u013f\u013d\3\2\2\2"+
		"\u013f\u013e\3\2\2\2\u01409\3\2\2\2\u0141\u0142\7\"\2\2\u0142\u0143\5"+
		"<\37\2\u0143\u0144\7#\2\2\u0144\u0149\5<\37\2\u0145\u0146\7#\2\2\u0146"+
		"\u0148\5<\37\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a;\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d"+
		"\5(\25\2\u014d\u014e\7>\2\2\u014e\u014f\5(\25\2\u014f\u0150\79\2\2\u0150"+
		"\u0151\5*\26\2\u0151\u0152\7:\2\2\u0152\u0153\58\35\2\u0153=\3\2\2\2\u0154"+
		"\u0155\5,\27\2\u0155\u0156\7=\2\2\u0156\u0157\5\64\33\2\u0157?\3\2\2\2"+
		"\u0158\u0159\7%\2\2\u0159\u015e\5B\"\2\u015a\u015b\78\2\2\u015b\u015d"+
		"\5B\"\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7&"+
		"\2\2\u0162\u0163\7@\2\2\u0163\u0164\7<\2\2\u0164\u0165\5P)\2\u0165A\3"+
		"\2\2\2\u0166\u016a\7@\2\2\u0167\u0169\5D#\2\u0168\u0167\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7<\2\2\u016e\u016f\5F$\2\u016fC\3"+
		"\2\2\2\u0170\u0173\5\\/\2\u0171\u0173\5Z.\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0171\3\2\2\2\u0173E\3\2\2\2\u0174\u017c\5J&\2\u0175\u017c\5L\'\2\u0176"+
		"\u017c\7\37\2\2\u0177\u0178\7\66\2\2\u0178\u0179\5F$\2\u0179\u017a\7\67"+
		"\2\2\u017a\u017c\3\2\2\2\u017b\u0174\3\2\2\2\u017b\u0175\3\2\2\2\u017b"+
		"\u0176\3\2\2\2\u017b\u0177\3\2\2\2\u017cG\3\2\2\2\u017d\u0180\5F$\2\u017e"+
		"\u0180\5N(\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180I\3\2\2\2\u0181"+
		"\u0182\7\"\2\2\u0182\u0183\5L\'\2\u0183\u0184\7#\2\2\u0184\u0189\5L\'"+
		"\2\u0185\u0186\7#\2\2\u0186\u0188\5L\'\2\u0187\u0185\3\2\2\2\u0188\u018b"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018aK\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018c\u018e\5R*\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2"+
		"\2\u018e\u018f\3\2\2\2\u018f\u0190\5(\25\2\u0190\u0191\7>\2\2\u0191\u0192"+
		"\5(\25\2\u0192\u0193\79\2\2\u0193\u0194\5*\26\2\u0194\u0195\7:\2\2\u0195"+
		"\u0196\5H%\2\u0196M\3\2\2\2\u0197\u019b\7@\2\2\u0198\u019a\5T+\2\u0199"+
		"\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019cO\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a2\7@\2\2\u019f\u01a1"+
		"\5Z.\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3Q\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7$\2\2\u01a6"+
		"\u01a7\7\66\2\2\u01a7\u01a8\5^\60\2\u01a8\u01a9\7\67\2\2\u01a9S\3\2\2"+
		"\2\u01aa\u01ab\b+\1\2\u01ab\u01ac\5V,\2\u01ac\u01b3\3\2\2\2\u01ad\u01ae"+
		"\f\4\2\2\u01ae\u01af\5d\63\2\u01af\u01b0\5V,\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01ad\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4U\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\b,\1\2\u01b7\u01b8"+
		"\5X-\2\u01b8\u01bf\3\2\2\2\u01b9\u01ba\f\4\2\2\u01ba\u01bb\5f\64\2\u01bb"+
		"\u01bc\5X-\2\u01bc\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be\u01c1\3\2\2"+
		"\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0W\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c2\u01c3\7\66\2\2\u01c3\u01c4\5T+\2\u01c4\u01c5\7\67\2\2\u01c5"+
		"\u01c9\3\2\2\2\u01c6\u01c9\5Z.\2\u01c7\u01c9\5\\/\2\u01c8\u01c2\3\2\2"+
		"\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9Y\3\2\2\2\u01ca\u01cb"+
		"\7A\2\2\u01cb[\3\2\2\2\u01cc\u01cd\7@\2\2\u01cd]\3\2\2\2\u01ce\u01cf\b"+
		"\60\1\2\u01cf\u01d0\5`\61\2\u01d0\u01d7\3\2\2\2\u01d1\u01d2\f\4\2\2\u01d2"+
		"\u01d3\5h\65\2\u01d3\u01d4\5`\61\2\u01d4\u01d6\3\2\2\2\u01d5\u01d1\3\2"+
		"\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"_\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\b\61\1\2\u01db\u01dc\5b\62\2"+
		"\u01dc\u01e3\3\2\2\2\u01dd\u01de\f\4\2\2\u01de\u01df\5j\66\2\u01df\u01e0"+
		"\5b\62\2\u01e0\u01e2\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4a\3\2\2\2\u01e5\u01e3\3\2\2\2"+
		"\u01e6\u01e7\5T+\2\u01e7\u01e8\5l\67\2\u01e8\u01e9\5T+\2\u01e9\u01f1\3"+
		"\2\2\2\u01ea\u01eb\7\66\2\2\u01eb\u01ec\5^\60\2\u01ec\u01ed\7\67\2\2\u01ed"+
		"\u01f1\3\2\2\2\u01ee\u01f1\7\'\2\2\u01ef\u01f1\7(\2\2\u01f0\u01e6\3\2"+
		"\2\2\u01f0\u01ea\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"c\3\2\2\2\u01f2\u01f3\t\3\2\2\u01f3e\3\2\2\2\u01f4\u01f5\t\4\2\2\u01f5"+
		"g\3\2\2\2\u01f6\u01f7\t\5\2\2\u01f7i\3\2\2\2\u01f8\u01f9\t\6\2\2\u01f9"+
		"k\3\2\2\2\u01fa\u01fb\t\7\2\2\u01fbm\3\2\2\2\u01fc\u01fd\7@\2\2\u01fd"+
		"\u01fe\7<\2\2\u01fe\u01ff\5p9\2\u01ffo\3\2\2\2\u0200\u0201\7\64\2\2\u0201"+
		"\u0206\5r:\2\u0202\u0203\78\2\2\u0203\u0205\5r:\2\u0204\u0202\3\2\2\2"+
		"\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209"+
		"\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7\65\2\2\u020aq\3\2\2\2\u020b"+
		"\u020c\5(\25\2\u020c\u020d\79\2\2\u020d\u020e\5t;\2\u020es\3\2\2\2\u020f"+
		"\u0213\3\2\2\2\u0210\u0213\5z>\2\u0211\u0213\5v<\2\u0212\u020f\3\2\2\2"+
		"\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213u\3\2\2\2\u0214\u021c\5"+
		"|?\2\u0215\u021c\5\u0082B\2\u0216\u021c\5.\30\2\u0217\u0218\7\66\2\2\u0218"+
		"\u0219\5t;\2\u0219\u021a\7\67\2\2\u021a\u021c\3\2\2\2\u021b\u0214\3\2"+
		"\2\2\u021b\u0215\3\2\2\2\u021b\u0216\3\2\2\2\u021b\u0217\3\2\2\2\u021c"+
		"w\3\2\2\2\u021d\u0220\5t;\2\u021e\u0220\5,\27\2\u021f\u021d\3\2\2\2\u021f"+
		"\u021e\3\2\2\2\u0220y\3\2\2\2\u0221\u0222\7\"\2\2\u0222\u0223\5|?\2\u0223"+
		"\u0224\7#\2\2\u0224\u0229\5|?\2\u0225\u0226\7#\2\2\u0226\u0228\5|?\2\u0227"+
		"\u0225\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a{\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022f\5~@\2\u022d\u022f"+
		"\5\u0080A\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022f}\3\2\2\2\u0230"+
		"\u0231\5(\25\2\u0231\u0232\7 \2\2\u0232\u0233\5*\26\2\u0233\u0234\7:\2"+
		"\2\u0234\u0235\5x=\2\u0235\177\3\2\2\2\u0236\u0237\5(\25\2\u0237\u0238"+
		"\7!\2\2\u0238\u0239\5*\26\2\u0239\u023a\7:\2\2\u023a\u023b\5x=\2\u023b"+
		"\u0081\3\2\2\2\u023c\u023d\5,\27\2\u023d\u023e\7=\2\2\u023e\u023f\5t;"+
		"\2\u023f\u0083\3\2\2\2\62\u0087\u008e\u009c\u00a8\u00b4\u00bc\u00c0\u00c4"+
		"\u00c8\u00cc\u00d0\u00d4\u00db\u00df\u00e1\u00e5\u00ea\u00ed\u00f2\u0104"+
		"\u010b\u0118\u0120\u0132\u013b\u013f\u0149\u015e\u016a\u0172\u017b\u017f"+
		"\u0189\u018d\u019b\u01a2\u01b3\u01bf\u01c8\u01d7\u01e3\u01f0\u0206\u0212"+
		"\u021b\u021f\u0229\u022e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}