// console.dir(document)
// console.dir(document.head)
// console.dir(document.body);

// Por ID
const parrafo = document.getElementById("parrafo1")
console.log(parrafo)
console.log(parrafo.textContent)

parrafo.textContent = "Hola alumnos"    // reemplaza al primero que tenga ese 'id', por eos el id no se deberia repetir, ya que es unico

const texto = "HOLA"

// Por CLASS
// let paises = document.getElementsByClassName("paises");
// console.log(paises)
// console.log(paises[0].innerHTML);
// console.log(paises[1].innerHTML);
// console.log(paises[2].innerHTML);

// Por ETIQUETA (puede traer problemas, es el menos especifico
let contenedores = document.getElementsByTagName("div");
console.log(contenedores[0].innerHTML);
console.log(contenedores[1].innerHTML);
console.log(contenedores[2].innerHTML);


// Recorre un conjunto de nodos (si se tiene un array)
for(const div of contenedores){
    console.log(div)
}

// contenedores.forEach no lo toma como un array a "contenedores" asi que no se puede usar

// INNER TEXT : es para reemplazar la etiqueta con un texto de tipo string
const titulo = document.getElementById("titulo")
console.log(titulo.innerHTML)
console.log(titulo.innerText)
console.log(titulo.textContent)
titulo.innerText = "HOLA"

// INNER HTML : para reemplazar el contenido de la etiqueta con una etiqueta, ya no de tipo string

// const listaPaises = document.getElementById("listaPaises")
// listaPaises.innerText = "<li class='paises'>AR</li> <li class='paises'>CL</li> <li class'paises'>UY</li>"
// listaPaises.innerHTML = "<li class='paises'>AR</li> <li class='paises'>CL</li> <li class'paises'>UY</li>"


const titulo2 = document.getElementById("titulo")
console.log(titulo2)
console.log(titulo2.textContent)

// class list : para ver todas las clases que tiene una etiqueta
console.log(listaPaises.classList)

// class name : ayuda a reemplazar las clases que tenga una etiqueta por los que tengamos
// listaPaises.className = "contenedor"

console.log(listaPaises.classList)

// Reemplazar el ID
// elemento.id = "nuevo_id"
// console.log(nuevo_id)

// CREAR Y AGREGAR ELEMENTOS (YA NO REEMPLAZAR)
const contenedorPaises = document.getElementById("listaPaises")

const lista = document.createElement("ul")  // creamos un elemento <ul>

contenedorPaises.append(lista)  // se lo agregamos al <div> como hijo

const paises = ["AR", "CL", "UY", "MX", "PR", "BL", "BR", "PE", "CL", "VN"]

/* paises.forEach(pais => {
    const item = document.createElement("li")   // "item" va a representar la etiqueta <li>
    item.innerText = pais   // agregamos cada pais al "item" (que a su vez es un <li>)
    lista.append(item)      // agregamos a la lista (que es el <ul>) el "item" (que es la <li>)
}) */


// ELIMINAR NODOS (elimina el nodo "lista", que representa al <ul> por lo que ya no pdoemos agregar <li>)
// lista.remove()


// OBTENER VALORES DE INPUTS
const nonmbre = document.getElementById("nombre")       // nombre.value     ==>
const edad = document.getElementById("edad")            // edad.value       ==> 
const check = document.getElementById("checkbox")       // check.checked    ==>


// TEMPLETE STRINGS

// EJEMPLO 1 : concatenar con templete strings
const producto = {id: 1, nombre: "Arroz", precio: 125}
const concatenado = "Id : " + producto.id + "- Producto : " + producto.nombre + " - Precio: " + producto.precio
const plantilla = `Id: ${producto.id} - Producto: ${producto.nombre} - Precio: ${producto.precio}`

console.log(concatenado)
console.log(plantilla)


// EJEMPLO 2: agregar elementos con templete string
paises.forEach(pais=>{  // recorremos la lista "paises", por cada elemento hacemos un innerHTML con plantillas literales
    lista.innerHTML += `<li class="paises">${pais}</li>`
})

// contenedorPaises.append(lista)  // se lo agregamos al <div> como hijo


// QUERY SELECTOR
const contenedorPaisesQuery = document.querySelector("#listaPaises")
const contenedorPaisesQueryClass = document.querySelector(".listaPaisesClass")  // Si hay una clase class="listaPaisesClass", entonces te lo devuelve aca

console.log(contenedorPaisesQuery)
console.log(contenedorPaisesQueryClass)

const todosLosPaises = document.querySelectorAll(".paises")
console.log(todosLosPaises)
todosLosPaises.forEach((pais) => {return console.log(pais);})

// let radioChecked = document.querySelector(".radio:checked")
