leader_election = (
	choice
		na->nb:@leader; (
			choice
				nc->nd:@leader; end
			or
				nd->nc:@leader; end
		)
	or
		nb->na:@leader; (
			choice
				nc->nd:@leader; end
			or
				nd->nc:@leader; end
		)
)
