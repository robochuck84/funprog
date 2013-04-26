package funsets

import FunSets._

object settest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); val res$0 = 
	1 == 2;System.out.println("""res0: Boolean(false) = """ + $show(res$0));$skip(48); val res$1 = 
	
	
	union(singletonSet(1), singletonSet(2))(1);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(69); val res$2 = 
	
	forall((x: Int) => 1 < x && x < 100, (x: Int) => 2 < x && x < 15);System.out.println("""res2: Boolean = """ + $show(res$2))}
}
