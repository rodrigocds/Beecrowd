var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift())
var y = parseFloat(lines.shift())

console.log(`${(x/y).toFixed(3)} km/l`)