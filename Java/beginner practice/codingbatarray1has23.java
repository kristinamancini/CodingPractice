/*
Given an int array length 2, return true if it contains a 2 or a 3.
*/

public boolean has23(int[] nums) {
  boolean result = false;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 2 || nums[i] == 3)
      result = true;
    else
      continue;
  }
  return result;
}