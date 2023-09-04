/*
Given an array of ints, return true if the 
sequence of numbers 1, 2, 3 appears in the 
array somewhere.
*/

public boolean array123(int[] nums) {
  if (nums.length < 3)
    return false;
  
  for (int i = 0; i < nums.length; i++){
    for (int j = i + 1; j < nums.length; j++){
      if (nums[i] == 1)
        if (nums[j] == 2)
          if (nums[j + 1] == 3)
            return true;
    }
  }
  return false;
}