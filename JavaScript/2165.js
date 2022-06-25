var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let texto = String(lines.shift())

if (texto.length > 140) {
    console.log('MUTE')
} else {
    console.log('TWEET')
}