 auth2 = (
 	choice
 		s->c:@login; c->a:@passwd; a->s:@auth; end
 	or
 		s->c:@cancel; c->a:@quit; end
 )

