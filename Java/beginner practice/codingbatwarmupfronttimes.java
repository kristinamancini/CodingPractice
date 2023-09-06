/*
Given a string and a non-negative int n, we'll 
say that the front of the string is the first 
3 chars, or whatever is there if the string is 
less than length 3. Return n copies of the front;
*/

public String frontTimes(String str, int n) {
  String result = "";
  
  if (str.length() < 3)
    for (int i = 0; i < n; i++)
      result = result + str.substring(0, str.length());
    
  else
    for (int i = 0; i < n; i++){
      result = result + str.substring(0, 3);
  }

  return result;
}
