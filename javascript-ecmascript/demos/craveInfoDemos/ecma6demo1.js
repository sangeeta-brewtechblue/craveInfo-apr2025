var numbers = [4,1,8,3,9];

var sum = numbers.filter((val)=>(val%2)==0).
map((val)=>val*val).reduce((n1,n2)=>n1+n2);

console.log(sum);