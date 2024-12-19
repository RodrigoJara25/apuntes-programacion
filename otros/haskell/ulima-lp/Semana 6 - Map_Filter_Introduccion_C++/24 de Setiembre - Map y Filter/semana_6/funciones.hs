calcular :: Int -> Int -> (Int -> Int -> Int) -> Int
calcular op1 op2 f =
    f op1 op2

sumar :: Int -> Int -> Int
sumar op1 op2 = op1 + op2

restar :: Int -> Int -> Int
restar op1 op2 = op1 - op2

-- No va a funcionar si no tiene los mismos argumentos
cuadrado :: Int -> Int
cuadrado n = n*n