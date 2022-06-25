var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var num = lines.shift();

if (num.indexOf('13') != -1) {
    console.log(`${num} es de Mala Suerte`)
} else {
    console.log(`${num} NO es de Mala Suerte`)
}
