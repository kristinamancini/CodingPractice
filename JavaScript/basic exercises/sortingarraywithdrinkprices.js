function sortDrinkByPrice(p){
    return p.sort((a, b) => (a.price > b.price) ? 1 : -1)
}

drinks = [
  {name: "lemonade", price: 50},
  {name: "lime", price: 10}
]

drinks2 = [
  {name: "lemonade", price: 5},
  {name: "lime", price: 10}
]
console.log(sortDrinkByPrice(drinks));
console.log(sortDrinkByPrice(drinks2));