/*
Given 2 int arrays, a and b, each length 3,
return a new array length 2 containing their middle elements.
*/

public int[] middleWay(int[] a, int[] b) {
  int[] newArray = new int[2];

  newArray[0] = a[a.length / 2];
  newArray[1] = b[b.length / 2];

  return newArray;
}