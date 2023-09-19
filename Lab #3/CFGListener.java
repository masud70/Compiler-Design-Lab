// Generated from CFG.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CFGParser}.
 */
public interface CFGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CFGParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(CFGParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(CFGParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#ss}.
	 * @param ctx the parse tree
	 */
	void enterSs(CFGParser.SsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#ss}.
	 * @param ctx the parse tree
	 */
	void exitSs(CFGParser.SsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#ss2}.
	 * @param ctx the parse tree
	 */
	void enterSs2(CFGParser.Ss2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#ss2}.
	 * @param ctx the parse tree
	 */
	void exitSs2(CFGParser.Ss2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#pronoun_start}.
	 * @param ctx the parse tree
	 */
	void enterPronoun_start(CFGParser.Pronoun_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#pronoun_start}.
	 * @param ctx the parse tree
	 */
	void exitPronoun_start(CFGParser.Pronoun_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#pronoun_end}.
	 * @param ctx the parse tree
	 */
	void enterPronoun_end(CFGParser.Pronoun_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#pronoun_end}.
	 * @param ctx the parse tree
	 */
	void exitPronoun_end(CFGParser.Pronoun_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(CFGParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(CFGParser.NounContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#adjective}.
	 * @param ctx the parse tree
	 */
	void enterAdjective(CFGParser.AdjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#adjective}.
	 * @param ctx the parse tree
	 */
	void exitAdjective(CFGParser.AdjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void enterPronoun(CFGParser.PronounContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void exitPronoun(CFGParser.PronounContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFGParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(CFGParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFGParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(CFGParser.VerbContext ctx);
}