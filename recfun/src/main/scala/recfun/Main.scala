package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def parenthetical(char: Char, count: Int): Int = {
      if (char == '(') count + 1 else (if (char == ')') count - 1 else count)
    }
    def bal_helper(count: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty || count < 0) count == 0 else bal_helper(parenthetical(chars.head, count), chars.tail)
    }
    bal_helper(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(money: Int, coins: List[Int], count: Int): Int = {
      if (coins.isEmpty || money < 0) 0
      else {
        if (money == 0) count + 1 else loop(money - coins.head, coins, count) + loop(money, coins.tail, count)
      }
    }
    loop(money, coins, 0)
  }
}
