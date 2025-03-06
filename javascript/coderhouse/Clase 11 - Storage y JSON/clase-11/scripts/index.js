console.log("Hola, comenzamos con el tema de STORAGE & JSON");

// Ejemplo con numero
/* let numero = parseInt(prompt("Un numero: "))
localStorage.setItem("unNumero", numero)
let numeroRecuperado = localStorage.getItem("unNumero")
alert("El valor que tiene la clave unNumero en local storage es: " + numeroRecuperado)
console.log("El valor que tiene la clave unNumero en local storage es: ", numeroRecuperado)

sessionStorage.setItem("unNumeroEnSession", numero)
let numeroRecuperadoFromSession = sessionStorage.getItem("unNumeroEnSession")
alert("El valor que tiene la clave unNumeroEnSession en session storage es: " + parseInt(numeroRecuperadoFromSession))
console.log("El valor que tiene la clave unNumeroEnSession session storage es: ", parseInt(numeroRecuperadoFromSession)) */


// Ejemplo con texto
/* let texto = prompt("Un texto: ")
localStorage.setItem("untexto", texto)
let textoRecuperado = localStorage.getItem("untexto")
alert("El valor que tiene la clave untexto en local storage es: " + textoRecuperado)
console.log("El valor que tiene la clave untexto en local storage es: ", textoRecuperado)

sessionStorage.setItem("untextoEnSession", texto)
let textoRecuperadoFromSession = sessionStorage.getItem("untextoEnSession")
alert("El valor que tiene la clave untextoEnSession en session storage es: " + textoRecuperadoFromSession)
console.log("El valor que tiene la clave untextoEnSession session storage es: ", textoRecuperadoFromSession) */


// Ejemplo con Objeto Literal
/* let respuesta = confirm("Saliste en las fiestas de fin de anio?")
localStorage.setItem("unrespuesta", respuesta)
let respuestaRecuperado = localStorage.getItem("unrespuesta")
console.log("El valor que tiene la clave unrespuesta en local storage es: ", respuestaRecuperado == "true") */


// Ejemplo con objeto literal
/* let usuario = {
    nombre: "Rodrigo",
    apellido: "Jara"
} */

// Cuanbdo queremos mostrar el contenido de un objeto literal o un array almacenado en el local o session sotrage
// no se muestra, si no que solo sale el type de dato que esta alamcenado
// Asi que debemos tomar otra manera para poder acceder a los valores del array o del objeto. CON UN BUCLE.

// sessionStorage: se guarda ifnromacion sensible (informacion de sesion, contrasenas, tarjeta de credito). Cosas que cuando se cierra el navegador, se deberia de borrar.

//Ciclo para recorrer las claves almacenadas en el objeto localStorage
/* for (let i = 0; i < localStorage.length; i++) {
    let clave = localStorage.key(i);
    console.log("Clave: "+ clave);
    console.log("Valor: "+ localStorage.getItem(clave));
    console.log("--------------------------------------");
}
 */

// ELIMINAR DATOS DEL STORAGE
// Tambien podemos eliminar un elemento especifico o todos los elementos del local/session storage
/* localStorage.setItem('bienvenida', '¡Hola Code!');
sessionStorage.setItem('esValido', true); */

//localStorage.removeItem('bienvenida');  // Elimina un elemento especifico (con la clave)
//sessionStorage.removeItem('esValido');  // Elimina un elemento especifico (con la clave)
//localStorage.clear()    //elimina toda la información
//sessionStorage.clear() //elimina toda la información 


// JSON

// Ejemplo Stringify
const unProducto = { id: 2, nombre: "Arroz", precio: 987 };
const enTextoPlanoDeJSON = JSON.stringify(unProducto);

console.log(enTextoPlanoDeJSON); // {"id":2,"nombre":"Arroz","precio":987}
console.log(typeof unProducto); // object   (type del objeto)
console.log(typeof enTextoPlanoDeJSON);    // string    (type del JSON)

localStorage.setItem("unProductoObject", unProducto);
localStorage.setItem("unProductoString", enTextoPlanoDeJSON);
// Se guarda {"id":2,"nombre":"Arroz"} en el localStorage

// EJemplo Parse
// Recuperamos el dato JSON del local storage
console.log("Valor recuperado del unProductoString", JSON.parse(localStorage.getItem("unProductoString")));
// El resultado de esta recuperacion del JSON es un OBJETO. Es decir, te devuelve un type Object y no un String.

// Si intenamos convertir un elemento de localStorage que no fue enviado como JSON, entonces dara error
// console.log("Valor recuperado del unProductoObject", JSON.parse(localStorage.getItem("unProductoObject")));


