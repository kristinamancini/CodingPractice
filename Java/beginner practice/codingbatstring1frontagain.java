/*
Given a string, return true if the first 2 chars in the
string also appear at the end of the string, such as with "edited".
*/

public boolean frontAgain(String str) {
  if (str.length() < 2)
    return false;
  else if (str.endsWith(str.substring(0, 2)))
    return true;
  else
    return false;
}