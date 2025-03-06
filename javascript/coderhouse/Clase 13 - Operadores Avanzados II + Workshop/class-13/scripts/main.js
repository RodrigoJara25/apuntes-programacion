console.log("--> Bienvenidos a la clase 12: Operadores avanzados <--");

let tareas = [];
let states = STATES_FROM_CONSTANT.map((state) => {
    return new State(state.id, state.name, state.textColorClass, state.bgColorClass, state.key);
})
let ultimaTarea = null;
const DEFAULT_STATE = new State(1, "Pendiente");
const LENGGTH_LIMIT = 60;

// ================ Comentar codigo ==================
/**
 * @abstract Definición de qué hace está funcionalidad
 * @param {*} task Aquí ingresa el objeto unaTarea con el formato de un ibjeto literal
 * @returns Devuelve un objeto con las propiedades recibidas originalmente pero con el protoripo de clase Task
 * 
 */
const mapObjectToClass = ({ id, description, state: { id: stateId, name: stateName, textColorClass, bgColorClass, key: stateKey, }, date } = null) => {
    if (!id) { return null }
    return new Task(id, description, new State(stateId, stateName, textColorClass, bgColorClass, stateKey), new Date(date));
}
/**
 * @abstract Esta funcionalidad recupera los datos de storage del cliente y lo convierte en un array de alcance global
 */
const recuperarDelStorage = () => {
    ultimaTarea = mapObjectToClass(JSON.parse(localStorage.getItem("ultimaTarea")));
    const misTareasRecuperadas = JSON.parse(localStorage.getItem("misTareas")) || [];
    tareas = [];
    misTareasRecuperadas.forEach((entity) => {
        const restored = mapObjectToClass(entity);
        tareas.push(restored);
    });
}

// Evaluamos si existe la lista persistida y la cargamos a la memoria.
// La primera vez que lo ejecutes sin tener nada persistido va a explotar, porque los objetos asociados a las claves son nulos, te invito a programar un salvaguardas.
recuperarDelStorage();

// START Renderizado en UI
/**
 * @abstract Crea un componente visual con formato de lista desplegable con los estados posibles que puede tomar una tarea
 * @param {*} label Nombre con que se mostrará en la pantalla
 * @param {*} key Clave única para identificar al nodo/etiqueta en el DOM/código
 * @param {*} states Lista de estados que definimos para las tareas.
 * @param {*} exclude Estado excluido por ser el establecido en la tarea y no puede ser seleccionado
 * @param {*} entity Tarea a la que hace referencia este listado de estados alternativos
 * @returns Código HTML que representa a una etiqueta select con todas las opciones de estados posibles para la tarea 
 */
const generateStateListHTML = (label, key, states = [], exclude = null, entity) => {
    return `<div class="btn-group">
                <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                    ${label}
                </button>
                <ul class="dropdown-menu" id="dropdown-${key}" name="dropdown-${key}">
                    ${states.map((s) => `<li id="${key}-${s.key}" name="${key}-${s.key}"  onclick="changeStateToTask(${entity.id}, ${s.id},${exclude ? exclude.id === s.id : false})"><a class="dropdown-item${exclude ? exclude.id === s.id ? " disabled" : "" : ""}" href="#">${s.name}</a></li>`).join("")}
                </ul>
            </div>`;
}

/**
 * @abstract Crea la estructura de tabla HTML que muestra todas y cada una de las tareas que necesitamos en la interfaz de usuario, con información pertinente a estas.
 * @param {*} entities Listado de tareas
 * @param {*} states Listado de estados
 */
const renderTasksList = (entities = [], states = []) => {
    let bodyList = document.getElementById("main-content");
    bodyList.innerHTML = "";
    if (entities.length) {
        entities.forEach((entity) => {
            let record = document.createElement("div");
            record.setAttribute("class", "alert alert-secondary");
            record.setAttribute("id", entity.id.toString());
            record.setAttribute("role", "alert");
            record.innerHTML = `
            <h5 class="alert-heading">${entity.toString()}</h5>
            <div class="row">
                <div class="col-sm-9">
                    <p class="mb-0">${entity.getFormattedDate()} <span class="badge rounded-pill bg-${entity.state.bgColorClass} p-2 border border-light rounded-circle"> </span></p>
                </div>
                <div class="col-sm-3 d-flex justify-content-end">
                    ${generateStateListHTML("Change state", entity.id, states, entity.state, entity)}
                    <button type="button" class="btn btn-secondary" onclick="deleteTask(${entity.id})" style="margin-left: 5px"><i class="bi bi-trash-fill"></i></button>
                </div>
            </div>
            `;
            bodyList.append(record);
        });
    } else {
        let record = document.createElement("div");
        record.setAttribute("class", "alert alert-warning");
        record.setAttribute("role", "alert");
        let message = "There are no tasks to show yet.";
        if (entity.length === 0 && (selectedState || keywordsSelected.length)) {
            message = "There are no tasks to display yet based on the applied filters.";
        }
        record.innerHTML = `<h5 class="alert-heading">${message}</h5>`;
        bodyList.append(record);
    }
}

