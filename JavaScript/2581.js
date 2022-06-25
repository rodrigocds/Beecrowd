var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let qtd = parseInt(lines.shift())

for (let i = 0; i < qtd; i++) {
    let pergunta = lines.shift()
    console.log('I am Toorg!')
}
