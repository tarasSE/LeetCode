package my.solutions.easy;

/*
    Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    Example:

    Given nums = [1,1,2],

    Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
    It doesn't matter what you leave beyond the new length.
*/


public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int pointer = 0;
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[pointer] = current;
            if (nums[i] == current) {
                nums[i] = 0;
            } else {
                current = nums[i];
                nums[i] = 0;
                pointer += 1;
                nums[pointer] = current;
            }
        }
        int res[] = new int[pointer + 1];
        System.arraycopy(nums, 0, res, 0, pointer + 1);
        return res.length;
    }
}