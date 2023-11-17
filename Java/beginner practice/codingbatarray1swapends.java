/*
Given an array of ints, swap the first and last
elements in the array. Return the modified array.
The array length will be at least 1.
*/

public int[] swapEnds(int[] nums) {
  int newArray[] = new int[nums.length];
  newArray[0] = nums[nums.length - 1];
  newArray[nums.length - 1] = nums[0];

  for (int i = 1; i < nums.length - 1; i++)
    newArray[i] = nums[i];

  return newArray;
}