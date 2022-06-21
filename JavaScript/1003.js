var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var a = parseInt(lines.shift())
var b = parseInt(lines.shift())
var res = a + b

console.log(`SOMA = ${res}`)