var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let qtd = parseInt(lines.shift())

for (let i = 0; i < qtd; i++) {
    let linha = lines.shift().split(' ')
    let d1 = parseInt(linha[0])
    let d2 = parseInt(linha[1])

    let conta = (d1 * d2) / 2;
    console.log(`${Math.floor(conta)} cm2`)
}
