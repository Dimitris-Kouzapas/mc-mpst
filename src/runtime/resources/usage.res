Usage:
		usage
	or	help
			(details the user manual)
	or	check <name>
	or	verify <name>
			verifies protocol <name>
	or	check <name> == <name>
	or	verify <name> == <name>
			verifies the equality between the two protocols
	or	project <name>
			projects protocol <name>
	or	semantics <name>
			provides a syntactic representation of the execution of protocol <name>
	or	graph <name>
			provides a graph representation of the state machine of protocol <name>
	or	load <file>
	or	file <file>
			loads and executes the file <file>
	or	extract <file>
			extracts the loaded protocols in file <file>
	or	list [name]
	or	ls [name]
			lists the loaded contexts
	or	rm <name>
			removes protocol with name <name>
	or	history [num]
	or	hs [num]
			lists the successfully executed command history
	or	clear
			clears the screen
	or	verbose
			sets/unsets the verbose mode
	or	exec <num>
			executes command <num> from the history
	or	exec
	or	last
			executes the last successfully executed command
	or	quit
	or	exit
			terminates the terminal mode

where
	<name>
	[name]	(optional)
		a name of a defined protocol

	<file>
		a file with suffix .ctx that contains commands to be executed

	<num>
	[num]	(optional)
		an optional integer number

for more details type
		usage [command]
	or	help [command]
