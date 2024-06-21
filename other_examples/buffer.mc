
#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst
#
#	at the mc-mpst tool terminal run
# 2.	load buffer.mc (loads this file)
#

buffer =	choice
				inp1->b:int;
				(choice
					inp2->b:int; b->outp:int; b->outp:int; end
				or
					b->outp:int; inp2->b:int; b->outp:int; end
				)
			or
				inp2->b:int;
				(choice
					inp1->b:int; b->outp:int; b->outp:int; end
				or
					b->outp:int; inp1->b:int; b->outp:int; end
				)


