 ring_2 = (
 	choice
 		a->b:@l1; (
 			choice
 				c->a:@l3; b->c:@l2; end
 			or
 				b->c:@l2; c->a:@l3; end
 		)
 	or
 		b->c:@l2; (
 			choice
 				a->b:@l1; c->a:@l3; end
 			or
 				c->a:@l3; a->b:@l1; end
 		)
 	or
 		c->a:@l3; (
 			choice
 				a->b:@l1; b->c:@l2; end
 			or
 				b->c:@l2; a->b:@l1; end
 		)
 )
