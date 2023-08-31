/*
Given a string, return true if the first 
instance of "x" in the string is immediately 
followed by another "x".
*/

boolean doubleX(String str) {
  int first_x = str.indexOf("x");
  
  if (first_x == str.length() - 1)
    return false;
  
  if (str.charAt(first_x + 1) == 'x')
    return true;
    
  else
    return false;
}