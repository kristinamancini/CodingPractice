/*
Given two temperatures, return true if one is 
less than 0 and the other is greater than 100
*/

public boolean icyHot(int temp1, int temp2) {
  if (temp1 < 0 && temp2 > 100)
    return true;
  else if (temp1 > 100 && temp2 < 0)
    return true;
  else
    return false;
}
