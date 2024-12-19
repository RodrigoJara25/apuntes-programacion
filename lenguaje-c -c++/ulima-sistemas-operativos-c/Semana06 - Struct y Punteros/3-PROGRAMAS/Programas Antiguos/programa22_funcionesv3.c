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

   // Ingreso de dos n�meros

   system("clear") ;
   printf("* Digitar a: ") ; scanf("%d", &a) ;
   printf("* Digitar b: ") ; scanf("%d", &b) ;
   printf("\n") ;

   // Mostrar resultado

   printf("* Resultado: %d\n", suma(a,b)) ;
}
