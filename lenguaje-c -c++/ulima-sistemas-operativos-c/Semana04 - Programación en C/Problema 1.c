/*Desarrollar un programa que permita ingresar 4 notas. Calcule la nota máxima, mínima y promedio. Utilizar for.*/

#include <stdio.h>
#include <stdlib.h>
#define MAX 4

int main()
{
    int nota;
    int nota_min=0;
    int nota_max=0;
    float nota_prom=0;
    int suma;

    for (int i=0;i<MAX;i++)
    {
        puts("Ingrese una nota: "); scanf("%d",&nota);

        if(nota_max>nota) nota_max=nota;
        if(nota_min<nota) nota_min=nota;

        suma = suma + nota;
    }
    nota_prom=suma/MAX;
    printf("La nota promedio es %f",nota_prom);

    return 0;
}
