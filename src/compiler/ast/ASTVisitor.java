package compiler.ast;

import java.util.List;
import java.util.ArrayList;

import compiler.parser.MixedParser;

import compiler.ast.base.*;
import compiler.ast.statement.*;
import compiler.ast.expression.*;
import compiler.ast.local.*;
import compiler.ast.global.*;

import compiler.ast.parametrised.*;
import compiler.ast.parametrised.expr.*;

import compiler.StatementInterface;

public class ASTVisitor {
	public static List<StatementInterface> visitModule(MixedParser.ModuleContext ctx, String file) {
		List<StatementInterface> list = new ArrayList<StatementInterface>();
		for(Statement stm: visitStatements(ctx)) {
			stm.set(file);
			list.add(stm);
		}
		return list;
	}

	private static List<Statement> visitStatements(MixedParser.ModuleContext ctx) {
		List<Statement> list = new ArrayList<Statement>();
		for(MixedParser.CommandContext c: ctx.command())
			list.add(visitCommand(c));

		return list;
	}

	private static Statement visitCommand(MixedParser.CommandContext ctx) {
		return visitStatement(ctx.statement());
	}

	/*******************************************
	 *  Statements
	 *******************************************/

	private static Statement visitStatement(MixedParser.StatementContext ctx) {
		if(ctx.terminal() != null)
			return visitTerminal(ctx.terminal());
		else if(ctx.load() != null)
			return visitLoad(ctx.load());
		else if(ctx.printmodule() != null)
			return visitPrintModule(ctx.printmodule());
		else if(ctx.extract() != null)
			return visitExtract(ctx.extract());
		else if(ctx.typecheck() != null)
			return visitTypeCheck(ctx.typecheck());
		else if(ctx.store() != null)
			return visitStore(ctx.store());
		else if(ctx.protocoldecl() != null)
			return new DeclStatement(visitProtocolDecl(ctx.protocoldecl()), -1); //TODO line number
		else if(ctx.parametrised() != null)
			return new ParametrisedStatement(visitParametrised(ctx.parametrised()), -1); //TODO line number
		else if(ctx.projectstatement() != null)
			return visitProjectStatement(ctx.projectstatement());
		else if(ctx.encodestatement() != null)
			return visitEncodeStatement(ctx.encodestatement());
		else if(ctx.semantics() != null)
			return visitSemantics(ctx.semantics());
		else if(ctx.graph() != null)
			return visitGraph(ctx.graph());
		return null;
	}

	private static EnvStatement visitTerminal(MixedParser.TerminalContext ctx) {
		EnvOperation tc = null;
		int line = 0;
		String arg = null;

		if(ctx.ID() != null)
			arg = ctx.ID().getText();
		else if(ctx.INT() != null)
			arg = ctx.INT().getText();
		else if(ctx.ARG() != null)
			arg = ctx.ARG().getText();

		if(ctx.CLEAR() != null) {
			line = ctx.CLEAR().getSymbol().getLine();
			tc = EnvOperation.Clear;
		}
		else if(ctx.LAST() != null) {
			line = ctx.LAST().getSymbol().getLine();
			tc = EnvOperation.Last;
		}
		else if(ctx.QUIT() != null) {
			line = ctx.QUIT().getSymbol().getLine();
			tc = EnvOperation.Quit;
		}
		else if(ctx.EXIT() != null) {
			line = ctx.EXIT().getSymbol().getLine();
			tc = EnvOperation.Quit;
		}
		else if(ctx.USAGE() != null) {
			line = ctx.USAGE().getSymbol().getLine();
			tc = EnvOperation.Usage;
		}
		else if(ctx.HELP() != null) {
			line = ctx.HELP().getSymbol().getLine();
			tc = EnvOperation.Usage;
		}
		//else if(ctx.LIST() != null) {
		//	line = ctx.LIST().getSymbol().getLine();
		//	tc = EnvOperation.List;
		//}
		//else if(ctx.LS() != null) {
		//	line = ctx.LS().getSymbol().getLine();
		//	tc = EnvOperation.List;
		//}
		else if(ctx.HISTORY() != null) {
			line = ctx.HISTORY().getSymbol().getLine();
			tc = EnvOperation.History;
		}
		else if(ctx.VERBOSE() != null) {
			line = ctx.VERBOSE().getSymbol().getLine();
			tc = EnvOperation.Verbose;
		}
		//else if(ctx.TEMP() != null) {
		//	line = ctx.TEMP().getSymbol().getLine();
		//	tc = EnvOperation.Temp;
		//}
		//else if(ctx.TMP() != null) {
		//	line = ctx.TMP().getSymbol().getLine();
		//	tc = EnvOperation.Temp;
		//}
		else if(ctx.HS() != null) {
			line = ctx.HS().getSymbol().getLine();
			tc = EnvOperation.History;
		}
		//else if(ctx.ENV() != null) {
		//	line = ctx.ENV().getSymbol().getLine();
		//	tc = EnvOperation.Env;
		//}
		else if(ctx.EXEC() != null) {
			line = ctx.EXEC().getSymbol().getLine();
			tc = EnvOperation.Exec;
		}
		else if(ctx.RM() != null) {
			line = ctx.RM().getSymbol().getLine();
			tc = EnvOperation.Rm;
		}

		return new EnvStatement(tc, arg, line);
	}

