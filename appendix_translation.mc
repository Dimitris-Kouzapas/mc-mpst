

G1 = 	a->b:@l; c->d:@l; end
G2 =	a->c:@l; a->b:@l; c->d:@l; end
G3 = 	a->c:@l; a->b:@l; e->f:@l; c->d:@l; end
G4 = 	loop. a->b:@l; c->d:@l; loop
G5 = 	loop. a->c:@l; a->b:@l; c->d:@l; loop
G6 = 	loop. a->c:@l; a->b:@l; e->f:@l; c->d:@l; loop
G7 = 	a->c:@l; a->b:@l; c->d:@l; loop. e->f:@l; loop
G8 = 	a->c:@l; loop. a->b:@l; c->d:@l; loop
G9 =	choice
			a->b:@l1;
				choice
					c->d:@l1; end
				or
					c->d:@l2; end
		or
			a->b:@l2;
				choice
					c->d:@l1; end
				or
					c->d:@l2; end
G10 =	choice
			a->b:@l1; c->d:@l1; end
		or
			b->a:@l2; d->c:@l2; end

G11 =	loop.
			choice
				a->b:@l1; c->d:@l; loop
			or
				a->b:@l2; c->d:@l; loop


G12 =	loop.
			choice
				a->b:@l1; c->d:@l1; loop
			or
				a->b:@l2; c->d:@l2; end 

G13 =	loop.
			choice
				a->b:@l1; c->d:@l; loop
			or
				a->b:@l2; c->d:@l; end 


G14 =	loop1. a->c:@l;
			loop2. a->b:@l; c->d:@l; loop2

G15 =	loop1.
			a->c:@l; loop2.
				choice
					a->b:@l; c->d:@l; loop1
				or
					a->b:@l; c->d:@l; loop2

G16 =	loop1. a->c:@l;
			loop2. a->b:@l; c->d:@l; loop1


G17 =	loop1.
			a->b:@l; loop2.
				choice
					c->d:@l1; loop1
				or
					c->d:@l2; loop2

G18 = 	choice
			a->b:@l; c->d:@l1; end
		or
			a->b:@l; c->d:@l2; end

G19 =	loop.
			choice
				a->b:@l; c->d:@l; loop
			or
				a->b:@l; c->d:@l; loop

G20 =	loop.
			choice
				a->b:@l; c->d:@l; loop
			or
				a->c:@l; b->d:@l; loop

G21 =	loop.
			choice
				a->b:@l1; c->d:@l2; e->f:@l3; loop
			or
				e->f:@l3; a->b:@l0; c->d:@l2; loop


G22 =	loop.
			choice
				a->b:@l1; b->c:@l1; c->d:@l1; loop
			or
				a->c:@l2; b->d:@l2; loop

G23 =	loop.
			choice
				c->d:@l1; a->b:@l1; loop
			or
				a->d:@l1; b->c:@l1; loop


G24 =	loop.
			choice
				a->b:@l; c->d:@l; e->f:@l; loop
			or
				a->c:@l; b->d:@l; e->f:@l; loop

G25 =	loop.
			choice
				a->b:@l; c->d:@l; e->f:@l; loop
			or
				b->a:@l; d->c:@l; f->e:@l; loop


G26 =	loop.
			choice
				a->b:@l; c->d:@l; e->f:@l; loop
			or
				a->b:@l; c->d:@l; e->f:@l; loop
				







































