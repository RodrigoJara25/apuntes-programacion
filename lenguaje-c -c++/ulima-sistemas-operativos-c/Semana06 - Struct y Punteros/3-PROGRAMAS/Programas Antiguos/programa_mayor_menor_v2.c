/*

    Ejercicio 01: Crear un programa que permita indicar el mayor y el menor de
                  dos numeros enteros, utilizando funciones

*/

#include <stdio.h>

int mayor(int x, int y)
{
    if(x>y) { return(x) ; }
     else { return(y) ; }
}

int menor(int x, int y)
{
    if(x<y) { return(x) ; }
     else { return(y) ; }
}

int main()
{
    // Variables

    int a ; // Primer numero
    int b ; // Segundo numero
    int c ; // Tercer numero

    // Ingreso de datos

    printf("Digite primer número: ") ; scanf("%d", &a) ;
    printf("Digite segundo número: ") ; scanf("%d", &b) ;
    printf("Digite tercer número: ") ; scanf("%d", &c) ;

    // Imprimir Resultado

    printf("El mayor entre %d, %d y %d es %d\n", a, b, c, mayor(mayor(a,b),c)) ;
    printf("El menor entre %d, %d y %d es %d\n", a, b, c, menor(menor(a,b),c)) ;
    return 0 ;
}
