#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst
#
#	at the mc-mpst tool terminal run
# 2.	load hypersurface.mc (loads this file)
#

projection_hypersruface = {
n00: 	init.	choice
					n10!@dst; init
				or
					n10!@fw; init
				or
					n01!@dst; init
				or
					n01!@fw; init,

n10:	init.	choice
					n00?@dst; init
				or
					n00?@fw; (
						choice
							n11!@dst; init
						or
							n11!@fw; init
					)
				or
					n11?@dst; init,

n01:	init.	choice
					n00?@dst; init
				or
					n00?@fw; (
						choice
							n11!@dst; init
						or
							n11!@fw; init
					)
				or
					n11?@dst; init,

n11:	init.	choice
					n10?@dst; init
				or
					n01?@dst; init
				or
					n10?@fw; n01!@dst; init
				or
					n01?@fw; n10!@dst; init
}


