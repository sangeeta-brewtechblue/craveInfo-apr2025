var msgs=["msg1","msg2","msg3"];
var cat ={
    say : function(msg){
        console.log(msg);
    }
}
for(let i=0;i<msgs.length;i++){
    setTimeout(function(){
        cat.say(msgs[i])
    },3000);
}