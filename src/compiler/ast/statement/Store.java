package compiler.ast.statement;

import runtime.Program;
import runtime.Stream;

import compiler.ast.expression.ProtocolDecl;
import compiler.ast.expression.Expression;


public class Store extends Statement {
	private final Expression expr;

    public Store(Expression expr, int line) {
        super(line);
        this.expr = expr;
    }

    public void prettyPrint(Stream stream) {
		stream.print("store ");
		expr.prettyPrint(stream);
	}

    protected void semanticCheck() {
        expr.semanticCheck(this);
    }


    public boolean execute(Program p) {
		expr.set(p);

		if(checkForErrors() == true)
			return false;

        ProtocolDecl pdecl = (ProtocolDecl) expr.execute(p);

        p.verbose("Storing protocol module " + pdecl.id());

        p.put(pdecl.id(), pdecl);

		return true;
	}




}
