// 4. Imprime los números pares del 1 al 20 utilizando un bucle "while".
#include <iostream>

int main()
{
    int i = 1;
    while (i <= 20)
    {
        if (i % 2 == 0)
        {
            std::cout << i << '\n';
        }
        i++;   
    }
}