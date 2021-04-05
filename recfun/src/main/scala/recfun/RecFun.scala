package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int ={
    var sol: Int = 0
    if (c==0 || c==r ){
      sol=1
    }else{
      sol = pascal(c,r-1)+pascal(c-1,r-1)
    }
    return sol
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def inner(list: List[Char], num: Int): Int ={
      var count=num
      if (list.isEmpty==false){
        val listhead=list.head

        if (listhead=='('){
          count+= 1
        } else if(listhead==')'){
          count+= -1
        }
      }

      if (count<0 || list.isEmpty) return count
      else return inner(list.tail, count)
    }
    val sol = inner(chars,0)
    if(sol==0) return true
    else return false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =  {
    if(money == 0) {
      1
    } else if(coins.isEmpty) {
      0
    } else {
      var sol = if (money - coins.head >= 0) countChange(money - coins.head, coins) else 0
      sol+= countChange(money, coins.tail)
      return sol
    }

  }
}
