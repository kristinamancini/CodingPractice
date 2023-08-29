/*
Given a string and a non-negative int n, return a larger 
string that is n copies of the original string.
*/

public String stringTimes(String str, int n) {
  String newString = str;
  
  if (n == 0)
    return "";
  else
    for (int i = 1; i < n; i++){
      newString = newString + str;
    }
  
  return newString;
}