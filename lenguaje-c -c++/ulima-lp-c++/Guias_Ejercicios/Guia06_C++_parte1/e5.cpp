// Imprime los números impares del 10 al 1 utilizando un bucle "do while".

#include <iostream>

int main()
{
    int i = 10;
    do
    {
        if (i % 2 != 0)
        {
            std::cout << i << '\n';
        }
        i--;
        
    } while(i >= 1);
    return 0;
}