-- 15. Elaborar una función que devuelva una lista de los números binarios, de los números impares de una lista del 1 al 5.

convertirBinarioW :: Int -> String
convertirBinarioW num =
    convertirBinario num ""

convertirBinario :: Int -> String -> String
convertirBinario num numBinario = 
    if num < 2 
        then show num ++ numBinario
    else
        convertirBinario (num `div` 2) (show (num `mod` 2) ++ numBinario)

pregunta15 :: [Int] -> [String]
pregunta15 listaNum = map (convertirBinarioW) (filter (\n -> odd n) listaNum)



