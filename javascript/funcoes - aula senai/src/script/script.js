// function olaMundo(valor){
//     alert('ola mundo!!')

// }

// // function declaration
// function olaMundo(valor) {
//     alert(valor);
// }

// //anonymous function
// (function (valor) {
//     alert(valor);
// })('teste');

// // IIFE - Imediately Invoke Function Express
// (function (a, b, c) {
//     alert(a + b + c);
// })(1, 2, 3);


// // function express
// const alertar = function(d,e,f){
//     alert(d + e + f);
// }

// alertar(3,3,3);

// // function express
// const soma = function(d,e,f){
//     return d + e + f;
// }

// console.log(soma(3,3,3));


// // function arrow
// const somaDois = (g, h) => {
//     return g + h;
// }

// const subtracao = (i , j) => i - j
// console.log(subtracao(2, 6))


let seg = 0;
let min = 0;
const segundos = () => console.log(seg += 1)
const minutos = () => console.log(min += 1)

if(min < 3){
    setInterval(minutos, 60000);
    setInterval(segundos, 1000);
}

