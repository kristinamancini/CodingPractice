/*
Given an array of ints of odd length,
look at the first, last, and middle
values in the array and return the
largest. The array length will be a
least 1.
*/

public int maxTriple(int[] nums) {
int maxNum = 0;

  if(nums[0] > maxNum)
    maxNum = nums[0];
  if ((nums[nums.length / 2]) > maxNum)
    maxNum = nums[nums.length / 2];
  if ((nums[nums.length - 1]) > maxNum)
    maxNum = nums[nums.length - 1];

  return maxNum;
}