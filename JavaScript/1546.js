var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let qtd = parseInt(lines.shift())

while (qtd > 0) {
    let caso = parseInt(lines.shift())
    for (let i = 0; i < caso; i++) {
        let num = parseInt(lines.shift())
        switch (num) {
            case 1: console.log('Rolien')
                break
            case 2: console.log('Naej')
                break
            case 3: console.log('Elehcim')
                break
            case 4: console.log('Odranoel')
                break
        }
    }
    qtd--
}