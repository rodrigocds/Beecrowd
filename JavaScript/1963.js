var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let preco = lines.shift().split(' ')

let antigo = parseFloat(preco[0])
let novo = parseFloat(preco[1])

let porcentagem = ((novo - antigo) / antigo) * 100

console.log(`${porcentagem.toFixed(2)}%`)