/* 
6. Comprobar si una variable contiene texto
Desarrollaremos una forma de identificar a nuestro usuario dentro de la aplicación, y
si este está identificado (con algún nombre de usuario por ejemplo) le permitiremos
acceso a algunas características del sitio que un usuario no registrado no puede
acceder. 
*/

let nickname = "  "
let nickname_verificado = nickname.trim()
if (nickname_verificado !== "") {
    console.log("Hola " + nickname_verificado + ", tienes acceso a la plataforma")
} else {
    console.log("No tienes un nickname, por lo tanto no tienes acceso a la plataforma")
}