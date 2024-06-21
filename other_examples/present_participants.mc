
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load present_participants.mc (loads this file)
# 3.	check A == S (checks whether global protocol A is well-behaved with respect to role set S)
# 4.	project B (checks whether protocol B can be projected)
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