	private static Load visitLoad(MixedParser.LoadContext ctx) {
		String module = visitDir(ctx.dir()) + visitFilename(ctx.filename());

		int line = -1;
		if(ctx.LOAD() != null)
			line = ctx.LOAD().getSymbol().getLine();
		else if (ctx.FILE() != null)
			line = ctx.FILE().getSymbol().getLine();

		return new Load(module, line);
	}

	private static PrintModule visitPrintModule(MixedParser.PrintmoduleContext ctx) {
		String id = (ctx.ID() != null) ? ctx.ID().getText() : null;

		int line = -1;
		if(ctx.MODULES() != null)
			line = ctx.MODULES().getSymbol().getLine();
		else if(ctx.MODULE() != null)
			line = ctx.MODULE().getSymbol().getLine();
		else if(ctx.LIST() != null)
			line = ctx.LIST().getSymbol().getLine();
		else if(ctx.LS() != null)
			line = ctx.LS().getSymbol().getLine();

		return new PrintModule(id, line);
	}

	private static Extract visitExtract(MixedParser.ExtractContext ctx) {
		IDExpression expr = new IDExpression(ctx.ID().getText(), ctx.ID().getSymbol().getLine());
		String module = visitDir(ctx.dir()) + visitFilename(ctx.filename());
		int line = ctx.EXTRACT().getSymbol().getLine();
		return new Extract(expr, module, line);
	}

	private static TypeCheck visitTypeCheck(MixedParser.TypecheckContext ctx) {
		int line = (ctx.CHECK() != null) ? ctx.CHECK().getSymbol().getLine() : ctx.VERIFY().getSymbol().getLine();

		List<Expression> list = new ArrayList<Expression>();

		for(MixedParser.ExpressionContext e: ctx.expression())
			list.add(visitExpression(e));

		if(list.size() == 2)
			return new TypeCheck(list.get(0), list.get(1), line);

		return new TypeCheck(list.get(0), line);
	}


	private static Store visitStore(MixedParser.StoreContext ctx) {
		int line = ctx.STORE().getSymbol().getLine();
		Expression e = visitExpression(ctx.expression());

		return new Store(e, line);
	}

//	private static AsgnStatement visitAsgnStatement(MixedParser.AsgnstatementContext ctx) {
//		int line = -1;	//TODO find a line number here
//		return new AsgnStatement(visitAssignment(ctx.assignment()), line);
//	}


	private static ProjectStatement visitProjectStatement(MixedParser.ProjectstatementContext ctx) {
		int line = -1;	//TODO find a line number here
		return new ProjectStatement(visitProject(ctx.project()), line);
	}

	private static EncodeStatement visitEncodeStatement(MixedParser.EncodestatementContext ctx) {
		int line = -1;	//TODO find a line number here
		return new EncodeStatement(visitEncode(ctx.encode()), line);
	}

