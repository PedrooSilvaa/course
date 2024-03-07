const escola = "Cod3r"

// letra da posicao indicada
console.log(escola.charAt(4))
console.log(escola.charAt(5)) // vazio pq nao existe 

// valor da tabela unicode
console.log(escola.charCodeAt(3))

// posicão da letra indicada
console.log(escola.indexOf('r'))

// a partir da posicao indicada pra frente || a partir da posicao indicada e antes da outra posicao indicada
console.log(escola.substring(1))
console.log(escola.substring(0, 3))

// concatenar
console.log('Escola '.concat(escola).concat('!'))
console.log('Escola ' + escola + '!')

/*
Substituir 
(/\d/, ''e) => todos digitos pela letra "e" 
(/\w/g, 'e') => todas as letras por "e"
*/

console.log(escola.replace(3, 'e'))
console.log(escola.replace(/\w/g, 'e'))
console.log(escola.replace(/\d/, 'e'))

console.log('Ana,Pedro,Maria'.split(','))