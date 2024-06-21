# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load error_process.mc (loads this file)
# 3.	check G == S (checks if A is well-behaved wrt S)
#


S = {
	p:	choice
			q!nat; end
		or
			q?bool; end,
	q: 	choice
			p?nat; end
		or
			p!bool; end
}

G =
	choice
		p->q:nat; end
	or
		q->p:bool; end




