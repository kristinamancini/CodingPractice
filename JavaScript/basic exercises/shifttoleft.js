function shiftToLeft(x, y){
    //return x << y;
    return x * 2**y;
}
console.log(shiftToLeft(46, 6));