#include <iostream>
#include "operaciones.h"

int main()
{
    int suma = sumar(10,10);
    int resta = restar(10,3);
    std::cout << "Suma:" << suma << '\n';
    std::cout << "Resta:" << resta << '\n';
    return 0;
}
