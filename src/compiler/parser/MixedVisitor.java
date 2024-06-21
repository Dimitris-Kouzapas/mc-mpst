// Generated from Mixed.g4 by ANTLR 4.7.2

package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MixedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MixedVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MixedParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(MixedParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(MixedParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MixedParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#projectstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectstatement(MixedParser.ProjectstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#semantics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemantics(MixedParser.SemanticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(MixedParser.GraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MixedParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(MixedParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#printmodule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintmodule(MixedParser.PrintmoduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(MixedParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#extract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(MixedParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#typecheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecheck(MixedParser.TypecheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#store}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore(MixedParser.StoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#protocoldecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocoldecl(MixedParser.ProtocoldeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#project}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(MixedParser.ProjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDir(MixedParser.DirContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(MixedParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole(MixedParser.RoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#ground}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGround(MixedParser.GroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#rvariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvariable(MixedParser.RvariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(MixedParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#globalprotocol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalprotocol(MixedParser.GlobalprotocolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#globaltypedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobaltypedecl(MixedParser.GlobaltypedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#globaltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobaltype(MixedParser.GlobaltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#guardedglobaltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardedglobaltype(MixedParser.GuardedglobaltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#globalcontinuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalcontinuation(MixedParser.GlobalcontinuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#globalsum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalsum(MixedParser.GlobalsumContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#pass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass(MixedParser.PassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#grec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrec(MixedParser.GrecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#parametrised}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrised(MixedParser.ParametrisedContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#abstraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstraction(MixedParser.AbstractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MixedParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#parametrisedtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrisedtype(MixedParser.ParametrisedtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#pcontinuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPcontinuation(MixedParser.PcontinuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#pglobalsum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPglobalsum(MixedParser.PglobalsumContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#parametrisedpass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrisedpass(MixedParser.ParametrisedpassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(MixedParser.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#iapplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIapplication(MixedParser.IapplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(MixedParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#sumexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumexpr(MixedParser.SumexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#mulexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulexpr(MixedParser.MulexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MixedParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MixedParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MixedParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#relexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelexpr(MixedParser.RelexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#logexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogexpr(MixedParser.LogexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(MixedParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#sumop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumop(MixedParser.SumopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(MixedParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(MixedParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#logop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogop(MixedParser.LogopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#compareop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareop(MixedParser.CompareopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#localcontextdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalcontextdecl(MixedParser.LocalcontextdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#localcontext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalcontext(MixedParser.LocalcontextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#roledecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoledecl(MixedParser.RoledeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#localtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocaltype(MixedParser.LocaltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#guardedlocaltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardedlocaltype(MixedParser.GuardedlocaltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#localcontinuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalcontinuation(MixedParser.LocalcontinuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#localsum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalsum(MixedParser.LocalsumContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#localaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalaction(MixedParser.LocalactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#send}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend(MixedParser.SendContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#receive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive(MixedParser.ReceiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MixedParser#recurse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurse(MixedParser.RecurseContext ctx);
}