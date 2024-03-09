const [a] = [10]
console.log(a)

// guardando valores de um array em variaveis
const [n1, , n3, , n5, n6 = 0] = [10, 7, 9, 8]
console.log(n1, n3, n5, n6)


// , esta ignorando, nesse esse exemplo ele ignora o primeiro array e o primeiro valor do segundo array, dessa forma imprimindo o numero 6
const [, [, nota]] = [[, 8, 8], [9, 6, 8]]
console.log(nota)