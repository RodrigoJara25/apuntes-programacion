/*
    Programa 17: Determinar si el numero
                 ingresado por teclado
                 es par o impar
*/

#include <stdio.h>

int main ( )
{
    // Declaracion de variables
	int a, b = 1 ; // Variable inicializada
	int resultado ;

    // Ingresar el valor de a
	printf("Digite a: ") ; scanf("%d", &a) ;

    // Obtener resultado
	resultado = a & b ;

    // Mostrar resultados
	printf("* Resultado: %d\n", resultado) ;
	if(resultado==1)
	{
	    printf("* El numero %d es impar", a) ;
	}
	else
	{
	    printf("* El numero %d es par", a) ;
	}
	printf("\n") ;

	return (0) ;
}

