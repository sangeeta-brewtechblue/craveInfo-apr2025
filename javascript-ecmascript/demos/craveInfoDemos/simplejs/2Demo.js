/*
//1.
var a;
console.log('The value of a is ' + a); // The value of a is undefined

console.log('The value of b is ' + b); // The value of b is undefined
var b;

//console.log('The value of c is ' + c); // Uncaught ReferenceError: c is not defined

//let x;
//console.log('The value of x is ' + x); // The value of x is undefined

//console.log('The value of y is ' + y); // Uncaught ReferenceError: y is not defined
//let y;

//2
var a;
a + 2;  // Evaluates to NaN

//3 Loops & iterations:

for(var ctr=0;ctr<5;ctr++;
{
	console.log("times printed"+ctr);
}


var step;
for (step = 0; step < 5; step++) {
  // Runs 5 times, with values of step 0 through 4.
  console.log('Walking east one step');
}
//3- for loop
function howMany(selectObject) {
  var numberSelected = 0;
  for (var i = 0; i < selectObject.options.length; i++) {
    if (selectObject.options[i].selected) {
      numberSelected++;
    }
  }
  return numberSelected;
}

var btn = document.getElementById('btn');
btn.addEventListener('click', function() {
  alert('Number of options selected: ' + howMany(document.selectForm.musicTypes));
});

//do while 
var i = 0;
do {
  i += 1;
  console.log(i);
} while (i < 5);


//while
var n = 0;
var x = 0;
while (n < 3) {
  n++;
  x += n;
}
//break
for (var i = 0; i < a.length; i++) {
  if (a[i] == theValue) {
    break;
  }
}
//Assignment: dowhile & while (https://jsbin.com/vatubiy/2/edit?html,js,console,output)
//breaking to a label

var x = 0;
var z = 0;
labelCancelLoops: while (true) {
  console.log('Outer loops: ' + x);
  x += 1;
  z = 1;
  while (true) {
    console.log('Inner loops: ' + z);
    z += 1;
    if (z === 10 && x === 10) {
      break labelCancelLoops;
    } else if (z === 10) {
      break;
    }
  }
}

//continue-ex1
var i = 0;
var n = 0;
while (i < 5) {
  i++;
  if (i == 3) {
    continue;
  }
  n += i;
}
//continue -ex2
checkiandj:
  while (i < 4) {
    console.log(i);
    i += 1;
    checkj:
      while (j > 4) {
        console.log(j);
        j -= 1;
        if ((j % 2) == 0) {
          continue checkj;
        }
        console.log(j + ' is odd.');
      }
      console.log('i = ' + i);
      console.log('j = ' + j);
  }
  //for-in(For an object car with properties make and model, result would be:
  //car.make = Ford
  //car.model = Mustang
  function dump_props(obj, obj_name) {
  var result = '';
  for (var i in obj) {
    result += obj_name + '.' + i + ' = ' + obj[i] + '<br>';
  }
  result += '<hr>';
  return result;
} */
//for-of statement
let arr = [3, 5, 7];
//arr.foo = 'hello';

for (let i in arr) {
   console.log(i); // logs "0", "1", "2", "foo"
   console.log(arr[i]);
}

for (let i of arr) {
   console.log(i); // logs 3, 5, 7
}


