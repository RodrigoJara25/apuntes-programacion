/*
    Programa 19: Mostrar todos los numeros pares entre el 1
                 y un numero entero positivo mayor a 1
                 ingresado por teclado
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
   // Declaracion de variables

      int a ;

   // Ingresar numero entero

      system("clear") ;
      printf("* Digite a: ") ; scanf("%d", &a) ;

   // Mostrar numeros pares

      int i = 1 ;

      while(i<=a)
      {
         if(i%2==0)
         {
            printf("* El numero %d es par\n", i) ;
         }
         i = i + 1 ;
      }

   return(0) ;
}
