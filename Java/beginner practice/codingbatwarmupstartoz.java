/*
Given a string, return a string made 
of the first 2 chars (if present), 
however include first char only if 
it is 'o' and include the second only 
if it is 'z', so "ozymandias" yields "oz".
*/

public String startOz(String str) {
  if (str.isEmpty())
    return "";
  else if (str.startsWith("oz"))
    return "oz";
  else if (str.charAt(0) == 'o')
    return "o";
  else if (str.charAt(1) == 'z')
    return "z";
  else
    return "";
}