/*
Given an "out" string length 4, such as "<<>>", and a word, 
return a new string where the word is in the middle of the 
out string, e.g. "<<word>>".
*/

public String makeOutWord(String out, String word) {
  String result = "";
  for (int i = 0; i < out.length(); i++){
    result = result + out.charAt(i);
    if (i == 1)
      result = result + word;
  }
    
  return result;
}
