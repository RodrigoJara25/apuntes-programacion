sumar :: Float -> Float -> Float
sumar op1 op2 = op1 + op2

esPositivo :: Int -> Bool
esPositivo num =
    if num >= 0
        then True
        else False

fun1 num =
    (if num > 100
        then num*2
        else num/2) + 1

mayorEdad :: String -> Int -> Bool
mayorEdad nombre edad =
    edad >= 18