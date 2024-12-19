// Math

// Min y Max : sus parametros son numeros, no arrays
console.log( Math.max(55, 13, 0, -25, 93, 4) ) // 93
console.log( Math.min(55, 13, 0, -Infinity, 93, 4) ) // -Infinity

// Con arrays (metodo SPREAD)
const numeros = [55, 13, 0, -25, 93, 400]
console.log(...numeros)
console.log(Math.max(...numeros))
console.log(Math.min(...numeros))



// Redondeo
const pi = Math.PI // 3.141592653589793

console.log(pi)

// CEIL: devuelve el entero mayor o igual más próximo (le suma +1 al entero)
console.log(Math.ceil(pi)) // 4

// FLOOR: devuelve el entero más cercano redondeado hacia abajo
console.log(Math.floor(pi)) // 3

// ROUND: retorna el valor de un número redondeado al entero más cercano (redondeo normal)
console.log(Math.round(pi)) // 3



// Square
// retorna la raíz cuadrada de un número. Si se le envía un número negativo, el método retorna NaN.
console.log(Math.sqrt(9)) // 3
console.log(Math.sqrt(2).toFixed(6)) // 1.414213562373095
console.log(Math.sqrt(1))  // 1
console.log(Math.sqrt(-1)) // NaN



// Random
// genera un número pseudo-aleatorio entre 0 y 1, siendo el 0 límite inclusivo y el 1 exclusivo.
console.log( Math.random() ) 
console.log( Math.random() * 10)
console.log( Math.round(Math.random() * 100)) // Random entero entre 0 y 100
console.log( Math.random() * 30 + 20 )      // Random entre 20 y 50

const generadorNumero = () => {
    return Math.round( Math.random() * 100 )
}



// Clase DATE
console.log( new Date() )       // da la fecha actual

let fecha = new Date()
console.log( {fecha} )

let casiNavidad = new Date(2021, 11, 25, 23, 59, 59)     // los meses van de 0 a 11 (0 enero y 11 diciembre)
console.log(casiNavidad)

// Puede recibir parámetros en el orden año, mes, día, hora, minutos, segundos, milisegundos (todos tipo number).
casiNavidad = new Date("December 25, 2021 23:59:59")    
console.log(casiNavidad)

const hoy = new Date("December 17, 2021")

console.log( hoy.toDateString() ) // Fri Dec 17 2021
console.log( hoy.toLocaleString() ) // 17/12/2021 00:00:00
console.log( hoy.toLocaleDateString() ) // 17/12/2021
console.log( hoy.toTimeString() ) // 00:00:00 GMT-0300 (hora estándar de Argentina)

console.log(hoy.getFullYear()) // 2021
console.log(hoy.getMonth()) // 11  (diciembre)
console.log(hoy.getDay()) // 5  (viernes)

// Diferencia entre fechas (se calcula en milisegunbdos)

const navidad = new Date("December 25, 2021")

console.log( navidad - hoy ) // 691200000

const milisegundosPorDia = 86400000

console.log( (navidad - hoy ) / milisegundosPorDia) // 8 dias


// EJERCICIO PRACTICO
// Ejmplo de manejo de Arrays con Clase y FOS, Math y Date
class ItemFactura {
    id = ""
    producto = ""
    fechaDeAlta = new Date()
    cantidad = 0
    precioUnitario = 0
    porcentajeDescuento = 0

    constructor(id, nombre, precio, fecha = new Date(), cantidad = 1, pctjDto = 0) {
        this.id = id
        this.producto = nombre
        this.fechaDeAlta = fecha
        this.cantidad = cantidad
        this.precioUnitario = precio
        this.porcentajeDescuento = pctjDto
    }
    
    toString() {
        return this.producto
    }

    getMontoDescuento(){
        return this.precioUnitario*this.porcentajeDescuento
    }

    getSubtotal(){
        return (this.precioUnitario*this.cantidad) - this.getMontoDescuento()
    }
}

class Factrura {
    id = "";
    cliente = "";
    fechaDeAlta = new Date();
    detalle = [];

    constructor(id, cliente, detalle = [], fecha = new Date()){
        this.id = id;
        this.cliente = cliente;
        this.detalle = detalle;
        this.fechaDeAlta = this.fechaDeAlta;
    }

    toString() {
        return this.id + " - " + this.cliente
    }

    addItem(item) {
        this.detalle.push(item)
    }

    getDetalle() {
        return this.detalle
    }

    getTotal() {
        const total = this.getDetalle().reduce((acumulado, item) => acumulado = acumulado + item.getSubtotal(), 0)
        return total.toFixed(2)
    }
}

console.log(ventas)

// Primero, para trabajr con las clases hay que transofrmar estos objetos literales en clases.
// Tranformamos la lista de objetos literales a una lista de objetos de tipo Factura
const ventasMapeado = ventas.map(
    (unaVenta) => {return new Factrura(unaVenta.id, unaVenta.cliente, unaVenta.detalle.map(
                                                                                            (unItem) => {return new ItemFactura(unItem.id, unItem.producto, unItem.precioUnitario, unItem.fechaDeAlta, unItem.cantidad, unItem.porcentajeDescuento)}
                                                                                        ), unaVenta.fechaDeAlta)}
    ) 

console.log(ventasMapeado)

ventasMapeado.forEach((unaVenta) => {console.log(unaVenta.toString(), unaVenta.getTotal())})
