package compiler.ast.statement;

public enum EnvOperation {
	Usage("usage"),
	Verbose("verbose"),
	//Temp("temp"),
	//List("list"),
	Clear("clear"),
	History("history"),
	//Env("env"),
	Exec("exec"),
	Last("last"),
	Rm("rm"),
	Quit("quit");

	private final String operation;

	EnvOperation(String operation) {
		this.operation = operation;
	}

	final String op() {
		return operation;
	}
}
