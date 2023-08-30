function timeForMilkAndCookies(dateToTest){
    let month = dateToTest.getMonth()
    let day = dateToTest.getDate()
    if (month == 11 && day == 24)
        return true;
    else
        return false;
}
console.log(timeForMilkAndCookies(new Date(2013, 11, 24)));