######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Example 1 of submission
# Mixed Choice Multiparty Session Types


#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load interrupt.mc (loads this file)
# 3.	project interrupt (projects the interrupt global file below)
# 4.	semantics interrupt (prints the semantic state space of the interrupt protocol)
# 5.	check interrupt (checks the interrupt global type for well-behavedness against its projection)
#

interrupt =	loop.
			choice
				p->q:data; loop
			or
				q->p:data; loop


#Uncomment below and load the file

#project interrupt
#semantics interrupt
#check interrupt


