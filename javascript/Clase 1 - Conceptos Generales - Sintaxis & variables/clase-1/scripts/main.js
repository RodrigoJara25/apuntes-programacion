alert("Aca estamos dentro del archivo main.js")

/* 
1) forma de declararlo
2) nombre con el cual acceder 
3) ponerle algun valor 
*/

// 1) "var" ya no se usa, no recomendable
var nickname = "Chaman";
console.log(nickname)   // me permite ver la variable en la consola del navegador
/* e deja hacerle print en la consola aunque no este declarada la variable */

// 2)
// debugger
let nickName = "Chaman";
console.log(nickName)
nickName = "Saraza"
console.log(nickName)
// Un valor con let, puede modificar su type
let dato = "dato 1 con let";
console.log(dato)
dato = 2024
console.log(dato)
dato = true
console.log(dato)

// 3) "const" te exige que definas el valor de la variable cuando es declarada
// valores consantes, que no cambian
const year = 2024;
console.log("año " + year);


// JUGANDO CON LET Y CONS

let numero1 = 10;
let numero2 = 20;
let resultado = numero1 + numero2;
console.log("resultado1: " + resultado);
resultado = numero1 / numero2;
console.log("resultado2: " + resultado);
const resta = numero1 - numero2;
console.log("resta: " + resta);
// resta = 40;     // si intento cambiar el valor de una constante, el error aparece en la consola


let nombre = "gerson";
let apellido = "jara";
let mensaje = "Hola " + nombre + " " + apellido + ", qué tal tu día?" ;
console.log(mensaje);

const dolar = 1230;
let monto = 1000;

// funcion para pedir un dato al usuario
nombre = prompt("Dime cuál es tu nombre");
console.log(nombre);

edad = prompt("Dime tu edad");
console.log(edad);

console.log(parseInt(edad))