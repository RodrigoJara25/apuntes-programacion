/*
Modificar el programa, de tal forma que permita mostrar promedios maximo, minimo y la media obtenida para 32 estudiantes
*/

#include <stdio.h>
#include <time.h>
#include <stdlib.h>

#define MAX 32

int main()
{
    int pc1[MAX], pc2[MAX], pc3[MAX];
    float promedio[MAX];

    float maximo = 0.0;
    float minimo = 20.0;
    float media = 0.0;

    char t01[] = "PC1";
    char t02[] = "PC2";
    char t03[] = "PC3";
    char t04[] = "Promedio";

    printf("%6s, %6s, %6s, %6s\n",t01,t02,t03,t04);

    int i=0;

    srand(time(0));

    for(int i = 0; i < MAX; i++)
    {
        pc1[i] = 8 + rand() % 13;
        pc2[i] = 8 + rand() % 13;
        pc3[i] = 8 + rand() % 13;

        promedio[i] = (pc1[i]+pc2[i]+pc3[i])/3.0; //3.0 para el promedio en decimales

        if (promedio[i]>maximo) maximo=promedio[i];
        if (promedio[i]<minimo) minimo=promedio[i];

        media += (promedio[i]/MAX);

        printf("%6i, %6i, %6i, %6.2f\n", //"6" es el número de espacios
                pc1[i], pc2[i], pc3[i], promedio[i]);
    }

    //printf("%i",pc1[2]); //imprimmos la tercera nota de las notas del PC1
    printf("\n");
    printf("Promedio máximo: %.2f\n", maximo);
    printf("Promedio mínimo: %.2f\n", minimo);
    printf("Nota media: %.2f\n", media);

    return 0;
}
