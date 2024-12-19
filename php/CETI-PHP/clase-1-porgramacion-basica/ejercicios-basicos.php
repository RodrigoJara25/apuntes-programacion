<?php
    // Determinar si un número es par o impar
    $numero = 3;
    if ($numero % 2 == 0) {
        print "El numero $numero es par";
    } else {
        print "El numero $numero es impar <br>";
    }


    // Calcular el factorial de un numero
    $numero2 = 2;
    $factorial = 1;
    for ($i=1; $i <= $factorial; $i++) { 
        $factorial = $factorial * $i;
    }
    print "El factorial de $numero2 es $factorial <br>";


    // Imprimir los primeros 10 números de la serie Fibonacci
    function Fibonacci($n){
        if ($n == 0) {
            return 0;
        }
        else if ($n == 1) {
            return 1;
        }
        else{
            return Fibonacci($n-1) + Fibonacci($n-2);
        }
    }

    $n = 10;
    $resultado = 0;
    for ($i=0; $i < $n; $i++) { 
        $resultado = Fibonacci($i);
        print "$resultado, ";
    }


    // Convertir grados Celsius a Fahrenheit
    $celsius = 25;
    $fahrenheit = $celsius * (9/5) + 32;
    print "<br> $celsius grados celsius equivale a $fahrenheit grados fahrenheit <br>";


    // Verificar si una cadena es un palíndromo
    function esPalindromo($cadena){
        // Verificar si la cadena limpia es igual a su reverso
        return $cadena === strrev($cadena);
    }
    $cadena = "ALA";
    if (esPalindromo($cadena)) {
        print "La cadena $cadena es un palindromo";
    } else {
        print "La cadena $cadena no es un palindromo";
    }


    // Contar las vocales en una cadena
    $cadena = "Sergio";
    $vocales = ["a", "e", "i", "o", "u"];
    $contador = 0;
    for ($i=0; $i < strlen($cadena); $i++) { 
        if (in_array($cadena[$i], $vocales)) {
            $contador++;
        }
    }
    print "<br>La cantidad de vocales que hay en la palabra {$cadena} son $contador<br>";


    // Verificar si un número es primo
    function esPrimo($numero) {
        if ($numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
    
        // Verificar divisores desde 2 hasta la raíz cuadrada del número
        for ($i = 2; $i <= sqrt($numero); $i++) {
            if ($numero % $i == 0) {
                return false; // Si es divisible por algún número, no es primo
            }
        }
        return true; // Si no tiene divisores, es primo
    }
    
    // Ejemplo de uso
    $numero = 5;
    if (esPrimo($numero)) {
        echo "$numero es un número primo.";
    } else {
        echo "$numero no es un número primo.";
    }


    // Calcular la media de un array de números:
    $array = [1, 2, 3, 4, 5];
    $longitud = count($array);
    $suma = 0;
    for ($i=0; $i < $longitud; $i++) { 
        $suma = $suma + $array[$i];
    }
    $media = $suma / $longitud;
    print "<br>La media es $media";




?>