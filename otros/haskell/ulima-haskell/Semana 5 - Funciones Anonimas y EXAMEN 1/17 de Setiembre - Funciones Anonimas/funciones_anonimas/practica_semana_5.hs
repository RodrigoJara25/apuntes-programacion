-- Escribe una función recursiva llamada sumaPares que reciba una lista de enteros y devuelva la suma de todos los números pares 
-- en la lista. La función no debe utilizar funciones auxiliares como filter o sum.

sumaPares :: [Int] -> Int
sumaPares lista = 
    if null lista
        then 0  -- Si la lista está vacía, devolver 0
    else 
        if head lista `mod` 2 == 0
            then head lista + sumaPares (tail lista)  -- Si el primer elemento es par, sumarlo
        else sumaPares (tail lista)  -- Si es impar, ignorarlo y seguir con el resto

sumaPares2 :: [Int] -> Int
sumaPares2 [] = 0
sumaPares2 (x:xs) = 
    if x `mod` 2 == 0
        then x + sumaPares2 xs
    else
        sumaPares2 xs

sumaPares3 :: [Int] -> Int
sumaPares3 [] = 0
sumaPares3 (x:xs)  
    | x `mod` 2 == 0 = x + sumaPares3 xs
    | otherwise = sumaPares3 xs

sumaPares4 :: [Int] -> Int
sumaPares4 lista = sum [x | x <- lista, x `mod` 2 == 0]

-- Define una función separarParesImpares que, dado una lista de enteros, devuelva una tupla de dos listas: la primera 
-- lista debe contener todos los números pares y la segunda todos los impares, utilizando pattern matching y recursión.

separarParesImpares :: [Int] -> ([Int], [Int])
separarParesImpares lista = (
    [x | x <- lista, x `mod` 2 == 0],
    [x | x <- lista, x `mod` 2 /= 0]
    )

-- Implementa una función recursiva combinaciones que reciba dos listas y devuelva una lista con todas las combinaciones 
-- posibles (pares) entre los elementos de ambas listas, sin usar listas por comprensión.

combinaciones :: [a] -> [b] -> [(a, b)]
combinaciones lista1 lista2 = [(x, y) | x <- lista1, y <- lista2]


combinaciones2 [] _ = [] 
combinaciones2 _ [] = [] 
combinaciones2 (x:xs) lista2 = combinarCon x lista2 ++ combinaciones2 xs lista2
 where
   combinarCon :: a -> [b] -> [(a, b)]
   combinarCon _ [] = []
   combinarCon x (y:ys) = (x, y) : combinarCon x ys

-- Define una función matrizIdentidad que reciba un número entero n y devuelva una matriz identidad de 
-- tamaño n x n utilizando listas por comprensión.

matrizIdentidad n = [[if i == j then 1 else 0 | j <- [0..n-1]] | i <- [0..n-1]]

-- Escribe una función productoAcumulativo que reciba una lista de enteros y devuelva una lista donde cada 
-- elemento es el producto acumulativo de los elementos anteriores. Por ejemplo, para [1, 2, 3, 4] debe devolver [1, 2, 6, 24].


