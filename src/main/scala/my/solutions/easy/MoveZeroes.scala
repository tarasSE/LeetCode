package my.solutions.easy

/*
  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

  For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

  Note:
  You must do this in-place without making a copy of the array.
  Minimize the total number of operations.
  Credits:
  Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
*/

object MoveZeroes {
  def moveZeroes(nums: Array[Int]): Unit = {
    (nums.toVector.filterNot(_ == 0) ++ nums.toVector.filter(_ == 0)).zipWithIndex.foreach(x => nums.update(x._2, x._1))
  }
}