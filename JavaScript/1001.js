var input = require('fs').readFileSync('stdin.txt', 'utf8');
var valor = input.split("\n");

var x = parseInt(valor.shift())
var y = parseInt(valor.shift())
var res = x + y

console.log("X = " + res)