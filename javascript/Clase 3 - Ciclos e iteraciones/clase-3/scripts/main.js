console.log("--> Bienvenidos a la clase 3: Ciclos e Iteraciones <--")

// const numero = parseInt(prompt("Ingresa un numero"))

// Ejemplo de ciclo for basico
// (desde,      hasta,      actualizacion)
/* for (let pasoActual = 1; pasoActual < 11; pasoActual++) {
    // Aca va el bloque de codigo
    //debugger
    console.log(pasoActual.toString() + " * " + numero + " = " + (pasoActual*numero).toString())

} */

// break
// es para terminar un bucle
/* for (let i = 1; i <= 10; i++) {
    //Si la variable i es igual 5 interrumpo el for. 
    if(i == 5){
        break;
    }
    console.log(i);
} */

// continue
// cuando escribimos una estructura for, necesitamos que bajo cierta condición, el ciclo saltee esa repetición y siga con la próxima. 
// Para eso se utiliza la sentencia continue.
/* for (let i = 1; i <= 10; i++) {
    //Si la variable i es 5, no se interpreta la repetición
    if(i % 2 === 0){    // si es par, no se imprime
        continue;
    }
    console.log(i);
} */

// Para comparaciones (estrictas)
// ===
// !==

// WHILE
/* const real_password = "F3rnet"
const attempt_limit = 3
let attempt = 0

let password = prompt("Ingresa la contraseña")

while (password !== real_password && attempt < attempt_limit - 1) {
    password = prompt("Ingresa la contraseña")
    attempt++
}
// Verificar si se ingresó correctamente
if (password === real_password) {
    alert("¡Acceso concedido!");
} else {
    alert("No pudiste ingresar.");
} */

// DO-WHILE
// Al menos se ejecuta una vez
real_password = "hola"
let ingreso
do {
    ingreso = prompt("Ingrese contaseña")
} while (ingreso !== real_password);


// SWITCH
// Se puede usar como un if, pero es mas ordenado

let entrada = prompt("Ingresar un nombre");
//Repetimos hasta que se ingresa "ESC"
while(entrada != "ESC" ){
   switch (entrada) {
       case "ANA":
            alert("HOLA ANA");
            break;
        case "JUAN":
            alert("HOLA JUAN");
            break;
       default:
           alert("¿QUIÉN SOS?")
           break;
   }
   entrada = prompt("Ingresar un nombre");
}
