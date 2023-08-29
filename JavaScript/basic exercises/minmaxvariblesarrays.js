//learned to use spread syntax ... for arrays

function minMax(x){
    let min_var = Math.min(...x);
    let max_var = Math.max(...x);
   let min_max_var = [min_var, max_var]
    return min_max_var;
}

let arr = [12, 55, 7, 27, 76, 45];
console.log(minMax(arr));