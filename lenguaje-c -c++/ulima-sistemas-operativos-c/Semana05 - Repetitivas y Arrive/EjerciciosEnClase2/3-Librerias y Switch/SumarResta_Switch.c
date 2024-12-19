/*
Crea una función que permita obtener el mayor y el menor de 4 números enteros.
*/

#include <stdio.h>

#include "libreria.h"
int main()
{
    float a,b;
    char opcion;

    printf("Ingrese el primer numero: ");
    scanf("%f",&a);

    printf("Ingrese el segundo numero: ");
    scanf("%f",&b);

    printf("\n");

    printf("[1] Suma\n");
    printf("[2] Resta\n");
    printf("[3] Multiplicacion\n");
    printf("[4] Division\n");

    printf("\n");
    printf("Elija una opcion: \n");

    scanf("%s",&opcion);

    switch (opcion)
    {
        case '1': printf("*Resultado: %.2f",suma(a,b));
                  break;
        case '2': printf("*Resultado: %.2f",resta(a,b));
                  break;
        case '3': printf("*Resultado: %.2f",multiplicacion(a,b));
                  break;
        case '4': printf("*Resultado: %.2f",division(a,b));
                  break;
    }






}
