#include <iostream>
int restar(int n1, int n2)
{
    int* resultado = new int;   // Aigne espacio en el heap

    *resultado = n1 - n2;   // va a almacenar n1 - n2
    
    int temp = *resultado;

    delete resultado;       // Libere espacio
    
    return temp;
}

int main()
{
    // int* p;
    int* p = nullptr;   // inicializar el puntero con un valor por defecto
    int num = 10;

    p = &num;

    std::cout << p << '\n';
    std::cout << *p << '\n';

    // Probar punteros dentro de una funcion
    int resp = restar(10,5);
    std::cout << resp << '\n';


    return 0;
}