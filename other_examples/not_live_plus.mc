#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst
#
#	at the mc-mpst tool terminal run
# 2.	load not_live_plus.mc (loads this file)
#

not_live_plus =	loop.	choice
							p->q:@l1; loop
						or
							p->q:@l2;
							p->r:U;end

