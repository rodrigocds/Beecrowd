var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let qtd = parseInt(lines.shift())
let resp = 0

for (let i = 0; i < qtd; i++) {
    resp++
    let num = parseInt(lines.shift())
    console.log(`resposta ${resp}: ${num}`)
}