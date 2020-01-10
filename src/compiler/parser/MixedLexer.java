// Generated from src/compiler/parser/Mixed.g4 by ANTLR 4.7.2

package compiler.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MixedLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOAD", "FILE", "MODULE", "MODULES", "PROJECT", "CHECK", "VERIFY", "SEMANTICS", 
			"GRAPH", "USAGE", "HELP", "VERBOSE", "TEMP", "TMP", "LIST", "LS", "CLEAR", 
			"HISTORY", "HS", "ENV", "EXEC", "LAST", "RM", "EXTRACT", "QUIT", "EXIT", 
			"END", "SEND", "RECEIVE", "CHOICE", "OR", "IF", "LET", "IN", "TRUE", 
			"FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "NEQ", "LT", "LEQ", "GT", 
			"GEQ", "AND", "LBRA", "RBRA", "LPAR", "RPAR", "COMMA", "COLON", "SEMICOLON", 
			"EQEQ", "EQUAL", "DOT", "TO", "LABEL", "ID", "INT", "ARG", "WHITESPACE", 
			"COMMENT"
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


	public MixedLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mixed.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u019c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3"+
		".\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3;\3<\3<"+
		"\3<\7<\u0177\n<\f<\16<\u017a\13<\3=\3=\7=\u017e\n=\f=\16=\u0181\13=\3"+
		">\6>\u0184\n>\r>\16>\u0185\3?\3?\3?\7?\u018b\n?\f?\16?\u018e\13?\3@\3"+
		"@\3@\3@\3A\3A\7A\u0196\nA\fA\16A\u0199\13A\3A\3A\2\2B\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\3\2\t\3\2BB\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2//\5\2\13\f"+
		"\17\17\"\"\3\2\f\f\2\u01a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\3\u0083\3\2\2\2\5\u0088\3\2\2\2\7\u008d\3\2\2\2\t\u0094\3\2\2\2\13"+
		"\u009c\3\2\2\2\r\u00a4\3\2\2\2\17\u00aa\3\2\2\2\21\u00b1\3\2\2\2\23\u00bb"+
		"\3\2\2\2\25\u00c1\3\2\2\2\27\u00c7\3\2\2\2\31\u00cc\3\2\2\2\33\u00d4\3"+
		"\2\2\2\35\u00d9\3\2\2\2\37\u00dd\3\2\2\2!\u00e2\3\2\2\2#\u00e5\3\2\2\2"+
		"%\u00eb\3\2\2\2\'\u00f3\3\2\2\2)\u00f6\3\2\2\2+\u00fa\3\2\2\2-\u00ff\3"+
		"\2\2\2/\u0104\3\2\2\2\61\u0107\3\2\2\2\63\u010f\3\2\2\2\65\u0114\3\2\2"+
		"\2\67\u0119\3\2\2\29\u011d\3\2\2\2;\u011f\3\2\2\2=\u0121\3\2\2\2?\u0128"+
		"\3\2\2\2A\u012b\3\2\2\2C\u012e\3\2\2\2E\u0132\3\2\2\2G\u0135\3\2\2\2I"+
		"\u013a\3\2\2\2K\u0140\3\2\2\2M\u0142\3\2\2\2O\u0144\3\2\2\2Q\u0146\3\2"+
		"\2\2S\u0148\3\2\2\2U\u014a\3\2\2\2W\u014d\3\2\2\2Y\u014f\3\2\2\2[\u0152"+
		"\3\2\2\2]\u0154\3\2\2\2_\u0157\3\2\2\2a\u015b\3\2\2\2c\u015d\3\2\2\2e"+
		"\u015f\3\2\2\2g\u0161\3\2\2\2i\u0163\3\2\2\2k\u0165\3\2\2\2m\u0167\3\2"+
		"\2\2o\u0169\3\2\2\2q\u016c\3\2\2\2s\u016e\3\2\2\2u\u0170\3\2\2\2w\u0173"+
		"\3\2\2\2y\u017b\3\2\2\2{\u0183\3\2\2\2}\u0187\3\2\2\2\177\u018f\3\2\2"+
		"\2\u0081\u0193\3\2\2\2\u0083\u0084\7n\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7f\2\2\u0087\4\3\2\2\2\u0088\u0089\7h\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\6\3\2\2\2\u008d\u008e"+
		"\7o\2\2\u008e\u008f\7q\2\2\u008f\u0090\7f\2\2\u0090\u0091\7w\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\b\3\2\2\2\u0094\u0095\7o\2\2\u0095"+
		"\u0096\7q\2\2\u0096\u0097\7f\2\2\u0097\u0098\7w\2\2\u0098\u0099\7n\2\2"+
		"\u0099\u009a\7g\2\2\u009a\u009b\7u\2\2\u009b\n\3\2\2\2\u009c\u009d\7r"+
		"\2\2\u009d\u009e\7t\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7l\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7v\2\2\u00a3\f\3\2\2\2\u00a4\u00a5"+
		"\7e\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7e\2\2\u00a8"+
		"\u00a9\7m\2\2\u00a9\16\3\2\2\2\u00aa\u00ab\7x\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\7{\2\2"+
		"\u00b0\20\3\2\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7"+
		"o\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7u\2\2\u00ba\22\3\2\2\2\u00bb\u00bc"+
		"\7i\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7r\2\2\u00bf"+
		"\u00c0\7j\2\2\u00c0\24\3\2\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7u\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7i\2\2\u00c5\u00c6\7g\2\2\u00c6\26\3\2\2\2\u00c7"+
		"\u00c8\7j\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7r\2\2"+
		"\u00cb\30\3\2\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7"+
		"t\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7"+
		"\7o\2\2\u00d7\u00d8\7r\2\2\u00d8\34\3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db"+
		"\7o\2\2\u00db\u00dc\7r\2\2\u00dc\36\3\2\2\2\u00dd\u00de\7n\2\2\u00de\u00df"+
		"\7k\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7v\2\2\u00e1 \3\2\2\2\u00e2\u00e3"+
		"\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\"\3\2\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7"+
		"\7n\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"$\3\2\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7{\2\2"+
		"\u00f2&\3\2\2\2\u00f3\u00f4\7j\2\2\u00f4\u00f5\7u\2\2\u00f5(\3\2\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7x\2\2\u00f9*\3\2\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7z\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7e\2\2"+
		"\u00fe,\3\2\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7c\2\2\u0101\u0102\7u\2"+
		"\2\u0102\u0103\7v\2\2\u0103.\3\2\2\2\u0104\u0105\7t\2\2\u0105\u0106\7"+
		"o\2\2\u0106\60\3\2\2\2\u0107\u0108\7g\2\2\u0108\u0109\7z\2\2\u0109\u010a"+
		"\7v\2\2\u010a\u010b\7t\2\2\u010b\u010c\7c\2\2\u010c\u010d\7e\2\2\u010d"+
		"\u010e\7v\2\2\u010e\62\3\2\2\2\u010f\u0110\7s\2\2\u0110\u0111\7w\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7v\2\2\u0113\64\3\2\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7z\2\2\u0116\u0117\7k\2\2\u0117\u0118\7v\2\2\u0118\66\3\2\2\2\u0119"+
		"\u011a\7g\2\2\u011a\u011b\7p\2\2\u011b\u011c\7f\2\2\u011c8\3\2\2\2\u011d"+
		"\u011e\7#\2\2\u011e:\3\2\2\2\u011f\u0120\7A\2\2\u0120<\3\2\2\2\u0121\u0122"+
		"\7e\2\2\u0122\u0123\7j\2\2\u0123\u0124\7q\2\2\u0124\u0125\7k\2\2\u0125"+
		"\u0126\7e\2\2\u0126\u0127\7g\2\2\u0127>\3\2\2\2\u0128\u0129\7q\2\2\u0129"+
		"\u012a\7t\2\2\u012a@\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d\7h\2\2\u012d"+
		"B\3\2\2\2\u012e\u012f\7n\2\2\u012f\u0130\7g\2\2\u0130\u0131\7v\2\2\u0131"+
		"D\3\2\2\2\u0132\u0133\7k\2\2\u0133\u0134\7p\2\2\u0134F\3\2\2\2\u0135\u0136"+
		"\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7w\2\2\u0138\u0139\7g\2\2\u0139"+
		"H\3\2\2\2\u013a\u013b\7h\2\2\u013b\u013c\7c\2\2\u013c\u013d\7n\2\2\u013d"+
		"\u013e\7u\2\2\u013e\u013f\7g\2\2\u013fJ\3\2\2\2\u0140\u0141\7-\2\2\u0141"+
		"L\3\2\2\2\u0142\u0143\7/\2\2\u0143N\3\2\2\2\u0144\u0145\7,\2\2\u0145P"+
		"\3\2\2\2\u0146\u0147\7\61\2\2\u0147R\3\2\2\2\u0148\u0149\7\'\2\2\u0149"+
		"T\3\2\2\2\u014a\u014b\7#\2\2\u014b\u014c\7?\2\2\u014cV\3\2\2\2\u014d\u014e"+
		"\7>\2\2\u014eX\3\2\2\2\u014f\u0150\7>\2\2\u0150\u0151\7?\2\2\u0151Z\3"+
		"\2\2\2\u0152\u0153\7@\2\2\u0153\\\3\2\2\2\u0154\u0155\7@\2\2\u0155\u0156"+
		"\7?\2\2\u0156^\3\2\2\2\u0157\u0158\7c\2\2\u0158\u0159\7p\2\2\u0159\u015a"+
		"\7f\2\2\u015a`\3\2\2\2\u015b\u015c\7}\2\2\u015cb\3\2\2\2\u015d\u015e\7"+
		"\177\2\2\u015ed\3\2\2\2\u015f\u0160\7*\2\2\u0160f\3\2\2\2\u0161\u0162"+
		"\7+\2\2\u0162h\3\2\2\2\u0163\u0164\7.\2\2\u0164j\3\2\2\2\u0165\u0166\7"+
		"<\2\2\u0166l\3\2\2\2\u0167\u0168\7=\2\2\u0168n\3\2\2\2\u0169\u016a\7?"+
		"\2\2\u016a\u016b\7?\2\2\u016bp\3\2\2\2\u016c\u016d\7?\2\2\u016dr\3\2\2"+
		"\2\u016e\u016f\7\60\2\2\u016ft\3\2\2\2\u0170\u0171\7/\2\2\u0171\u0172"+
		"\7@\2\2\u0172v\3\2\2\2\u0173\u0174\t\2\2\2\u0174\u0178\t\3\2\2\u0175\u0177"+
		"\t\4\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179x\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017f\t\3\2\2"+
		"\u017c\u017e\t\4\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180z\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0184\t\5\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186|\3\2\2\2\u0187\u0188\t\6\2\2\u0188\u018c"+
		"\t\3\2\2\u0189\u018b\t\4\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d~\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\u018f\u0190\t\7\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b@\2\2\u0192\u0080"+
		"\3\2\2\2\u0193\u0197\7%\2\2\u0194\u0196\n\b\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019b\bA\2\2\u019b\u0082\3\2\2\2\b\2\u0178"+
		"\u017f\u0185\u018c\u0197\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}