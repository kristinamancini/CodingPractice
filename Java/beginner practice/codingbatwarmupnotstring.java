/*
Given a string, return a new string 
where "not " has been added to the 
front. However, if the string already 
begins with "not", return the string 
unchanged. 
*/

public String notString(String str) {
  if (str.startsWith("not"))
    return str;
  else
    return "not " + str;
}
