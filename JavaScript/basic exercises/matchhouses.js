function matchHouses(n){
if (n == 0)
return 0;
else if (n == 1)
return 6;
else
return (6 * n) - (n - 1);
}

console.log(matchHouses(87));