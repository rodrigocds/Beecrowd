var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

do {
    var senha = parseInt(lines.shift())
    if (senha == 2002) {
        console.log('Acesso Permitido')
    } else {
        console.log('Senha Invalida')
    }
} while (senha != 2002)