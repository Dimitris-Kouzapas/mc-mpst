######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Example 41 of submission
# Mixed Choice Multiparty Session Types

#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load parametric.mc (loads this file)
# 3.	ls A (prints the unfolded protocol G)
# 4.	project A (projects protocol A)
# 5.	check A (checks global protocol A for well-behavedness)
#

let
	P 0 = end,
	P x =	choice
			if(x%2 == 0) a->b:nat; P x-1
		or
			if(x%2 == 1) a->c:nat; P x-1
in
	A = P 6

#Uncomment below and load the file

#ls A
#project A
#check A


