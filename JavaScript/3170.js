var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let bolinha = parseInt(lines.shift())
let galho = parseInt(lines.shift())

if (galho % 2 != 0) {
    galho--
}

let metade = galho / 2

if (bolinha >= metade) {
    console.log('Amelia tem todas bolinhas!')
} else {
    let falta = metade - bolinha
    console.log(`Faltam ${falta} bolinha(s)`)
}