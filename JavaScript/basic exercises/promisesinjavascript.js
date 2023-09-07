//Resolved promise example
let promise = new Promise((resolve, reject) => {
    setTimeout(() => resolve("hello"), 1000);
});

promise.then(
    result => alert(result),
    error => alert(error)
);

//Rejection promise example
let promise2 = new Promise((resolve, reject) => {
    setTimeout(() => reject(new Error("Whoops an error!")), 1000);
});

promise2.then(
    result => alert(result),
    error => alert(error)
);