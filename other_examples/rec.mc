#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load rec.mc (loads this file)
# 3.	project Rec1 (projects protocol Rec1)
# 4.	project Rec2 (checks if Rec2 can be projected)
# 5.	check Rec1 (checks if Rec1 is well-behaved)
# 6.	check Rec1 == Rec2 (checks if Rec1 and Rec2 are well-behaved equivalent)
#

Rec1 =	loop.
		a->b:nat; a->c:nat; d->e:nat; loop

Rec2 =	loop.
		choice
			a->b:nat; a->c:nat; loop
		or
			d->e:nat; loop


