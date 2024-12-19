/*
    Programa 21: Generar una muestra de 15 salarios entre 4000 y 5000
                 soles. Calcular salario minimo, salario maximo, salario promedio
                 Usar una constante para la cantidad de muestras
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX 15

int main()
{
   int salario[MAX] ;
   int salario_minimo = 5000 ;
   int salario_maximo = 4000 ;
   int suma ;
   float salario_promedio ;

   // Limpiar pantalla
   system("clear") ;

   // Generar semilla de número aleatorio
   srand(time(0)) ;

   // Generar muestra
   suma = 0 ;

   // Generar muestra
   for(int i=0;i<MAX;i++)   salario[i] = 4000 + rand() % 1001 ;

   // Procesar muestra de salarios
   for(int i=0;i<MAX;i++)
   {
      if (salario[i]<salario_minimo)  salario_minimo = salario[i] ;
      if (salario[i]>salario_maximo)  salario_maximo = salario[i] ;
      suma += salario[i] ;
   }

   salario_promedio = (float)suma / MAX ;

   // Publicacion de resultados

   for(int j=0;j<MAX;j++)  printf("Salario %3d: %3d\n", (j+1), salario[j]) ;

   printf("\n* Resultados:\n\n") ;
   printf("* Salario minimo   : %10d\n", salario_minimo) ;
   printf("* Salario maximo   : %10d\n", salario_maximo) ;
   printf("* Suma salarios    : %10d\n", suma) ;
   printf("* Promedio salarios: %10.2f\n", salario_promedio) ;

   return (0) ;
}