	private static Semantics visitSemantics(MixedParser.SemanticsContext ctx) {
		int line = ctx.SEMANTICS().getSymbol().getLine();
		return new Semantics(visitExpression(ctx.expression()), line);
	}

	private static GraphStatement visitGraph(MixedParser.GraphContext ctx) {
		int line = ctx.GRAPH().getSymbol().getLine();
		String module = visitDir(ctx.dir()) + visitFilename(ctx.filename());
		return new GraphStatement(visitExpression(ctx.expression()), module, line);
	}

	/*******************************************
	 *  File name
	 *******************************************/

	private static String visitDir(MixedParser.DirContext ctx) {
		if(ctx == null)
			return "";

		String dir = "";
		for(MixedParser.FilenameContext file: ctx.filename())
			dir += visitFilename(file) + "/";

		return dir;
	}

	private static String visitFilename(MixedParser.FilenameContext ctx) {
		String file = "";

		if(ctx.DOT() != null)
			file = ".";
		else if(ctx.ID() != null)
			file = ctx.ID().getText();

		if(ctx.filename() != null)
			file += visitFilename(ctx.filename());

		return file;
	}

	/*******************************************
	 *  Expressions
	 *******************************************/

	private static Expression visitExpression(MixedParser.ExpressionContext ctx) {
		//if(ctx.assignment() != null)
		//	return visitAssignment(ctx.assignment());
		//else
		if(ctx.project() != null)
			return visitProject(ctx.project());
		else if(ctx.protocoldecl() != null)
			return visitProtocolDecl(ctx.protocoldecl());
		else if(ctx.encode() != null)
			return visitEncode(ctx.encode());
		else if(ctx.ID() != null)
			return new IDExpression(ctx.ID().getText(), ctx.ID().getSymbol().getLine());
		else if(ctx.expression() != null);
			return visitExpression(ctx.expression());
	}

/*	private static Assignment visitAssignment(MixedParser.AssignmentContext ctx) {
		String id = ctx.ID().getText();
		Expression expr = visitExpression(ctx.expression());
		int line = ctx.EQUAL().getSymbol().getLine();

		return new Assignment(id, expr, line);
	}
*/
	private static Project visitProject(MixedParser.ProjectContext ctx) {
		Expression expr = visitExpression(ctx.expression());

		int line = ctx.PROJECT().getSymbol().getLine();

		return new Project(expr, line);
	}

	private static Encode visitEncode(MixedParser.EncodeContext ctx) {
		Expression expr = visitExpression(ctx.expression());

		int line = ctx.ENCODE().getSymbol().getLine();

		return new Encode(expr, line);
	}

	private static ProtocolDecl visitProtocolDecl(MixedParser.ProtocoldeclContext ctx) {
		if(ctx.globalprotocol() != null)
			return visitGlobalProtocol(ctx.globalprotocol());
		else if(ctx.localcontextdecl() != null)
			return visitLocalContextDecl(ctx.localcontextdecl());
		return null;
	}

	/*******************************************
	 *  Metavariables and terminating Types
	 *******************************************/

	private static String visitRole(MixedParser.RoleContext ctx) {
		return ctx.ID().getText();
	}

	private static String visitGround(MixedParser.GroundContext ctx) {
		if(ctx.ID() != null)
			return ctx.ID().getText();
		return ctx.LABEL().getText();
	}

	private static End visitEnd(MixedParser.EndContext ctx) {
		return new End(ctx.END().getSymbol().getLine());
	}

	private static RVariable visitRVariable(MixedParser.RvariableContext ctx) {
		return new RVariable(getRVariable(ctx), ctx.ID().getSymbol().getLine());
	}

	private static String getRVariable(MixedParser.RvariableContext ctx) {
		return ctx.ID().getText();
	}

	/*******************************************
	 *  Global Protocol
	 *******************************************/
	private static ProtocolDecl visitGlobalProtocol(MixedParser.GlobalprotocolContext ctx) {

		String id = ctx.ID().getText();
		TypeDecl td = visitGlobalTypeDecl(ctx.globaltypedecl());
		int line = ctx.EQUAL().getSymbol().getLine();

		return new GlobalProtocol(id, td, line);
	}

