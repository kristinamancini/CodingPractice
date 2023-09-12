function detectWord(word){
    const regex = /[a-z]/g;
    const found = word.match(regex);
    
    return found.join("");
}

console.log(detectWord("UcUNFYGaFYFYGtNUH")); //cat
console.log(detectWord("bEEFGBuFBRrHgUHlNFYaYr")); //burgular
console.log(detectWord("YFemHUFBbezFBYzFBYLleGBYEFGBMENTment")); //embezzlement