package my.solutions.easy

/*
  Given a roman numeral, convert it to an integer.

  Input is guaranteed to be within the range from 1 to 3999.
*/

object RomanToInteger {
  def romanToInt(s: String): Int = {
    val cm = """(^CM)(.*)""".r
    val m = """(^M)(.*)""".r
    val cd = """(^CD)(.*)""".r
    val d = """(^D)(.*)""".r
    val xc = """(^XC)(.*)""".r
    val c = """(^C)(.*)""".r
    val xl = """(^XL)(.*)""".r
    val l = """(^L)(.*)""".r
    val ix = """(^IX)(.*)""".r
    val x = """(^X)(.*)""".r
    val iv = """(^IV)(.*)""".r
    val v = """(^V)(.*)""".r
    val i = """(^I)(.*)""".r

    def rec(s: String, res: Int): Int = {
      s match {
        case cm(a, b) => rec(b, res + 900)
        case m(a, b) => rec(b, res + 1000)
        case cd(a, b) => rec(b, res + 400)
        case d(a, b) => rec(b, res + 500)
        case xc(a, b) => rec(b, res + 90)
        case c(a, b) => rec(b, res + 100)
        case xl(a, b) => rec(b, res + 40)
        case l(a, b) => rec(b, res + 50)
        case ix(a, b) => rec(b, res + 9)
        case x(a, b) => rec(b, res + 10)
        case iv(a, b) => rec(b, res + 4)
        case v(a, b) => rec(b, res + 5)
        case i(a, b) => rec(b, res + 1)
        case _ => res
      }
    }
    rec(s, 0)
  }
}