// Imagina que estás desarrollando una aplicación para gestionar una libreta de contactos. Quieres utilizar una estructura de datos adecuada para 
// almacenar la información de los contactos, como nombres, números de teléfono y direcciones de correo electrónico.

// Por este motivo, se le pide implementar la funcionalidad de la libreta de contactos mediante un programa en C++, utilizando una lista enlazada. 
// Se le pide definir estructuras que modelen la Lista de contactos (lista enlazada) y el contacto (nodo).

// Cada contacto contendrá los siguientes datos: 
//  - Nombre del contacto: String
//  - Edad: Int
//  - Número de teléfono: String
//  - Dirección de correo electrónico: String
//  - Sexo: enum con 2 casos (Masculino, Femenino)

// 1. Implementa la clase LibretaContactos y una clase Contacto que tenga atributos para almacenar el nombre, la edad, el número de teléfono, el correo electrónico y el sexo de un contacto. Además, incluye un atributo siguiente que apunte al siguiente nodo en la lista.
// 2. Implementa un método que agrega un nuevo contacto al final de la lista de contactos. Este deberá recibir como parámetro el nombre (String), la edad (Int), el teléfono (String) y el email (String)
// 3. Implementa un método que muestre los datos de todos los contactos ingresados.
// 4. Implementa un método que busque un contacto por nombre. Este, deberá devolver el primer contacto de la lista que haga match con el nombre ingresado.
// 5. Implementa un método que reciba un nombre y elimine todos los contactos que hagan match con el nombre ingresado.
// 6. Implementa un método que reciba como entrada un Contacto, un nombre (String), una edad (Int), un teléfono (String) y un email (String), y edite los datos del contacto ingresado por los nuevos.
// 7. Implementar un método que reciba un sexo y muestre todos los contactos de que sean del sexo ingresado. 

// No vamos a utilizar listas enlazadas, solo vectores para la lista de contactos

#include <iostream>
#include <vector>
#include <algorithm>

namespace ULContactos
{
    enum class Sexo{
        Masculino, 
        Femenino
    };

    class Contacto
    {
    public:
        std::string nombre;
        int edad;
        std::string num_tel;
        std::string correo;
        Sexo sexo;

        // Constructor
        Contacto(std::string nombre, int edad, std::string num_tel, std::string correo, Sexo sexo);
        void editarContacto(Contacto& contacto_nuevo, std::string nombre, int edad, std::string num_tel, std::string correo, Sexo sexo);

    };

    class LibretaContactos
    {
        std::vector<Contacto>* contactos;   // puntero para poder almacenar mayor cantidad de espacio
    public:
        LibretaContactos();
        void AgregarContacto(std::string nombre, int edad, std::string num_tel, std::string correo, Sexo sexo);
        void mostrarContactos();
        Contacto* buscarContacto(std::string nombre);
        void eliminarContactos(std::string nombre);
        void buscarSexo(Sexo sexo);
    };
}
