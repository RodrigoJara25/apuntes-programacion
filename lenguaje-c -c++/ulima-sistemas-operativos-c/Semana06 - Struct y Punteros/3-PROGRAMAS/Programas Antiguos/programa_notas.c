/*
    Ejercicio: Desarrollar un programa que genere 3 notas de PC entre
               01 y 20 para una muestra de 20 alumnos, mostrando el
               promedio de PC1, PC2 y PC3. Usar estructuras.

    Ejercicio: Incorporar los resultados de maximo y minimo por cada
               practica calificada
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 20

struct notas
{
  int pc1, pc2, pc3 ;
  float promedio ;
} ;

int main()
{
    // Limpiar pantalla

       system("clear") ;

    // Declaracion de variables

       struct notas alumno[N] ;

       float prom_pc1 = 0.0 ;
       float max_pc1 = 1 ;
       float min_pc1 = 20 ;

       float prom_pc2 = 0.0 ;
       float max_pc2 = 1 ;
       float min_pc2 = 20 ;

       float prom_pc3 = 0.0 ;
       float max_pc3 = 1 ;
       float min_pc3 = 20 ;

    // Generar muestra de notas entre 01 y 20

    srand(time(0)) ;

    for(int i=0;i<=N-1;i++)
    {
        alumno[i].pc1 = 1 + rand() % 20 ;
        alumno[i].pc2 = 1 + rand() % 20 ;
        alumno[i].pc3 = 1 + rand() % 20 ;
        alumno[i].promedio = (alumno[i].pc1 + alumno[i].pc2 + alumno[i].pc3)/3.0 ;
    }

    // Calculo de promedios de practicas

    for(int i=0;i<=N-1;i++)
    {
        prom_pc1 += (float)alumno[i].pc1/N ;
        prom_pc2 += (float)alumno[i].pc2/N ;
        prom_pc3 += (float)alumno[i].pc3/N ;
    }

    // Calculo de maximos y minimos

    for(int i=0;i<=N-1;i++)
    {
        if(alumno[i].pc1>max_pc1)  max_pc1 = alumno[i].pc1 ;
        if(alumno[i].pc1<min_pc1)  min_pc1 = alumno[i].pc1 ;
    }

    // Reporte de resultados

    char tpc1[] = "PC01" ;
    char tpc2[] = "PC02" ;
    char tpc3[] = "PC03" ;
    char tprm[] = "PROMEDIO" ;

    printf("\n%15s %15s %15s %15s\n\n", tpc1, tpc2, tpc3, tprm) ;

    for(int i=0;i<=N-1;i++)
    {
       printf("%15d %15d %15d %15.2f\n", alumno[i].pc1,
                                         alumno[i].pc2,
                                         alumno[i].pc3,
                                         alumno[i].promedio) ;
    }

    printf("\n") ;
    printf("* Promedio PC01:   %.2f\n", prom_pc1) ;
    printf("* Promedio PC02:   %.2f\n", prom_pc2) ;
    printf("* Promedio PC03:   %.2f\n", prom_pc3) ;

	return (0) ;
}

