// 6. Lee un número del usuario e imprime "Par" si es divisible por 2, "Impar" si no lo es.

#include <iostream>

int main()
{
    int num;
    std::cout << "Ingresa un numero: " << '\n';
    std::cin >> num;
    if (num % 2 == 0)
    {
        std::cout << "PAR";
    }
    else{
        std::cout << "IMPAR";
    }

    return 0;
}