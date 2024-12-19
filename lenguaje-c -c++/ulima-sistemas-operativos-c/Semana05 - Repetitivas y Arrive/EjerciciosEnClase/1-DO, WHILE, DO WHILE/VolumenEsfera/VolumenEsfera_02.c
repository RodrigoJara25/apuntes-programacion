/* 
Calcular el volumen de la esfera con variable de precisión simple y mostrar resultados con 3 decimales
*/
#include <stdio.h>
#define PI 3.1415

int main() 
{
    float radio;
    float volumen;
    printf("Ingrese el radio (R): ");
    scanf("%f",&radio);
    if (radio>0)
    {
        volumen = (4.0/3)*PI*radio*radio*radio;
        printf("El volumen es %.3f",volumen);
    }
    else
    {
        printf("Dato incorrecto");
    }
    return 0;
}