	private static TypeDecl visitGlobalTypeDecl(MixedParser.GlobaltypedeclContext ctx) {
		return new TypeDecl(visitGlobalType(ctx.globaltype()), -1);
	}

	private static Type visitGlobalType(MixedParser.GlobaltypeContext ctx) {
		if(ctx.globalsum() != null)
			return visitGlobalSum(ctx.globalsum());
		else if(ctx.guardedglobaltype() != null)
			return visitGuardedGlobalType(ctx.guardedglobaltype());

		return null;
	}

	private static Type visitGuardedGlobalType(MixedParser.GuardedglobaltypeContext ctx) {
		if(ctx.pass() != null)
			return visitGlobalPass(ctx.pass());
		else if(ctx.grec() != null)
			return visitGRec(ctx.grec());
		else if(ctx.end() != null)
			return visitEnd(ctx.end());
		else if(ctx.globaltype() != null)
			return visitGlobalType(ctx.globaltype());

		return null;
	}

	private static Type visitGlobalContinuation(MixedParser.GlobalcontinuationContext ctx) {
		if(ctx.globaltype() != null)
			return visitGlobalType(ctx.globaltype());
		else if(ctx.rvariable() != null)
			return visitRVariable(ctx.rvariable());
		return null;
	}

	private static Sum visitGlobalSum(MixedParser.GlobalsumContext ctx) {
		List<Type> sum = new ArrayList<Type>();
		for(MixedParser.PassContext c: ctx.pass())
			sum.add(visitGlobalPass(c));

		int line = ctx.OR(0).getSymbol().getLine();

		return new Sum(sum, line);
	}

	private static Recursion visitGRec(MixedParser.GrecContext ctx) {
		String var = getRVariable(ctx.rvariable());
		Type t = visitGlobalType(ctx.globaltype());
		int line = ctx.DOT().getSymbol().getLine();
		return new Recursion(var, t, line);
	}

	private static GlobalPass visitGlobalPass(MixedParser.PassContext ctx) {
		String from = visitRole(ctx.role(0));
		String to = visitRole(ctx.role(1));
		String type = visitGround(ctx.ground());
		Type t = visitGlobalContinuation(ctx.globalcontinuation());

		int line = ctx.COLON().getSymbol().getLine();

		return new GlobalPass(from, to, type, t, line);
	}

	/*******************************************
	 *  Parametrised Protocol
	 *******************************************/

	private static Parametrised visitParametrised(MixedParser.ParametrisedContext ctx) {
		int line = ctx.IN().getSymbol().getLine();
		List<Abstraction> l = new ArrayList<Abstraction>();
		for(MixedParser.AbstractionContext pp: ctx.abstraction())
			l.add(visitAbstraction(pp));

		String id = ctx.ID().getText();
		IApplication a = visitIApplication(ctx.iapplication());
		return new Parametrised(id, a, l, line);
	}

	private static Abstraction visitAbstraction(MixedParser.AbstractionContext ctx) {
		String id = ctx.ID().getText();
		int line = ctx.EQUAL().getSymbol().getLine();
		List<Expr> parameters = new ArrayList<Expr>();
		for(MixedParser.ParameterContext p: ctx.parameter())
			parameters.add(visitParameter(p));

		ParametrisedType body = visitParametrisedType(ctx.parametrisedtype());
		return new Abstraction(id, parameters, body, line);
	}

	private static IApplication visitIApplication(MixedParser.IapplicationContext ctx) {
		int line = ctx.ID().getSymbol().getLine();
		String id = ctx.ID().getText();
		List<ValueExpr> l = new ArrayList<ValueExpr>();
		for(MixedParser.ValueContext v: ctx.value())
			l.add(visitValue(v));
		return new IApplication(id, l, line);
	}

	private static Expr visitParameter(MixedParser.ParameterContext ctx) {
		if(ctx.variable() != null)
			return visitVariable(ctx.variable());
		else if(ctx.value() != null)
			return visitValue(ctx.value());
		return null;
	}

