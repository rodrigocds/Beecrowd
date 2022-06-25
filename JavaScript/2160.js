var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let texto = lines.shift()

if (texto.length > 80) {
    console.log('NO')
} else {
    console.log('YES')
}