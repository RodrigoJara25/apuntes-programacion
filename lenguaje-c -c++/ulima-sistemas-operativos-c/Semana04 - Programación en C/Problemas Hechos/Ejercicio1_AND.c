/******************************************************************************
Ejercicio N°01:
Para las variables a = 23 y b = 90, haga su representación en binario y luego 
realice la operación AND.
*******************************************************************************/
#include <stdio.h>

int main()
{
    char a = 23;
    char b = 90;
    char resultado;
    
    printf("a=%d\n",a);
    printf("b=%d\n",b);
    resultado = a & b;
    printf("Resultado=%d",resultado);
    
    return 0;
}
