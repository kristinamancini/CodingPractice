function bitwiseAND(a, b){
    //console.log(a.toString(2));
    //console.log(b.toString(2));
    return a & b;
}
function bitwiseOR(a, b){
    return a | b;
}
function bitwiseXOR(a, b){
    return a ^ b;
}

console.log(bitwiseAND(7, 12));
console.log(bitwiseOR(7, 12));
console.log(bitwiseXOR(7, 12));