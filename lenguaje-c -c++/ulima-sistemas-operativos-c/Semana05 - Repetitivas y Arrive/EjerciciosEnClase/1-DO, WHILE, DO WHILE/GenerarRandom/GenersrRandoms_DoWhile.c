/*
Desarrollar un programa que muestre 10 calificaciones entre 5 y 20 generadas aleatoriamente
*/

#include <stdio.h>
//#include <time.h>
//#include <stdlib.h>

int main()
{
    int nota;
    int i=0;

    srand(time(0)); //permite generar nuevos random

    do
    {
        nota = 5 + rand() % 16; //numero menor 16 + 5
        printf("Nota %i: %i\n",i+1,nota);
        i++;
    }
    while(i<10);
}