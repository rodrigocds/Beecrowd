var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift())
var y = parseInt(lines.shift())
var tot = 0

if (x > y) {
    for (var i = y; i <= x; i++) {
        if (i % 13 != 0) {
            tot += i
        }
    }
} else {
    for (var i = x; i <= y; i++) {
        if (i % 13 != 0) {
            tot += i
        }
    }
}

console.log(tot)