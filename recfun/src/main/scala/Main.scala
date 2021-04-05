import recfun.RecFun._

object Main extends App {
 println(pascal(0, 2))
 println(pascal(1, 2))
 println(pascal(1, 3))
 println(pascal(2, 3))

 val string1="(if (zero? x) max (/ 1 x))"
 val string2="I told him (that it’s not (yet) done). (But he wasn’t listening)"
 val string3=":-)"
 val string4="())("
 println(balance(string1.toList))
 println(balance(string2.toList))
 println(balance(string3.toList))
 println(balance(string4.toList))

 println(countChange(4, List(1,2)))
 println(countChange(2, List(1,2)))
 println(countChange(3, List(1,2)))
 println(countChange(10, List(1,2,5)))
}