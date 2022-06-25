var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let rodada, j1 = 0, j2 = 0, p1 = 0, p2 = 0

do {
    rodada = parseInt(lines.shift())
    p1 = 0
    p2 = 0
    if (rodada == 0) {
        break
    }
    for (let i = 0; i < rodada; i++) {
        let linha = lines.shift().split(' ')
        let j1 = parseInt(linha[0])
        let j2 = parseInt(linha[1])
        if (j1 > j2) {
            p1++
        } else if (j2 > j1) {
            p2++
        }
    }
    console.log(`${p1} ${p2}`)
} while (rodada > 0)