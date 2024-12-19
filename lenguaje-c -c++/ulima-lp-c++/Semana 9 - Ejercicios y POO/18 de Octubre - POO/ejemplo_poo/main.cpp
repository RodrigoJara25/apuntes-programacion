#include <iostream>
#include "entidades.h"

void Test()
{
    Perro perro1 ("Chino");

    Persona arturo("Arturo", 27, perro1); // instancia arturo esta en stack
    Persona* julian = new Persona("Julian", 20, perro1); // instancia pepito en heap
    Persona pepito;
    // Cuando esta en stack
    /*
    arturo.nombre = "Arturo";
    arturo.edad = 27;
    */

    // Cuando esta en heap (es puntero)
    /*
    julian->nombre = "Julian";
    julian->edad = 20;
    */

    arturo.ImprimirDatos();
    julian->ImprimirDatos();
    pepito.ImprimirDatos();

    arturo.Saludar();

    std::cout << "cantidad de personas creadas: " << arturo.GetCantidadCreadas() << '\n';

    delete julian;
}

int main()
{
    Test();
    return 0;
}