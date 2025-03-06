console.log("--> Bienvenidos a la clase 15: Asincronia y Promesas <--");

let tareas = [];
let states = STATES_FROM_CONSTANT.map((state) => {
    return new State(state.id, state.name, state.textColorClass, state.bgColorClass, state.key);
})
let ultimaTarea = null;
const DEFAULT_STATE = new State(1, "Pendiente");
const LENGGTH_LIMIT = 60;

/**
 * @abstract Definición de qué hace está funcionalidad
 * @param {*} task Aquí ingresa el objeto Una tarea con el formato de un ibjeto lietral
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
                    <button type="button" class="btn btn-primary" onclick="showDetails('${entity.description}')" style="margin-left: 5px">Ver</button>
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
        if (filteredTasks.length === 0 && (selectedState || keywordsSelected.length)) {
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
        /* ================== TOASTIFY ================== */
        Toastify({
            text: "Tarea Agregada Correctamente",
            duration: 3000, // duracion de 3000ms (osea 3s)
            // newWindow: true,
            close: true,
            gravity: "bottom", // `top` or `bottom`
            position: "right", // `left`, `center` or `right`
            stopOnFocus: true, // Prevents dismissing of toast on hover
            style: {
                background: "linear-gradient(to right, #00b09b, #96c93d)",
            },
            onClick: function(){
                console.log("No me toques!");
            } // Callback after click
          }).showToast();   // el showToast() es el que muestra la notificacion
        renderTasksList(tareas, states);
        // 5) Limpiar el fomrualrio
        form.reset();
    }
});

/* SWEET ALERT */

// =========== EVENTO: TERMINA DE CARGAR TODO EL CONTENIDO ===========
const DateTime = luxon.DateTime     // Cargamos la fecha (con Luxon)
document.addEventListener("DOMContentLoaded", () => {
    /* Swal.fire({
        title: 'Bienvenido',
        text: 'Ya puedes trabajar con el sitio.',
        icon: 'success',
        confirmButtonText: 'Yeii!'
    }) */
    /* const dt = DateTime.local(2025, 1, 15, 22, 5)
    console.log(dt.toLocaleString(DateTime.DATETIME_SHORT));

    const now = DateTime.now()
    console.log( now.toString() )

    console.log(dt.toLocaleString(DateTime.DATE_FULL))  // 25 de enero de 2022

    const suma = dt.plus({ hours: 5, minutes: 15 })     // sumarle 5 horas y 15 minutos a una fecha
    console.log(suma.toLocaleString(DateTime.DATETIME_SHORT))

    const resta = dt.minus({ month: 2, days: 10 })      // restarle 2 meses y 10 dias
    console.log(resta.toLocaleString(DateTime.DATETIME_SHORT))

    // Duration
    const Duration = luxon.Duration
    const dur = Duration.fromObject({ hours: 3, minutes: 15 });
    console.log( dur.hours ) // 3
    console.log( dur.minutes ) // 15
    console.log( dur.seconds ) // 0

    // Interval
    const Interval = luxon.Interval

    const later = DateTime.local(2025, 2, 26)       // primero va el mas antiguo y segundo el más lejano
    const i = Interval.fromDateTimes(now, later)

    console.log( i.length('days') ) // 0.3905736111111111
    console.log( i.length('hours') ) // 9.373766666666667
    console.log( i.length('minutes') ) // 562.426 */

})

// Boton "Ver", para mostrar detalles de la tarea
const showDetails = (id) => {
    const entity = buscarTereaPorNombre(id);
    if (entity) {
        Swal.fire({
            title: 'Bienvenido',
            text: 'Ya puedes trabajar con el sitio.',
            icon: 'success',
            confirmButtonText: 'Yeii!',
            html: `
                <p>${entity.toString()}</p>
                <div>
                    <p>Algo mas...</p>
                </div>
                `,
        })
    }
}

// Poder buscar por el buscador las tareas
const filterTasks = (value = "") => {
    return tareas.filter((task) => task.description.toLowerCase().includes(value.toLowerCase()))
}

const filterForm = document.getElementById("filter-tasks-form");
filterForm.addEventListener("submit", (event) => {
    event.preventDefault()
    const input = document.getElementById("filter-tasks-form-term");
    const termino = input.value;
    const filteredTasks = filterTasks(termino);
    renderTasksList(filteredTasks)  // solo le pasamos la lista de filtrados
});

/* ============== ASINCORNIA ============== */
// ================= setTimeout =================
/* console.log("Inicia proceso")

setTimeout(()=> {
    console.log("Mitad de proceso")
}, 2000)

console.log("Fin proceso") */

/* let count = 1;
for (let letra of "hola") {
    setTimeout(() => {
        console.log(letra)
    }, count * 1000)
    count++;
}

for (let letra of "mundo") {
    setTimeout(() => {
        console.log(letra)
    }, count * 1000)
    count++;
}  */

// Ejemplo  de la Call Stack (en el ppt)
/* function multiply (x, y) {    
    return x * y;
}

function printSquare (x) {    
    let s = multiply(x, x);    
    console.log(s);
}

printSquare(5); */

