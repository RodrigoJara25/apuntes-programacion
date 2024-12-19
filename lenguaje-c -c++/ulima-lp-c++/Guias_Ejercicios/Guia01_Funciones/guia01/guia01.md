# Guía 01 - Funciones Haskell

La siguiente guía debe de realizarla utilizando el shell interactivo de Haskell (a no ser que se especifique lo contrario).

1. Escribir una función llamada Doble que devuelva el doble de un numero entero ingresado como argumento de entrada.

2. Escribir una función llamada factorial que retorne el factorial de un número entero que será el argumento de entrada de la función. *Tip: Utilizar función fac*.

3. Escribir una función llamada cuadrado que reciba como argumento un número y lo eleve al cuadrado.

4. Escribir una función llamada mayor que reciba como argumentos de entrada dos números y devuelva el mayor de ellos. No debe utilizar la función max.

5. Escribir una función llamada mayor3 que reciba como argumentos de entrada tres números y devuelva el mayor de ellos. Para este caso debe de utilizar la función max.

6. Escribir una función llamada validador1 que reciba como argumento de entrada un número entero y devuelva un string que diga "PAR" si el número es par o "IMPAR" si es impar. Tip: Puede utilizar la función even o la función odd.

7. Escribir una función llamada validador2 que reciba como argumento de entrada un número entero y devuelva un string que diga "PAR" si el número es par o "IMPAR" si es impar. No debe utilizar la función even ni odd, pero si la función mod.

8. Escribir una función llamada distancia que calcule la distancia entre 2 puntos en un plano euclidiano. Esta función debe recibir 4 argumentos de entrada: los dos primeros las posiciones X1 e Y1 y los dos últimos las posicion X2 e Y2.

9. Escribir una función llamada imc que calcule el índice de masa corporal de una persona. Esta función debe recibir como argumento de entrada el peso (en kg) que será un Float, y la altura en metros (Float).

10. Escrir una función llamada clasificar_imc que recibar como argumento de entrada el peso y la altura, y devuelva un string según las categorías de la siguiente tabla:

| IMC | Categoría |
| --- | --------- |
| Menor a 18.5 | "bajo" |
| Mayor o igual que 18.5 y menor que 25 | "normal" |
| Mayor o igual que 25 y menor que 30 | "sobrepeso" |
| Mayor o igual que 30 | "obesidad" |

11. Escribir una función llamada manhattan que calcule la distancia *manhattan* entre dos puntos. Esta función debe recibir 4 argumentos de entrada: los dos primeros las posiciones X1 e Y1 y los dos últimos las posicion X2 e Y2.

La fórmula es: d = |X2 - X1| + |Y2 - Y1|

No debe utilizar la función abs de Haskell (debe crear la suya propia).

12. Escribir una función llamada area, que dado la longitud de los 3 lados de un triángulo (argumentos de entrada), retorne el área del triángulo, según la fórmula de Heron.

```
area = raiz_cuadrada(s(s - a)(s - b)(s - c))
donde: s = (a + b + c) / 2
```

13. Escribir una funcion llamada cambiar_moneda que reciba como argumento un valor numerico en soles (float) y el nombre de una moneda (String) a la cual se desea convertir. Tomar como referencia los siguientes tipos de cambios:

| Moneda | Tipo de cambio (valor de S/1) |
| ------- | --------------- |
| Dolar | 0.27 |
| Euro | 0.24 |
| Peso chileno | 212.57 |
| Peso argentino | 56.79 |
| Dolar canadiense | 0.36 |