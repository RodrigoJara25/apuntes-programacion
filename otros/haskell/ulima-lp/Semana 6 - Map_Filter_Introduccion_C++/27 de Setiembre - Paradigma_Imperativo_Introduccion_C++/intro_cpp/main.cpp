#include<iostream>

int main()
{
    // std::cout = print
    std::cout << "Lenguajes de Porgramacion 2024" << '\n';

    short numeroPequeno = 34;
    long numeroGrande = 123432234;
    int numero = 20; // declarar y asignar
    float estatura = 10.6f; // se debe poner la "f"
    double peso = 10.3456; // no necesita la f
    bool es_mayor_edad = false;

    char caracter = '$';

    const int numero2 = 40; // variable inmutable

    std::string nombre = "Arturo"; // Asi se define un STRING en C++

    // Printear en terminal la variable "nombre"
    std::cout << nombre << '\n';

    int x = 3;
    x = 2.3 + (x/2);
    std::cout << x << '\n';

    // Un mal cast genera desbordamiento
    int num1 = 2147483647;
    short num2 = (short) num1;
    std::cout << num2 << '\n';

    return 0;
}

