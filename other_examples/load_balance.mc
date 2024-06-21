
# Example execution steps
#
#	at the terminal run
# 1.	java -jar mc-mpst
#
#	at the mc-mpst tool terminal run
# 2.	load load_balance.mc (loads this file)
#

load_balance =  init.   c->s : @w; (
                            choice
                                s->w1: @w; w1->c: @r; init
                            or
                                s->w2: @w; w2->c: @r; init
                            or
                                s->w3: @w; w3->c: @r; init
                            or
                                s->w4: @w; w4->c: @r; init
                            or
                                s->w5: @w; w5->c: @r; init
                            or
                                s->w6: @w; w6->c: @r; init
                            or
                                s->w7: @w; w7->c: @r; init
                            or
                                s->w8: @w; w8->c: @r; init
                            or
                                s->w9: @w; w9->c: @r; init
                            or
                                s->w10: @w; w10->c: @r; init
                        )

