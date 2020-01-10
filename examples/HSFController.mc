


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
# 3.	semantics Controller (prints the semantic state space of global protocol Controller)
# 4.	semantics PController (prints the semantic state space of role set PController)
# 7.	check Controller == PController (checks if global protocol Controller is well-behaved against role set PController)
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


PController = {
	input2: 	loop. processing!packet; loop,
	input1:		loop. processing!packet; loop,

	processing:	loop.
				choice
					input1?packet; routing!packet ; loop
				or
					input2?packet; routing!packet; loop,

	routing:	loop.
				processing?packet;
				choice
					output1!packet; loop
				or
					output2!packet ; loop,

	output1: loop. routing?packet; loop,
	output2: loop. routing?packet; loop
}


#Uncomment below and load the file

#semantics Controller
#semantics PController
#check Controller == PController


