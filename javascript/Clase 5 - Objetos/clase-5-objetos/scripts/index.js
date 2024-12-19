console.log("--> Clase 5: Objetos <--")


// Los variables anteriores entran relacionados entre sí, entonces mejor usamos un objeto literal
// Puede ser let (si va a cambiar) o const (si no va a  cambiar sus propiedades)
const persona1 = { 
    nombre: "Homero", 
    apellido: "Simpson",
    edad: 39, 
    calle: "Av. Siempreviva 742", 
    trabajo: "Ingeniero de Sistemas",
}

console.log("Datos del objeto compelto", persona1)

console.log("Otra forma de mostrar los datos completos")
console.log(persona1)

// Mostrar o acceder a los datos individuales 
console.log("Nombre: ", persona1.nombre)
console.log ("Edad: ", persona1.edad)
console.log("Calle", persona1.calle)

// Otra forma de mostrar los datos (va entre " " ya que si no piensa que es una variable)
console.log(persona1["nombre"])
console.log(persona1["edad"])
console.log(persona1["calle"])

// Prototype : permite a una variable encapsular variable so funcionalidades. Js no tiene como tal una forma de usar objetos como Java.

// Acceder a una propiedad y cambiar su valor
persona1["nombre"] = "Marge"
persona1.edad = 36


// Constructor de un objeto con funciones
/* function Persona(nombre, edad, calle) {
    this.nombre = nombre;
    this.edad 	 = edad;
    this.calle  = calle;
}
const persona2 = new Persona("Homero", 39, "Av. Siempreviva 742");
const persona3 = new Persona("Marge", 36, "Av. Siempreviva 742");

console.log("===========================================")
console.log("Nombre de persona 2: ", persona2.nombre)
console.log("Nombre de persona 3: ", persona3.nombre) */

// Ejemplo
function Profesor(nombre, apodo, curso){
    this.nombre = nombre;
    this.apodo = apodo;
    this.curso = curso;
    this.saludar = function () {
        return "Hola, binevenido al curso de " + this.curso + ", mi nombre es " + this.nombre + ". Pero puedes llamarme " + this.apodo;    // es ma conveniente que devuelve el valor y no un alert,ya que luego se puede utilizar para diferentes usos
    }
    this.apodoNombre = function () {
        return "Mi nombre es " + this.nombre + " y mi apodo es " + this.apodo
    }
    this.toString = function (){      // Cuando agregas metodos, debes indicarle a la funcion que va a mostrar cuandos ea llamada en un alert o conosle.log, si no saldra por defecto el type
        return this.nombre
    }
}

let name = prompt("Ingresar el nombre")
let nickname = prompt("Ingresar el apodo")
let course = prompt("Ingresar el curso")

let profesor1 = new Profesor(name, nickname, course);
/* console.log("Valores que asignamos a nuestro Profesor", profesor1);
const saludo = profesor1.saludar()
const nombreApodo = persona1.apodoNombre()
alert(saludo);
alert(nombreApodo) */
alert(profesor1)        // Aca se meustra lo definido en la funcion toString

// Metodos

// JavaScript cuenta con sus propios objetos, incluso ya usamos algunos de ellos sin identificar que son objeto.
// String es un objeto, por lo que tiene sus propios metodos
let cadena = "HOLA CODER";
//Propiedad de objeto String: Largo de la cadena.
console.log(cadena.length);
//Método de objeto String: Pasar a minúscula.
console.log(cadena.toLowerCase());
//Método de objeto String: Pasar a mayúscula.
console.log(cadena.toUpperCase());


// Operador IN y FOR IN

// Puedo recorrer cada propiedad y funcion del objeto creado
for (const propiedad in profesor1) {
    console.log(profesor1[propiedad]);
}


// CLASES
// Sirve para reemplazar a una funcion constructora. Asi no confundimos funciones ocn clases dentro del codigo.
class Persona{
    // Constructor
    constructor(nombre, edad, calle) {
        this.nombre = nombre;
        this.edad   = edad;
        this.calle  = calle;
    }
    // Metodos 
    hablar(){
        console.log("HOLA SOY "+ this.nombre);
    }

}
const personaClase = new Persona("Homero", 39, "Av. Siempreviva 742");  // el 'new' llama al constructor definido
console.log(personaClase)
personaClase.hablar()

// Ejemplo de clase Producto
/* class Producto {
    constructor(nombre, precio) {
        this.nombre  = nombre.toUpperCase();
        this.precio  = parseFloat(precio);
        this.vendido = false;
    }
    sumaIva() {
        this.precio = this.precio * 1.21;
    }
    vender() {
        this.vendido = true;
    }
}
const producto1 = new Producto("arroz", "125");
const producto2 = new Producto("fideo", "50");
producto1.sumaIva();
producto2.sumaIva();
producto1.vender(); */

// Ejemplo 5: Producto (Usamos Clase, aunque tambien pdoemos usar una Funcion Constructora)
class Producto{
    // Inicializacion
    nombre = "";
    descripcion = "";
    categoria = "";
    marca = "";
    precioUnitario = "";
    codigoProducto = "";
    stock = 0;

    // Constructor
    constructor(nombre, descripcion, categoria, marca, precioUnitario, codigoProducto, stock){
        this.nombre = nombre.trim();    // trim() es para quitar los espacios innecesarios
        this.descripcion = descripcion.trim();
        this.categoria = categoria.trim();
        this.marca = marca.trim();
        this.precioUnitario = precioUnitario;
        this.codigoProducto = codigoProducto.trim();
        this.stock = stock;
    }

    toString(){
        return this.descripcion + " (" + this.codigoProducto + ")";
    }

    calcularSubtotal(cantidad){
        return cantidad * this.precioUnitario;
    }
}

const producto1 = new Producto("Harina", "Harina de trigo", "Amacen    ", "Canuelas", 764.54, "20224280", 100)
console.log(producto1)
console.log(producto1.toString())
console.log(producto1.calcularSubtotal(5).toFixed(2))       // toFixed(2) para tener dos decimales

