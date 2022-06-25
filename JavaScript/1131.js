var input = require('fs').readFileSync('stdin.txt', 'utf8');
var lines = input.split('\n');

let opcao, grenais = 0, vitInter = 0, vitGremio = 0, empates = 0

do {
    let placar = lines.shift().split(' ')
    let golInter = parseInt(placar[0])
    let golGremio = parseInt(placar[1])
    grenais++
    if (golInter > golGremio) {
        vitInter++
    } else if (golGremio > golInter) {
        vitGremio++
    } else {
        empates++
    }
    console.log('Novo grenal (1-sim 2-nao)')
    opcao = parseInt(lines.shift())
} while (opcao == 1)

console.log(`${grenais} grenais`)
console.log(`Inter:${vitInter}`)
console.log(`Gremio:${vitGremio}`)
console.log(`Empates:${empates}`)

if (vitInter > vitGremio) {
    console.log('Inter venceu mais')
} else if (vitGremio > vitInter) {
    console.log('Gremio venceu mais')
} else {
    console.log('Nao houve vencedor')
}