var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let qtd = parseInt(lines.shift())
let soma

for (let i = 0; i < qtd; i++) {
    soma = 0
    let num = parseInt(lines.shift())
    for (let j = 1; j < num; j++) {
        if (num % j == 0) {
            soma += j
        }
    }
    if (soma == num) {
        console.log(`${num} eh perfeito`)
    } else {
        console.log(`${num} nao eh perfeito`)
    }
}
