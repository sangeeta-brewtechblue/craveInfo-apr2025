const http = require('http');
let server=http.createServer((req,res)=>{
    res.writeHead(200,{'content-type':'text/html'});
    res.write(("Hello world!"));
})
server.listen(3000,()=>{console.log("running on port 3000")});