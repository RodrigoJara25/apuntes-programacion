-- 14. Elabora una función que reciba una lista de cadenas y devuelva una lista que contenga las cadenas con más de 5 dígitos.

listaCadenas :: [String] = ["Haskell", "Hola", "Mundo", "Programacion", "123456", "1234"]
pregunta14 :: [String] -> [String]
pregunta14 listaCad = filter (\n -> length n > 5) listaCad