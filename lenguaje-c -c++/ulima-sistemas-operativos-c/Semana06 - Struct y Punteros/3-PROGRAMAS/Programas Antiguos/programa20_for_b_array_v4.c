/*
    Ejercicio: Se tienen dos escalas salariales, en las que el empleado
               categoria c1 gana hasta S/.5000.00 y el empleado categoria
               c2 gana hasta S/.8000. Los empleados C1 reciben una
               bonificacion del 15% y los empleados C2 una bonificacion
               del 10%. Aquellos que exceden la categoria C2 reciben
               bonificacion de 5%. Dado un salario, indicar las ganancias
               totales de 5 empleados.

    Ejercicio 01: Almacenar en memoria los salarios

    Ejercicio 02: Almacenar en memoria ganancias y bonificaciones

    Ejercicio 03: Desarrollar cálculo y reporte en bucles separados

    Ejercicio 04: Considerar una constante para lectura y procesamiento de datos
*/

#include <stdio.h>
#include <stdlib.h>

#define N 10

int main ( )
{
    // Limpiar pantalla

       system("clear") ;

    // Declaracion de variables

        float salario[N] ;
        float bonificacion[N] ;
        float ganancias[N] ;

    // Ingreso de salario y calculo de bonificacion/ganancias

    for(int i=0;i<=N-1;i++)  // 0 a 4 ---> 5
    {
       // Ingresar salario

       printf("* Digite salario %d: ",i) ; scanf("%f", &salario[i]) ;

    }

    // Calculo de resultados

    for(int i=0;i<=N-1;i++)
    {
       // Obtener bonificacion

       if(salario[i]<=5000) { bonificacion[i] = 0.15*salario[i] ; }
       else if (salario[i]<=8000) { bonificacion[i] = 0.10*salario[i] ; }
       else { bonificacion[i] = 0.05*salario[i] ; }

       // Obtener ganancias totales

       ganancias[i] = salario[i] + bonificacion[i] ;
    }

    // Reporte de resultados

    char tsalario[] = "SALARIO" ;
    char tganancias[] = "GANANCIAS" ;
    char tbonificacion[] = "BONIFICACION" ;

    printf("\n%15s %15s %15s\n\n", tsalario, tbonificacion, tganancias) ;

    for(int i=0;i<=N-1;i++)
    {
       printf("%15.2f %15.2f %15.2f\n", salario[i], bonificacion[i], ganancias[i]) ;
    }

	return (0) ;
}

