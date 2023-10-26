/*
Given an array of ints length 3, return a
new array with the elements in reverse
order, so {1, 2, 3} becomes {3, 2, 1}.
*/

public int[] reverse3(int[] nums) {
  int[] newArray = new int[3];
  int length = nums.length - 1;

  for (int i = 0; i < 3; i++)
    newArray[i] = nums[length--];

  return newArray;
}