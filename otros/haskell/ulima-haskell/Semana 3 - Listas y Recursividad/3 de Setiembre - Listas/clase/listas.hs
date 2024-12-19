num :: Int = 20
peso :: Float = 78.4
esMayorEdad :: Bool = True
nombre :: String = "Arturo"
nombre2 :: [Char] = "Arturo"

numeros :: [Int] = [1,4,7,9]
diasSemana :: [String] = ["Lunes", "Martes"]

segundo :: [Int] -> Int 
segundo lista = head (tail lista)

tercero :: [Int] -> Int
tercero lista = head (tail (tail lista))

cuarto :: [Int] -> Int
cuarto lista = head (tail (tail (tail lista)))

quinto :: [Int] -> Int
quinto lista = 
    if null (tail (tail (tail (tail lista)))) then (-1)
    else head (tail (tail (tail (tail lista))))

longitud :: [Int] -> Int
longitud lista = 
    if null lista 
        then 0 -- Caso base
        else longitud (tail lista) + 1 -- Caso recursivo