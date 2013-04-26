package funsets

import FunSets._

object settest {
	1 == 2                                    //> res0: Boolean(false) = false
	
	
	union(singletonSet(1), singletonSet(2))(1)//> res1: Boolean = true
	
	forall((x: Int) => 1 < x && x < 100, (x: Int) => 2 < x && x < 15)
                                                  //> res2: Boolean = false
}