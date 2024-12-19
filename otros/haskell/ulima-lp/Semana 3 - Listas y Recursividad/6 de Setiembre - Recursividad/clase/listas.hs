longitud :: [Int] -> Int
longitud lista =
    if null lista 
    -- Caso Base
    then 0
    -- Caso Recursivo
    else longitud(tail lista) + 1


-- Funcion Wrapper
longitudLista :: [Int] -> Int
longitudLista lista =
    longitudTail lista 0 

-- Funcion Recursiva con Cola
longitudTail :: [Int] -> Int -> Int
longitudTail lista longitudParcial =
    -- caso base
    if null lista
        then longitudParcial
    -- caso recursivo
    else longitudTail (tail lista) (longitudParcial + 1)


{-- Implementar una funcion sumarLista que reciba una lista de enteros
-- y me devuela la suma de sus elementos
sumarLista :: [Int] -> Int
sumarLista lista =
    if null lista 
        then 0 -- Caso base
    -- Caso Recursivo
    else sumarLista (tail lista) + (head lista)
-}

-- Implementar una funcion sumarLista que reciba una lista de enteros
-- y me devuela la suma de sus elementos. Con recursividad de cola.
sumarListaW :: [Int] -> Int
sumarListaW lista =
    sumarLista lista 0

sumarLista :: [Int] -> Int -> Int
sumarLista lista sumParcial =
    if null lista 
        then sumParcial -- Caso base
    -- Caso Recursivo
    else sumarLista (tail lista) (sumParcial + (head lista))


