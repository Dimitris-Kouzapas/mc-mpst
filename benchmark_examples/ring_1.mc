ring_1 = (
 	choice
 		a->b:@l1; b->c:@l2; c->a:@l3; end
 	or
 		b->c:@l2; c->a:@l3; a->b:@l1; end
 	or
 		c->a:@l3; a->b:@l1; b->c:@l2; end
)
