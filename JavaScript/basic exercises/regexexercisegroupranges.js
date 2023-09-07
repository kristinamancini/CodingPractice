const myString = "yellow flag red flag blue flag green flag";
const myOtherString = "pink flag red flag black flag blue flag green flag red flag "
const regexRedBlueFlag = /\bred flag|blue flag\b/g;

console.log(myString.match(regexRedBlueFlag));
console.log(myOtherString.match(regexRedBlueFlag));