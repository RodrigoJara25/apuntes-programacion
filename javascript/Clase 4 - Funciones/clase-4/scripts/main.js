console.log("Clase 4: Funciones")

/* // Definicion de una funcion
function saludar(){
    alert("Hola, esta es la funcion saludar()")
}

// Llamar a la funcion
saludar() */


/* // Definicion de funcion para pedir nombre
function solicitarNombre(){
    let nombreIngresado = prompt("Ingresar nombre");
    alert("El nombre ingresado es " + nombreIngresado);
}

solicitarNombre() */


// ============================ FUNCIONES CON PARAMETROS ===================================

/* function mostrarSaludo(nombreIngresado) {
    alert("Hola, " + nombreIngresado + " bienvenido a la clase 4.");
}

let nombre = prompt("Ingresar nombre")
mostrarSaludo(nombre)

mostrarSaludo("Saul") */

/* function mostrarSaludoPorCurso(nombreEstudiante, nombreCurso) {
    alert("Hola, " + nombreEstudiante + " bienvenido al curso de " + nombreCurso)
}

let nombre = prompt("Ingresar nombre")
let nombre_curso = prompt("Ingresar nombre del curso")

mostrarSaludoPorCurso(nombre, nombre_curso) */


// Uso de funciones y el retorno de valores
function sumar(primerNumero, segundoNumero) {
    return primerNumero + segundoNumero;
}
let resultado = sumar(5, 8);
console.log("Resultado de la funcion sumar: " + resultado)

// Tambien puedo: definir una variable y cambiarle el valor dentro de una funcion (aunque no la pases como parametro)
/* //Declaración de variable para guardar el resultado de la suma
let resultado = 0;
//Función que suma dos números y asigna a resultado
function sumar(primerNumero, segundoNumero) {
    resultado = primerNumero + segundoNumero
}
//Función que muestra resultado por consola
function mostrar(mensaje) {
    console.log(mensaje)
}
//Llamamos primero a sumar y luego a mostrar
sumar(6, 3);            
mostrar(resultado);  */


// ejemplo de calculadora
function calculadora(primerNumero, segundoNumero, operacion) {
    switch (operacion) {
        case "+":
            return primerNumero + segundoNumero;
            break;
        case "-":
            return primerNumero - segundoNumero;
            break;
        case "*":
            return primerNumero * segundoNumero;
            break;
        case "/":
            return primerNumero / segundoNumero;
            break;
        default:
            return 0;
            break;
    }
}
console.log(calculadora(10, 5, "*"));
console.log(calculadora(10, 5, "+"));
console.log(calculadora(10, 5, "-"));
console.log(calculadora(10, 5, "/"));


// ========================== Funciones Anonimas =======================================
console.log("Funciones anonimas\n")

//Generalmente, las funciones anónimas se asignan a variables declaradas como constantes
const suma  = function (a, b) { return a + b }
const resta = function (a, b) { return a - b }
console.log( suma(15,20) )
console.log( resta(15,5) )


// ========================== Funciones Flechas =======================================
// Identificamos a las funciones flechas como funciones anónimas de sintaxis simplificada. 
const suma2  = (a, b) => { return a + b }
//Si es una función de una sola línea con retorno podemos evitar escribir el cuerpo.
const resta2 = (a, b) =>  a - b ;
console.log( suma2(15,20) )
console.log( resta2(20,5) )