	private static Application visitApplication(MixedParser.ApplicationContext ctx) {
		int line = ctx.ID().getSymbol().getLine();
		String id = ctx.ID().getText();
		List<Expr> l = new ArrayList<Expr>();
		for(MixedParser.SumexprContext s: ctx.sumexpr())
			l.add(visitSumExpr(s));
		return new Application(id, l, line);
	}

	private static ParametrisedType visitParametrisedType(MixedParser.ParametrisedtypeContext ctx) {
		if(ctx.pglobalsum() != null)
			return visitPGlobalSum(ctx.pglobalsum());
		else if(ctx.parametrisedpass() != null)
			return visitParametrisedPass(ctx.parametrisedpass());
		else if(ctx.END() != null)
			return new ParametrisedEnd(ctx.END().getSymbol().getLine());
		else if(ctx.parametrisedtype() != null)
			return visitParametrisedType(ctx.parametrisedtype());

		return null;
	}

	private static ParametrisedType visitPContinuation(MixedParser.PcontinuationContext ctx) {
		if(ctx.parametrisedtype() != null)
			return visitParametrisedType(ctx.parametrisedtype());
		else if(ctx.application() != null)
			return visitApplication(ctx.application());
		return null;
	}

	private static ParametrisedSum visitPGlobalSum(MixedParser.PglobalsumContext ctx) {
		List<ParametrisedPass> sum = new ArrayList<ParametrisedPass>();
		for(MixedParser.ParametrisedpassContext c: ctx.parametrisedpass())
			sum.add(visitParametrisedPass(c));

		int line = ctx.CHOICE().getSymbol().getLine();

		return new ParametrisedSum(sum, line);
	}

	private static ParametrisedPass visitParametrisedPass(MixedParser.ParametrisedpassContext ctx) {
		BoolExpr expr = null;
		if(ctx.conditional() != null)
			expr = visitConditional(ctx.conditional());

		String from = visitRole(ctx.role(0));
		String to = visitRole(ctx.role(1));
		String type = visitGround(ctx.ground());
		ParametrisedType t = visitPContinuation(ctx.pcontinuation());

		int line = ctx.COLON().getSymbol().getLine();

		return new ParametrisedPass(expr, from, to, type, t, line);
	}

	/*******************************************
	 *  Expressions
	 *******************************************/

	private static ValueExpr visitValue(MixedParser.ValueContext ctx) {
		return new ValueExpr(ctx.INT().getText(), ctx.INT().getSymbol().getLine());
	}

	private static VarExpr visitVariable(MixedParser.VariableContext ctx) {
		return new VarExpr(ctx.ID().getText(), ctx.ID().getSymbol().getLine());
	}

	private static BoolExpr visitConditional(MixedParser.ConditionalContext ctx) {
		return visitRelExpr(ctx.relexpr());
	}

	private static BoolExpr visitRelExpr(MixedParser.RelexprContext ctx) {
		if(ctx.relexpr() != null)
			return new RelExpr(visitRelExpr(ctx.relexpr()), visitRelOp(ctx.relop()), visitLogExpr(ctx.logexpr()), getLine(ctx.relop()));
		return visitLogExpr(ctx.logexpr());
	}

	private static BoolExpr visitLogExpr(MixedParser.LogexprContext ctx) {
		if(ctx.logexpr() != null)
			return new LogExpr(visitLogExpr(ctx.logexpr()), visitLogOp(ctx.logop()), visitBExpr(ctx.bexpr()), getLine(ctx.logop()));
		return visitBExpr(ctx.bexpr());
	}

	private static BoolExpr visitBExpr(MixedParser.BexprContext ctx) {
		if(ctx.sumexpr() != null)
			return new Compare(visitSumExpr(ctx.sumexpr(0)), visitCompareOp(ctx.compareop()), visitSumExpr(ctx.sumexpr(1)), getLine(ctx.compareop()));
		else if(ctx.relexpr() != null)
			return visitRelExpr(ctx.relexpr());
		else if(ctx.TRUE() != null)
			return new True(ctx.TRUE().getSymbol().getLine());
		else if(ctx.FALSE() != null)
			return new False(ctx.FALSE().getSymbol().getLine());
		return null;
	}

