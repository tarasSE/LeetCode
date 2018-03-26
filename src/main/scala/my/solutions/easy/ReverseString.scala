package my.solutions.easy

/*
  Write a function that takes a string as input and returns the string reversed.

  Example:
  Given s = "hello", return "olleh".
*/

object ReverseString {
  def reverseString(s: String): String = {
    s.toVector.par.reverse.mkString
  }
}