######################################################
#
#	Mixed Choice Multiparty Session Types
#
######################################################

# The following demonstrates Example 7 of submission
# Mixed Choice Multiparty Session Types

#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load choice_semantics.mc (loads this file)
# 4.	semantics independent (prints the semantic state space of the independent global protocol)
#

independent =	choice
			a->b:U; (
				choice
					c->d:U; end
				or
					d->c:U; end
			)
		or
			b->a:U; (
				choice
					c->d:U; end
				or
					d->c:U; end
			)


#Uncomment below and load the file

#semantics independent
