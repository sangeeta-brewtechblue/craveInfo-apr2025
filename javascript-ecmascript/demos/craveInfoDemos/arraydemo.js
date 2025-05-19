var arrayOne = [1,8,6,7,3,4,9,2,5,10],
    arrayTwo = new Array(10),
    arrayThree = new Array(1,2,3,4,5,6,7,8,9,10),
    idx;

console.log("Array One");
for(idx in arrayOne) {
  console.log(idx, arrayOne[idx]);
}

console.log("Array Two");
for (idx = 0; idx < arrayTwo.length; arrayTwo[idx++] = idx) {
  console.log(idx, arrayOne[idx]);
}

console.log("Array Three");
arrayThree.forEach(function(v, i) {
  console.log(i, v);
});

arrayOne.sort();
console.log("alphabetical sort", arrayOne);

arrayOne.sort(function(a, b) {  return a-b; });
console.log("numeric sort", arrayOne);

arrayOne.splice(2, 0, 12, 11);
console.log("splice", arrayOne);

arrayTwo.reverse();
console.log("reverse sort", arrayTwo);

var mapArray = arrayTwo.map(function(v, i) { return v + i; });
console.log("mapArray", mapArray);

var reduce = arrayThree.reduce(function(x, y) { return x * y; }, 0.25);
console.log("reduce", reduce);