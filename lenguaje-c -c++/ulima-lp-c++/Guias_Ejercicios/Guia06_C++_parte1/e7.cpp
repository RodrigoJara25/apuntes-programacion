// 7. Lee un número del usuario y utiliza un switch para imprimir el día de la semana correspondiente.

#include <iostream>


int main()
{
    int num;
    std::cout << "Ingresa un numero: " << '\n';
    std:: cin >> num;

    switch (num)
    {
    case 1:
        std::cout << "Lunes" << '\n';
        break;
    case 2:
        std::cout << "Martes" << '\n';
        break;
    case 3:
        std::cout << "Miercoles" << '\n';
        break;
    case 4:
        std::cout << "Jueves" << '\n';
        break;
    case 5:
        std::cout << "Viernes" << '\n';
        break;
    case 6:
        std::cout << "Sabado" << '\n';
        break;
    case 7:
        std::cout << "Domingo" << '\n';
        break;
    
    default:
        break;
    }

    return 0;
}