// Generated from src/compiler/parser/Mixed.g4 by ANTLR 4.7.2

package compiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MixedParser}.
 */
public interface MixedListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MixedParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(MixedParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(MixedParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(MixedParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(MixedParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MixedParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MixedParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#projectstatement}.
	 * @param ctx the parse tree
	 */
	void enterProjectstatement(MixedParser.ProjectstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#projectstatement}.
	 * @param ctx the parse tree
	 */
	void exitProjectstatement(MixedParser.ProjectstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#semantics}.
	 * @param ctx the parse tree
	 */
	void enterSemantics(MixedParser.SemanticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#semantics}.
	 * @param ctx the parse tree
	 */
	void exitSemantics(MixedParser.SemanticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(MixedParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(MixedParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MixedParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MixedParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(MixedParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(MixedParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#printmodule}.
	 * @param ctx the parse tree
	 */
	void enterPrintmodule(MixedParser.PrintmoduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#printmodule}.
	 * @param ctx the parse tree
	 */
	void exitPrintmodule(MixedParser.PrintmoduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(MixedParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(MixedParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#extract}.
	 * @param ctx the parse tree
	 */
	void enterExtract(MixedParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#extract}.
	 * @param ctx the parse tree
	 */
	void exitExtract(MixedParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#typecheck}.
	 * @param ctx the parse tree
	 */
	void enterTypecheck(MixedParser.TypecheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#typecheck}.
	 * @param ctx the parse tree
	 */
	void exitTypecheck(MixedParser.TypecheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#protocoldecl}.
	 * @param ctx the parse tree
	 */
	void enterProtocoldecl(MixedParser.ProtocoldeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#protocoldecl}.
	 * @param ctx the parse tree
	 */
	void exitProtocoldecl(MixedParser.ProtocoldeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(MixedParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(MixedParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#dir}.
	 * @param ctx the parse tree
	 */
	void enterDir(MixedParser.DirContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#dir}.
	 * @param ctx the parse tree
	 */
	void exitDir(MixedParser.DirContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(MixedParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(MixedParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(MixedParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(MixedParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#ground}.
	 * @param ctx the parse tree
	 */
	void enterGround(MixedParser.GroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#ground}.
	 * @param ctx the parse tree
	 */
	void exitGround(MixedParser.GroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#rvariable}.
	 * @param ctx the parse tree
	 */
	void enterRvariable(MixedParser.RvariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#rvariable}.
	 * @param ctx the parse tree
	 */
	void exitRvariable(MixedParser.RvariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(MixedParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(MixedParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#globalprotocol}.
	 * @param ctx the parse tree
	 */
	void enterGlobalprotocol(MixedParser.GlobalprotocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#globalprotocol}.
	 * @param ctx the parse tree
	 */
	void exitGlobalprotocol(MixedParser.GlobalprotocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#globaltypedecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobaltypedecl(MixedParser.GlobaltypedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#globaltypedecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobaltypedecl(MixedParser.GlobaltypedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#globaltype}.
	 * @param ctx the parse tree
	 */
	void enterGlobaltype(MixedParser.GlobaltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#globaltype}.
	 * @param ctx the parse tree
	 */
	void exitGlobaltype(MixedParser.GlobaltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#guardedglobaltype}.
	 * @param ctx the parse tree
	 */
	void enterGuardedglobaltype(MixedParser.GuardedglobaltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#guardedglobaltype}.
	 * @param ctx the parse tree
	 */
	void exitGuardedglobaltype(MixedParser.GuardedglobaltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#globalcontinuation}.
	 * @param ctx the parse tree
	 */
	void enterGlobalcontinuation(MixedParser.GlobalcontinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#globalcontinuation}.
	 * @param ctx the parse tree
	 */
	void exitGlobalcontinuation(MixedParser.GlobalcontinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#globalsum}.
	 * @param ctx the parse tree
	 */
	void enterGlobalsum(MixedParser.GlobalsumContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#globalsum}.
	 * @param ctx the parse tree
	 */
	void exitGlobalsum(MixedParser.GlobalsumContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#pass}.
	 * @param ctx the parse tree
	 */
	void enterPass(MixedParser.PassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#pass}.
	 * @param ctx the parse tree
	 */
	void exitPass(MixedParser.PassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#grec}.
	 * @param ctx the parse tree
	 */
	void enterGrec(MixedParser.GrecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#grec}.
	 * @param ctx the parse tree
	 */
	void exitGrec(MixedParser.GrecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#parametrised}.
	 * @param ctx the parse tree
	 */
	void enterParametrised(MixedParser.ParametrisedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#parametrised}.
	 * @param ctx the parse tree
	 */
	void exitParametrised(MixedParser.ParametrisedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#abstraction}.
	 * @param ctx the parse tree
	 */
	void enterAbstraction(MixedParser.AbstractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#abstraction}.
	 * @param ctx the parse tree
	 */
	void exitAbstraction(MixedParser.AbstractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MixedParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MixedParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#parametrisedtype}.
	 * @param ctx the parse tree
	 */
	void enterParametrisedtype(MixedParser.ParametrisedtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#parametrisedtype}.
	 * @param ctx the parse tree
	 */
	void exitParametrisedtype(MixedParser.ParametrisedtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#pcontinuation}.
	 * @param ctx the parse tree
	 */
	void enterPcontinuation(MixedParser.PcontinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#pcontinuation}.
	 * @param ctx the parse tree
	 */
	void exitPcontinuation(MixedParser.PcontinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#pglobalsum}.
	 * @param ctx the parse tree
	 */
	void enterPglobalsum(MixedParser.PglobalsumContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#pglobalsum}.
	 * @param ctx the parse tree
	 */
	void exitPglobalsum(MixedParser.PglobalsumContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#parametrisedpass}.
	 * @param ctx the parse tree
	 */
	void enterParametrisedpass(MixedParser.ParametrisedpassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#parametrisedpass}.
	 * @param ctx the parse tree
	 */
	void exitParametrisedpass(MixedParser.ParametrisedpassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(MixedParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(MixedParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#iapplication}.
	 * @param ctx the parse tree
	 */
	void enterIapplication(MixedParser.IapplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#iapplication}.
	 * @param ctx the parse tree
	 */
	void exitIapplication(MixedParser.IapplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(MixedParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(MixedParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void enterSumexpr(MixedParser.SumexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void exitSumexpr(MixedParser.SumexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void enterMulexpr(MixedParser.MulexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void exitMulexpr(MixedParser.MulexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MixedParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MixedParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MixedParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MixedParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MixedParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MixedParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#relexpr}.
	 * @param ctx the parse tree
	 */
	void enterRelexpr(MixedParser.RelexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#relexpr}.
	 * @param ctx the parse tree
	 */
	void exitRelexpr(MixedParser.RelexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#logexpr}.
	 * @param ctx the parse tree
	 */
	void enterLogexpr(MixedParser.LogexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#logexpr}.
	 * @param ctx the parse tree
	 */
	void exitLogexpr(MixedParser.LogexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(MixedParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(MixedParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#sumop}.
	 * @param ctx the parse tree
	 */
	void enterSumop(MixedParser.SumopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#sumop}.
	 * @param ctx the parse tree
	 */
	void exitSumop(MixedParser.SumopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(MixedParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(MixedParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(MixedParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(MixedParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#logop}.
	 * @param ctx the parse tree
	 */
	void enterLogop(MixedParser.LogopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#logop}.
	 * @param ctx the parse tree
	 */
	void exitLogop(MixedParser.LogopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#compareop}.
	 * @param ctx the parse tree
	 */
	void enterCompareop(MixedParser.CompareopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#compareop}.
	 * @param ctx the parse tree
	 */
	void exitCompareop(MixedParser.CompareopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#localcontextdecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalcontextdecl(MixedParser.LocalcontextdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#localcontextdecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalcontextdecl(MixedParser.LocalcontextdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#localcontext}.
	 * @param ctx the parse tree
	 */
	void enterLocalcontext(MixedParser.LocalcontextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#localcontext}.
	 * @param ctx the parse tree
	 */
	void exitLocalcontext(MixedParser.LocalcontextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#roledecl}.
	 * @param ctx the parse tree
	 */
	void enterRoledecl(MixedParser.RoledeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#roledecl}.
	 * @param ctx the parse tree
	 */
	void exitRoledecl(MixedParser.RoledeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#localtype}.
	 * @param ctx the parse tree
	 */
	void enterLocaltype(MixedParser.LocaltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#localtype}.
	 * @param ctx the parse tree
	 */
	void exitLocaltype(MixedParser.LocaltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#guardedlocaltype}.
	 * @param ctx the parse tree
	 */
	void enterGuardedlocaltype(MixedParser.GuardedlocaltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#guardedlocaltype}.
	 * @param ctx the parse tree
	 */
	void exitGuardedlocaltype(MixedParser.GuardedlocaltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#localcontinuation}.
	 * @param ctx the parse tree
	 */
	void enterLocalcontinuation(MixedParser.LocalcontinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#localcontinuation}.
	 * @param ctx the parse tree
	 */
	void exitLocalcontinuation(MixedParser.LocalcontinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#localsum}.
	 * @param ctx the parse tree
	 */
	void enterLocalsum(MixedParser.LocalsumContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#localsum}.
	 * @param ctx the parse tree
	 */
	void exitLocalsum(MixedParser.LocalsumContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#localaction}.
	 * @param ctx the parse tree
	 */
	void enterLocalaction(MixedParser.LocalactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#localaction}.
	 * @param ctx the parse tree
	 */
	void exitLocalaction(MixedParser.LocalactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#send}.
	 * @param ctx the parse tree
	 */
	void enterSend(MixedParser.SendContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#send}.
	 * @param ctx the parse tree
	 */
	void exitSend(MixedParser.SendContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#receive}.
	 * @param ctx the parse tree
	 */
	void enterReceive(MixedParser.ReceiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#receive}.
	 * @param ctx the parse tree
	 */
	void exitReceive(MixedParser.ReceiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MixedParser#recurse}.
	 * @param ctx the parse tree
	 */
	void enterRecurse(MixedParser.RecurseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MixedParser#recurse}.
	 * @param ctx the parse tree
	 */
	void exitRecurse(MixedParser.RecurseContext ctx);
}