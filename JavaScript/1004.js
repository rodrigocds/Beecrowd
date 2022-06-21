var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift())
var y = parseInt(lines.shift())
var PROD = x * y

console.log(`PROD = ${PROD}`)