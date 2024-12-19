/*
   Programa 17:  Determinar si el numero entero positivo 
                 ingresado por teclado es par o impar
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
   // Limpiar pantalla
   system("clear") ;
   
   // Declaracion de variables
   int a ;
   int resultado ;

   // Ingresar el valor de a
   printf("* Digite a: ") ;
   scanf("%d", &a) ;

   // Resultado de division entera
   resultado = a % 2 ;

   // Mostrar resultado
   printf("\n") ;
   printf("* Resultado: %d\n", resultado) ;
   if(resultado==1)
   {
      printf("* El numero %d es impar\n", a) ;
   }
   else
   {
      printf("* El numero %d es par\n", a) ;
   }
   printf("\n") ;

   return (0) ;
}
