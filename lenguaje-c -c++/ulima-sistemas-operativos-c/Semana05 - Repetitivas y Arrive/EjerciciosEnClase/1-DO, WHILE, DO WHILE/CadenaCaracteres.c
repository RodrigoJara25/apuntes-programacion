/*
Desarrollar un programa que muestre 10 juegos (se repita 10 veces) de 3 prácticas calificadas entre 8 y 20, junto con la nota promedio.
Las notas deben estar ordenadas por columnas.
*/

#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main()
{
    int pc1, pc2, pc3;
    float promedio;

    char t01[] = "PC1";
    char t02[] = "PC2";
    char t03[] = "PC3";
    char t04[] = "Promedio";

    printf("%6s, %6s, %6s, %6s\n",t01,t02,t03,t04);

    int i=0;

    srand(time(0));

    for(int i = 0; i < 10; i++)
    {
        pc1 = 8 + rand() % 13;
        pc2 = 8 + rand() % 13;
        pc3 = 8 + rand() % 13;

        promedio = (pc1+pc2+pc3)/3.0; //3.0 para el promedio en decimales

        printf("%6i, %6i, %6i, %6.2f\n", //"6" es el número de espacios
                pc1, pc2, pc3, promedio);
    }
}
