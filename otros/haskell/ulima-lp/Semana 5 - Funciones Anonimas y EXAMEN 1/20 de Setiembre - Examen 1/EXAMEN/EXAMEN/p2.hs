-- Pregunta 2
{-
PREGUNTA2 (4 puntos)
Implementar una función llamada binarioDecimal, que reciba como argumento de 
entrada una lista de 0s y 
1s, que representan un número en base 2, y devuelva el número, pero en base 10. 
Debe implementar su 
código en el archivo p2.hs. 
Por ejemplo:
[1, 0 ,1, 1, 1, 0] = 0*2^0 + 1*2^1 + 1*2^2 + 1*2^3 + 0*2^4 + 1*2^5 = 0 + 2 + 4 + 8 + 32 = 46
-}

longitud :: [Int] -> Int
longitud lista =
    if null lista
        then 0
    else 
        (longitud (tail lista)) + 1

binarioDecimal :: [Int] -> Int 
binarioDecimal listaBinaria =
    binarioDecimal2 listaBinaria 0 (longitud listaBinaria)

binarioDecimal2 :: [Int] -> Int -> Int -> Int
binarioDecimal2 listaBinaria sumParcial index =
    if null listaBinaria
        then sumParcial
    else 
        binarioDecimal2 (tail listaBinaria) 
        (sumParcial + ((head listaBinaria)*(2^(index-1)))) 
        (index - 1)