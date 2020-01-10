package compiler;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;

import compiler.parser.MixedLexer;
import compiler.parser.MixedParser;
import compiler.ast.ASTVisitor;

public class Compiler implements CompilerInterface {

	public List<StatementInterface> compile(CharStream in, String file) {
		MixedLexer lexer = new MixedLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MixedParser parser = new MixedParser(tokens);

		MixedParser.ModuleContext moduleCtx = parser.module();

		if(parser.getNumberOfSyntaxErrors() > 0)
			return new ArrayList<StatementInterface>();

		return ASTVisitor.visitModule(moduleCtx, file);
	}

	//public List<StatementInterface> compileString(String line) {
	//	CharStream in = CharStreams.fromString(line);
	//	return compile(in, null);
	//}
}
