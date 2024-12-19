/*
    Ejercicio: Se tienen dos escalas salariales, en las que el empleado
               categoria c1 gana hasta S/.5000.00 y el empleado categoria
               c2 gana hasta S/.8000. Los empleados C1 reciben una
               bonificacinn del 15% y los empleados C2 una bonificacinn
               del 10%. Aquellos que exceden la categoria C2 reciben
               bonificacion de 5%. Dado un salario, indicar las ganancias
               totales de 5 empleados.
*/

#include <stdio.h>
#include <stdlib.h>

#define MAX 5

int main ( )
{
    // Limpiar pantalla

       system("clear") ;

    // Declaracion de variables

        float salario ;
        float bonificacion ;
        float ganancias ;

    // Ingreso de salario y calculo de bonificacion/ganancias

    for(int i=1;i<=MAX;i++)
    {
       // Ingresar salario

       printf("* Digite salario %d: ", i) ; scanf("%f", &salario) ;

       // Obtener bonificacion

       if(salario<=5000) { bonificacion = 0.15*salario ; }
       else if (salario<=8000) { bonificacion = 0.10*salario ; }
       else { bonificacion = 0.05*salario ; }

       // Obtener ganancias totales

       ganancias = salario + bonificacion ;

       // Mostrar resultados

       printf("* Bonificacion: %.2f\n", bonificacion) ;
       printf("* Ganancias: %.2f\n\n", ganancias) ;
    }

	return (0) ;
}

