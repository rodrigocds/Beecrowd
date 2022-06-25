var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let x, y

do {
    let linha = lines.shift().split(' ')
    x = parseInt(linha[0])
    y = parseInt(linha[1])
    if (x == 0 && y == 0) {
        break
    }
    console.log(x + y);
} while (x > 0 && y > 0)