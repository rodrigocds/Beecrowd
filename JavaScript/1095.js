var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let i = 1

for (let j = 60; j > -1; j -= 5) {
    console.log(`I=${i} J=${j}`)
    i += 3
}
