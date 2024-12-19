type Alumno = (String, Int, Float)

tuplaAlumno :: Alumno = ("Arturo", 24, 1.7)

devolverEdad :: Alumno -> Int
devolverEdad(_, edad, _) = edad * 2


obtenerCategoriaEdad :: Alumno -> String
obtenerCategoriaEdad (_, edad, _)
    | edad <= 18 = "Menor de edad"
    | edad <= 30 = "Adulto joven"
    | edad <= 75 = "Adulto"
    | otherwise = "Adulto mayor"


