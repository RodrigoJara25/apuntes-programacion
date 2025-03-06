console.log("--> Bienvenidos a la clase 12: Operadores avanzados <--");

let tareas = [];
let ultimaTarea = null;
const DEFAULT_STATE = new State(1, "Pendiente");
const LENGGTH_LIMIT = 60;

const mapObjectToClass = ({ id, description, state: { id: stateId, name: stateName, textColorClass, bgColorClass, key: stateKey, }, date } = null) => {
    if (!id) { return null }
    return new Task(id, description, new State(stateId, stateName, textColorClass, bgColorClass, stateKey), new Date(date));
}

const recuperarDelStorage = () => {
    // Convertimos el objeto tareareCuperada (objeto literal) en un objeto con el prototipo de class Task
    ultimaTarea = mapObjectToClass(JSON.parse(localStorage.getItem("ultimaTarea")));

    // Convertimos la lista en formato JSON en una lista de objetos literales
    const misTareasRecuperadas = JSON.parse(localStorage.getItem("misTareas")) || [];

    // Convertimos la lista misTareasRecuperadas (lista de objetos literales) en una lista de objetos con el prototipo de class Task
    tareas = [];
    misTareasRecuperadas.forEach((entity) => {
        const restored = mapObjectToClass(entity);
        tareas.push(restored);
    });

    // Si el proyecto no necesita de prototipo de clase, podemos dejar en una sola línea de código (si no necesitamos convertirlo de JSON a objeto)
    //tareas = JSON.parse(localStorage.getItem("misTareas")) || [];
}

// Evaluamos si existe la lista persistida y la cargamos a la memoria.
// La primera vez que lo ejecutes sin tener nada persistido va a explotar, porque los objetos asociados a las claves son nulos, te invito a programar un salvaguardas.
recuperarDelStorage();

const buscarTereaPorNombre = (nombre) => {
    return tareas.find((task) => task.description.toLowerCase() === nombre.trim().toLowerCase());
}

const validarNombreTarea = (nombre = "") => {
    // 1) Que no sea vacía
    const default_message = "El nombre de la tarea no puede ser vacía.";
    if (!nombre) { return default_message }
    if (nombre.trim().length === 0) { return default_message }

    // 2) Limitar la cantidad máxima de caracteres - 20
    if (nombre.trim().length > LENGGTH_LIMIT) {
        return "El nombre de la tarea no puede superar los " + LENGGTH_LIMIT.toString() + " caracteres."
    }
    return null;
}

const crearTerea = (nombre) => {
    // 2) Validar algún aspecto del nombre de la tarea
    const error = validarNombreTarea(nombre);
    if (error !== null) {
        alert(error);
        return false;
    }

    // 3) Corroborar que no existan duplicados
    const tarea = buscarTereaPorNombre(nombre);
    if (tarea) {
        alert("La tarea ya existe");
        return false;
    }

    // 1) Crear una tarea
    const nuevaTarea = new Task(tareas.length + 1, nombre, DEFAULT_STATE);
    localStorage.setItem("ultimaTarea", JSON.stringify(nuevaTarea));
    // Indicar globalmente cuál es la última tarea creada
    ultimaTarea = nuevaTarea;
    // Agregar dicha tarea a la lista de tareas en memoria
    tareas.unshift(nuevaTarea);
    localStorage.setItem("misTareas", JSON.stringify(tareas));
    return true;
}

const form = document.getElementById("task-form");

form.addEventListener("submit", (event) => {
    event.preventDefault();
    const nombreTarea = form.children[0].value;
    if (crearTerea(nombreTarea)) {
        // 4) Intentar listar las tareas en la UI
        console.table(tareas);
        // 5) Limpiar el fomrualrio
        form.reset();
    }
});

// =========================== CLASE 12: OPERADORES AVANZADOS I =============================


/* const esCaluroso = () => {
    alert("Es un dia caluroso!") 
    console.log("Es un dia caluroso!")
}

const noEsCaluroso = () => {
    alert("Es un dia agradable!") 
    console.log("Es un dia caluroso!")
}

// Operador ternario
let tempratura = parseInt(prompt("Ingresa una temperatura"))
tempratura > 28 ? esCaluroso() : noEsCaluroso() */

//  Determinar si entra en una fila de espera (solamente la edad: 60 años)
const unaPersona = {
    edad: 59
}

// let preferente = (unaPersona.edad >= 60) ? true : false;
let preferente = (unaPersona.edad >= 60) ? true : false;

const filaComun = []
const filaPreferencial = []

unaPersona.edad >= 60 ? filaPreferencial.push(unaPersona) : filaComun.push(unaPersona); 
//preferente ? filaPreferencial.push(unaPersona) : filaComun.push(unaPersona)


// Operador Logico "AND" para simplificar un if, solo cuando la condicion verdadera
const carrito = []

if (carrito.length === 0) {
  console.log("El carrito está vacío!")
}

// con operador AND
carrito.length === 0 && console.log("El carrito está vacío!")


// En caso no se cumpla la condicion, se devuelve FALSE
const usuario = {
    nombre: "John Doe",
    edad: 14
}
const registroIngreso = usuario.edad >= 18 && new Date()

console.log(registroIngreso) // FALSE


