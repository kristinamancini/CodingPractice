/*
Given 2 strings, a and b, return a new string made of 
the first char of a and the last char of b, so "yo" 
and "java" yields "ya". If either string is length 0, 
use '@' for its missing char.
*/

public String lastChars(String a, String b) {
  if (a.isEmpty() && b.isEmpty())
    return "@@";
  else if (a.isEmpty())
    return "@" + b.substring(b.length() - 1);
  else if (b.isEmpty())
    return a.substring(0,1) + "@";
  else
    return a.substring(0, 1) + b.substring(b.length() - 1);
}
