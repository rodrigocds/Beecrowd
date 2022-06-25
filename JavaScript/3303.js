var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let palavra = lines.shift()

if (palavra.length >= 10) {
    console.log('palavrao')
} else {
    console.log('palavrinha')
}
