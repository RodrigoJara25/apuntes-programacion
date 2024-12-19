-- 16. Elaborar una función que calcule el total a pagar de los siguientes útiles de oficina, representados en la siguiente lista 
-- de tuplas, en la cual cada elemento de la tupla representa el nombre, cantidad y precio respectivamente: 

-- [("Lapicero", 5, 2.00),("Borrador", 1, 3.00),("Cuaderno", 3, 8.00),("Tijeras", 1, 2.50)]

type ListaUtiles = (String, Float, Float)

pregunta16 :: [ListaUtiles] -> Float
pregunta16 lista = sum (map (\(_, cantidad, precio) -> cantidad * precio) lista)

