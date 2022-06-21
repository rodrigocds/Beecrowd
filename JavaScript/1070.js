var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let entrada = parseInt(lines.shift())

if (entrada % 2 == 0) {
    entrada++
}

console.log(entrada)

for (let i = 0; i < 5; i++) {
    entrada += 2
    console.log(entrada)
}