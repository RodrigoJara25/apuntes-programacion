// ARRAYS

// Definicion
const listaDeLibros = ["El alquimista", "Deep Work", "Liderazgo"];
console.table(listaDeLibros);

console.log("El libro almacenado en el index numero 2 es: ".concat(listaDeLibros[1]));  // Tambien pdoemos usar el +

/* const  numeros = [1,2,3,4,5];
console.log( numeros[0] ) // 1; 
console.log( numeros[3] ) // 4; 
let resultado  = numeros[1] + numeros[2] 
console.log( resultado  ) // 5; */

// Recorrer un array
for (let i = 0; i < listaDeLibros.length; i++) {
    console.log(listaDeLibros[i]);        // Si reocrro un index que no tiene nada me saldra "undefined"
}

// length: da la longitud de la lista (siempre le ultimo index de un array es length - 1)


// push --> inlcuir elementos al final del array
// unshift --> incluir elementos al inicio del array
const listaNotas = [];
let nota = parseFloat(prompt("Ingrese la nota de un estudiante. CERO (0) para finalizar"));
while (nota !== NaN && nota > 0) {
    listaNotas.push(nota);
    console.table(listaNotas);
    nota = parseFloat(prompt("Ingrese la nota de un estudiante. CERO (0) para finalizar"))
}

// shift() --> para eliminar el primero
// pop() --> para eliminar el ultimo 
const numeros = [2,5,4,2,7,5,9]

const numero_eliminado = numeros.pop()  // de esta manera puedes saber que numero estas elimnando
console.table(numeros)
console.log(numero_eliminado) 

const numero_eliminado2 = numeros.shift()
console.table(numeros)
console.log(numero_eliminado2) 


// SPLICE : permite eliminar uno ovarios elementos de un array en cualquier posicion
// .splice(index inicio, cantidad de elementos a eliminar desde el inicio)
const nombres = ['Rita', 'Pedro', 'Miguel', 'Ana', 'Vanesa'];

console.log(nombres)

nombres.splice(1, 2)

console.log(nombres)
// ['Rita', 'Ana', 'Vanesa']
// Elimina el index 1 y 2 (empieza en 1 y se eleiminan dos elementos, osea el 2 tambien)


// JOIN
// Crea un string con todos los elementos del array, pero separados por el caracter indidcado
const nombres2 = ["Luis", "Ana", "Julia", "Juan"]

console.log( nombres2.join(", ") )  // el espacio en blanco tambien cuenta
// Luis, Ana, Julia

console.log( nombres2.join("*") ) 
// Luis*Ana*Julia


// CONCAT
// podemos combinar dos Arrays en un único Array resultante, PERO NO ALTERA NINGUNO DE LOS DOS ARRAYS
const perros   = ["Pupy", "Ronnie"]
const gatos = ["Mishi", "Garfield", "Zuri"]
const mascotas = perros.concat(gatos)
console.log(mascotas)
// ["Pupy", “Ronnie”, "Mishi", “Garfield”, "Zuri"]
// En este caso, se juntan ambos array y se printean ya que cuando printeas un array se muestra como un array.
console.table({perros, gatos})


// SLICE
// El método slice devuelve una copia de una parte del Array dentro de un nuevo Array, empezando por el inicio hasta fin (fin no incluído). El Array original no se modificará.
const nombres3 = ['Rita', 'Pedro', 'Miguel', 'Ana', 'Vanesa'];
const masculinos = nombres3.slice(1, 3); // Nuevo array desde la posición 1 a 3 (el 3 no lo incluye)
// masculinos contiene ['Pedro','Miguel']
console.log(masculinos)
// no se modifica el array original


// IndexOf
// El método indexOf() nos permite obtener el índice de un elemento en un array. Recibe por parámetro el elemento que queremos buscar en el array y, 
// en caso de existir, nos retorna su índice. Si el elemento no existe nos retornará como valor: -1
const nombres4 = ['Rita', 'Pedro', 'Miguel', 'Ana', 'Vanesa'];

console.log( nombres4.indexOf('Rita') ) // ⇒ 0 , esta en el indice 0
console.log( nombres4.indexOf('Ana') ) // ⇒ 3 , esta en el indice 3
console.log( nombres4.indexOf('Julieta') ) // ⇒ -1 , porque no existe
// El elemento debe ser identico en type y valor que el elemento buscado



// Includes
// el método includes me permite saber si un elemento que recibo por parámetro existe o no dentro de un array, 
// retornando un valor booleano en caso afirmativo o negativo:
const nombres5 = ['Rita', 'Pedro', 'Miguel', 'Ana', 'Vanesa']

console.log( nombres5.includes('Rita') ) // ⇒ true
console.log( nombres5.includes('Miguel') ) // ⇒ true
console.log( nombres5.includes('Julieta') ) // ⇒ false


// Reverse
// el método reverse() invierte el orden de los elementos dentro de un array.
// el reverse si altera el orden del array original, asi que ojo con eso
const nombres6 = ['Rita', 'Pedro', 'Miguel', 'Ana', 'Vanesa']
console.log(nombres6)
nombres6.reverse()
console.log( nombres6 ) 
// ⇒ ['Vanesa', 'Ana','Miguel', 'Pedro','Rita']


// FOR OF
// La sentencia for...of permite recorrer un array ejecutando un bloque de código por cada elemento del objeto.
const productos = [{id: 1, producto: "Arroz"},
                  {id: 2,  producto: "Fideo"},
                  {id: 3,  producto: "Pan"}];

for (const producto of productos) {
    console.log(producto.id);
    console.log(producto.producto);
    console.table(producto)
}