renderTasksList(tareas, states);

// END Renderizado en UI

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
        renderTasksList(tareas, states);
        // 5) Limpiar el fomrualrio
        form.reset();
    }
});

// =================================== CLASE 13: Operadores Avanzados II ===================================

// ============ SPREAD =================
// En ARRAYS, permite enviar todos sus elementos como parámetros individuales.

const nombress = ["Juan", "Julieta", "Carlos", "Mariela"]
// spread ... del array
console.log(...nombress) // Juan Julieta Carlos Mariela
// equivalente a:
console.log("Juan", "Julieta", "Carlo", "Mariela")


const numeros = [4, 77, 92, 10, 3, -32, 54, 11]
console.log( Math.max(numeros) ) // NaN
console.log( Math.max(...numeros) ) // 92


// SPREAD con OBJETOS y ARRAYS dentro de otras estructuras de datos
const nombres1 = ["Juan", "Julieta"]
const nombres2 = ["Carlos", "Mariela"]

// spread de los dos arrays dentro de otro
const nombres = [...nombres1, ...nombres2]  // Esto es como si hicieramos nombres1.concat(nombres2)
console.log(nombres) // ["Juan", "Julieta", "Carlos", "Mariela"]

// spread del array en un objeto
const nombresObj = {
    ...nombres
}
console.log(nombresObj)
// { '0': 'Juan', '1': 'Julieta', '2': 'Carlos', '3': 'Mariela' }

// =============== Ejemplo: con nuestro formulario. El rray "tareas" ================
console.log("--> Estructura con formato de array <--");
console.log(tareas);

console.log("--> Estructura con formato de spread <--");
console.log(...tareas);
/* tareas.forEach((e) =>{
    console.log(e);
}) */   // Esto es lo mismo que hacer SPREAD


// =========== SPREAD DE OBJETOS ===========
// Permite COPIAR todos los atributos de un objeto en otro objeto. 

const usuario1 = {
    nombre: "Juan",
    edad: 24,
    curso: "Javascript"
}
console.log("Datos del usuario 1:");
console.log(usuario1);

// lista todas las propiedades y valores de usuario1 dentro de otro objeto
const usuario2 = {
    ...usuario1
}
console.log("Datos del usuario 2:");
console.log(usuario2) // { nombre: 'Juan', edad: 24, curso: 'Javascript' }

// permite copiar los atributos de otro objeto (y puede modificar/agregar un atributo)
const usuario3 = {
    ...usuario1,
    curso: "ReactJS",
    email: "juan@doe.com"
}
console.log("Datos del usuario 3 (fusionado):");
console.log(usuario3)
// { nombre: 'Juan', edad: 24, curso: 'ReactJS', email: 'juan@doe.com' }

// Creado OTRO ejemplo
const paises = [
    {
        id: 200,
        nombre: "Argentina",
        gentilicio: "Argentino/a",
        lengua: "Español latinoamericano"
    },
    {
        id: 300,
        nombre: "Paraguay",
        gentilicio: "Paraguayo/a",
        lengua: "Guarani"
    },
]

const usuarios = [
    {
        nombre: "Sandra",
        idPais: 200
    },
    {
        nombre: "Pedro",
        idPais: 300
    },
    {
        nombre: "Juan Pablo",
        idPais: 200
    },
]

console.log(usuarios);

const usuarioCompletos = usuarios.map((unUsuario) => {
    return {
        ...unUsuario,
        pais: paises.find((unPais)=>unPais.id === unUsuario.idPais)
    }
})
// elimino el atributo que no quiero que se muestre
usuarioCompletos.forEach((entity) => {
    delete entity.idPais    // delete objeto.atributo
});
console.log(usuarioCompletos);

// Eliminar/Enviar todos los atributos que estan en la lista. Esto hace el codigo mas dinamico.
/* const attToDelete = ["idPais", "idConstancia", "genero"]
const attToSend = ["idPais", "idConstancia", "genero"] */


// ======================= Rest Parameters =======================

/* El operador spread también puede utilizarse dentro de la declaración de una función para indicar 
que queremos recibir una cantidad indeterminada de parámetros.
Supongamos que quiero tener una función para sumar cualquier cantidad de números que reciba por parámetro */

/* Mi función va a recibir una cantidad indeterminada de parámetros, 
pero los va a agrupar dentro de un array con el nombre que defina */
console.log("---------- Rest Parameters ----------");

function sumar(...numeros) {
    console.log(numeros)
    return numeros.reduce((acc, n)=>acc+n,0)
}

console.log(sumar(4, 2)) // [ 4, 2 ]
console.log(sumar(10, 15, 30, 5)) // [ 10, 15, 30, 5 ]
console.log(sumar(...[10, 15, 30, 5])) // [ 10, 15, 30, 5 ]


// ============== EJEMPLOS =================
const intentos = 4
const LIMITE = 3

const intentarDenuevo = () => {
    console.log("Inentalo una vez más");
}

const bloquearCuenta = () => {
    console.log("Cuenta bloqueada");
}

(intentos < LIMITE) ? intentarDenuevo() : bloquearCuenta()