// Operador Logico "OR"
// Si el primer operando es diferente de "FALSY", se retorna el primer operando. 
// Si el primer operando es "FALSY", se retorna el segundo operando.
console.log( 0 || "Operando 2")  // Falsy
console.log( 40 || "Falsy")  // 40
console.log( null || "Falsy")  // Falsy
console.log( undefined || "Falsy")  // Falsy
console.log( "Hola Mundo" || "Falsy")  // Hola Mundo
console.log( "" || "Falsy")  // Falsy
console.log( NaN || "Falsy")  // Falsy
console.log( true || "Falsy")  // true
console.log( false || "Falsy")  // Falsy

const usuario1 = null

console.log( usuario1 || "El usuario no existe");

/* let carrito2
let carritoLocalStorage = JSON.parse( localStorage.getItem('carrito') )
if (carritoLocalStorage) {  // verificar que el carritoLocalStorage no sea Falsy (osea sea Truthy)
    carrito2 = carritoLocalStorage
} else {    // si el carrito es null, lo define como un array vacio
    carrito2 = []
}
console.log(carrito2) */

// Es lo mios que la lgoica anterior, pero con OR
const carrito2 = JSON.parse(localStorage.getItem('carrito')) || []

// Operador Nullish Coalescing
// Solo acpeta como falsy: null y undefined

console.log("========== Operador Nullish ===========");
console.log( 0 ?? "Nullish")  // 0
console.log( 40 ?? "Nullish")  // 40
console.log( null ?? "Nullish")  // Nullish
console.log( undefined ?? "Nullish")  // Nullish
console.log( "Hola Mundo" ?? "Nullish")  // Hola Mundo
console.log( "" ?? "Nullish")  // ""
console.log( NaN ?? "Nullish")  // NaN
console.log( true ?? "Nullish")  // true
console.log( false ?? "Nullish")  // false

// ============== ACCESO CONDICIONAL: ?. ==================

const usuario2 = null;

// Si queremos acceder a la propiedad/atributo de un objeto y este no existe, sirve para prevenir un error
// console.log(usuario2.nombre || "El usuario no existe");      -> esto da error ya que no se puede ingresar a la propiedad de un null
console.log(usuario2?.nombre);  // Esto devuelve un undefined
console.log(usuario2?.nombre || "El usuario no existe") ;

const user = {
    nombre: "John Doe",
    edad: 22,
    cursos: {
      javascript: "aprobado"
    }
}
  
console.log( user?.cursos?.javascript || "La propiedad no existe")
// "aprobado"
console.log( user?.trabajos?.coderhouse || "La propiedad no existe")
// "La propiedad no existe"


// ============== Desestructuracion ===================
// SYNTAXIS: const { prop1, prop2 } = objeto

// OJO: para usar esto, hay que tener confirmado que EL OBJETO (no las propiedades) EXISTE, ya que si no dara error al acceder a un objeto que no existe.

// El nombre de la variable debe tener el mismo nombre que la propiedad del objeto
const unaTarea = new Task()
const {
    // id,
    description,
    // state,
    // date,  => no es necesario tomar todas las propiedades
} = unaTarea;
console.log(description);


// VENTAJAS: si es que una propiedad fuera null, la desestructuracion daria undefined en la variable creada (description, por ejemplo)
// EN CAMBIO, si usamos description = unaTarea.description, esto reventaria.
const {dia} = unaTarea; // undefined

// Otro ejemplo de DESESTRUCTURACION
const usuario3 = {
    nombre: "John Doe",
    edad: 32,
    telefono: {
        cel: 113334444,
        casa: null,
        trabajo: 113325555
    }
}

const { 
    nombre, 
    telefono: {
        trabajo
    } 
} = usuario3

console.log(nombre) // "John Doe"
console.log(trabajo) // 113325555


// ============== ALIAS ===================
// Permite declarar la variable con un nombre alternativo tras haber desestructurado el objeto.
console.log("============ ALIAS ===========");

const item = {
    item_id: 432,
    product_name: "Some product",
    price_per_unit: 5600
}

const {
    item_id: id,    // le ponemos "id" al item_id
    product_name: nombreProducto,   // le ponemos "nombreProducto" al product_name 
    price_per_unit: precio  // le ponemos "precio" al price_per_unit
} = item

console.log(id) // 432
console.log(nombreProducto) // "Some product"
console.log(precio) // 5600


// ============== DESESTRUCTURACION EN PARAMETROS =============
console.log("Desestructurar todos los objetos con una funcion");

const producto = {
    id: 10,
    nombre: "Curso Javascript",
    precio: 12500
}

/* const desestructurar = (item) => {
    // desestructurando dentro del bloque
    const {id, nombre} = item
    console.log(id, nombre)
}

desestructurar(producto) // 10 Curso Javascript */


// desestructurando lo que reciba por parámetro
const desestructurar = ( {id, nombre} ) => {
    console.log(id, nombre)
}

desestructurar(producto) // 10 Curso Javascript


// Ejemplo con EVENTOS: el evetno click nos permite saber las coordenadas xy (entre otras cosas) de donde se presiona el click
window.addEventListener('click', ( {x, y} ) => {
    console.log(x, y)
})

// ========== Desestructuracion de arrays ==========
// Para arrays, la desestructuracion es posicional

const nombres = ["Juan", "Julieta", "Carlos", "Mariela"]

const [a, b] = nombres

console.log(a) // "Juan"
console.log(b) // "Julieta"

// omito las dos primeras posiciones
const [,, c, d] = nombres

console.log(c) // "Carlos"
console.log(d) // "Mariela"
