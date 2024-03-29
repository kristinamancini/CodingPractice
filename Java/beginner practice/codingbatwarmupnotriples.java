/*
Given an array of ints, we'll say that a triple 
is a value appearing 3 times in a row in the array. 
Return true if the array does not contain any triples.
Note: review this again
*/

public boolean noTriples(int[] nums) {
  for (int i = 0; i < nums.length - 2; i++){
    int first = nums[i];
    if (nums[i + 1] == first && nums[i + 2] == first)
      return false;
  }
  return true;
}
