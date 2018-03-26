package my.solutions.easy

/*
  Given an array of integers, find if the array contains any duplicates.Your function should return true
  if any value appears at least twice in the array, and it should return false if every element is distinct.
*/

object ContainsDuplicates {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    nums.toSet.size != nums.length
  }
}