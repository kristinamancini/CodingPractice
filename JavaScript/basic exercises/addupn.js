/*
Add up all the numbers from 1 to the number 
you passed to the function. 
*/

function addUp(n){
    if (n == 1)
        return 1;
    else
        return addUp(n-1) + n;
}
console.log(addUp(600));