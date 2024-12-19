#include "contactos.h"

using namespace ULContactos;

int main()
{
    LibretaContactosXLM libreta;
    libreta.AgregarContacto("Ralf",19,"942646860","ralfito1301@gmail.com",Sexo::Masculino);
    libreta.AgregarContacto("Rodrigo",27,"943224543","rdsadsa@gmail.com",Sexo::Masculino);
    libreta.AgregarContacto("Julia",34,"142255","csadsa@gmai.com",Sexo::Femenino);

    libreta.Imprimir();
    libreta.FiltrarContacto(Sexo::Femenino);


    LibretaContactosJSON libretita;
    libretita.AgregarContacto("Ralf",19,"942646860","ralfito1301@gmail.com",Sexo::Masculino);
    libretita.AgregarContacto("Jelly",124,"94224520","dasdsa@.com",Sexo::Femenino);
    
    libretita.Imprimir();
    
    libretita.FiltrarContacto(Sexo::Femenino);

    Contacto* contactoEncontrado = libretita.BuscarPorNombre("Eloy");
    if (contactoEncontrado==nullptr)
    {
        std::cout << "No se encontro contacto" << '\n';
        return 1;
    }

    std::cout << "Contacto Encontrado: " << contactoEncontrado->correo << '\n';

    Contacto* contacto = libreta.BuscarPorNombre("Ralf");
    if(contacto==nullptr)
    {
        std::cout << "No se encontro contacto" << '\n';
        return 1;
    }


    libreta.ModificarContacto(*contacto,contacto->nombre,22,contacto->telefono,contacto->correo);

    libreta.Imprimir();















    return 0;
}







