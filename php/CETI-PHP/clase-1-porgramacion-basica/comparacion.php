<?php

    /* Operadores de Comparacion */

    $num1 = 20;
    $num2 = 10;

    // igual (==)
    if ($num1 == $num2) {
        print "<h2>Las variables tienen el mismo valor</h2>";
    }else {
        print "<h2>Las variables no tienen el mismo valor</h2>";
    }

    // diferente (<>)
    if ($num1 <> $num2) {
        print "<h2>Las variables tienen diferentes valores</h2>";
    }else {
        print "<h2>Las variables son iguales</h2>";
    }

    // <
    // >
    // <=
    // >=

    /* Operadores Logicos AND y && (es lo mismo) */
    $usuario = "admin";
    $clave = 1234;

    if ($usuario == "admin" and $clave == 1234) {
        print "Bienvenido al sistema <br>";
    } else{
        print "Datos incorrectos. Intente de nuevo. <br>";
    }


    /* Operador Logico OR */
    $color = "negro";
    if ($color == "rojo" or $color == "azul" or $color == "amarillo") {
        print "El color $color es primario";
    } else {
        print "El color $color no es primario";
    }


?>
