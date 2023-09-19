// Generated from CFG.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CFGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48;
	public static final int
		RULE_sentence = 0, RULE_ss = 1, RULE_ss2 = 2, RULE_pronoun_start = 3, 
		RULE_pronoun_end = 4, RULE_noun = 5, RULE_adjective = 6, RULE_pronoun = 7, 
		RULE_verb = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentence", "ss", "ss2", "pronoun_start", "pronoun_end", "noun", "adjective", 
			"pronoun", "verb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\\u00E0\\u00A5\\u00A4'", "'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00A6\\u00E0\\u00A6\\u00BF'", 
			"'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A7\\u2021'", "'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00A4'", 
			"'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A7\\u2021\\u00E0\\u00A6\\u00AE\\u00E0\\u00A6\\u00A8\\u00E0\\u00A6\\u0178\\u00E0\\u00A6\\u00BE'", 
			"'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00B0\\u00E0\\u00A6\\u00BE'", 
			"'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00A6\\u00E0\\u00A6\\u00BF\\u00E0\\u00A6\\u201C'", 
			"'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u2021'", 
			"'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u2013\\u00E0\\u00A6\\u00A8'", 
			"'\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u00B8\\u00E0\\u00A7\\u2021'", "'\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u00A4'", 
			"'\\u00E0\\u00A6\\u00A4\\u00E0\\u00A7\\u2021\\u00E0\\u00A6\\u00AE\\u00E0\\u00A6\\u00A8\\u00E0\\u00A6\\u0178\\u00E0\\u00A6\\u00BE'", 
			"'\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00B0\\u00E0\\u00A6\\u00BE'", 
			"'\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u00A5\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00AA\\u00E0\\u00A6\\u00BF'", 
			"'\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u2021'", 
			"'\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u2013\\u00E0\\u00A6\\u00A8'", 
			"'\\u00E0\\u00A6\\u00AC\\u00E0\\u00A6\\u00BF\\u00E0\\u00A6\\u00AA\\u00E0\\u00A6\\u00A6'", 
			"'\\u00E0\\u00A6\\u00A6\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u0192\\u00E0\\u00A6\\u2013\\u00E0\\u00A6\\u201C'", 
			"'\\u00E0\\u00A6\\u2026\\u00E0\\u00A6\\u00AA\\u00E0\\u00A6\\u00B0\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00A7'", 
			"'\\u00E0\\u00A6\\u00B6\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00B8\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u00BF'", 
			"'\\u00E0\\u00A6\\u2020\\u00E0\\u00A6\\u00B2\\u00E0\\u00A7\\u2039'", 
			"'\\u00E0\\u00A6\\u00AA\\u00E0\\u00A7\\u0153\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00B6\\u00E0\\u00A7\\u2039\\u00E0\\u00A6\\u00A8\\u00E0\\u00A6\\u00BE'", 
			"'\\u00E0\\u00A6\\u2014\\u00E0\\u00A6\\u00BE\\u00E0\\u00A7\\u0153\\u00E0\\u00A6\\u00BF\\u00E0\\u00A6\\u00A4\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u2014\\u00E0\\u00A6\\u00B0\\u00E0\\u00A6\\u00BF\\u00E0\\u00A6\\u00AC'", 
			"'\\u00E0\\u00A6\\u2026\\u00E0\\u00A6\\u00A8\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00A7'", 
			"'\\u00E0\\u00A6\\u00A6\\u00E0\\u00A7\\u2021\\u00E0\\u00A6\\u00B6\\u00E0\\u00A6\\u00AA\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00B0\\u00E0\\u00A7\\u2021\\u00E0\\u00A6\\u00AE\\u00E0\\u00A6\\u00BF\\u00E0\\u00A6\\u2022'", 
			"'\\u00E0\\u00A6\\u2026\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u00BF\\u00E0\\u00A6\\u00A5\\u00E0\\u00A6\\u00BF\\u00E0\\u00A6\\u00AA\\u00E0\\u00A6\\u00B0\\u00E0\\u00A6\\u00BE\\u00E0\\u00A7\\u0178\\u00E0\\u00A6\\u00A3'", 
			"'\\u00E0\\u00A6\\u00A4\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00AE\\u00E0\\u00A6\\u00BF'", 
			"'\\u00E0\\u00A6\\u2020\\u00E0\\u00A6\\u00AE\\u00E0\\u00A6\\u00BF'", 
			"'\\u00E0\\u00A6\\u2020\\u00E0\\u00A6\\u00AE\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00B0 \\u00E0\\u00A6\\u00AD\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u2021'", 
			"'\\u00E0\\u00A6\\u00B2\\u00E0\\u00A7\\u2039\\u00E0\\u00A6\\u2022\\u00E0\\u00A6\\u0178\\u00E0\\u00A6\\u00BF'", 
			"'\\u00E0\\u00A6\\u2020\\u00E0\\u00A6\\u00B8\\u00E0\\u00A7\\u2039'", 
			"'\\u00E0\\u00A6\\u00A6\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u201C'", 
			"'\\u00E0\\u00A6\\u2020\\u00E0\\u00A6\\u00B8\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u2022\\u00E0\\u00A6\\u00B0\\u00E0\\u00A7\\u2021\\u00E0\\u00A6\\u203A\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u00AA\\u00E0\\u00A7\\u2021\\u00E0\\u00A7\\u0178\\u00E0\\u00A7\\u2021\\u00E0\\u00A6\\u203A\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u2022\\u00E0\\u00A6\\u00B0\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u00AA\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u0161\\u00E0\\u00A7\\u0153\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u00AD\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00B2\\u00E0\\u00A7\\u2039\\u00E0\\u00A6\\u00AC\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00B8\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\u2039'", 
			"'\\u00E0\\u00A6\\u0153\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00A8\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u00AA\\u00E0\\u00A7\\u0153\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\uFFFD\\u00E0\\u00A6\\u00B8\\u00E0\\u00A7\\u2021\\u00E0\\u00A6\\u203A\\u00E0\\u00A6\\u00BF\\u00E0\\u00A6\\u00B2\\u00E0\\u00A7\\u2039'", 
			"'\\u00E0\\u00A6\\u0161\\u00E0\\u00A7\\u2021\\u00E0\\u00A7\\u0178\\u00E0\\u00A7\\u2021\\u00E0\\u00A6\\u203A\\u00E0\\u00A6\\u00BF\\u00E0\\u00A6\\u00B2\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00AE'", 
			"'\\u00E0\\u00A6\\u00AA\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u2021\\u00E0\\u00A6\\u00A8\\u00E0\\u00A6\\u00BF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
	public String getGrammarFileName() { return "CFG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CFGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public Pronoun_startContext pronoun_start() {
			return getRuleContext(Pronoun_startContext.class,0);
		}
		public List<SsContext> ss() {
			return getRuleContexts(SsContext.class);
		}
		public SsContext ss(int i) {
			return getRuleContext(SsContext.class,i);
		}
		public Pronoun_endContext pronoun_end() {
			return getRuleContext(Pronoun_endContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			pronoun_start();
			setState(19);
			ss();
			setState(20);
			match(T__0);
			setState(21);
			pronoun_end();
			setState(22);
			ss();
			setState(23);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SsContext extends ParserRuleContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Ss2Context ss2() {
			return getRuleContext(Ss2Context.class,0);
		}
		public PronounContext pronoun() {
			return getRuleContext(PronounContext.class,0);
		}
		public SsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterSs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitSs(this);
		}
	}

	public final SsContext ss() throws RecognitionException {
		SsContext _localctx = new SsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ss);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				noun();
				setState(26);
				ss2();
				}
				break;
			case T__11:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				pronoun();
				setState(29);
				ss2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ss2Context extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public PronounContext pronoun() {
			return getRuleContext(PronounContext.class,0);
		}
		public Ss2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ss2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterSs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitSs2(this);
		}
	}

	public final Ss2Context ss2() throws RecognitionException {
		Ss2Context _localctx = new Ss2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_ss2);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				verb();
				}
				break;
			case T__11:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				pronoun();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pronoun_startContext extends ParserRuleContext {
		public Pronoun_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pronoun_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterPronoun_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitPronoun_start(this);
		}
	}

	public final Pronoun_startContext pronoun_start() throws RecognitionException {
		Pronoun_startContext _localctx = new Pronoun_startContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pronoun_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2040L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pronoun_endContext extends ParserRuleContext {
		public Pronoun_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pronoun_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterPronoun_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitPronoun_end(this);
		}
	}

	public final Pronoun_endContext pronoun_end() throws RecognitionException {
		Pronoun_endContext _localctx = new Pronoun_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pronoun_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 522240L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NounContext extends ParserRuleContext {
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitNoun(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66584576L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdjectiveContext extends ParserRuleContext {
		public AdjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterAdjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitAdjective(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_adjective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PronounContext extends ParserRuleContext {
		public PronounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pronoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterPronoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitPronoun(this);
		}
	}

	public final PronounContext pronoun() throws RecognitionException {
		PronounContext _localctx = new PronounContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pronoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106131456L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VerbContext extends ParserRuleContext {
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 562932773552128L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u000102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0006\u0001\u0000\u0003\n\u0001\u0000\u000b\u0012\u0001\u0000\u0013\u0019"+
		"\u0001\u0000\u001a\u001d\u0002\u0000\f\f\u001e!\u0001\u0000\"0*\u0000"+
		"\u0012\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004"+
		"#\u0001\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\b\'\u0001\u0000"+
		"\u0000\u0000\n)\u0001\u0000\u0000\u0000\f+\u0001\u0000\u0000\u0000\u000e"+
		"-\u0001\u0000\u0000\u0000\u0010/\u0001\u0000\u0000\u0000\u0012\u0013\u0003"+
		"\u0006\u0003\u0000\u0013\u0014\u0003\u0002\u0001\u0000\u0014\u0015\u0005"+
		"\u0001\u0000\u0000\u0015\u0016\u0003\b\u0004\u0000\u0016\u0017\u0003\u0002"+
		"\u0001\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018\u0001\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0003\n\u0005\u0000\u001a\u001b\u0003\u0004\u0002"+
		"\u0000\u001b \u0001\u0000\u0000\u0000\u001c\u001d\u0003\u000e\u0007\u0000"+
		"\u001d\u001e\u0003\u0004\u0002\u0000\u001e \u0001\u0000\u0000\u0000\u001f"+
		"\u0019\u0001\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000 \u0003"+
		"\u0001\u0000\u0000\u0000!$\u0003\u0010\b\u0000\"$\u0003\u000e\u0007\u0000"+
		"#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\u0005\u0001\u0000"+
		"\u0000\u0000%&\u0007\u0000\u0000\u0000&\u0007\u0001\u0000\u0000\u0000"+
		"\'(\u0007\u0001\u0000\u0000(\t\u0001\u0000\u0000\u0000)*\u0007\u0002\u0000"+
		"\u0000*\u000b\u0001\u0000\u0000\u0000+,\u0007\u0003\u0000\u0000,\r\u0001"+
		"\u0000\u0000\u0000-.\u0007\u0004\u0000\u0000.\u000f\u0001\u0000\u0000"+
		"\u0000/0\u0007\u0005\u0000\u00000\u0011\u0001\u0000\u0000\u0000\u0002"+
		"\u001f#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}