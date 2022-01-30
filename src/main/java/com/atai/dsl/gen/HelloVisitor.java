// Generated from D:/code/ruledsl/src/main/resources\Hello.g4 by ANTLR 4.9.2
package com.atai.dsl.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(HelloParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(HelloParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(HelloParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HelloParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HelloParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(HelloParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HelloParser.ValueContext ctx);
}