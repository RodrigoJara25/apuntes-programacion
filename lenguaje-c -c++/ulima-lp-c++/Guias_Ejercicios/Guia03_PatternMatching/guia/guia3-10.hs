{-
1. Elaborar una función que reciba como parámetro la siguiente lista de notas: [11, 19, 06, 17, 14, 20, 18] y devuelva una lista indicando 
si es Aprobado o Desaprobado. Utilizar las siguientes condiciones:

- Desaprobado: < 11
- Aprobado: >= 11
-}



{-
10. Se tiene una lista que contiene mediciones del peso de una persona (2 mediciones) además del nombre de la persona.
Un ejemplo sería como el siguiente:

``` haskell
[("Pedro", 78.7, 80.4), ("Luis", 79.0, 80.7), ...]
```

Implementar una función llamada pregunta1 que calcule la raiz cuadrada del promedio del error elevado al cuadrado de 
todas las mediciones realizadas.

El error elevado al cuadrado es el cuadrado de la resta de las dos mediciones. Por ejemplo, en el caso de Pedro sería 78.7-80.4 elevado 
l cuadrado, o sea 2.89. En el caso de Luis su error elevado al cuadrado es 79.0-80.3 elevado al cuadrado, o sea 1.69.
-}
type Persona = (String, Float, Float)

calcularErrorAlCuadrado :: Persona -> Float
calcularErrorAlCuadrado (_, med1, med2) =
    (med1 - med2)**2

pregunta1 :: [Persona] -> Float
pregunta1 listaPersonas =
    pregunta1Tail listaPersonas 0 0

pregunta1Tail :: [Persona] -> Float -> Float -> Float
pregunta1Tail listaPersonas sumaParcial cantidad
    | null listaPersonas = sqrt (sumaParcial/cantidad) -- caso base
    | otherwise = pregunta1Tail (tail listaPersonas) (calcularErrorAlCuadrado (head listaPersonas) + sumaParcial) (cantidad+1)

{-
pregunta1Tail :: [Persona] -> Float -> Float -> Float    
pregunta1Tail [] sumaParcial cantidad = sqrt (sumaParcial/cantidad) -- caso base
pregunta1Tail (x:xs) sumaParcial cantidad = pregunta1Tail (xs) (calcularErrorAlCuadrado (x) + sumaParcial) (cantidad+1)
-}


{-
Ejercicio 12

**A**

Implementar una función llamada alumnosMatriculados que reciba como argumento de entrada la lista de cursos y el nombre 
de la carrera, y devuelva la cantidad total de alumnos matriculados (Int) en todos los cursos de determinada carrera.
-}