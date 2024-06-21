
#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load elect.mc (loads this file)
# 3.	check elect (checks the elect global protocol for well-behavedness against its projection)
#

elect =	choice
		node1->node2:leader; node1->node3:leader; node1->envr:elect; end
	or
		node2->node1:leader; node2->node3:leader; node2->envr:elect; end
	or
		node3->node1:leader; node3->node2:leader; node3->envr:elect; end



