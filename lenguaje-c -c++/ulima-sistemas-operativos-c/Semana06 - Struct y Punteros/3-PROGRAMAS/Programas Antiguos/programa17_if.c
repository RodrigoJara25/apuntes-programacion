/*
   Programa 17:  Determinar si el número entero positivo 
                 ingresado por teclado es par o impar
*/

#include <stdio.h>

int main()
{
   // Declaracin de variables
   int a ;
   int resultado ;

   // Ingresar el valor de a
   printf("* Digite a: ") ;
   scanf("%d", &a) ;

   // Resultado de division entera
   resultado = a % 2 ;

   // Mostrar resultado
   printf("Resultado: %d\n", resultado) ;
   if(resultado==1)
   {
      printf("El numero %d es impar\n", a) ;
   }
   else
   {
      printf("El numero %d es par\n", a) ;
   }

   return (0) ;
}
