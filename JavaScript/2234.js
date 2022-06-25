var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(' ')

let dog = parseInt(linha[0])
let part = parseInt(linha[1])

let div = (dog / part)

console.log(div.toFixed(2))