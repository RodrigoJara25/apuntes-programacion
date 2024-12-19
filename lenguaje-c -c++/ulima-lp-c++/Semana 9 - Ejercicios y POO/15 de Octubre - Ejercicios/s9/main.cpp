#include <iostream>
#include "e10.h"

int main()
{
    int n1 = 10;
    int n2 = 20;
    int num = 0;
    // int* p = new int;   Luego tendrías que eliminar manualmente el puntero 
    int* p = &num;
    Pregunta10(n1, n2, p);
    std::cout << num << '\n';
    
    return 0;
}