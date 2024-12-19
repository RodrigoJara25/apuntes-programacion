# Guía 08 - C++ con Listas Enlazadas

La siguiente guía debe de realizarla utilizando C++ y listas enlazadas. Además la compilación deberá hacerla utilizando un archivo Makefile que deberá de construir.Además, la organización del código 
debe de seguir el paradigma orientado a objetos.

## Easy

1. Utilizando punteros, calcule la suma de los elementos de un arreglo de numeros enteros.
2. Elabore un algoritmo que invierta los elementos de un arreglo de numeros enteros.
3. Utilizando punteros, elabore un algoritmo que cuente cuantos numeros pares hay en un arreglo de enteros.
4. Utilizando punteros, elabore un algoritmo que sobre un arreglo de numeros enteros, reemplace todas las ocurrencias de un numero indicado por otro numero ingresado.
5. Utilizando punteros elabore un algoritmo que encuentre e imprima el maximo y minimo valor de un arreglo de enteros.
6. Sobre la implementacion de listas enlazadas, elabore los siguientes algoritmos:
   - a) Contar numero de nodos
   - b) Crear una nueva lista enlazada invertida
   - c) Reemplazar todas las ocurrencias de un elemento x por un nuevo valor y.
   - d) Dividir una lista enlazada en dos listas, donde la primera lista tenga todos los elementos hasta antes del nodo con valor x. La segunda contendra todos los elementos a partir del nodo con valor x.
7. Implementa las siguientes clases:
   - a. Implementa una clase "Persona" con atributos de nombre y edad, y métodos para establecer y obtener estos atributos.
   - b. Crea una clase "Rectángulo" con atributos de origen x, origen y, ancho y alto, y métodos para calcular el área y el perímetro.
   - c. Diseña una clase "Triángulo" con atributos de punto 1 x, punto 1 y, punto 2 x, punto 2 y, punto 3 x, punto 3 y, y métodos para calcular su perímetro.
   - d. Diseña una clase "Círculo" con atributos de radio y métodos para calcular el área y la circunferencia.
   - e. Diseña una clase "Fecha" con atributos de día, mes y año, y métodos para obtener y establecer la fecha, así como para verificar si es una fecha válida. El algoritmo correcto de esFechaValida es opcional
   - f. Crea una clase "Libro" con atributos de título, autor y año de publicación, y métodos para mostrar la información del libro.
   - g. Implementa una clase "Calculadora" con métodos para realizar operaciones matemáticas básicas como suma, resta, multiplicación y división.
   - h. Diseña una clase "CuentaBancaria" con atributos de número de cuenta, saldo y titular, y métodos para depositar, retirar y mostrar el saldo actual.
   - i. Crea una clase "Tiempo" con atributos de horas, minutos y segundos, y métodos para sumar y restar tiempos. El algoritmo correcto de sumarTiempo y restarTiempo es opcional.

## Medium - Hard

1.	Existe un método de decodificación de palabras o frases llamado el Código da Vinci.

El método consiste en que, inicialmente, tenemos una serie de números que pertenecen a la serie de Fibonacci y también tenemos una palabra del mismo tamaño a nivel de caracteres que la cantidad de números en la serie y esta palabra esta codificada.

Por ejemplo:
Números: 13 2 89 377 8 3 233 34 144 21 1
Palabra: OHLAMESAINT

Del ejemplo podemos ver que cada letra de la palabra queda asociada a un número de la serie de acuerdo con la posición en la que fueron ingresados. Para el ejemplo quedarían asociados de la siguiente manera:

| 12 | 2 | 89 | 377 | 8 | 3 | 233 | 34 | 144 | 21 | 1 |
| -- | - | -- | --- | - | - | --- | -- | --- | -- | - |
| O  | H | L  | A   | M | E | S   | A  | I   | N  | T |

La decodificación consiste en re-ordenar los números de manera creciente y por ende sus letras asociadas también cambiarán de orden, para nuestro ejemplo quedaría así.

| 1 | 2 | 3 | 8 | 13 | 21 | 34 | 89 | 144 | 233 | 377 |
| - | - | - | - | -- | -- | -- | -- | --- | --- | --- |
| T | H | E | M | O  | N  | A  | L  | I   | S   | A   |

Después de ordenar los números se puede dar el caso que la serie de Fibonacci tenga vacíos, para este ejemplo, entre el 3 y el 8 falta el número 5, esto quiere decir que como entre el 3 y el 8 falta un número de la serie entonces entre la E y la M debe ir un espacio en blanco al momento de imprimir la palabra decodificada. Es decir, por cada número faltante de la serie se imprime un carácter en blanco. Siguiendo con nuestro ejemplo finalmente la palabra se imprimirá así:

THE MONA LISA

El espacio en blanco entre la E y la M es porque falta el número 5 y el espacio en blanco entre la A y la L es porque falta ahí el número 55. Tome como condición que no la palabra a decodificar no tendrá más de 15 caracteres y que se debe tomar como inicio de la serie el termino T2 del mismo, es decir sin considerar el primer 1 de la serie.

