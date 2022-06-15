var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var peca1 = lines.shift().split(' ')
var peca2 = lines.shift().split(' ')

var cod1 = parseInt(peca1[0])
var num1 = parseInt(peca1[1])
var preco1 = parseFloat(peca1[2])

var cod2 = parseInt(peca2[0])
var num2 = parseInt(peca2[1])
var preco2 = parseFloat(peca2[2])

var totPreco = ((num1 * preco1) + (num2 * preco2))

console.log(`VALOR A PAGAR: R$ ${totPreco.toFixed(2)}`)

//12 1 5.30 16 2 5.10
//13 2 15.30 161 4 5.20
// 1 1 15.10 2 1 15.10