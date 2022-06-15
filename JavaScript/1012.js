var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

var valores = lines.shift().split(' ')
var a = parseFloat(valores[0])
var b = parseFloat(valores[1])
var c = parseFloat(valores[2])

var tri = (a * c) / 2
var cir = 3.14159 * Math.pow(c, 2)
var tra = ((a + b) * c) / 2
var qua = Math.pow(b , 2)
var ret = a * b

console.log(`TRIANGULO: ${tri.toFixed(3)}`)
console.log(`CIRCULO: ${cir.toFixed(3)}`)
console.log(`TRAPEZIO: ${tra.toFixed(3)}`)
console.log(`QUADRADO: ${qua.toFixed(3)}`)
console.log(`RETANGULO: ${ret.toFixed(3)}`)

//3.0 4.0 5.2
//12.7 10.4 15.2