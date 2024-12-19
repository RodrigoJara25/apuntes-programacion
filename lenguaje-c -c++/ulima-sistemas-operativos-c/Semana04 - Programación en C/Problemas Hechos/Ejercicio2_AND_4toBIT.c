/******************************************************************************
Ejercicio N°02:
Se tiene el número a = 75 y se quiere averiguar si su cuarto bit es 1 o 0. Haga su representación en binario
y luego realice la operación AND con 8 en binario.
*******************************************************************************/
#include <stdio.h>

int main()
{
    char a = 75;
    char b = 8;
    
    if (a&b!=0) //si el cuato bit es diferente a 0
    {
        printf("El cuarto bit es 1\n");
    }
    else
    {
        printf("El cuarto bit es 0\n");
    }
    
    return 0;
}
