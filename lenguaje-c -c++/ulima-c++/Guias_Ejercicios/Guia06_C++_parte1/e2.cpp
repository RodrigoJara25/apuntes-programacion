// 2. Solicitar un caracter y determinar si es mayúscula o minúscula: 
// a) usando isupper, islower, 
// b) sin usar dichas funciones

#include <iostream>

int main()
{
    char c;
    std::cout << "Ingresar un caracter: " << '\n';
    std::cin >> c;

    if (isupper(c))
    {
        std::cout << "Es mayuscula";
    }
    else
    {
        std::cout << "Es minuscula";
    }

    std::cout << '\n';

    if (c>='A' && c<='Z')
    {
        std::cout << "Es mayuscula";
    }
    else
    {
        std::cout << "Es minuscula";
    }
    
}