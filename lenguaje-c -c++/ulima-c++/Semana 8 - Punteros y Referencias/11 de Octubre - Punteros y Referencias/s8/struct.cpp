#include <iostream>

struct Alumno
{
    std::string codigo;
    std::string nombre;
    int edad;
};

// Pase por valor
void Imprimir(Alumno a)
{
    std::cout << "Codigo: " << a.codigo << '\n';
    std::cout << "Nombre: " << a.nombre << '\n';
    std::cout << "Edad: " << a.edad << '\n';
}

// Pase por referencia
void ImprimirConReferencia(const Alumno& a)
{
    std::cout << "Codigo: " << a.codigo << '\n';
    std::cout << "Nombre: " << a.nombre << '\n';
    std::cout << "Edad: " << a.edad << '\n';
}

int main()
{
    Alumno a1{"20224280", "Arturo", 22};    // Inicializacion de struct
    Alumno* a2 = new Alumno{"20224280", "Arturo", 22};
    ImprimirConReferencia(a1);
    // ImprimirConReferencia(*a2);

    return 0;
}
