var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var num = parseInt(lines.shift())

for (var i = 1; i <= 10; i++) {
    console.log(`${i} x ${num} = ${num * i}`)
}