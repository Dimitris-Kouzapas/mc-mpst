grammar Mixed;

@header {
package compiler.parser;
}

/*
 *	[Parser]
 */

module		:	command* EOF
		;

command		:	statement SEMICOLON?
		;

statement	:	terminal
		|	load
		|	printmodule
		|	extract
		|	typecheck
		|	protocoldecl
		|	parametrised
		|	projectstatement
		|	semantics
		|	graph
		;

projectstatement:	project
		;

semantics	:	SEMANTICS expression
		;

graph		:	GRAPH expression
		;

expression	:	project
		|	protocoldecl
		|	ID
		|	LPAR expression RPAR
		;

/*****************************
 * [parser] statement
 *****************************/

terminal	:	CLEAR
		|	QUIT		|	EXIT
		|	LAST
		|	USAGE ARG?	|	HELP ARG?
//		|	LIST ID?	|	LS ID?
		|	HISTORY INT?	|	HS INT?
		|	VERBOSE ID?
//		|	TEMP ID?	|	TMP ID?
//		|	ENV ID?
		|	EXEC INT?
		|	RM ID
		;

printmodule	:	MODULES		|	MODULE ID
		|	LIST ID?	|	LS ID?
		;

load		:	LOAD dir? filename
		|	FILE dir? filename
		;

extract		:	EXTRACT dir? filename
		;

typecheck	:	CHECK expression
		|	CHECK expression EQEQ expression
		|	VERIFY expression
		|	VERIFY expression EQEQ expression
		;

/************************************
 * [parser] expression
 ************************************/

//assignment	:	ID EQUAL expression
//		;

protocoldecl	:	globalprotocol
		|	localcontextdecl
		;

project		:	PROJECT expression
		;

/*****************************
 * [parser] file name
 *****************************/
//TODO fix the file name recognition

dir		:	(filename DIV)+
		;

filename	:	DOT
		|	ID
		|	DOT filename
		|	ID filename
		;

/*****************************
 * [parser] metavariables
 *****************************/

role		:	ID
		;

ground		:	ID
		|	LABEL
		;

/*****************************
 * [parser] terminating types
 *****************************/

rvariable	:	ID
		;

end		:	END
		;

/*****************************
 * [parser] global types
 *****************************/

globalprotocol	:	ID EQUAL globaltypedecl
		;

globaltypedecl	:	globaltype
		;

globaltype
		:	globalsum
		|	guardedglobaltype
		;

guardedglobaltype
		:	pass
		|	grec
		|	end
		|	LPAR globaltype RPAR
		;

globalcontinuation
		:	globaltype //guardedglobaltype
		|	rvariable
		;

globalsum	:	CHOICE pass OR pass (OR pass)*
		;

pass		:	role TO role COLON ground SEMICOLON globalcontinuation
		;

grec		:	/*MU*/ rvariable DOT globaltype
		;

/*****************************
 * [parser] parametrised global types
 *****************************/

parametrised	:	LET abstraction (COMMA abstraction)* IN ID EQUAL iapplication
		;

abstraction	:	ID parameter* EQUAL parametrisedtype
		;

parameter	:	variable
		|	value
		;

parametrisedtype
		:	pglobalsum
		|	parametrisedpass
		|	END
		|	LPAR parametrisedtype RPAR
		;

pcontinuation	:	parametrisedtype
		|	application
		;

pglobalsum	:	CHOICE parametrisedpass OR parametrisedpass (OR parametrisedpass)*
		;

parametrisedpass:	conditional?
			role TO role COLON ground SEMICOLON pcontinuation
		;

application	:	ID sumexpr*
		;

iapplication	:	ID value*
		;

conditional	:	IF LPAR relexpr RPAR
		;

/*****************************
 * [parser] expressions
 *****************************/

sumexpr		:	sumexpr sumop mulexpr
		|	mulexpr
		;

mulexpr		:	mulexpr mulop expr
		|	expr
		;

