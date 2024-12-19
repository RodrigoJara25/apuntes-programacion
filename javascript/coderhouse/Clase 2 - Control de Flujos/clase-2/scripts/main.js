console.log("--> Bienvenidos a la clase 2 <--")

// if
// if (condition) {
    
// }

let diaSemana = "miercoles"
if (diaSemana == "miercoles") {
    console.log("coincide")
}
else{
    console.log("no coincide")
}

let monto = parseFloat(prompt("ingresa un monto: "));
if (monto > 1000) {
    alert("mayor a 1000");
}
else if (monto == 1000) {
    alert("igual a 1000");
} 
else {
    alert("menor a 1000");
}

// variable booleana: TRUE or FALSE
const numero = parseFloat(prompt("Ingrese un numero"))
let esMayor;
if (numero > 5) {
    esMayor = true;
    console.log("es mayor a 5")
}
else{
    esMayor = false;
}

// si no convertimos el prompt a numero, la comparacion no se realiza.|
// variable.toString()  --> transformar en string una variable

// debugger
// es para ir viendo paso a paso como se ejecuta el codigo

console.log("es mayor a " + monto)

let nombreIngresado = "ROdrIGO"
if (nombreIngresado.trim().toLowerCase() == "rodrigo") {
    
} else {
    
}

// trim() elimina todos los espacios en blanco
// toLowerCase() pone en minusculas todas las letras
// toUpperCase() pone ne mayuscula todas las letras