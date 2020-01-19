


######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Usecase in Section 5.2 of submission
# Mixed Choice Multiparty Session Types

#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load HSFController.mc (loads this file)
# 3.	ls Controller (prints the unfolded Controller protocol)
# 4.	semantics Controller (prints the semantic state space of global protocol Controller)
# 5.	check Controller (checks if global protocol Controller is well-behaved)
#

let
	Controller maxP pElem maxR rElem =
		choice
			if(pElem < maxP)
				input1->processing:packet; Controller maxP (pElem+1) maxR rElem
		or
			if(pElem < maxP)
				input2->processing:packet; Controller maxP (pElem+1) maxR rElem
		or
			if(pElem > 0 and rElem < maxR)
				processing->routing:packet; Controller maxP (pElem-1) maxR (rElem+1)
		or
			if(rElem > 0)
				routing->output1: packet; Controller maxP pElem maxR (rElem-1)
		or
			if(rElem > 0)
				routing->output2 : packet; Controller maxP pElem maxR (rElem-1)
in
	Controller = Controller 1 0 1 0



#Uncomment below and load the file

#ls Controller
#semantics Controller
#check Controller


