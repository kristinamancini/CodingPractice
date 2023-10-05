function potatoes(num){
    var count = (num.match(/potato/g)).length;
    
    return count;
}

console.log(potatoes("potatopotato")); //2
console.log(potatoes("potatoapple"));//1