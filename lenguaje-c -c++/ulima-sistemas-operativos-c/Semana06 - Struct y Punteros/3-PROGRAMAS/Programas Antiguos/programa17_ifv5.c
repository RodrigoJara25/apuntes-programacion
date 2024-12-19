/*
    Ejercicio: Se tienen dos escalas salariales, en las que el empleado
               categoria c1 gana hasta S/.5000.00 y el empleado categoria
               c2 gana hasta S/.8000. Los empleados C1 reciben una
               bonificacion del 15% y los empleados C2 una bonificacion
               del 10%. Aquellos que exceden la categoria C2 reciben
               bonificacion de 5%. Dado un salario, indicar las ganancias
               totales.

    Ejercicio 02: Ahora C1 gana hasta 6500 con 20% de bonificacion
                        C2 gana hasta 9500 con 15% de bonificacion
                        Para salarios superiores, 10% de bonificacion
*/

#include <stdio.h>
#include <stdlib.h>

int main ( )
{
    // Limpiar pantalla

       system("clear") ;

    // Declaracion de variables

        float salario ;
        float bonificacion ;
        float ganancias ;

    // Ingresar salario
	printf("* Digite salario: ") ; scanf("%f", &salario) ;

    // Obtener bonificacion

	if(salario<=6500)
	{
	    bonificacion = 0.20*salario ;
	}
	else if (salario<=9500)
	{
	    bonificacion = 0.15*salario ;
	}
	else
        {
            bonificacion = 0.10*salario ;
        }

    // Obtener ganancias

	ganancias = salario + bonificacion ;

    // Mostrar resultados

	printf("* Bonificacion: %.2f\n", bonificacion) ;
	printf("* Ganancias: %.2f\n", ganancias) ;

	return (0) ;
}

