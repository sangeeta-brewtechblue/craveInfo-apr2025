function abc () {
	var temp = 123;
	console.log(temp);
}
abc();
var temp;
console.log(temp);
//------------
var cat = {
 
    name: "Gus",
    color: "gray",
    age: 15,
  
    printInfo: function() {
       console.log("in outer, Name:", this.name, "Color:", this.color, "Age:", this.age); //line 1, prints correctly
       //  var that =this;    
     var fun= ()=> {
           console.log("in Nested,Name:", this.name, "Color:", this.color, "Age:", this.age); //line 2, loses cat scope
       };
         fun(); //line 3, prints correctly
   // nestedFunction();
    }
 };
 
 printInfo();
 //cat.printInfo();
//--------------------

 
