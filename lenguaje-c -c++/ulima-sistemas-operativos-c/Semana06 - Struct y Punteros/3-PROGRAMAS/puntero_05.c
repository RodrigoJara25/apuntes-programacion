#include <stdio.h>
#include <stdlib.h>
//#include <conio.h>

int main(void)
{
   int a, b, c;
   int *p1, *p2, *p3; // Declaracion de los punteros

   printf("Ingrese el valor de a:\n")  ; scanf("%d", &a) ;
   printf("Ingresar el valor de b:\n") ; scanf("%d", &b) ;

   c = a + b ;

   printf("a + b = %d\n", c) ;

   /* Asignamos las direcciones a los punteros correspondientes */

   p1 = &a ;
   p2 = &b ;
   printf("*p1 + *p2 = %d\n", *p1 + *p2) ;
   p3 = &c ;
   printf(" * Direccion de a es %p\n", p1) ;
   printf(" * Direccion de b es %p\n", p2) ;
   printf(" * Direccion de c es %p\n", p3) ;
   getch() ;

   return 0 ;
}
