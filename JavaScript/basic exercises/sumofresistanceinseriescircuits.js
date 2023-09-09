function seriesResistance(arr){
    let result = 0;
    for (i = 0; i < arr.length; i++)
        result = result + arr[i];
    
    return result;
}

console.log(seriesResistance([1, 5, 6, 3]), "ohms");
console.log(seriesResistance([16, 3.5, 6]), "ohms");