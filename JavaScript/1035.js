var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var val = lines.shift().split(' ')

var A = parseInt(val[0])
var B = parseInt(val[1])
var C = parseInt(val[2])
var D = parseInt(val[3])

if ((B > C) && (D > A) && (C + D > A + B) && (C > 0 && D > 0) && (A % 2 == 0)) {
    console.log('Valores aceitos');
} else {
    console.log('Valores nao aceitos');
}

//5 6 7 8
//2 3 2 6