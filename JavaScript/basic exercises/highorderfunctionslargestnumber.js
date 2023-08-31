function whichIsLarger(f, g){
    if (f() > g())
        return "f";
    if (f() == g())
        return "neither";
    else
        return "g";
}

console.log(whichIsLarger(() => 10, () => 10));