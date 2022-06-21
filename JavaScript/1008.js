var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var numero = parseInt(lines.shift())
var horas = parseInt(lines.shift())
var salarioHoras = parseFloat(lines.shift())

var salario = salarioHoras * horas

console.log(`NUMBER = ${numero}`)
console.log(`SALARY = U$ ${salario.toFixed(2)}`)