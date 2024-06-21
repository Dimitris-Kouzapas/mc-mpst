Usage:
		usage
	or	help
			(details the user manual)
		<id> = <global>
			stores global type <global> with identifier <id>
		<id> = <local_context>
			stores local context <local_context> as identifier <id> 
		project <name>
			projects protocol <type_id>
		store project <name>
			projects protocol <type_id> and then stores the resulting local context
		graph <type_id> <file>
			creates an mclr2 representation of protocol <type_id> and stores it in file <file>.mcrl2
		load <file>
	or	file <file>
			loads and executes the mc-mpst commands from file <file>
		extract <type_id> <file>
			extracts protocol <type_id> in file <file>
		list [type_id]
	or	ls [type_id]
			lists the loaded contexts
		rm <type_id>
			removes protocol with identifier <type_id>
		clear
			clears the screen
		verbose
			sets/unsets the verbose mode
		quit
	or	exit
			terminates the terminal mode

where
	<type_id>
	[type_id]	(optional)
		the identifier of a defined protocol

	<file>
		a file with suffix ".mc" that contains commands to be executed

	<num>
	[num]	(optional)
		an optional integer number

	<global>
		global	:=	choice global_prefix [or global_prefix]+  
				 |	rec_label. global
				 |	rec_label
				 |	end

		global_prefix
				:=	p->q: U; global
				 |	p->q: @l; global
	<local context>
		is a local context syntax defined as
		local_context
				:=	{ [a: <local>] [, a:<local>]* }

	<local>
		local	:=	p!U; local | p?U; local
				 |	p!@l; local | p?@l: local
				 |	choice local_prefix [or local_prefix]+
				 |	rec_label. local
				 |	rec_label
				 |	end
				 
		local_prefix
				:=	p!U; local | p?U; local
				 |	p!@l; local | p?@l: local

		where	 p, q are participants
				 U is a ground type
				 l is a choice label
				 rec_label is a recursion label

