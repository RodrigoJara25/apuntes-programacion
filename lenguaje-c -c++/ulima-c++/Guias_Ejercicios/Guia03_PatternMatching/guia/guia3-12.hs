{-
**A**

Implementar una función llamada alumnosMatriculados que reciba como argumento de entrada la lista de cursos y el nombre de la carrera, y 
devuelva la cantidad total de alumnos matriculados (Int) en todos los cursos de determinada carrera.
-}

listaCursos :: [Curso] = [
   ("Sistemas", "Ingenieria de Software", "Lenguajes de Programación", 40, 12.34),
   ("Sistemas", "Ingenieria de Software", "EDA", 38, 40.34),
   ("Industrial", "Investigación de Operaciones", "Simulación de Procesos", 42, 30.34),
   ("Industrial", "Operaciones y Cadena de Suministros", "Gestión de la Demanda", 40, 12.34),
   ("Civil", "Construccion", "Tecnología de Construcción I", 42, 15.77)
   ]

type Curso = (String, String, String, Int, Float)

alumnosMatriculados :: [Curso] -> String -> Int
alumnosMatriculados listaCursos carrera =
    alumnosMatriculados2 listaCursos carrera 0

alumnosMatriculados2 :: [Curso] -> String -> Int -> Int
alumnosMatriculados2 [] _ contParcial = contParcial
alumnosMatriculados2 ((_, carreraCurso, _, numAlumnos, _):xs) carrera contParcial = 
    if carreraCurso == carrera
        then alumnosMatriculados2 xs carrera (contParcial + numAlumnos)
    else
        alumnosMatriculados2 xs carrera contParcial

