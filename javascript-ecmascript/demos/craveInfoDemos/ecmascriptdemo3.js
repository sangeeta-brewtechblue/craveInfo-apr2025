const strings = ["apple", "banana", "cherry", "strawberry", 
    "grapes"];

const result = strings.filter(str => {
    str.includes('s')|| str.includes('S')})
    .map(str => str.length);

console.log(result);