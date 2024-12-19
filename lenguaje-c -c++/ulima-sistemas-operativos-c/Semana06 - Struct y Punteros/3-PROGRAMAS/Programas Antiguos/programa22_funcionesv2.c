/*
   Programa 22: Crear una programa que permita sumar dos n�meros enteros
                Usando funciones
*/
#include <stdio.h>
#include <stdlib.h>

int suma(int x, int y)
{
   int resultado ;
   resultado = x + y ;
   return(resultado) ;
}

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

   resultado = suma(a,b) ;

   // Mostrar resultado

   printf("* Resultado: %d", resultado) ;
}
