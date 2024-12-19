/******************************************************************************
 Desarrollar un programa en C que permita leer los datos de dos puntos que pertenecen
 a una recta, y mediante una función calcular la pendiente. Hacer uso de struct.
*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>

typedef struct punto
{
    float x;
    float y;
}punto;

float leer_float(char *mensaje)
{
    float x;
    printf("%s", mensaje);
    scanf("%f", &x);
    return(x);
}

float pendiente(punto p1, punto p2)
{
    return ((p2.y-p1.y)/(p2.x-p1.x));
}

int main()
{

    punto p1, p2;

    p1.x = leer_float("Digite p1.x: ");
    p1.y = leer_float("Digite p1.y: ");
    p2.x = leer_float("Digite p2.x: ");
    p2.y = leer_float("Digite p2.y: ");

    printf("La pendiente de la recta es %.3f\n",pendiente(p1,p2));


    return 0;
}
