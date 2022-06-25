var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let qtd = parseInt(lines.shift())

let V = 0
let G = 0

for (let i = 0; i < qtd; i++) {
    let esc = lines.shift().split(' ')
    let tipo = esc[0];;
    let valor = parseInt(esc[1])
    if (tipo == 'G') {
        G += valor
    } else {
        V += valor
    }
}

if (G > V) {
    console.log('NAO VAI TER CORTE, VAI TER LUTA!')
} else {
    console.log('A greve vai parar.')
}