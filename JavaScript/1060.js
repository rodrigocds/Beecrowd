var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var pos = 0

for (var i = 0; i < 6; i++) {
    var num = (lines.shift())
    if (num > 0) {
        pos++
    }
}

console.log(`${pos} valores positivos`);