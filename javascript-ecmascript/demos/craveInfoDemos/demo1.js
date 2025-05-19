var person1 = {
    name:"someName",
    age:34,
    showPerson:function(){
       console.log(this.name+"-",this.age);
    }
}
var person2 = {
    name:"name2",
    age:24,
    showPerson:function(){
       console.log(this.name+"-",this.age);
    }
}

person.showPerson();
console.log(person);