/*

    Ejercicio 01: Crear un programa que permita indicar el mayor y el menor de
                  dos numeros enteros, utilizando funciones

*/

#include <stdio.h>

int mayor(int x, int y)
{
    int c ;

    if(x>y) { c = x ; }
     else { c = y ; }

    return(c) ;
}

int menor(int x, int y)
{
    if(x<y) { return(x) ; }
     else { return(y) ; }
}

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
    printf("El mayor entre %d y %d es %d\n", a, b, mayor(a,b)) ;
    printf("El menor entre %d y %d es %d\n", a, b, menor(a,b)) ;
    return 0 ;
}
