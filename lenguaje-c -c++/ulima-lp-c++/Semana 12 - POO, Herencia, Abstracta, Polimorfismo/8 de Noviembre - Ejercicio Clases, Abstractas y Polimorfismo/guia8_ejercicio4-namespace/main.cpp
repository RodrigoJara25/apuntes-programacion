#include "contactos.h"

using namespace ULContactos;

int main()
{
    LibretaContactos libreta1;

    libreta1.AgregarContacto("Rodrigo", 20, "960241702", "r.jara.e7@gmail.com", Sexo::Masculino);
    libreta1.AgregarContacto("Gerson", 30, "960241702", "r.jara.e7@gmail.com", Sexo::Masculino);
    libreta1.AgregarContacto("Rodrigo", 40, "960241702", "r.jara.e7@gmail.com", Sexo::Masculino);
    libreta1.AgregarContacto("Rodrigo", 40, "960241702", "r.jara.e7@gmail.com", Sexo::Masculino);
    libreta1.AgregarContacto("DINA", 40, "960241702", "r.jara.e7@gmail.com", Sexo::Femenino);


    std::cout << "-------------------MOSTRAR CONTACTOS------------------------" << '\n';
    libreta1.mostrarContactos();
    
    std::cout << "-------------------BUSCAR CONTACTOS------------------------" << '\n';
    Contacto* contactoEncontrado = libreta1.buscarContacto("Gerson");
    if(contactoEncontrado == nullptr){
        std::cout << "no se encontro contacto" << '\n';
        return 123;
    }
    std::cout << "Contacto encontrado: " << contactoEncontrado->correo << '\n';

    std::cout << "-------------------ELIMINAR CONTACTOS------------------------" << '\n';
    libreta1.eliminarContactos("Rodrigo");
    libreta1.mostrarContactos();

    std::cout << "-------------------MOSTRAR CONTACTO------------------------" << '\n';
    Contacto contacto1("Dina", 49, "960241702", "r.jara.e7@gmail.com", Sexo::Femenino);
    std::cout << "Nombre: " << contacto1.nombre << '\n';
    std::cout << "-------------------ELIMINAR CONTACTO EDITADO------------------------" << '\n';
    contacto1.editarContacto(contacto1, "Diana", 49, "960241702", "r.jara.e7@gmail.com", Sexo::Femenino);
    std::cout << "Nombre: " << contacto1.nombre << '\n';

    std::cout << "-------------------BUSCAR CONTACTO EN LISTA DE CONTACTOS POR SEXO------------------------" << '\n';
    libreta1.buscarSexo(Sexo::Femenino);

    return 0;
}