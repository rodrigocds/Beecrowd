var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let qtd = parseInt(lines.shift())

for (let i = 0; i < qtd; i++) {
    let linha = lines.shift().split(' ')
    let x = parseInt(linha[0])
    let y = parseInt(linha[1])

    let rafael = (Math.pow(3 * x, 2)) + (Math.pow(y, 2))
    let beto = (2 * Math.pow(x, 2)) + Math.pow(5 * y, 2)
    let carlos = (-100 * x) + (Math.pow(y, 3))

    if (rafael > beto && rafael > carlos) {
        console.log('Rafael ganhou')
    } else if (beto > rafael && beto > carlos) {
        console.log('Beto ganhou')
    } else {
        console.log('Carlos ganhou')
    }
}