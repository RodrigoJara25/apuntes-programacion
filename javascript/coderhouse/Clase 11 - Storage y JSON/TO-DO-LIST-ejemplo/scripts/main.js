console.log("--> Bienvenidos a la clase 10: Eventos <--");

const saludar = () => {
    alert("Hola mundo")
}

//const boton = document.getElementById("my-button");
// Opción 1: usar el addEventListener
//boton.addEventListener("click", saludar);

// Opción 2: (evaluar si lleva () )
//boton.onclick = saludar;

// Opción 3: no recomendamos usar.
// <input type="button" value="CLICK2" onclick="alert('Respuesta 3');" />

// NOTA: es preferible usar los "id" para los eventos si es que se trata de un solo elemento
//       Si vamos a aplicarlo a un conjunto de elementos, si comviene usar las clases

const hacerAlgo = (eventoNombre) => {
    console.log("El evento ejecutado es: " + eventoNombre)
}

// Manejar EVENTOS con el MOUSE
const input = document.getElementById("task-form-description"); // Me interesa solo un unico elemento en especifico
console.log("input de nueva tarea: ", input)

/* input.addEventListener("mousedown", () => hacerAlgo("mousedown"));     // si mi funcion recibe un parametro, entonces necesito definir si o si una arrow function
input.addEventListener("mouseup", () => hacerAlgo("mouseup"));
input.addEventListener("mousemove", () => hacerAlgo("mousemove"));
input.addEventListener("mouseout", () => hacerAlgo("mouseout"));
input.addEventListener("mouseover", () => hacerAlgo("mouseover"));
input.addEventListener("click", () => hacerAlgo("click")); */

// Manejar EVENTOS con el TECLADO
/* input.addEventListener("keydown", () => hacerAlgo("keydown"))
input.addEventListener("keyup", () => hacerAlgo("keyup")) */
/* input.addEventListener("change", () => hacerAlgo("change"))     // El "CHANGE" es el que mas se usa normalmente
input.addEventListener("input", () => hacerAlgo("input"))   // Por cada tecla que se presione, se detecta (ya sea un caracter, un delete, etc.) ==> para ir mostrando la cantidad de caracteres que vas escribiendo */


// EJEMPLO
// Obtener la informacion de un evento
/* const form = document.getElementById("task-form")
form.addEventListener("submit", (event) => {
    event.preventDefault();     // evita que un evento se ejecute de manera predeterminada por el navegador
    // En este caso, evita que el formulario se envie Y LA PAGINA SE RECARGUE (que es una funcion de Google, cuando se presiona ENTER)
    console.log(event);
}) */
// isTrusted: true  ==> significa que ese evento fue generado por un usuario (y no por un script) para mayor seguridad
// bubbles: true    ==> indica que la informacion enviada/recibida en ese evento puede ser enviada a un "elemento" padre (del input al formulario, del formulario al body, etc.)
// cancelBubble: false   ==> si el bubble es cancelable
// cancelable: true   ==> si el evento puede ser cancelado
// currentTarget: true  ==> si esta asociado a un elemento que va a hacer algo
// defaultPrevented: true   ==> si aplicamos el preventDefault en el codigo
// target: form#task-form   ==> indica quien fue el responsable de enviar el evento (En este caso, el encargado fue el input. En otro caso, puede ser todo el formulario, un boton, etc.)
// type: "submit"   ==> el tipo de evento que se lanzo


// Darle un poco de vida al ejemplo (MAS FUNCIONALIDADES A LA PAGINA)
// 1) Crear una tarea
// 2) Validar algun aspecto del nombre de la tarea
// 3) Corroborar que no existan duplicados
// 4) Intentar listar las tareas en la UI
// 5) Limpiar el formulario

// buscar tarea por nombre
let tareas = [];
let ultimaTarea = null
const DEFAULT_STATE = new State(1, "Pendiente")

const mapObjectToClass = (entity) => {
    return new Task(entity.id, entity.description, new State(entity.state.id, entity.state.name, entity.state.textColorClass, entity.state.bgColorClass, entity.state.key), new Date(entity.date))
}