/* ================= Event Loop ================= */
// Permite la sincronizcacion entre la call stack y otra pila diferente (web apis, asincornas). Esto permite que se ejecute la pila
// asincrona si la call stack esta vacia


/* ================= Set Interval ================= */
// Permite ejecutar funciones de manera reiterativa tras los milisegundos indicados 
// hasta que indiquemos su detención o se cierre la aplicación 
/* setInterval(() => {
    console.log("Tic")
}, 1000) */
// Cada un segundo, INTERRUMPE la Call Stack para ejecutar su funcion, luego sigue con el hilo normal.
// Cada un segundo, la Web Apis mete a la Call Stack la funcionalidad definida en el Set Interval.


/* ================= CLEAR INTERVAL ================= */
// En caso de querer remover un Intervalo, utilizamos la función clearInterval (). 
// También podemos detener la ejecución de un setTimeout invocando clearTimeout ().
/* let counter = 0
const interval = setInterval(() => {
    counter++
    let carrito = [];
    console.log("Espera para sacarte de la lista: ", counter)

    if (counter >= 5) {
        carrito.push({});
    } 
    if (counter > 5 && carrito.length === 0) {
        clearInterval(interval);
        console.log("Estas afuera. No compraste nada.");
    }
    if (counter > 5 && carrito.length !== 0) {
        clearInterval(interval);
        console.log("Ya compraste. Felcidades!");
    }

}, 1000) */

/* =============== Clear Timeout =============== */
// Similar el clearInterval() sirve para cancelar un setTimeout()
console.log("Inicio")

const fin = setTimeout(() => {
    console.log("fin")
}, 2000)

clearTimeout(fin)
// En este caso, no se llega a ejecutar el setTimeout()


/* =================== PROMESAS =================== */

// Cuando no sabemos cuánto tiempo va a demorar un proceso, pero sabemos que queremos hacer cuando ocurra.
// Es una accion asincrona que se puede completar en algún momento y producir un valor o notifacion cuando ocurra.
// Tiene 3 estados: 
// - pending: indica que se esta ejecutando
// - fulfilled: confirma la ejecucion de manera favorable
// - rejected: la ejecucion fue rechazada o algo del estilo

/* const eventoFuturo = () => {
    return new Promise( (resolve, reject) => {
        // resolve("Hola, esto está OK!")  // aca se puede pasar un objeto, un array, etc.
        reject("Algo salió mal.")   // Salta un error en la terminal
    } )
}
console.log( eventoFuturo() ) // Promise { <pending> } */

const eventoFuturo = (res) => {
    return new Promise( (resolve, reject) => {
        if (res === true) {
            resolve([{}, {}])   // devuelvo un array de objetos
        } else {
            reject('Promesa rechazada')
        }
    })
}

/* console.log( eventoFuturo(true) ) // Promise { 'Promesa resuelta' }
console.log( eventoFuturo(false) ) // Promise { <rejected> 'Promesa rechazada' }
 */

// Podemos crear promesas a través de su constructor new Promise. 
// Recibe una función por parámetro que a su vez 
// recibe por parámetro las funciones de resolve y reject.

// - Si el cuerpo de la promesa llama a resolve(), la promesa cambiará su estado a fulfilled, con el valor enviado a resolve().
// - Si la promesa llama a reject(), cambiará su estado a rejected con el valor enviado al reject().


/* const eventoFuturo2 = (res) => {
    return new Promise( (resolve, reject) => {
        setTimeout( () => {
            res ? resolve('Promesa resuelta') : reject('Promesa rechazada')
        }, 2000)
    })
}

console.log( eventoFuturo2(true) ) // Promise { <pending> }
console.log( eventoFuturo2(false) ) // Promise { <pending> } */

// En este caso, el console.log es sincrónico y vemos que la promesa está en pending en 
// ambos llamados (su resolución se generará dentro de 2s). Las promesas tienen un 
// mecanismo para trabajar esta asincronía y poder ejecutar funciones cuando cambie su estado

// En este caso, el console.log se ejecuta de forma sincronica, por lo que se ejecuta antes 
// de la resolucion del setTimeout(), por lo que nos da que esta en espera.

// Para trabajr con esto, usamos 
/* ================ THEN & CATCH ================ */

// Sirve para capturar el resultado de la promesa, asi salgo bien o mal.
// Llamos a la promesa eventoFuturo, con valor correcto y con error

// Para respuesta favorable
/* eventoFuturo(true).then( (response) => {
        console.log("La consulta fue exitosa: ",response) // Promesa resuelta
    })

// Para respuesta de error. Solo muestra el mensaje en la consola, ya no el error. Este es capturado con el .catch()
eventoFuturo(false).catch( (error) => {
        console.log("La consulta sufrio un error: ",error) // Promesa rechazada
    }) */


/* ======================== FINALLY ======================== */

// finally() es un método que recibe una función la cual se ejecutará siempre al 
// finalizar la secuencia, sin importar si se haya resuelto o no la promesa.
console.log("------- PROMESAS CON FINALLY -------");
eventoFuturo(true)
    .then( (response) => {
        console.log(response)
    })
    .catch( (error) => {
        console.log(error)
    })
    .finally( () => {
        console.log("Fin del proceso")
    })
// Promesa resuelta
// Fin del proceso
