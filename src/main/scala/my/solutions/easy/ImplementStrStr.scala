package my.solutions.easy

/*
  Implement strStr() => http://www.cplusplus.com/reference/cstring/strstr/

  Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

  Example 1:
  Input: haystack = "hello", needle = "ll"
  Output: 2

  Example 2:
  Input: haystack = "aaaaa", needle = "bba"
  Output: -1
*/


object ImplementStrStr {
  def strStr(haystack: String, needle: String): Int = {
    haystack.indexOf(needle)
  }
}