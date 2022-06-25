var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(' ')

let x = parseInt(linha[0])
let y = parseInt(linha[1])

console.log(x * y)