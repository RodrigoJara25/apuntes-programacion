/*
Crea una función que permita obtener el mayor y el menor de 4 números enteros.
*/

#include <stdio.h>

#include "libreria.h"
int main()
{
    int a,b,c,d;

    printf("Ingrese el primer numero: ");
    scanf("%d",&a);

    printf("Ingrese el segundo numero: ");
    scanf("%d",&b);

    printf("Ingrese el tercer numero: ");
    scanf("%d",&c);

    printf("Ingrese el cuarto numero: ");
    scanf("%d",&d);

    printf("El mayor es %d \n", mayor(mayor(a,b),mayor(c,d)));
    printf("El menor es %d", menor(menor(a,b),menor(c,d)));




}
