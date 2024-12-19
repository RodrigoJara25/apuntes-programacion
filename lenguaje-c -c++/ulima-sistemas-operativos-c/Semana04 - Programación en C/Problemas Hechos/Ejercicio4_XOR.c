/******************************************************************************
Ejercicio N°01:
Para las variables a = 23 y b = 90, haga su representación en binario y realice la operación XOR, luego escriba
el programa en C, compile, ejecute y compare los resultados
*******************************************************************************/
#include <stdio.h>

int main()
{
    char a = 23;
    char b = 90;
    
    char resultado;
    
    printf("a=%d\nb=%d\n",a,b);
    
    resultado = a ^ b;
    
    printf("El resultado del OR es: %d",resultado);
    
    return 0;
}
