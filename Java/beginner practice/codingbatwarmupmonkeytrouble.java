/*
We have two monkeys, a and b, and the parameters aSmile and 
bSmile indicate if each is smiling. We are in trouble if they 
are both smiling or if neither of them is smiling. Return true
if we are in trouble.
*/

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile && bSmile == true)
    return true;
  if (aSmile == false && bSmile == false)
    return true;
  else
    return false;
}