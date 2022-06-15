var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var p1 = lines.shift().split(' ')
var p2 = lines.shift().split(' ')

var x1 = parseFloat(p1[0])
var y1 = parseFloat(p1[1])

var x2 = parseFloat(p2[0])
var y2 = parseFloat(p2[1])

var distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))

console.log(distancia.toFixed(4))

//1.0 7.0 5.0 9.0
//-2.5 0.4 12.1 7.3
//2.5 -0.4 -12.2 7.0