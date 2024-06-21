
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load interrupt.mc (loads this file)
# 3.	project interrupt (projects the interrupt global file below)
# 4.	check interrupt (checks the interrupt global type for well-behavedness against its projection)
#

interrupt =	loop.
			choice
				p->q:data; loop
			or
				q->p:data; loop




