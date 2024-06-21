#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load queue.mc (loads this file)
# 3.	project queue (projects the queue global protocol)
# 4.	check queue (checks the queue global protocol for well-behavedness against its projection)
#

queue =	
	p->buffer:nat;
		choice
			p->buffer:bool; buffer->q:nat; buffer->q:bool; end
		or
			buffer->q:nat; p->buffer:bool; buffer->q:bool; end



