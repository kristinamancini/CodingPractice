/*
Given two non-negative int values, return true if they have the same last digit
*/

public boolean lastDigit(int a, int b) {
  int modA = 1;
  int modB = 1;
  
  if (a < 10)
    modA = a;
  else if (a >= 10 && a < 100)
    modA = a % 10;
  else if (a >= 100)
    modA = a % 10;
   
  if (b < 10)
    modB = b;
  else if (b >= 10 && b < 100)
    modB = b % 10;
  else if (b >= 100)
    modB = b % 10;
  
  if (modA == modB)
    return true;
    
  else
    return false;
}
