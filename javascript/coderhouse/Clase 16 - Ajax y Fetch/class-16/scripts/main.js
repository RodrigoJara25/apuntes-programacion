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

/* ======================= AJAX Y FETCH ======================= */

/* fetch('https://jsonplaceholder.typicode.com/posts')     // por ahora no usamos el parametro de configuracion
    // 1) Ejecutamos el metodo json. Para convertir ese texto plano a un objeto.
    .then((response) => {
        console.log("--> Respuesta de la solicitud", response);

        return response.json();     // el metodo json() es una promesa, por lo que debemos capturar su respuesta positiva/negativa
    })
    // .catch((error) => console.log(error))

    // 2) Capturamos la respuesta de la promesa del "return" del .json()
    .then((data) => {
        console.log("--> Datos decodificados <--", data)
    })
    // .catch((error) => console.log(error)) */

// Metodo GET: para recuperar informacion
const postsContent = document.getElementById("posts-result")
fetch('https://jsonplaceholder.typicode.com/posts')
    .then((response) => response.json())
    .then((data) => {
        console.log("--> Datos decodificados <--", data);
        /* {
            "userId": 1,
            "id": 1,
            "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
            "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
        } */
        data.forEach((post) => {
            let register = document.createElement("div")
            register.innerHTML = `
                <h5>${post.title}</h5>
                <p>${post.body}</p>
            `;
            postsContent.append(register);
        })
    });

// Metodo POST: para enviar informacion
/* fetch('https://jsonplaceholder.typicode.com/posts', {
    method: 'POST', // poinemos el metodo POST
    body: JSON.stringify({      // Enviamos la informacion a la API en formato json (texto plano)
        title: 'Coderhouse',
        body: 'Agregando regsitros con el metodo POST',
        userId: 1,
    }),
    headers: {
        'Content-type': 'application/json; charset=UTF-8',      // aplication/json => indica en que formato estamos enviando los datos
    },
})
    .then((response) => response.json())
    .then((data) => console.log("Informacion devuelta por el servidor: ",data)) */



// Rutas Relativas

fetch('/mocks/products.json')
    .then( (res) => res.json())
    .catch((error)=>console.log("Error leyendo archivo local: ", error))
    .then( (data) => {
        /* {
            "nombre": "Producto 1",
            "precio": 1500,
            "id": 1
        }, */
        data.forEach((producto) => {
            const li = document.createElement('li')
            li.innerHTML = `
                <h4>${producto.nombre}</h4>
                <p>${producto.precio}</p>
                <p>Código: ${producto.id}</p>
                <hr/>
            `
            postsContent.append(li)
        })
    })



// ========== Async-Await ==========

// La sentencia await nos permite establecer un punto de espera en el código. 
// Creamos una funcion o arrow function ( con la palabra async )

const pedirPosts = async () => {

    // el codgio se queda esperando en este punto hasta que el servidor no de una respuesta con el fetch() => ya que es una promesa
    const resp = await fetch('https://jsonplaceholder.typicode.com/posts')

    // lo mismo ocurre en esta linea, donde procesamos la respuesta con .json() => ya que tambien es una promesa
    const data = await resp.json()

    // luego, se ejecuta esto de manera sincronica
    console.log("--> Datos decodificados <--", data);
    data.forEach((post) => {
        let register = document.createElement("div")
        register.innerHTML = `
            <h5>${post.title}</h5>
            <p>${post.body}</p>
        `;
        postsContent.append(register);
    })
}

// ejecutamos la funcion
pedirPosts()


/* 
    SIEMPRE QUE HAYAN PROMESAS, LAS CONTROLAMOS CON
    - (THEN) y CATCH
    - ASYN y (AWAIT)
*/
/* 
    PARA VER ESTA SIMULACION EN VIVO, PODEMOS USAR UNA RED 3G EN EL NAVEGADOR Y AHI SE VERAN LOS ASYNC Y AWAIT
*/