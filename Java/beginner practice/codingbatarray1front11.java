/*
Given 2 int arrays, a and b, of any length,
return a new array with the first element of
each array. If either array is length 0,
ignore that array.
*/
public int[] front11(int[] a, int[] b) {
  if (a.length == 0 && b.length != 0){
    int newArray[] = new int[1];
    newArray[0] = b[0];
    return newArray;
  }

  else if(b.length == 0 && a.length != 0){
    int newArray[] = new int[1];
    newArray[0] = a[0];
    return newArray;
  }

  else if (b.length == 0 && a.length == 0)
    return a;

  else{
    int newArray[] = new int[2];
    newArray[0] = a[0];
    newArray[1] = b[0];
    return newArray;
  }
}