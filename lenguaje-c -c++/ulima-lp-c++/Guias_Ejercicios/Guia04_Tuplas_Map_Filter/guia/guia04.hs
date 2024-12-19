-- 1. Escriba una funcion llamada 'filtrarEnteros' que reciba como entrada una lista y una función anónima que retorne un booleano, 
-- y filtre los elementos de la lista de enteros de acuerdo a esta función.

filtrarEnteros :: [Int] -> (Int -> Bool) -> [Int]
filtrarEnteros lista f =
    filter f lista

-- 2. Escriba un función que reciba como entrada una lista de números enteros y devuelva una nueva lista que contenga sólo los números 
-- positivos. Ejemplo: [1,2,3,4,5,8] => [4,16,64]

pregunta2 :: [Int] -> [Int]
pregunta2 lista = filter (\n -> n >= 0) lista

-- 3. Escriba una funcion llamada 'transformarEnterosACuadrados' que reciba como entrada una lista de enteros y devuelva una nueva lista 
-- con los numeros enteros elevados al cuadrado. Ejemplo: [1,2,3] => [1,4,9]

transformarEnterosACuadrados :: [Int] -> [Int]
-- transformarEnterosACuadrados lista = [x*x | x <- lista]
transformarEnterosACuadrados lista = map (\n -> n*n) lista

-- 4. Escriba un función que reciba como entrada una lista de números enteros y devuelva una nueva lista que solamente contenga los cuadrados 
-- de cada número par de la lista de entrada. Ejemplo: [1,2,3,4,5,8] => [4,16,64]

pregunta4 :: [Int] -> [Int]
pregunta4 lista = map (\n -> n*n) (filter (\n -> even n) lista)

-- 5. Escriba un función que reciba como entrada una lista de strings y devuelva una nueva lista que contenga solamente aquellos strings que 
-- tengan más de 5 caracteres.

pregunta5 :: [String] -> [String]
pregunta5 lista = filter (\n -> length n > 5) lista

-- 6. Elabore una función que reciba dos listas de enteros (de igual tamaño) y una función que reciba 2 enteros y devuelva un nuevo entero, 
-- y las combine en una sola lista bajo la función ingresada. 

-- Ejemplo: 

-- [1,2,3] [2,3,4] (\a b-> a + b) = [3,5,7]

pregunta6 :: [Int] -> [Int] -> (Int -> Int -> Int) -> [Int]
pregunta6 [] [] _ = []
pregunta6 (x:xs) (y:ys) f = f x y : pregunta6 xs ys f   

-- 7. Contador de vocales: Escribe una función que reciba una cadena de texto y devuelva la cantidad de vocales que contiene.

pregunta7 :: String -> Int
pregunta7 palabra = length (filter (\n -> n `elem` "aeiouAEIOU") palabra)

-- 8. Elabore una función que reciba una lista de nombres, y devuelva una nueva lista agregando un saludo al principo de cada nombre.

pregunta8 :: [String] -> [String]
pregunta8 lista = map (\n -> "hola " ++ n) lista

-- 9. Elabore una función que reciba una lista de tuplas de 2 valores, donde el primer valor sea un numero y una potencia, y devuelva una nueva lista con los números elevados a la potencia correspondiente. 

-- Ejemplo: [(2,2),(3,5),(4,2),(2,6)] => [4,243,16,64]

pregunta9 :: [(Float, Float)] -> [Float]
pregunta9 lista = map (\(num, pot) -> num ** pot) lista

-- 10. Elabora una función que reciba una lista de tuplas de dos valores: nombre del empleado (String) y sueldo (float). Se quiere obtener una 
-- lista con los nombres de aquellos empleados con un sueldo mayor al sueldo minimo (s/ 1025) 

-- Ejemplo: [("Jaime",2000),("Luis",1000),("Renato",4000),("Cuto",10000)] => ["Jaime","Renato","Cuto"]

pregunta10 :: [(String, Float)] -> [String]
-- pregunta10 lista = map (\(nombre, sueldo) -> nombre) (filter (\(_, sueldo) -> sueldo > 1025) lista)
pregunta10 lista = map fst (filter (\(_, sueldo) -> sueldo > 1025) lista)


-- 11. Elabore una función que reciba como entrada una lista de tuplas con 3 valores: nombre de producto (String), precio (Float), stock (Int). 
-- Se quiere obtener una lista de con los nombres de aquellos 
-- productos que su precio sea mayor a 10.0 y tengan stock (stock mayor a cero). 
-- Ejemplo: [("Polo", 30.0, 5), ("Camisa", 50.0, 0), ("Collar", 5.0, 2), ("Casaca", 30.50, 3)] => ["Polo","Casaca"]

pregunta11 :: [(String, Float, Int)] -> [String]
pregunta11 lista = map (\(nombre, _, _) -> nombre) (filter (\(_, precio, stock) -> precio > 10 && stock > 0) lista)

-- 12. Elabora una función que reciba una lista de tuplas de 3 valores: nombre del anime (String), rating (Float) y género (String). 
-- El programa debera, además recibir como entrada un rating y un genero, y debera devolver una lista con aquellos animes con un rating 
-- mayor o igual al ingresado y pertenecientes al género ingresado. 

-- Ejemplo: lista: 

-- [("Noragami",7.9,"Action"),("Neon Genesis Evangelion",8.5,"Sci-Fi"),("Jujutsu Kaisen",8.5,"Action"),("Sword Art Online",7.5,"Adventure"),("Tokyo Ghoul",7.7,"Fantasy"),("Fullmetal Alchemist: Brotherhood",9.1,"Action")] 
-- rating: 8.3 género: "Action" 
-- El resultado deberia ser: [("Jujutsu Kaisen",8.5,"Action"),("Fullmetal Alchemist: Brotherhood",9.1,"Action")]

type Anime = (String, Float, String)
listaAnime :: [Anime] = [("Noragami",7.9,"Action"),("Neon Genesis Evangelion",8.5,"Sci-Fi"),("Jujutsu Kaisen",8.5,"Action"),("Sword Art Online",7.5,"Adventure"),("Tokyo Ghoul",7.7,"Fantasy"),("Fullmetal Alchemist: Brotherhood",9.1,"Action")]
pregunta12 :: [Anime] -> Float -> String -> [Anime]
pregunta12 lista rating genero = filter (\(_, rat, gen) -> rat >= rating && gen == genero) lista