package my.solutions.medium

/*
  Given an integer, convert it to a roman numeral.

  Input is guaranteed to be within the range from 1 to 3999.
*/

object IntegerToRoman {
  def intToRoman(num: Int): String = {
    def count(n: Int, i: Int): Int = n / i
    def subtract(n: Int, i: Int): Int = n - count(n, i) * i
    def generateRoman(res: String, s: String, i: Int): String = res + s * i

    def rec(i: Int, res: String): String = {
      i match {
        case n if n == 0 => res
        case n if n / 1000 > 0 => rec(subtract(n, 1000), generateRoman(res, "M", count(n, 1000)))
        case n if n / 900 > 0 => rec(subtract(n, 900), generateRoman(res, "CM", count(n, 900)))
        case n if n / 500 > 0 => rec(subtract(n, 500), generateRoman(res, "D", count(n, 500)))
        case n if n / 400 > 0 => rec(subtract(n, 400), generateRoman(res, "CD", count(n, 400)))
        case n if n / 100 > 0 => rec(subtract(n, 100), generateRoman(res, "C", count(n, 100)))
        case n if n / 90 > 0 => rec(subtract(n, 90), generateRoman(res, "XC", count(n, 90)))
        case n if n / 50 > 0 => rec(subtract(n, 50), generateRoman(res, "L", count(n, 50)))
        case n if n / 40 > 0 => rec(subtract(n, 40), generateRoman(res, "XL", count(n, 40)))
        case n if n / 10 > 0 => rec(subtract(n, 10), generateRoman(res, "X", count(n, 10)))
        case n if n / 9 > 0 => rec(subtract(n, 9), generateRoman(res, "IX", count(n, 9)))
        case n if n / 5 > 0 => rec(subtract(n, 5), generateRoman(res, "V", count(n, 5)))
        case n if n / 4 > 0 => rec(subtract(n, 4), generateRoman(res, "IV", count(n, 4)))
        case n if n / 1 > 0 => rec(subtract(n, 1), generateRoman(res, "I", count(n, 1)))
      }
    }

    rec(num, "")
  }
}