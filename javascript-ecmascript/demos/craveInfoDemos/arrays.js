var fruits =['apple','pineapple','blueberry'];
console.log(fruits.indexOf('pineapple'));
//fruits.splice(1,1);


fruits.push("Kiwi");
fruits.push('pear');
console.log(fruits);
var newFruits = fruits.slice(1,2);
console.log(newFruits);
console.log(fruits);
fruits.toSpliced(1,0,"banana");
console.log(fruits);

