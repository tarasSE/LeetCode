package my.solutions.easy

/*
  Determine whether an integer is a palindrome. Do this without extra space.

  Some hints:
  Could negative integers be palindromes? (ie, -1)

  If you are thinking of converting the integer to string, note the restriction of using extra space.

  You could also try reversing an integer. However, if you have solved the problem "Reverse Integer",
  you know that the reversed integer might overflow. How would you handle such case?

  There is a more generic way of solving this problem.
*/

object PalindromeNumber {
  def isPalindrome(x: Int): Boolean = {
    if (0 > x) {
      return false
    }

    var n = x
    var rev = 0
    while (n > 0) {
      val dig = n % 10
      rev = rev * 10 + dig
      n = n / 10
    }

    rev == x
  }
}