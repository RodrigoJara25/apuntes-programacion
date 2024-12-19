/* 
1. Comprobar si un cliente posee saldo en su cuenta
Suponer que necesitamos validar el saldo de la cuenta bancaria de 
un cliente, si el
cliente posee un saldo positivo (superior a cero) puede continuar 
con la transacción
requerida. 
*/

let saldo = 200;
if (saldo > 0) {
    console.log("Puede continuar con la trasaccion")
}
else{
    console.log("Saldo insuficiente")
}