######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Example 2 of submission
# Mixed Choice Multiparty Session Types

#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load queue.mc (loads this file)
# 3.	project queue (projects the queue global protocol)
# 4.	semantics queue (prints the semantic state space of the queue global protocol)
# 5.	check queue (checks the queue global protocol for well-behavedness against its projection)
#

queue =	p->buffer:nat;
	choice
		p->buffer:bool; buffer->q:nat; buffer->q:bool; end
	or
		buffer->q:nat; p->buffer:bool; buffer->q:bool; end


#Uncomment below and load the file

#project queue
#semantics queue
#check queue
