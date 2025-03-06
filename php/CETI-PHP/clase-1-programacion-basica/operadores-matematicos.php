<?php
    /* Operador matematico y simbolos:
    suma (+), resta (-), multiplicacion (*)
    division (/), raiz, potencia */

    $cant1 = 10;
    $cant2 = 5;

    $suma = $cant1 + $cant2;
    $resta = $cant1 - $cant2;
    $multi = $cant1 * $cant2;
    $div = $cant1 / $cant2;

    // funcion para calcular la potencia
    $potencia = pow($cant1, $cant2);

    // funcion para calclar la raiz
    $raiz = sqrt(9);

    print "Cantidad 1: " .$cant1;
    print "<br>Cantidad 2: " .$cant2;
    print "<br>La suma de $cant1 + $cant2 es " .$suma;
    print "<br>La resta de $cant1 - $cant2 es " .$resta;
    print "<br>La multiplicacion de $cant1 * $cant2 es " .$multi;
    print "<br>La division de $cant1 / $cant2 es " .$div;
    print "<br>La potencia de $cant1 ** $cant2 es " .$potencia;
    print "<br>La raiz cuadrada de 9 es " .$raiz;





?>