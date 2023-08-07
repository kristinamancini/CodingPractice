/*
Given 2 int values, return whichever 
value is nearest to the value 10, or 
return 0 in the event of a tie. 
*/

public int close10(int a, int b) {
  int numberA = Math.abs(10 - a);
  int numberB = Math.abs(10 - b);
  
  if (numberA < numberB)
    return a;
    
  else if (numberB < numberA)
    return b;
    
  else
    return 0;
}