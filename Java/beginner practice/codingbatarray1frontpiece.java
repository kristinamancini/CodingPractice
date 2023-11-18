/*
Given an int array of any length, return a
new array of its first 2 elements. If the
array is smaller than length 2, use whatever
elements are present.
*/

public int[] frontPiece(int[] nums) {
  if (nums.length >= 2){
    int newArray[] = new int[2];
    newArray[0] = nums[0];
    newArray[1] = nums[1];
    return newArray;
  }

  else if (nums.length == 0)
    return nums;

  else{
    int newArray[] = new int[1];
    newArray[0] = nums[0];
    return newArray;
  }
}