ring_3 = (
	choice
		a->b:@l1; b->c:@l1; c->a:@l1; end
	or
		b->c:@l2; c->a:@l2; a->b:@l2; end
	or
		c->a:@l3; a->b:@l3; b->c:@l3; end
)
