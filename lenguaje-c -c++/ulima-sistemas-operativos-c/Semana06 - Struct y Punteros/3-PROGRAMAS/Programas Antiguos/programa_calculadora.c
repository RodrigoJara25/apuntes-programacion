/*

    Ejemplo 01: Crear un programa que permita el ingreso de dos números
                enteros y muestre la suma

    Ejemplo 02: Crear una funcion que permita sumar dos números enteros

    Ejercicio 01: Crear funciones aritméticas (resta, multiplicacion, division)
*/

#include <stdio.h>

int suma(int a, int b)
{
    int c = a + b ;
    return(c) ;
}

int resta(int a, int b)
{
    int c = a - b ;
    return(c) ;
}

int multiplicacion(int a, int b)
{
    int c = a * b ;
    return(c) ;
}

int division(int x, int y)
{
    int z = x / y ;
    return(z) ;
}

int main()
{
    // Variables

    int a ; // Primer numero
    int b ; // Segundo numero

    // Ingreso de datos

    printf("Digite primer número: ") ; scanf("%d", &a) ;
    printf("Digite segundo número: ") ; scanf("%d", &b) ;

    // Imprimir Resultado

    printf("La suma de %d y %d es %d\n", a, b, suma(a,b)) ;
    printf("La resta de %d y %d es %d\n", a, b, resta(a,b)) ;
    printf("La multiplicacion de %d y %d es %d\n", a, b, multiplicacion(a,b)) ;
    printf("La division de %d y %d es %d\n", a, b, division(a,b)) ;
    return 0 ;
}
