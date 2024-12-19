-- 13. Elabora una función que reciba una lista de tuplas de 3 valores: nombre del curso (String), seccion (Int) y la nota (Float). 
-- El programa además deberá recibir el nombre de un curso (String) y deberá calcular el promedio de notas de todas las secciones 
-- correspondientes a ese curso.

listaCursos ::[(String, Int, Float)] = [("Matematicas", 101, 15.5), 
                                        ("Matematicas", 102, 18.0), 
                                        ("Fisica", 101, 12.5), 
                                        ("Matematicas", 103, 16.5), 
                                        ("Fisica", 102, 14.0)]
pregunta12 :: [(String, Int, Float)] -> String -> Float
pregunta12 lista curso = 
    (sum
    (map (\(_, _, nota) -> nota) 
        (filter (\(cursoF, _, _) -> cursoF == curso) lista))) / (fromIntegral (length (filter (\(cursoF, _, _) -> cursoF == curso) lista)))