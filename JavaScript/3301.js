var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let idades = lines.shift().split(' ')
let h = parseInt(idades[0])
let z = parseInt(idades[1])
let l = parseInt(idades[2])

if ((h < z && h > l) || (h > z && h < l)) {
    console.log('huguinho')
} else if ((z < h && z > l) || (z > h && z < l)) {
    console.log('zezinho')
} else if ((l < h && l > z) || (l > h && l < z)) {
    console.log('luisinho')
}
