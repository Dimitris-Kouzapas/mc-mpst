
#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load producer_consumer.mc (loads this file)
# 3.	project G (projects protocol G)
# 4.	check G (checks if G is well-behaved)
#

G =	choice
		prod1->buffer: nat; (
			choice
				prod2->buffer:nat; buffer->cons:nat; buffer->cons:nat; end
			or
				buffer->cons:nat; prod2->buffer:nat; buffer->cons:nat; end
		)
	or
		prod2->buffer: nat; (
			choice
				prod1->buffer:nat; buffer->cons:nat; buffer->cons:nat; end
			or
				buffer->cons:nat; prod1->buffer:nat; buffer->cons:nat; end
		)