	private static Expr visitSumExpr(MixedParser.SumexprContext ctx) {
		if(ctx.sumexpr() != null)
			return new SumExpr(visitSumExpr(ctx.sumexpr()), visitSumOp(ctx.sumop()), visitMulExpr(ctx.mulexpr()), getLine(ctx.sumop()));
		return visitMulExpr(ctx.mulexpr());
	}

	private static Expr visitMulExpr(MixedParser.MulexprContext ctx) {
		if(ctx.mulexpr() != null)
			return new MulExpr(visitMulExpr(ctx.mulexpr()), visitMulOp(ctx.mulop()), visitExpr(ctx.expr()), getLine(ctx.mulop()));
		return visitExpr(ctx.expr());
	}

	private static Expr visitExpr(MixedParser.ExprContext ctx) {
		if(ctx.sumexpr() != null)
			return visitSumExpr(ctx.sumexpr());
		else if(ctx.value() != null)
			return visitValue(ctx.value());
		else if(ctx.variable() != null)
			return visitVariable(ctx.variable());
		return null;
	}

	private static String visitSumOp(MixedParser.SumopContext ctx) {
		if(ctx.PLUS() != null)
			return ctx.PLUS().getText();
		if(ctx.MINUS() != null)
			return ctx.MINUS().getText();
		return null;
	}

	private static int getLine(MixedParser.SumopContext ctx) {
		if(ctx.PLUS() != null)
			return ctx.PLUS().getSymbol().getLine();
		if(ctx.MINUS() != null)
			return ctx.MINUS().getSymbol().getLine();
		return -1;
	}

	private static String visitMulOp(MixedParser.MulopContext ctx) {
		if(ctx.MUL() != null)
			return ctx.DIV().getText();
		if(ctx.DIV() != null)
			return ctx.DIV().getText();
		if(ctx.MOD() != null)
			return ctx.MOD().getText();
		return null;
	}

	private static int getLine(MixedParser.MulopContext ctx) {
		if(ctx.MUL() != null)
			return ctx.DIV().getSymbol().getLine();
		if(ctx.DIV() != null)
			return ctx.DIV().getSymbol().getLine();
		if(ctx.MOD() != null)
			return ctx.MOD().getSymbol().getLine();
		return -1;
	}

	private static String visitRelOp(MixedParser.RelopContext ctx) {
		if(ctx.EQEQ() != null)
			return ctx.EQEQ().getText();
		if(ctx.NEQ() != null)
			return ctx.NEQ().getText();
		return null;
	}

	private static int getLine(MixedParser.RelopContext ctx) {
		if(ctx.EQEQ() != null)
			return ctx.EQEQ().getSymbol().getLine();
		if(ctx.NEQ() != null)
			return ctx.NEQ().getSymbol().getLine();
		return -1;
	}

	private static String visitLogOp(MixedParser.LogopContext ctx) {
		if(ctx.AND() != null)
			return ctx.AND().getText();
		if(ctx.OR() != null)
			return ctx.OR().getText();
		return null;
	}

	private static int getLine(MixedParser.LogopContext ctx) {
		if(ctx.AND() != null)
			return ctx.AND().getSymbol().getLine();
		if(ctx.OR() != null)
			return ctx.OR().getSymbol().getLine();
		return -1;
	}

	private static String visitCompareOp(MixedParser.CompareopContext ctx) {
		if(ctx.EQEQ() != null)
			return ctx.EQEQ().getText();
		if(ctx.NEQ() != null)
			return ctx.NEQ().getText();
		if(ctx.LT() != null)
			return ctx.LT().getText();
		if(ctx.LEQ() != null)
			return ctx.LEQ().getText();
		if(ctx.GT() != null)
			return ctx.GT().getText();
		if(ctx.GEQ() != null)
			return ctx.GEQ().getText();
		return null;
	}

