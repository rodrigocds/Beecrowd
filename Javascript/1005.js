var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n')

var a = parseFloat(lines.shift())
var b = parseFloat(lines.shift())

var media = ((a * 3.5) + (b * 7.5)) / 11

console.log(`MEDIA = ${media.toFixed(5)}`)

//5.0 7.1
//0.0 7.1
//10.0 10.0