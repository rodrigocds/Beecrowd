var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var pi = 3.14159
var raio = parseFloat(lines.shift())
var vol = (4.0/3.0) * pi * Math.pow(raio,3)

console.log(`VOLUME = ${vol.toFixed(3)}`)

//3
//15
//1523