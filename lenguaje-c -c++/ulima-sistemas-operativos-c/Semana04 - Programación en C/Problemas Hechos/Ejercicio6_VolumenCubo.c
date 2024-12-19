/******************************************************************************
Problema N°01:
Desarrollar el algoritmo y su posterior código en C que permita calcular el volumen de un cubo
*******************************************************************************/

#include <stdio.h>

int main() {
    float a;
    float volumen;
    
    printf("Ingrese la longitud del lado: ");
    scanf("%f",&a);
    
    volumen = a*a*a;
    
    printf("El volumen es %.2f",volumen);
    
    return 0;
}