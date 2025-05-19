function Person(name,age){
   this.name=name;
   this.age =age;
   this.showPerson=function(){
    console.log(this.name +"-"+this.age);
   }

}
var p1 = new Person("name1",34);
var p2 = new Person("name2",38);
p1.showPerson();
p2.showPerson();

function f1(){
   console.log("f1"+this.age);
}
f1();