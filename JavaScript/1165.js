var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let qtd = parseInt(lines.shift())
let soma

for (let i = 0; i < qtd; i++) {
    let num = parseInt(lines.shift())
    soma = 0
    for (let j = 2; j < num; j++) {
        if (num % j == 0) {
            soma += j
        }
    }
    if (soma > 0) {
        console.log(`${num} nao eh primo`)
    } else {
        console.log(`${num} eh primo`)
    }
}
