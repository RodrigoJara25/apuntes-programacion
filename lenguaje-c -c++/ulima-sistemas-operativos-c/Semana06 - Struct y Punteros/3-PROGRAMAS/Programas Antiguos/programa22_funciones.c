/*
   Programa 22: Crear una programa que permita sumar dos n�meros enteros
*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
   // Declaracion de variables

   int a, b ;  // N�meros
   int resultado ; // Resultado

   // Ingreso de dos n�meros

   system("clear") ;
   printf("* Digitar a: ") ; scanf("%d", &a) ;
   printf("* Digitar b: ") ; scanf("%d", &b) ;
   printf("\n") ;

   // Resultado

   resultado = a + b ;

   // Mostrar resultado

   printf("* Resultado: %d", resultado) ;
}
