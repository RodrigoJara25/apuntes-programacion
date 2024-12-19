/* 
4. Calcular costo de envío
Necesitamos calcular el costo de envío de un paquete, y este costo depende de la
distancia recorrida desde el lugar de despacho al de recepción. Para ello distancias
entre 0-500km el costo es de $ 5.000, entre 500-1000km es de $ 7.250 y superior a
este es $ 10.000. 
*/

let distancia = 1000;
let costo_envio;
if (distancia > 0 && distancia < 500) {
    costo_envio = 5000;
} else if (distancia < 1000) {
    costo_envio = 7250;
} else{
    costo_envio = 10000;
}
console.log("El costo de envio es " + costo_envio.toString())