var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var pi = 3.14159;
var raio = parseFloat(input)
var res = pi * Math.pow(raio,2)

console.log(`A=${res.toFixed(4)}`)