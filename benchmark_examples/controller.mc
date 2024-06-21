controller = (
	choice
		inp1->b:int; (
			choice
				inp2->b:int; b->out1:int; b->out2:int; end
			or
				b->out1:int; inp2->b:int; b->out2:int; end
		)
	or
		inp2->b:int; (
			choice
				inp1->b:int; b->out1:int; b->out2:int; end
			or
				b->out1:int; inp1->b:int; b->out2:int; end
		)
)
