function hoursMinutes(str){
    const regexpSize = /([0-9]{2}):([0-9]{2})/;
    const match = str.match(regexpSize);
    
    return (`The time is ${match[1]}:${match[2]}`);
}
console.log(hoursMinutes("Breakfast at 09:00 in the room 123:456"));