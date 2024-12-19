/* 
    8. Otorgar incentivos
    Suponer que en una fábrica hay incentivos otorgados a aquel personal que supera
    un umbral de producción, para este caso vamos a otorgar un incentivo de $
    200.000,00 a aquellos individuos que superen la producción mínima de 30.000
    unidades. 
*/

let produccion_minima = 30000

let produccion = 200000

if (produccion < produccion_minima) {
    console.log("No tienes incentivo")
} else {
    console.log("Tienes un incentivo de 200,000")
}