######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Example 26 of submission
# Mixed Choice Multiparty Session Types

#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load error_process.mc (loads this file)
# 3.	semantics G  (prints the semantic state space of the global protocol G)
# 4.	semantics S  (prints the semantic state space of the role set S)
# 5.	check G == S (checks if A is well-behaved wrt S)
#


S = {
	p:	choice
			q!nat; end
		or
			q!bool; end,
	q: 	choice
			p?nat; end
		or
			p?bool; end
}

G =	choice
		p->q:nat; end
	or
		q->p:bool; end



#Uncomment below and load the file

#semantics G
#semantics S
#check G == S

