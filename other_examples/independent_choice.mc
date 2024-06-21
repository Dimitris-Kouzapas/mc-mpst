#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load choice_semantics.mc (loads this file)
#

independent_choice
			=	choice
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



