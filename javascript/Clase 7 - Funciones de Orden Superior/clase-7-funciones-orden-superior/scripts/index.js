// Funciones de Orden Superior


// Retornar Funcion

function mayorQue(n){       // Devuelvo una funcion
    return (m) => m > n
}

// Definimos que la variable "n" de la funcion mayorQue va a ser 10.
// Ahora a mayorQueDiez le asignamos la funcion flecha asi: 
// mayorQueDiez = (m) => m > 10
let mayorQueDiez = mayorQue(10)

console.log("12 mayor a 10?", mayorQueDiez(12))   // true
console.log("8 mayor a 10?",mayorQueDiez(8))    // false

// Al devolver una funcion flecha, primero asignamos el valor de "n" de la funcion como 10
// y luego con la segunda llamada definimos el "m" de la funcion flecha


// Recibir funciones por parametros

// Funcion generica/dinamica
function porCadaUno(arr, fn) {
    for (const el of arr) {
        fn(el)
    }
}

const numeros= [1, 2, 3, 4]

// Le pasamos como funcion el console.log y array "numeros"
porCadaUno(numeros, console.log)
// 1
// 2
// 3
// 4

console.log("Ejemplo con funcion definida por mi")

const doble = (n) => {
    console.log(n*2);
}

porCadaUno(numeros, doble)


// Metodos/Funciones de orden superior para arrays


// forEach
const numeros2 = [1, 2, 3, 4, 5, 6]
const personas = [{nombre: "Saul", edad: 24}, {nombre: "Rodrigo", edad: 21}]

console.log("Ejemplos")
numeros2.forEach((elemento) => {
    console.log(elemento*2)
})

personas.forEach((persona) => {
    console.log("Hola, " + persona.nombre + ". Tienes " + persona.edad + " anios")
})


// Find
// Para buscar dentro de arrays objetos con un identificasdor unico
// ejem: dni, codigo, etc.
const cursos = [
    {nombre: 'Javascript', precio: 15000},
    {nombre: 'ReactJS', precio: 22000},
    {nombre: 'AngularJS', precio: 22000},
    {nombre: 'Desarrollo Web', precio: 16000},
]

const resultado = cursos.find((el) => el.nombre === "ReactJS")      // Quiero buscar todos los que son "ReactJS"
const resultado2 = cursos.find((el) => el.nombre === "DW")          

console.log(resultado) // {nombre: 'ReactJS', precio: 22000}
console.log(resultado2) // undefined

/* El método find() recibe una función de comparación por parámetro. 
Captura el elemento que se está recorriendo y retorna true o false 
según la comparación ejecutada. El método retorna el primer elemento 
que cumpla con esa condición */


// Filter
const conResultado = cursos.filter((el) => el.nombre.includes('JS'))
const sinResultado = cursos.filter((el) => el.precio < 14000)

console.log(conResultado)
/* [
    {nombre: 'ReactJS', precio: 22000},
    {nombre: 'Angular', precio: 22000}
] */
console.log(sinResultado) // []


// Some
// retorna true o false según el resultado de la iteración de búsqueda.
console.log( cursos.some((el) => el.nombre == "Desarrollo Web")) 
// true
console.log( cursos.some((el) => el.nombre == "VueJS")) 
// false


// Map
/* El método map() crea un nuevo array con todos los elementos del 
original transformados según las operaciones de la función enviada 
por parámetro. Tiene la misma cantidad de elementos pero los 
almacenados son el return de la función.
Aplica una propiedad a todos los elementos del array segun le sea indicado */

// Obtener la lista de todos los nombre de los cursos
const nombres = cursos.map((el) => el.nombre)
console.log(nombres)
// [ 'Javascript', 'ReactJS', 'AngularJS', 'Desarrollo Web' ]


// Reduce
// resume el array a un único valor de retorno
/* Ejemplos de aplicación:
    - Cuando queremos acumular la suma de alguna propiedad de los elementos,
    - O cuando deseamos obtener algún resultado general sobre todo el array. 
 */

const numeros4 = [1, 2, 3, 4, 5, 6]
const total = numeros4.reduce((acumulador, elemento) => acumulador + elemento, 0)

console.log(total) // 21

// Sort
/* El método sort() nos permite reordenar un array según un criterio 
que definamos. Recibe una función de comparación por parámetro que, 
a la vez, recibe dos elementos del array.  */
// Este metodo es destructivo, osea modifica al array original
const numeros6 = [ 40, 1, 5, 200 ];
numeros6.sort((a, b) => a - b);  // [ 1, 5, 40, 200 ]
console.log(numeros6)
numeros6.sort((a, b) => b - a);  // [ 200, 40, 5, 1 ]
console.log(numeros6)

const items = [
    { name: 'Pikachu', price: 21 },
    { name: 'Charmander', price: 37 },
    { name: 'Pidgey', price: 45 },
    { name: 'Squirtle', price: 60 }
  ]
items.sort((a, b) => {
    if (a.name > b.name) {
        return 1;
    }
    if (a.name < b.name) {
        return -1;
    }
    // a es igual a b
    return 0;
})
console.log(items)