var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(' ')

let disPala = parseInt(linha[0])
let diaPalaSauron = parseInt(linha[1])
let diaPalaSaruman = parseInt(linha[2])

let ICM = parseFloat(disPala / (diaPalaSauron + diaPalaSaruman))

console.log(ICM.toFixed(2))