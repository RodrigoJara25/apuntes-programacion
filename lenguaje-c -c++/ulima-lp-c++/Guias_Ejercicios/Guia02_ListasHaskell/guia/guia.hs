{-
1. Crear una función llamada crearListaP1, que reciba como argumento de entrada un numero n y que te permita devolver la siguiente lista:

```
[-n,...,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,...,n]
```
-}
crearListaP1 :: Int -> [Int]
crearListaP1 n = [-n..n]


{-
2. Escribir una funcion llamada pregunta2 que calcule la suma de los elementos impares de una lista de números 
enteros que es su argumento de entrada.
-}
pregunta2W :: [Int] -> Int
pregunta2W lista =
    pregunta2 lista 0

pregunta2 :: [Int] -> Int -> Int
{-pregunta2 lista sumParcial= 
    if null lista
        then sumParcial
    else if head lista `mod` 2 /= 0
        then pregunta2 (tail lista) (sumParcial + head lista)
    else 
        pregunta2 (tail lista) sumParcial
-}
pregunta2 lista sumParcial = 
    if null lista
        then sumParcial
    else 
        if head lista `mod` 2 /= 0
            then pregunta2 (tail lista) (sumParcial + head lista)
        else 
            pregunta2 (tail lista) sumParcial


-- Implementar una funcion llamada obtenerElemento que reciba
-- como argumento de entrada una lista de numeros enteros y una posicion
-- y nos devuelva el elemento en esa posicion
obtenerElementoW :: [Int] -> Int -> Int
obtenerElementoW lista pos =
    obtenerElemento lista pos 0

obtenerElemento :: [Int] -> Int -> Int -> Int
obtenerElemento lista pos inicio =
    if inicio == pos
        then head lista
    else
        obtenerElemento (tail lista) (pos) (inicio + 1)


-- Implementar una funcion llamada mayorElemento que reciba
-- como argumento de entrada una lista de numeros enteros y nos devuelve el mayor
mayorElementoW :: [Int] -> Int 
mayorElementoW lista =
    mayorElemento lista (head lista)

mayorElemento :: [Int] -> Int -> Int
mayorElemento lista mayorParcial =
    if null lista
        then mayorParcial
    else
        if head lista > mayorParcial
            then mayorElemento (tail lista) (head lista)
        else
            mayorElemento (tail lista) (mayorParcial)


-- Implementar una funcion llamada promediar que reciba
-- como argumento de entrada una lista de numeros Float y devuelva el promedio
promediarW :: [Float] -> Float 
promediarW lista =
    promediar lista 0 0 

promediar :: [Float] -> Float -> Float -> Float
promediar lista sumaParcial longParcial =
    if null lista
        then sumaParcial / longParcial
    else 
        promediar (tail lista) (sumaParcial + head lista) (longParcial + 1)


{-
3. Escribir una función llamada pregunta3 que calcule el producto de los elementos pares de una lista de números enteros, que 
será su argumento de entrada. Debe utilizar tail recursion.
-}
pregunta3W :: [Int] -> Int 
pregunta3W lista =
    pregunta3 lista 1

pregunta3 :: [Int] -> Int -> Int
pregunta3 lista prodParcial =
    if null lista
        then prodParcial
    else
        if (head lista) `mod` 2 == 0
            then pregunta3 (tail lista) (prodParcial * head lista)
        else
            pregunta3 (tail lista) prodParcial


{-
4. Escribir una función que invierta una lista. Esto es, que reciba como argumento de entrada [1, 2, 3, 4, 5] y devuelva [5, 4, 3, 2, 1].
-}

invertirW :: [Int] -> [Int] 
invertirW lista =
    invertir lista []

invertir :: [Int] -> [Int] -> [Int]
invertir lista listaParcial =
    if null lista 
        then listaParcial
    else
        invertir (tail lista) (head lista : listaParcial)


{-
5. Escribir una función que devuelva True si todos los elementos, de una lista que se entregue como argumento de entrada, 
son mayores que 0, o False en caso contrario. Debe utilizar tail recursion.
-}

mayorCeroW :: [Int] -> Bool
mayorCeroW lista =
    mayorCero lista True

