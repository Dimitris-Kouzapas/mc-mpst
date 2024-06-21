#
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst
#
#	at the mc-mpst tool terminal run
# 2.	load hypersurface.mc (loads this file)
#

hypersurface = init.	choice
							n00 -> n10: @dst; init
						or
							n00 -> n10: @fw; (
								choice
									n10 -> n11: @dst; init
								or
									n10 -> n11: @fw; n11 -> n01: @dst; init
							)
						or
							n00 -> n01: @dst; init
						or
							n00 -> n01: @fw; (
								choice
									n01 -> n11: @dst; init
								or
									n01 -> n11: @fw; n11 -> n10: @dst; init
							)


