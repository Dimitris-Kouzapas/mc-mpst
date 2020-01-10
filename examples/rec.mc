######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Example 40 of submission
# Mixed Choice Multiparty Session Types

#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load rec.mc (loads this file)
# 3.	project Rec1 (projects protocol Rec1)
# 4.	project Rec2 (projects protocol Rec2)
# 5.	semantics Rec1 (prints the semantic state space of global protocol Rec1)
# 6.	semantics Rec2 (prints the semantic state space of global protocol Rec2)
# 7.	check Rec1 (checks if Rec1 is well-behaved)
# 8.	check Rec2 (checks if Rec2 is well-behaved)
# 9.	check Rec1 == Rec2 (checks if Rec1 and Rec2 are well-behaved equivalent)
#

Rec1 =	loop.
		a->b:nat; a->c:nat; d->e:nat; loop

Rec2 =	loop.
		choice
			a->b:nat; a->c:nat; loop
		or
			d->e:nat; loop





#Uncomment below and load the file

#project Rec1
#project Rec2
#semantics Rec1
#semantics Rec2
#check Rec1
#check Rec2
#check Rec1 == Rec2

