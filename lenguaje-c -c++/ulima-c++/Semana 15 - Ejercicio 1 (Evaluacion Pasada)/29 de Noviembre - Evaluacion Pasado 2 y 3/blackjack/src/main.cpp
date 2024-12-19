#include <partida.h>
#include <mazo.h>

int main()
{
    Partida partida;

    int opcion = -1;
    while(opcion != 0)
    {
        std::cout << "Menu de opciones" << std::endl;
        std::cout << "1. Agregar jugador" << std::endl;
        std::cout << "2. Eliminar jugador" << std::endl;
        std::cout << "3. Iniciar partida" << std::endl;
        std::cout << "0. Salir" << std::endl;
        std::cin >> opcion;

        switch(opcion)
        {
            case 1:
            {
                std::string nombre;
                std::cout << "Ingrese el nombre del jugador: ";
                std::cin >> nombre;
                partida.AgregarJugador(nombre);
                break;
            }
            case 2:
            {
                std::string nombre;
                std::cout << "Ingrese el nombre del jugador: ";
                std::cin >> nombre;
                partida.EliminarJugador(nombre);
                break;
            }
            case 3:
            {
                partida.Iniciar();
                partida.ImprimirResultados();
                break;
            }
            case 0:
                break;
            default:
                std::cout << "Opcion invalida" << std::endl;
        }
    }
    return 0;
}