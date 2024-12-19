/* 
5. Verificar si una tienda está abierta o cerrada según la hora actual
Este ejemplo usa una condición if para verificar si la hora actual está dentro del
horario de atención de una tienda y dependiendo de ello nos arrojará un mensaje
indicándonos esto. 
*/

const fecha_actual = new Date();
const hora_actual = fecha_actual.getHours();
// const hora_actual = 4

const horario_atencion_incio = 8 
const horario_atencion_fin = 22

if (hora_actual > horario_atencion_incio && hora_actual < horario_atencion_fin) {
    console.log("La tienda esta abierta")
} else {
    console.log("La tienda esta cerrada")
}

