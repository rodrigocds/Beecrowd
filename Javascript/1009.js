var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var nome = (lines.shift())
var salario = parseFloat(lines.shift())
var vendas =  parseFloat(lines.shift())

var salariotot = ((vendas * 15) / 100) + salario

console.log(`TOTAL = R$ ${salariotot.toFixed(2)}`)

//JOAO 500.00 1230.30
//PEDRO 700.00 0.00
//MANGOJATA 1700.00 1230.50