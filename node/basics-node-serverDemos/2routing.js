// Import the 'http' module
const http = require('http');
// Create the server using the 'http.createServer()' method
const server = http.createServer((req, res) => {
  // Check the URL of the incoming request
  if (req.url === '/') {
    // If the URL is '/', set the response header and send the message
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('Welcome to the homepage!');
  } else if (req.url === '/about') {
    // If the URL is '/about', set the response header and send the message
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('About us: This is a simple Node.js server.');
  } else {
    // For any other URL, set a 404 response header and send a 'Page not found.' message
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('Page not found.');
  }
});

const PORT = 5001;
server.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});