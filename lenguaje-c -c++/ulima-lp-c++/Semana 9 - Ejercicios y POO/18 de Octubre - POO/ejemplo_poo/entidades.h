#include <iostream>

class Perro
{
public:

    std::string nombre;

    Perro();
    Perro(std::string nombre);

    void Saludar();
};

class Persona
{

    static int cantidad_creadas;    // Propiedad de clase

// zona privada
    float estatura;

// zona publica
public:    
    // Propiedades
    std::string nombre;
    int edad;
    Perro mascota;

    // Constructor vacío
    Persona();

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
    Persona(std::string nombre, int edad, Perro mascota);

    // Destructor : el destructor no se llama. Siempre que el sistema quiera eliminar un espacio de memoria, se llama solo.
    ~Persona();

    // Metodos
    void ImprimirDatos();
    /*void ImprimirDatos()
    {
        std::cout << "<Persona nombre = " << this->nombre << 
                    " edad = " << this->edad << "/>" << '\n';
    }*/
    void Saludar();
    int GetCantidadCreadas();
};