Se le solicita desarrollar un programa en C/C++, lea un número “n” el cual representará la cantidad de números de Fibonacci que ingresará y la cantidad de caracteres que tendrá la palabra. Luego lea los “n” números de Fibonacci que ingresará el usuario y lea la palabra codificada. Por último, el programa debe imprimir la palabra decodificada bajo el algoritmo descrito.

El formato de entrada de datos e impresión será:

**Entrada**
```
11
13 2 89 377 8 3 233 34 144 21 1
OHLAMESAINT
```

**Salida**
```
La palabra decodificada es: THE MONA LISA
```

NOTA: No se permite el uso de funciones de librerías externas, solo se permiten funciones creadas por Ud.

---

2. Existen diferentes tipos de palabras y alguna de ellas son las siguientes:

Una palabra es catalogada “palíndroma” cuando tiene más de una letra y leída de izquierda a derecha y de derecha a izquierda son iguales, por ejemplo: reconocer

Una palabra es catalogada como “i-palíndroma” cuando quitando el primer carácter de la palabra esta se convierte en palíndroma, por ejemplo: casa, si quitamos la c quedaría “asa”, siendo esta palíndroma.

Una palabra es catalogada como “d-palíndroma” cuando quitando el último carácter de la palabra esta se convierte en palíndroma, por ejemplo: amad, si quitamos la d quedaría ama, siendo esta palíndroma.

Una palabra es catalogada “distinguida” a aquellas palabras que son
palíndromas, i-palíndromas o d- palíndromas.

Se le solicita desarrollar un programa en C, que dada una palabra que se lee por teclado, deberá imprimir si la palabra es “distinguida” o no. En caso sea “distinguida” deberá indicar porque es “distinguida” (palíndroma, i-palíndroma o d-palíndroma, o si es más de una de las anteriores).

El formato de entrada de datos e impresión será:

```
Ingrese la palabra a evaluar: osos
La palabra ES “distinguida” porque es:
i-palíndroma
d-palíndroma
```

Otro ejemplo

```
Ingrese la palabra a evaluar: avion
La palabra NO ES “distinguida”.
```

---

3. Se está desarrollando una notación posicional original para representar números enteros. Se le ha llamado “La notación curiosa” (LNC), el cual usa los mismos dígitos tal como la notación decimal. Por ejemplo, del 0 al 9.

Para convertir un número A de LNC a la notación decimal usted debe sumar k términos, donde k es el número de dígitos de A (en la notación LNC). El valor del i-ésimo término, que corresponde al i-ésimo dígito contando de derecha a izquierda, es x i!. Por ejemplo 719LNC es equivalente a 5310, a partir de 7 x 3! + 1 x 2! + 9 x 1! = 53.

Realice un programa en C que reciba una cadena de caracteres de máximo 5 dígitos, que represente un número en la notación LNC, la cadena no debe tener ceros a la izquierda. Tenga en cuenta todas las validaciones necesarias.

El formato de entrada de datos e impresión será:

```
Ingrese la cadena con el número en notación LNC: 719
Número en notación decimal: 53
```

---

4. Imagina que estás desarrollando una aplicación para gestionar una libreta de contactos. Quieres utilizar una estructura de datos adecuada para almacenar la información de los contactos, como nombres, números de teléfono y direcciones de correo electrónico.

Por este motivo, se le pide implementar la funcionalidad de la libreta de contactos mediante un programa en C++, utilizando una lista enlazada. Se le pide definir estructuras que modelen la Lista de contactos (lista enlazada) y el contacto (nodo).

Cada contacto contendrá los siguientes datos: 
 - Nombre del contacto: String
 - Edad: Int
 - Número de teléfono: String
 - Dirección de correo electrónico: String
 - Sexo: enum con 2 casos (Masculino, Femenino)

1. Implementa la clase LibretaContactos y una clase Contacto que tenga atributos para almacenar el nombre, la edad, el número de teléfono, el correo electrónico y el sexo de un contacto. Además, incluye un atributo siguiente que apunte al siguiente nodo en la lista.
2. Implementa un método que agrega un nuevo contacto al final de la lista de contactos. Este deberá recibir como parámetro el nombre (String), la edad (Int), el teléfono (String) y el email (String)
3. Implementa un método que muestre los datos de todos los contactos ingresados.
4. Implementa un método que busque un contacto por nombre. Este, deberá devolver el primer contacto de la lista que haga match con el nombre ingresado.
5. Implementa un método que reciba un nombre y elimine todos los contactos que hagan match con el nombre ingresado.
6. Implementa un método que reciba como entrada un Contacto, un nombre (String), una edad (Int), un teléfono (String) y un email (String), y edite los datos del contacto ingresado por los nuevos.
7. Implementar un método que reciba un sexo y muestre todos los contactos de que sean del sexo ingresado. 