######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates the global in the Related work section of submission
# Mixed Choice Multiparty Session Types

#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load present_participants.mc (loads this file)
# 3.	project A (projects global protocol A)
# 3.	check B (checks whether global protocol A is well-behaved)
#

A =	choice
		a->b:nat; c->a:nat; end
	or
		c->a:nat; a->b:nat; end


#Uncomment below and load the file

#project A
#check A


