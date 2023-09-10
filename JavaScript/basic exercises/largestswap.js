function largestSwap(n){
    let firstDigit = parseInt(n / 10);
    let secondDigit = n % 10;
    
    var numSwitch = secondDigit * 10 + firstDigit;
    
    if (n == numSwitch)
        return true;
    else
        return n > numSwitch;
}

console.log(largestSwap(27)); //false
console.log(largestSwap(53)); //true
console.log(largestSwap(43)); //true
console.log(largestSwap(99)); //true