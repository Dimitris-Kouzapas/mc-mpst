 group_present = f1->s:@title; s->f1:@quote; (
 	choice
 		f1->f2:@halfquote; (
 			choice
 				f2->f1:@halfquote; f1->f3:@done; f1->s:@address; s->f1:@date; end
 			or
 				f2->f3:@thirdquote; (
 					choice
 						f3->f2:@thirdquote; f2->f1:@twothirdquote; f1->s:@address; s->f1:@date; end
 					or
 						f3->f2:@no; (
 							choice
 								f2->f1:@askedbuthalfquote; f1->s:@address; s->f1:@date; end
 							or
 								f2->f1:@bothno; f1->s:@cancel; end
 						)
 				)
 			or
 				f2->f1:@no; f1->f3:@halfquote; (
 					choice
 						f3->f1:@halfquote; f1->f2:@done; f1->s:@address; s->f1:@date; end
 					or
 						f3->f1:@no; f1->f2:@done; f1->s:@cancel; end
 				)
 		)
 	or
 		f1->f3:@halfquote; (
 			choice
 				f3->f1:@halfquote; f1->f2:@done; f1->s:@address; s->f1:@date; end
 			or
 				f3->f1:@no; f1->f2:@done; f1->s:@cancel; end
 		)
 )
