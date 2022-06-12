var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var a = parseFloat(lines.shift())
var b = parseFloat(lines.shift())
var c = parseFloat(lines.shift())

var media = ((a * 2) + (b * 3) + (c * 5)) / 10

console.log(`MEDIA = ${media.toFixed(1)}`)

//5.0 6.0 7.0
//5.0 10.0 10.0
//10.0 10.0 5.0