expr		:	LPAR sumexpr RPAR
		|	value
		|	variable
		;

value		:	INT
		;

variable	:	ID
		;

relexpr		:	relexpr relop logexpr
		|	logexpr
		;

logexpr		:	logexpr logop bexpr
		|	bexpr
		;

bexpr		:	sumexpr compareop sumexpr
		|	LPAR relexpr RPAR
		|	TRUE
		|	FALSE
		;

sumop		:	PLUS
		|	MINUS
		;

mulop		:	MUL
		|	DIV
		|	MOD
		;

relop		:	EQEQ
		|	NEQ
		;

logop		:	AND
		|	OR
		;

compareop	:	EQEQ
		|	NEQ
		|	LEQ
		|	LT
		|	GEQ
		|	GT
		;


/*****************************
 * [parser] Local types
 *****************************/

localcontextdecl
		:	ID EQUAL localcontext
		;

localcontext	:	LBRA roledecl (COMMA roledecl)* RBRA
		;

roledecl	:	role COLON localtype
		;

localtype	:
		|	localsum
		|	guardedlocaltype
		;

guardedlocaltype:	localaction
		|	recurse
		|	end
		|	LPAR localtype RPAR
		;

localcontinuation
		:	localtype //guardedlocaltype
		|	rvariable
		;

localsum	:	CHOICE localaction OR localaction (OR localaction)*
		;

localaction	:	send
		|	receive
		;

send		:	role SEND ground SEMICOLON localcontinuation
		;

receive		:	role RECEIVE ground SEMICOLON localcontinuation
		;

recurse		:	/*MU*/ rvariable DOT localtype
		;

/*************************
 * Lexer
 *************************/

LOAD		:	'load';
FILE		:	'file';

MODULE		:	'module';
MODULES		:	'modules';

//LOCAL		:	'local';
//GLOBAL	:	'global';

PROJECT		:	'project';
CHECK		:	'check';
VERIFY		:	'verify';

SEMANTICS	:	'semantics';
GRAPH		:	'graph';


USAGE		:	'usage';
HELP		:	'help';
VERBOSE		:	'verbose';
TEMP		:	'temp';
TMP		:	'tmp';
LIST		:	'list';
LS		:	'ls';
CLEAR		:	'clear';
HISTORY		:	'history';
HS		:	'hs';
ENV		:	'env';
EXEC		:	'exec';
LAST		:	'last';
RM		:	'rm';
EXTRACT		:	'extract';
QUIT		:	'quit';
EXIT		:	'exit';

END		:	'end';

//MU		:	'μ';

SEND		:	'!';
RECEIVE		:	'?';

CHOICE		:	'choice';
OR		:	'or';
//OR		:	'+';

IF		:	'if';
LET		:	'let';
IN		:	'in';
TRUE		:	'true';
FALSE		:	'false';

PLUS		:	'+';
MINUS		:	'-';
MUL		:	'*';
DIV		:	'/';
MOD		:	'%';

NEQ		:	'!=';
LT		:	'<';
LEQ		:	'<=';
GT		:	'>';
GEQ		:	'>=';

AND		:	'and';
//LOR		:	'||';

LBRA		:	'{';
RBRA		:	'}';
LPAR		:	'(';
RPAR		:	')';
COMMA		:	',';
COLON		:	':';
SEMICOLON	:	';';
//SLASH		:	'/';

EQEQ		:	'==';
EQUAL		:	'=';

DOT		:	'.';

TO		:	'->';

LABEL		:	[@][a-zA-Z_][a-zA-Z0-9_]*;
ID		:	[a-zA-Z_][a-zA-Z0-9_]*;
INT		:	[0-9]+;

ARG		:	[-][a-zA-Z_][a-zA-Z0-9_]*;

WHITESPACE	:	(' ' | '\t' | '\r'| '\n') -> skip;

COMMENT		:	'#'~'\n'* -> skip;
