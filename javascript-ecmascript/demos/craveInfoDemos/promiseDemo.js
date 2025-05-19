var mypromise = 
new Promise(function (resolve,reject)
{
//setInterval(resolve('someData') 
setInterval(reject('someError')
 ,   
3000); });

mypromise.then((data)=>
{console.log("promise has been resolved:"+data)})
.catch((error)=>console.log(error));
console.log("some code getting executed...yet promise is to be resolved");
console.log(mypromise);

