

######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Example 42 of submission
# Mixed Choice Multiparty Session Types

#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load producer_consumer.mc (loads this file)
# 3.	project G (projects protocol G)
# 4.	semantics G (prints the semantic state space of global protocol G)
# 5.	check G (checks if G is well-behaved)
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


#Uncomment below and load the file

#project G
#semantics G
#check G



