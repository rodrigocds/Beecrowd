var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var km = parseInt(lines.shift())

console.log(`${km * 2} minutos`)