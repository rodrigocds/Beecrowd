var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var a = parseInt(lines.shift())
var b = parseInt(lines.shift())
var c = parseInt(lines.shift())
var d = parseInt(lines.shift())

var diferenca = (a * b - c * d)

console.log(`DIFERENCA = ${diferenca}`)

//5 6 7 8
//0 0 7 8
//5 6 -7 8