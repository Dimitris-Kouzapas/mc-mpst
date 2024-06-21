#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst
#
#	at the mc-mpst tool terminal run
# 2.	load simple_leader_election.mc (loads this file)
# 4.	semantics simple_deterministic (prints the semantic state space of the independent global protocol)
#

simple_deterministic =	choice
							p->q:U; p->r:@l1; end
						or
							p->q:U; r->p:@l2; end


