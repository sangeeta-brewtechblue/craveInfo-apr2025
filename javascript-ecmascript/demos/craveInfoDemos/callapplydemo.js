var cat = {
 
    name: "Gus",
    color: "gray",
    age: 15,
 };
  var  printInfo = function() {
       console.log("Name:", this.name, "Color:", this.color, "Age:", this.age); 
  };
  
  var cat1 = {
  
    name: "cuty",
    color: "white",
    age: 13,
 };
 
  //cat1.printInfo();

 printInfo.call(cat,);
 
 printInfo.apply(cat1);