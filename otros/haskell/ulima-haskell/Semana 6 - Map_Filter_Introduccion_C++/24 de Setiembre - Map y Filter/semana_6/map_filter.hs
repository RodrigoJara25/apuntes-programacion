listaNumeros :: [Int] = [1,3,5,7]
listaNombres :: [String] = ["Arturo", "Hernan"]

elevarCuadradoLista lista =
    map (\n1 -> n1 * n1) lista

listaAlumnos :: [(String, Float, Float, Float, Float)] =
    [("Arturo", 20, 16, 14, 16),
    ("Pepe", 10, 9, 10, 11),
    ("Hernan", 10, 3, 5, 11)]

-- N1: 20% N2: 20% N3: 30% N4: 30%
-- Implementar una funcion promedios que nos devuelva una lista
-- con el nombre y el promedio final de cada alumno.

promedios :: [(String, Float, Float, Float, Float)] -> [(String, Float)]
promedios listaAlumnos = 
    map (\(nombre, n1, n2, n3, n4) -> (nombre, n1*0.2+n2*0.2+n3*0.3+n4*0.3)) listaAlumnos 

-- Implementar una funcion que nos devuelva la cantidad de desaprobados 
-- numDesaprobados

numDesaprobados :: [(String, Float, Float, Float, Float)] -> Int
numDesaprobados listaAlumnos = 
    length
        (filter
            (\(_, nota) -> nota <= 10.5)
            (map (\(nombre, n1, n2, n3, n4) -> (nombre, n1*0.2+n2*0.2+n3*0.3+n4*0.3)) listaAlumnos))


-- Implementar una funcion llamada mayorDesaprobados que nos devuelva el nombre 
-- del alumno que tuvo más nota de los desaprobados

mayorDesaprobadosW :: [(String, Float, Float, Float, Float)] -> String
mayorDesaprobadosW listaAlumnos =
    mayorDesaprobados (filter (\(_, nota) -> nota <= 10.5) (map (\(nombre, n1, n2, n3, n4) -> (nombre, n1*0.2+n2*0.2+n3*0.3+n4*0.3)) listaAlumnos)) 0 ""

mayorDesaprobados [] notaMayor nombreMayor = nombreMayor  
mayorDesaprobados ((nombre, nota):xs) notaMayor nombreMayor   
    | nota > notaMayor = mayorDesaprobados xs nota nombre
    | otherwise = mayorDesaprobados xs notaMayor nombreMayor