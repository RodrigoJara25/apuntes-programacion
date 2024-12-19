/*
   Programa 22: Crear una programa que permita sumar dos numeros enteros
                Usando funciones. Crear una funcion que permita la lectura
                de un numero entero con una leyenda personalizada
*/
#include <stdio.h>
#include <stdlib.h>

int suma(int x, int y)
{
   int resultado ;
   resultado = x + y ;
   return(resultado) ;
}

int leer_entero(char *mensaje)
{
   int x ;
   printf("%s", mensaje) ; scanf("%d", &x) ;
   return(x) ;
}

int main()
{
   // Declaracion de variables

   int a, b ;  // N�meros

   // Ingreso de dos n�meros

   system("clear") ;
   a = leer_entero("* Digitar a: ") ;
   b = leer_entero("* Digitar b: ") ;
   printf("\n") ;

   // Mostrar resultado

   printf("* Resultado: %d\n", suma(a,b)) ;
}
