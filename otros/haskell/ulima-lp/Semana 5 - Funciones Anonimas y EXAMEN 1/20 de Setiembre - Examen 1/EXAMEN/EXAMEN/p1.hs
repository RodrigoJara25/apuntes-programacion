-- Pregunta 1

{-
PREGUNTA 1 (5 puntos)
Implementar una función en el lenguaje de programación Haskell llamada subcadena.
Esta función recibirá como argumento de entrada un String y dos enteros 
(posición inicial y posición final). Con estos datos, la 
función deberá extraer un nuevo String pero ahora con los caracteres que van 
desde la posición hasta la 
posición final. Debe implementar su código en el archivo p1.hs.

Por ejemplo:

subcadena “ESTO ES UNA PRUEBA” 3 7
Devolverá: “O ES ”

-}
subcadena :: String -> Int -> Int -> String 
subcadena cadena inicio final =
    subcadena2 cadena inicio final "" 0

subcadena2 :: String -> Int -> Int -> String -> Int ->  String 
subcadena2 cadena inicio final cadParcial cont =
    if null cadena 
        then cadParcial
    else 
        if cont >= inicio && cont <= final
            then subcadena2 (tail cadena) inicio final (cadParcial++[head cadena]) (cont +1)
        else
            subcadena2 (tail cadena) inicio final (cadParcial) (cont +1)