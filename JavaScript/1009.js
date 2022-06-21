var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var nome = (lines.shift())
var salario = parseFloat(lines.shift())
var vendas =  parseFloat(lines.shift())

var salariotot = ((vendas * 15) / 100) + salario

console.log(`TOTAL = R$ ${salariotot.toFixed(2)}`)