	private static int getLine(MixedParser.CompareopContext ctx) {
		if(ctx.EQEQ() != null)
			return ctx.EQEQ().getSymbol().getLine();
		if(ctx.NEQ() != null)
			return ctx.NEQ().getSymbol().getLine();
		if(ctx.LT() != null)
			return ctx.LT().getSymbol().getLine();
		if(ctx.LEQ() != null)
			return ctx.LEQ().getSymbol().getLine();
		if(ctx.GT() != null)
			return ctx.GT().getSymbol().getLine();
		if(ctx.GEQ() != null)
			return ctx.GEQ().getSymbol().getLine();
		return -1;
	}

	/*******************************************
	 *  Local Context
	 *******************************************/

	private static LocalContext visitLocalContextDecl(MixedParser.LocalcontextdeclContext ctx) {
		String id = ctx.ID().getText();
		List<RoleDecl> rdl = visitLocalContext(ctx.localcontext());
		int line = ctx.EQUAL().getSymbol().getLine();

		return new LocalContext(id, rdl, line);
	}

	private static List<RoleDecl> visitLocalContext(MixedParser.LocalcontextContext ctx) {
		ArrayList<RoleDecl> rdl = new ArrayList<RoleDecl>();
		for(MixedParser.RoledeclContext rdc: ctx.roledecl())
			rdl.add(visitRoleDecl(rdc));

		return rdl;
	}

	private static RoleDecl visitRoleDecl(MixedParser.RoledeclContext ctx) {
		String role = visitRole(ctx.role());

		Type type = visitLocalType(ctx.localtype());

		int line = ctx.COLON().getSymbol().getLine();

		return new RoleDecl(role, type, line);
	}

	private static Type visitLocalType(MixedParser.LocaltypeContext ctx) {
		if(ctx.localsum() != null)
			return visitLocalSum(ctx.localsum());
		else if(ctx.guardedlocaltype() != null)
			return visitGuardedLocalType(ctx.guardedlocaltype());
		return null;
	}

	private static Type visitGuardedLocalType(MixedParser.GuardedlocaltypeContext ctx) {
		if(ctx.localaction() != null)
			return visitLocalAction(ctx.localaction());
		else if(ctx.recurse() != null)
			return visitRecurse(ctx.recurse());
		else if(ctx.end() != null)
			return visitEnd(ctx.end());
		else if(ctx.localtype() != null)
			return visitLocalType(ctx.localtype());
		return null;
	}

	private static Type visitLocalContinuation(MixedParser.LocalcontinuationContext ctx) {
		if(ctx.localtype() != null)
			return visitLocalType(ctx.localtype());
		else if(ctx.rvariable() != null)
			return visitRVariable(ctx.rvariable());
		return null;
	}

	private static Sum visitLocalSum(MixedParser.LocalsumContext ctx) {
		List<Type> sum = new ArrayList<Type>();
		for(MixedParser.LocalactionContext lac: ctx.localaction())
			sum.add(visitLocalAction(lac));

		int line = ctx.OR(0).getSymbol().getLine();

		return new Sum(sum, line);
	}

	private static Pass visitLocalAction(MixedParser.LocalactionContext ctx) {
		if(ctx.send() != null)
			return visitSend(ctx.send());
		else if(ctx.receive() != null)
			return visitReceive(ctx.receive());
		return null;
	}

	private static Send visitSend(MixedParser.SendContext ctx) {
		String role = visitRole(ctx.role());
		String type = visitGround(ctx.ground());
		Type t = visitLocalContinuation(ctx.localcontinuation());

		int line = ctx.SEND().getSymbol().getLine();

		return new Send(role, type, t, line);
	}

	private static Receive visitReceive(MixedParser.ReceiveContext ctx) {
		String role = visitRole(ctx.role());
		String type = visitGround(ctx.ground());
		Type t = visitLocalContinuation(ctx.localcontinuation());

		int line = ctx.RECEIVE().getSymbol().getLine();

		return new Receive(role, type, t, line);
	}

	private static Recursion visitRecurse(MixedParser.RecurseContext ctx) {
		String var = getRVariable(ctx.rvariable());
		Type t = visitLocalType(ctx.localtype());
		int line = ctx.DOT().getSymbol().getLine();
		return new Recursion(var, t, line);
	}
}
