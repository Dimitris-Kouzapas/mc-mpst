######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Example 5 of submission
# Mixed Choice Multiparty Session Types


#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load selection.mc (loads this file)
# 3.	project selection (projects the selection global file below)
# 4.	semantics selection (prints the semantic state space of the selection protocol)
# 5.	check selection (checks the selection global type for well-behavedness against its projection)
#

selection =	choice
			p->q:@l1; end
		or
			q->p:@l2; end


#Uncomment below and load the file

#project selection
#semantics selection
#check selection


