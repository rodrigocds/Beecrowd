var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let num = parseFloat(lines.shift())
let calc = 2 * 3.14 * num;

console.log(calc.toFixed(2))