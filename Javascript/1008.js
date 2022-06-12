var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var numero = parseInt(lines.shift())
var horas = parseInt(lines.shift())
var salarioHoras = parseFloat(lines.shift())

var salario = salarioHoras * horas

console.log(`NUMBER = ${numero}`)
console.log(`SALARY = U$ ${salario.toFixed(2)}`)

//25 100 5.50
//1 200 20.50
//6 145 15.55