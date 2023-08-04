/*
We'll say that a number is "teen" if it is in the range 13..19 
inclusive. Given 3 int values, return true if 1 or more of them 
are teen.
*/

public boolean hasTeen(int a, int b, int c) {
  if (a > 12 && a < 20 || b > 12 && b < 20 || c > 12 && c < 20)
    return true;
  else
    return false;
  
}