mayorCero :: [Int] -> Bool -> Bool 
mayorCero lista mayorPar =
    if null lista
        then mayorPar
    else 
        if head lista > 0
            then mayorCero (tail lista) (mayorPar)
        else
            mayorCero (tail lista) (False)


{-
6. Escriba una función que reciba un número entero y una lista. Si el numero entero es par, devolver una nueva lista que contenga 
la lista inicial y el numero entero ingresado. Si no, devolver la lista inicial.
-}
pregunta6 :: [Int] -> Int -> [Int]
pregunta6 lista num =
    if num `mod` 2 == 0 
        then (num : lista)
    else
        lista

{-
7. Escribir una función que reciba como entrada una lista de numeros enteros y un numero entero, y devuelva una nueva lista donde 
cada uno de los elementos de la lista sea multiplicado por el numero entero ingresado.
-}
pregunta7 :: [Int] -> Int -> [Int] -> [Int]
pregunta7 lista num listaParcial =
    if null lista
        then reverse listaParcial
    else
        pregunta7 (tail lista) (num) ((head lista)*num : listaParcial)

{-
8. Escriba una función que reciba como entrada una lista de años y devuelva una nueva lista con aquellos que son bisiestos. 
Tomar en cuenta que un año bisiesto es un año que puede ser divisible entre 4 (sin residuo) excepto cada año que es divisible 
entre 100 (sin residuo), a no ser que el año sea divisible entre 400 (sin residuo).
-}
-- Ñpregunta8 :: [Int] -> [Int] -> [Int]

{-
9. Escriba una función que reciba como entrada 2 listas, y devuelva una nueva lista con los elementos de la primera lista 
que existan en la segunda.
-}
perteneceLista :: [Int] -> [Int] -> Bool
perteneceLista lista1 lista2 =
    if null lista1 
        then False
    else 
        if null lista2 
            then False
        else 
            if head lista1 == head lista2
                then True
            else 
                perteneceLista lista1 (tail lista2)


pregunta9 :: [Int] -> [Int] -> [Int] -> [Int]
pregunta9 lista1 lista2 listaParcial =
    if null lista1
        then listaParcial
    else if null lista2 
        then listaParcial
    else
        if perteneceLista lista1 lista2 == True
            then pregunta9 (tail lista1) (lista2) (head lista1 : listaParcial)
        else
            pregunta9 (tail lista1) (lista2) (listaParcial)


{-
10. Escriba una función que reciba un numero entero y devuelva una lista con su tabla de multplicar del 1 al 12.
-}
pregunta10 :: Int -> Int -> [Int] -> [Int]
pregunta10 num multiplicador listaParcial =
    if multiplicador == 0
        then listaParcial
    else
        pregunta10 (num) (multiplicador - 1) (num*multiplicador:listaParcial)

{-
11. Escriba una función que reciba una lista de listas de números enteros (lista de 2 nieveles o dimensiones, 
tambien conocida como matriz) y que devuelva una nueva lista con los promedios enteros de cada lista que tengan, por lo menos, 3 elementos.
-}
sumatoria11 lista =
    if null lista
        then 0
    else sumatoria11 (tail lista) + head lista

longitud lista =
    if null lista
        then 0
    else longitud (tail lista) + 1 

pregunta11 :: [[Float]] -> [Float] -> [Float]
pregunta11 matriz listaParcial =
    if null matriz
        then reverse listaParcial
    else
        pregunta11 (tail matriz) ((sumatoria11 (head matriz)) / (longitud (head matriz)) : listaParcial)

{-
12. Escribir una función que reciba una lista de Strings y un String, y devuelva True si la lista contiene el String o 
False si no lo contiene.
-}
pregunta12 :: [String] -> String -> Bool -> Bool
pregunta12 lista palabra verdadParcial =
    if null lista
        then False
    else
        if head lista == palabra
            then True
        else
            pregunta12 (tail lista) palabra (verdadParcial)

{-
13. Escribir una función que reciba una lista de Strings y un String. Si la lista no contiene el String ingresado, devolver 
una nueva lista que agregue el String ingresado a la lista inicial. Si la lista lo contiene, devolver la lista inicial.
-}