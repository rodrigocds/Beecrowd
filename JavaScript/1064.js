var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var soma = 0
var qtd = 0

for (var i = 0; i < 6; i++) {
    var num = parseFloat(lines.shift())
    if (num > 0) {
        qtd++
        soma += num
    }
}

console.log(`${qtd} valores positivos`)
console.log((soma / qtd).toFixed(1))