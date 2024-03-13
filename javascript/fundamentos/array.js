const valores = [7.7, 8.9, 6.3, 9.2]
console.log(valores[0], valores[3])
console.log(valores[4])

valores[4] = 10
console.log(valores)
console.log(valores.length)

//possivel misturar numeros, objetos, boolean, null, texto em um array, porém não é indicado
valores.push({id: 3}, false, null, 'teste')
console.log(valores)

//jeitos de remover de um array
console.log(valores.pop())
delete valores[0]
console.log(valores)


// um array é um objeto
console.log(typeof valores)