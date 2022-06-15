var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var linha = lines.shift().split(' ')

var a = parseInt(linha[0])
var b = parseInt(linha[1])
var c = parseInt(linha[2])

var maiorAB = ((a + b + Math.abs(a - b)) / 2)

if (maiorAB > c) {
    console.log(`${maiorAB} eh o maior`)
} else {
    console.log(`${c} eh o maior`)
}

//7 14 106
//217 14 6