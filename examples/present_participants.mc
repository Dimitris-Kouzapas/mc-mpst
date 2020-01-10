######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Example 12 of submission
# Mixed Choice Multiparty Session Types

#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load present_participants.mc (loads this file)
# 3.	check A == S (checks whether global protocol A is well-behaved with respect to role set S)
# 4.	project B (projects protocol B)
# 5.	check B == project B (checks global protocol B against its projection)
#

A =	loop. p->q:nat; loop

S = {
	p: loop. q!nat; loop,
	q: loop. p?nat; loop,
	r: loop. p!nat; end	
}

B =	choice
		p->q:nat; end
	or
		p->r:nat; end



#Uncomment below and load the file

#check A == S
#project B
#check B == project B

