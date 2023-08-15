function howManySeconds(hour){
    return hour * 60 * 60;
}

var hour = prompt("Enter a number in hours to convert to seconds: ");
console.log("How many seconds are in " + hour + " hours?");
console.log(howManySeconds(hour));