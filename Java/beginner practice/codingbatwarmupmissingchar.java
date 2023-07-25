/*
Given a non-empty string and an int n, return a new 
string where the char at index n has been removed. 
The value of n will be a valid index of a char in the 
original string.
*/

public String missingChar(String str, int n) {
  String first_part;
  String second_part;
  
  first_part = str.substring(0, n);
  second_part = str.substring(n+1, str.length());
  
  return first_part + second_part;
}
