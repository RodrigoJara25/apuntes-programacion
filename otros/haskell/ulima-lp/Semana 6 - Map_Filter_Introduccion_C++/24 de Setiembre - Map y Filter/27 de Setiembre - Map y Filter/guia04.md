# Guía 04 - Tuplas, Map y Filter

La siguiente guía debe de realizarla utilizando el shell interactivo de Haskell para probar las funciones creadas (a no ser que se especifique lo contrario).

1. Escriba una funcion llamada 'filtrarEnteros' que reciba como entrada una lista y una función anónima que retorne un booleano, y filtre los elementos de la lista de enteros de acuerdo a esta función.

2. Escriba un función que reciba como entrada una lista de números enteros y devuelva una nueva lista que contenga sólo los números positivos. Ejemplo: [1,2,3,4,5,8] => [4,16,64]

3. Escriba una funcion llamada 'transformarEnterosACuadrados' que reciba como entrada una lista de enteros y devuelva una nueva lista con los numeros enteros elevados al cuadrado. Ejemplo: [1,2,3] => [1,4,9]

4. Escriba un función que reciba como entrada una lista de números enteros y devuelva una nueva lista que solamente contenga los cuadrados de cada número par de la lista de entrada. Ejemplo: [1,2,3,4,5,8] => [4,16,64]

5. Escriba un función que reciba como entrada una lista de strings y devuelva una nueva lista que contenga solamente aquellos strings que tengan más de 5 caracteres.

6. Elabore una función que reciba dos listas de enteros (de igual tamaño) y una función que reciba 2 enteros y devuelva un nuevo entero, y las combine en una sola lista bajo la función ingresada. 

Ejemplo: 

``` haskell
[1,2,3] [2,3,4] (\a b-> a + b) = [3,5,7]
```

7. Contador de vocales: Escribe una función que reciba una cadena de texto y devuelva la cantidad de vocales que contiene.

8. Elabore una función que reciba una lista de nombres, y devuelva una nueva lista agregando un saludo al principo de cada nombre. 

Ejemplo: 

```haskell
["Leo","Hernan","Pepe"] => ["Buenas tardes, Leo","Buenas tardes, Hernan","Buenas tardes, Pepe"]
```

9. Elabore una función que reciba una lista de tuplas de 2 valores, donde el primer valor sea un numero y una potencia, y devuelva una nueva lista con los números elevados a la potencia correspondiente. 

```
Ejemplo: [(2,2),(3,5),(4,2),(2,6)] => [4,243,16,64]
```

10. Elabora una función que reciba una lista de tuplas de dos valores: nombre del empleado (String) y sueldo (float). Se quiere obtener una lista con los nombres de aquellos empleados con un sueldo mayor al sueldo minimo (s/ 1025) 

```
Ejemplo: [("Jaime",2000),("Luis",1000),("Renato",4000),("Cuto",10000)] => ["Jaime","Renato","Cuto"]
```

11. Elabore una función que reciba como entrada una lista de tuplas con 3 valores: nombre de producto (String), precio (Float), stock (Int). Se quiere obtener una lista de con los nombres de aquellos productos que su precio sea mayor a 10.0 y tengan stock (stock mayor a cero). 

```
Ejemplo: [("Polo", 30.0, 5), ("Camisa", 50.0, 0), ("Collar", 5.0, 2), ("Casaca", 30.50, 3)] => ["Polo","Casaca"]
```

12. Elabora una función que reciba una lista de tuplas de 3 valores: nombre del anime (String), rating (Float) y género (String). El programa debera, además recibir como entrada un rating y un genero, y debera devolver una lista con aquellos animes con un rating mayor o igual al ingresado y pertenecientes al género ingresado. 

Ejemplo: lista: 

``` haskell
[("Noragami",7.9,"Action"),("Neon Genesis Evangelion",8.5,"Sci-Fi"),("Jujutsu Kaisen",8.5,"Action"),("Sword Art Online",7.5,"Adventure"),("Tokyo Ghoul",7.7,"Fantasy"),("Fullmetal Alchemist: Brotherhood",9.1,"Action")] rating: 8.3 género: "Action" El resultado deberia ser: [("Jujutsu Kaisen",8.5,"Action"),("Fullmetal Alchemist: Brotherhood",9.1,"Action")]
```

13. Elabora una función que reciba una lista de tuplas de 3 valores: nombre del curso (String), seccion (Int) y la nota (Float). El programa además deberá recibir el nombre de un curso (String) y deberá calcular el promedio de notas de todas las secciones correspondientes a ese curso.

14. Elabora una función que reciba una lista de cadenas y devuelva una lista que contenga las cadenas con más de 5 dígitos.

15. Elaborar una función que devuelva una lista de los números binarios, de los números impares de una lista del 1 al 5.

16. Elaborar una función que calcule el total a pagar de los siguientes útiles de oficina, representados en la siguiente lista de tuplas, en la cual cada elemento de la tupla representa el nombre, cantidad y precio respectivamente: 

``` haskell
[("Lapicero", 5, 2.00),("Borrador", 1, 3.00),("Cuaderno", 3, 8.00),("Tijeras", 1, 2.50)]
```

17. Con respecto al ejercicio anterior, debido a la campaña escolar, los cuadernos se encuentran con 15% de descuento. Teniendo en cuenta esta información, calcular el total a pagar.

18. Se ha recibido diversos registros de la temperatura (en °C) en las ciudades de Lima y Callao durante el día. Se le solicita crear una función que calcule la temperatura promedio en la ciudad de Lima. Los datos se encuentran en la siguiente lista: 

``` haskell
[(1, "Lima", "10/05/2023", 28.5),(2, "Lima", "10/05/2023", 27.8),(3, "Callao", "10/05/2023", 30.5),(4, "Lima", "10/05/2023", 27.0),(5, "Lima", "10/05/2023", 29.5),(6, "Callao", "10/05/2023", 28.5),(7, "Callao", "10/05/2023", 27.1),(8, "Callao", "10/05/2023", 26.5),(9, "Lima", "10/05/2023", 30.5),(10, "Lima", "10/05/2023", 31.3),(11, "Lima", "10/05/2023", 26.0),(12, "Callao", "10/05/2023", 27.9),(13, "Callao", "10/05/2023", 25.7),(14, "Lima", "10/05/2023", 24.8)]
```