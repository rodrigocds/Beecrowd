var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let num1 = parseInt(lines.shift())
let num2 = parseInt(lines.shift())

console.log(num1 % num2)