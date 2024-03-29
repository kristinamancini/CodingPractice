/*
Given a string, return a new string made of 
every other char starting with the first, so 
"Hello" yields "Hlo".
*/

public String stringBits(String str) {
  String result = "";
  
  for (int i = 0; i < str.length(); i = i + 2){
    int end = i + 1;
    if (end > str.length())
      end = str.length();
    
    result = result + str.substring(i, end);
  }
  return result;
}

