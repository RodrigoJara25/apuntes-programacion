#include "entidades.h"

// ======================= Perro ===============================
Perro::Perro() : nombre("")
{
    std::cout << "Constructor vacío" << '\n';
}

Perro::Perro(std::string nombre)
    : nombre(nombre)
{}

void Perro::Saludar()
{
    std::cout << "guau guau" << '\n';
}



// ======================= Persona ===============================

// Asignando un valor por defecto a la propiedad de clase
int Persona::cantidad_creadas = 0;

// Constructor vacío
Persona::Persona() : nombre(""), edad(0), estatura(0.0f), mascota("")
{
    std::cout << "Constructor vacío" << '\n';
    Persona::cantidad_creadas++;
}

/*Persona()
{
    std::cout << "Constructor vacío" << '\n';
}*/

//  Constructor secundaria
/*Persona(std::string nombre, int edad)
{
    this->nombre = nombre;
    this->edad = edad;
}*/

Persona::Persona(std::string nombre, int edad, Perro mascota)
    : nombre(nombre), edad(edad), mascota(mascota)
{
    Persona::cantidad_creadas++;
}

// Destructor : el destructor no se llama. Siempre que el sistema quiera eliminar un espacio de memoria, se llama solo.
Persona::~Persona()
{
    std::cout << "Se elimina instancia de persona: "
            << nombre << '\n';
}

// Metodos
void Persona::ImprimirDatos()
{
    std::cout << "<Persona nombre = " << nombre << 
                " edad = " << edad << " Mascota = " << mascota.nombre << "/>" << '\n';
}
/*void ImprimirDatos()
{
    std::cout << "<Persona nombre = " << this->nombre << 
                " edad = " << this->edad << "/>" << '\n';
}*/

void Persona::Saludar()
{
    mascota.Saludar();
}

int Persona::GetCantidadCreadas()
{
    return Persona::cantidad_creadas;
}