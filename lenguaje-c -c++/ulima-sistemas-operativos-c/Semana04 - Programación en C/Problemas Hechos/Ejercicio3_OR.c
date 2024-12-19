/******************************************************************************
Ejercicio N°03:
Para las variables a = 23 y b = 90, haga su representación en binario y luego 
realice la operación OR.
*******************************************************************************/
#include <stdio.h>

int main()
{
    char a = 23;
    char b = 90;
    
    char resultado;
    
    printf("a=%d\nb=%d\n",a,b);
    
    resultado = a | b;
    
    printf("El resultado del OR es: %d",resultado);
    
    return 0;
}
