package my.solutions.easy

/*
  Given an array of integers, every element appears twice except for one. Find that single one.

  Note:
  Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

object SingleNumber {
  def singleNumber(nums: Array[Int]): Int = {
    (nums.distinct ++ nums.distinct).diff(nums)(0)
  }
}