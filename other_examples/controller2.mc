
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst (run the mc-mpst tool)
#
#	at the mc-mpst tool terminal run
# 2.	load controller2.mc (loads this file)
# 3.	ls Controller (prints the unfolded Controller protocol)
# 4.	check Controller (checks if global protocol Controller is well-behaved)
#

controller = 	choice 
					inp1->b:int ; (
						choice 
							inp2->b:int ; b->out1:int ; b->out2:int ; end
						or 
							b->out1:int ; inp2->b:int ; b->out2:int ; end
					)
				or 
					inp2->b:int ; (
						choice 
							inp1->b:int ; b->out1:int ; b->out2:int ; end
						or 
							b->out1:int ; inp1->b:int ; b->out2:int ; end 
					)



