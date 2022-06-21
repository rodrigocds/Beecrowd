var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var qtd = parseInt(lines.shift())

for (var i = 1; i <= qtd; i+= 2) {
    console.log(i)
}