const recuperarDelStorage = () => {
    // Recuperamos el objeto en formato JSON
    const tareasJSONFormat = localStorage.getItem("ultimaTarea")
    // Recuperamos el objeto literal
    const tareaEecuperada = JSON.parse(tareasJSONFormat)
    // Convertimos el objeto tareaRecuperada (objeto literal) en un objeto con el prototipo de class Task
    ultimaTarea = mapObjectToClass(tareaEecuperada)
    tareas = []
    const misTareasJSONFormat = localStorage.getItem("misTareas")
    const misTareasRecuperadas = JSON.parse(misTareasJSONFormat)
    misTareasRecuperadas.forEach((entity) => {
        const restored = mapObjectToClass(entity)
        tareas.push(restored)
    })
}

recuperarDelStorage();

const buscarTareaPorNombre = (nombre) => {
    return tareas.find((task) => task.description.toLowerCase() === nombre.toLowerCase());
}

// funcion para validar los inputs
const validarNombreTarea = (nombre = "") => {
    // 1) que no sea vacia
    if (nombre.trim().length === 0) {
        return "El nombre de la tarea no puede ser vacia"
    }

    // 2) limitar la cantidad de caracteres - 20
    if (nombre.trim().length > 20) {
        return "El nombre de la tarea no puede superar los 20 caracteres"
    }

    // valor por default (paso la validacion)
    return null;
}

// funcion para crear una tarea
const crearTarea = (nombre) => {
    // 2) Validar algun aspecto del nombre de la tarea
    const error = validarNombreTarea(nombre);
    if (error !== null) {
        alert(error)
        return false;   // no se va a crear la tarea (retorna false)
    }

    // 3) Corroborar que no existan duplicados
    const task = buscarTareaPorNombre(nombre);
    // En JavaScript, los valores como undefined, null, 0, false, NaN y "" (cadena vacía) son considerados falsy. Todo lo demás es truthy.
    if (task) {
        alert("La tarea ya existe");
        return false;   // La tarea ya esta repetida, se retorna falso y no se crea
    }

    // 1) Crear una tarea
    debugger
    const nuevaTarea = new Task(tareas.length+1, nombre, new State(1, "Pendiente"))
    localStorage.setItem("ultimaTarea", JSON.stringify(nuevaTarea))
    tareas.unshift(nuevaTarea);     // agrega la tarea mas reciente el principio de la lista
    localStorage.setItem("misTareas", JSON.stringify(tareas))
    return true;
}

const formulario = document.getElementById("task-form");

formulario.addEventListener("submit", (event) => {
    event.preventDefault();

    // Para tomar los datos de un formulario, tenemos varias opciones:
    // - recuperar el o los inputs individualmente con .getElementById
    // - acceder a los elementos hijos del formulario a tarves de una propiedad children
    // - utilizar el constrcutor de la clase FormData()

    // A traves de los children (ojo, son los hijos inmediatos. Osea, cuidado si tenemos divs dentro del <form>)
    const nombreTarea = formulario.children[0].value  // children: es un array con la informacion de cada hijo => aca sacamos la informacion del primer hijo de la etiqueta <form>, que es un <input>
    console.log("--> El valor ingresado es ", {nombreTarea})

    if (crearTarea(nombreTarea)) {
        // 4) Intentar listar las tareas en la UI
        console.table(tareas);
        // 5) Limpiar el formulario
        formulario.reset();     // borra todo lo que esta escrito en el formualrio
    }

})








// Desafíos:
// Array.prototype.map()    --> Ya lo usamos para convertir objetos literales en objetos con clase.
// Array.prototype.filter() --> Disponible.
// Array.prototype.reduce() --> Ya lo usamos para calcular el total del valor de la factura.
// Array.prototype.find()   --> Disponible
// Array.prototype.some()   --> Disponible
// Array.prototype.sort()   --> Disponible (ojo, método destructivo)
// Array.prototype.reverse()--> Disponible (ojo, método destructivo)
// Array.prototype.forEach()--> Ya lo usamos para mostrar la descripción de la factura y el monto total