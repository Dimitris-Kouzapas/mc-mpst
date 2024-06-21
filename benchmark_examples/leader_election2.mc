 leader_election2 = (
 	choice
 		a->b:@leader; (
 			choice
 				c->d:@leader; (
 					choice
 						a->c:@leader; a->station:@elect; end
 					or
 						c->a:@leader; c->station:@elect; end
 				)
 			or
 				d->c:@leader; (
 					choice
 						a->d:@leader; a->station:@elect; end
 					or
 						d->a:@leader; d->station:@elect; end
 				)
 		)
 	or
 		b->a:@leader; (
 			choice
 				c->d:@leader; (
 					choice
 						b->c:@leader; b->station:@elect; end
 					or
 						c->b:@leader; c->station:@elect; end
 				)
 			or
 				d->c:@leader; (
 					choice
 						b->d:@leader; b->station:@elect; end
 					or
 						d->b:@leader; d->station:@elect; end
 				)
 		)
 )
