function canNest(arr1, arr2){
    var arr1MinValue = Math.min.apply(Math, arr1);
    var arr1MaxValue = Math.max.apply(Math, arr1);
    var arr2MinValue = Math.min.apply(Math, arr2);
    var arr2MaxValue = Math.max.apply(Math, arr2);
    
    return ((arr1MinValue > arr2MinValue) && (arr1MaxValue < arr2MaxValue));
}
console.log(canNest([1, 2, 3, 4], [2, 3])); //false
console.log(canNest([3, 1], [4, 0])) //true