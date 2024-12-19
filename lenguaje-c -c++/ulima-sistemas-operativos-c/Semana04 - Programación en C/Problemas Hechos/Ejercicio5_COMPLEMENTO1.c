/******************************************************************************
Ejercicio N°02:
Para las variables a = 23 y b = 90, haga su representación en binario y realice la operación complemento a 1
a la Base, luego escriba el programa en C, compile, ejecute y compare los resultados.
*******************************************************************************/

#include <stdio.h>

int main() {
    int a = 23;
    int b = 90;

    printf("Representación en binario y complemento a 1:\n");
    printf("a = %d, en binario: %08b, complemento a 1: %08b\n", a, a, ~a & 0xFF);
    printf("b = %d, en binario: %08b, complemento a 1: %08b\n", b, b, ~b & 0xFF);

    return 0;
}