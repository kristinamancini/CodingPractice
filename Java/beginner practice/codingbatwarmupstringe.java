/*
Return true if the given string contains 
between 1 and 3 'e' chars.
*/

public boolean stringE(String str) {
  String[] letterArray = str.split("");
  
  int count = 0;
  for(int i = 0; i < letterArray.length; i++){
    if (letterArray[i].contains("e"))
      count = count + 1;
    else
      continue;
  }
  
  if (count > 0 && count < 4)
    return true;
  else
    return false;
}