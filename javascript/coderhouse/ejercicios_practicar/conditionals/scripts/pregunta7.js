/* 
    7. Determinar el nivel de descuento según el monto invertido en la compra
    Requerimos proporcionar descuentos a aquellos compradores de una tienda online
    dependiendo del monto total de sus compras. 
*/

let montoBajo = 500;
let montoMedio = 1000;
let montoAlto = 1500;

let monto = 1505

if (monto < montoBajo) {
    console.log("No tienes descuento")
} else if (monto <= montoMedio) {
    console.log("Tienes un descuento del 5%")
} else if (monto <= montoAlto){
    console.log("Tienes un descuento de 10%")
} else{
    console.log("Tienes un descuento de 15%")
}




