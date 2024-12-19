/*
    Ejercicio: Modificar el programa de tal forma que se muestre al final del
               reporte el salario maximo, salario minimo y salario promedio
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 15

struct pago
{
  float salario ;
  float bonificacion ;
  float ganancias ;
} ;

int main()
{
    // Limpiar pantalla

       system("clear") ;

    // Declaracion de variables

       struct pago planilla[N] ;
       float sminimo = 15000 ;
       float smaximo = 4000 ;
       float spromedio = 0 ;

    // Generar muestra de salarios entre 4000 y 15000 soles

    srand(time(0)) ;

    for(int i=0;i<=N-1;i++)
    {
        // salario[i] = 4000 + rand() % 11001 ;
        planilla[i].salario = 4000 + rand() % 11001 ;
        if (planilla[i].salario<sminimo)  sminimo = planilla[i].salario ;
        if (planilla[i].salario>smaximo)  smaximo = planilla[i].salario ;
        spromedio += planilla[i].salario / N ;
    }

    // Calculo de resultados

    for(int i=0;i<=N-1;i++)
    {
       // Obtener bonificacion

       if(planilla[i].salario<=5000)
        {
            planilla[i].bonificacion = 0.15*planilla[i].salario ;
        }
        else if (planilla[i].salario<=8000)
            {
                planilla[i].bonificacion = 0.10*planilla[i].salario ;
            }
            else
                { planilla[i].bonificacion = 0.05*planilla[i].salario ; }

       // Obtener ganancias totales

       planilla[i].ganancias = planilla[i].salario + planilla[i].bonificacion ;
    }

    // Reporte de resultados

    char tsalario[] = "SALARIO" ;
    char tganancias[] = "GANANCIAS" ;
    char tbonificacion[] = "BONIFICACION" ;

    printf("\n%15s %15s %15s\n\n", tsalario, tbonificacion, tganancias) ;

    for(int i=0;i<=N-1;i++)
    {
       printf("%15.2f %15.2f %15.2f\n", planilla[i].salario,
                                        planilla[i].bonificacion,
                                        planilla[i].ganancias) ;
    }

    printf("\n") ;
    printf("* Salario minimo:   %.2f\n", sminimo) ;
    printf("* Salario maximo:   %.2f\n", smaximo) ;
    printf("* Salario promedio: %.2f\n", spromedio) ;

	return (0) ;
}

