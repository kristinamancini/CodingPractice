/*
Given 2 int arrays, each length 2, return
a new array length 4 containing all their
elements.
*/

public int[] plusTwo(int[] a, int[] b) {
  int newArray[] = new int[4];

  newArray[0] = a[0];
  newArray[1] = a[1];
  newArray[2] = b[0];
  newArray[3] = b[1];

  return newArray;
}