// Generated from D:/code/ruledsl/src/main/resources\Hello.g4 by ANTLR 4.9.2
package com.atai.dsl.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(HelloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(HelloParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HelloParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HelloParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(HelloParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(HelloParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HelloParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HelloParser.ValueContext ctx);
}