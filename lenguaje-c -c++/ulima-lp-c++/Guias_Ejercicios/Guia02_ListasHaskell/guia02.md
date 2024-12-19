# Guía 02 - Listas Haskell

**Nota:** Las funciones deberá llamarlas según el número de la pregunta. Esto es, si es la pregunta 1, se deberá de llamar pregunta1.

1. Crear una función llamada crearListaP1, que reciba como argumento de entrada un numero n y que te permita devolver la siguiente lista:

```
[-n,...,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,...,n]
```

2. Escribir una funcion llamada pregunta2 que calcule la suma de los elementos impares de una lista de números enteros que es su argumento de entrada.

3. Escribir una función llamada pregunta3 que calcule el producto de los elementos pares de una lista de números enteros, que será su argumento de entrada. Debe utilizar tail recursion.

4. Escribir una función que invirta una lista. Esto es, que reciba como argumento de entrada [1, 2, 3, 4, 5] y devuelva [5, 4, 3, 2, 1].

5. Escribir una función que devuelva True si todos los elementos, de una lista que se entregue como argumento de entrada, son mayores que 0, o False en caso contrario. Debe utilizar tail recursion.

6. Escriba una función que reciba un número entero y una lista. Si el numero entero es par, devolver una nueva lista que contenga la lista inicial y el numero entero ingresado. Si no, devolver la lista inicial.

7. Escribir una función que reciba como entrada una lista de numeros enteros y un numero entero, y devuelva una nueva lista donde cada uno de los elementos de la lista sea multiplicado por el numero entero ingresado.

8. Escriba una función que reciba como entrada una lista de años y devuelva una nueva lista con aquellos que son bisiestos. Tomar en cuenta que un año bisiesto es un año que puede ser divisible entre 4 (sin residuo) excepto cada año que es divisible entre 100 (sin residuo), a no ser que el año sea divisible entre 400 (sin residuo).

9. Escriba una función que reciba como entrada 2 listas, y devuelva una nueva lista con los elementos de la primera lista que existan en la segunda.

10. Escriba una función que reciba un numero entero y devuelva una lista con su tabla de multplicar del 1 al 12.

11. Escriba una función que reciba una lista de listas de números enteros (lista de 2 nieveles o dimensiones, tambien conocida como matriz) y que devuelva una nueva lista con los promedios enteros de cada lista que tengan, por lo menos, 3 elementos.

12. Escribir una función que reciba una lista de Strings y un String, y devuelva True si la lista contiene el String o False si no lo contiene.

13. Escribir una función que reciba una lista de Strings y un String. Si la lista no contiene el String ingresado, devolver una nueva lista que agregue el String ingresado a la lista inicial. Si la lista lo contiene, devolver la lista inicial.

14. Escriba una función que elimine los elementos duplicados de la siguiente lista de números enteros [1, 1, 2, 3, 3, 4, 4, 5].

15. Escriba una función que reciba como entrada un número entero, si dicho valor no se encuentra en una la lista (que recibe como argumento de entrada), añadirlo, caso contrario eliminarlo de la lista. Finalmente imprimir la lista ordenada ascendentemente. Puede utilizar la función sort.

16. Escribir una función para calcular la pendiente de una recta, la función debe recibir dos parametros, cada uno es una lista de dos elementos (números enteros) que representan el punto A y punto B de la recta.

17. Escriba unafunción que calcule y añada a la lista los proximos 3 números siguiendo la sucesión de Fibonacci. Trabajar con la siguiente lista [0, 1, 1, 2, 3, 5, 8]

18. Escriba una función que reciba como parametro una cadena, extraiga las palabras y coloque cada una en una lista.

19. Escriba una función que reciba como parametro una cadena y devuelva una lista de las vocales que se encuentren en la entrada sin que se repitan.

20. Escribir una función que recorra una la lista [1, 3, 4, 5, 8, 9, 10] y la separe en dos sublistas de números pares e impares.

21. Escribir una función que reciba como parametros una lista de números enteros y un número entero (n), devolver la lista filtrada en la que cada elemento cumpla la siguiente condición: < n.