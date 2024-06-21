Usage:
		usage
		help
			(details the user manual)
		<name> = <global>
			stores global type <global> as name <name>
		<name> = <local_context>
			stores local context <local_context> as name <name> 
		check <name>
	or	verify <name>
			verifies that protocol <name> is bisimilar with its projection
		check <name> == <name>
	or	verify <name> == <name>
			verifies that the two protocols are bisimilar
		project <name>
			projects protocol <name>
		store project <name>
			projects protocol <name> and then stores the resulting local context
		semantics <name>
			provides a syntactic representation of the execution of protocol <name>
		graph <name>
			creates an mclr2 representation of protocol <name> and stores it in file <name>.mcrl2
		load <file>
	or	file <file>
			loads and executes the mc-mpst commands from file <file>
		extract <file>
			extracts the loaded protocols in file <file>
		list [name]
	or	ls [name]
			lists the loaded contexts
		rm <name>
			removes protocol with name <name>
		history [num]
	or	hs [num]
			lists the successfully executed command history
		clear
			clears the screen
		verbose
			sets/unsets the verbose mode
		exec <num>
			executes command <num> from the history
		exec
	or	last
			executes the last successfully executed command
		quit
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
		help [command]
