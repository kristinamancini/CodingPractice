function numberSquares(n){
    if (n == 0)
        return 0;
    else if (n == 1)
        return 1;
    else
        return (n ** 2 + numberSquares(n -1));
}

console.log(numberSquares(5)); //returns 55