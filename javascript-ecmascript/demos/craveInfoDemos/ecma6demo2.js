function  Person(){
    this.age =0;
    //var that = this;
     setInterval(function  growUp(){
                
        console.log(this.age++);
    
    },1000);
 }
function  Person(){
  this.age =0;
   
   setInterval(()=>{               
       console.log(this.age++);   
   },1000);
}
var p1 = new Person();