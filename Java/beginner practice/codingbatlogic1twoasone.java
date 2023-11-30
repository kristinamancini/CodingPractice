/*
Given three ints, a b c, return true if it is possible 
to add two of the ints to get the third.
*/

public boolean twoAsOne(int a, int b, int c) {
  if (a + b == c)
    return true;
  else if (b + c == a)
    return true;
  else if (a + c == b)
    return true;
  else
    return false;
}