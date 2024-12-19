#include "contactos.h"

namespace ULContactos
{
 

void LibretaContactos::AgregarContacto(
    std::string nombre,int edad,std::string telefono,std::string correo, Sexo sexo)
    {
        Contacto contacto(nombre,edad,telefono,correo,sexo);
        hola->push_back(contacto);
    }

Contacto* LibretaContactos::BuscarPorNombre(std::string nombre) const
{
    for(auto& contacto:*hola)
    {
        if(contacto.nombre==nombre)
        {
          return &contacto;
        }
    }
    return nullptr;
}

void LibretaContactos::EliminarporNombre(std::string nombre)
{
    int indice=0;
    bool encontrado=false;
    for(const Contacto& contacto: *hola)
    {
        if(contacto.nombre==nombre)
        {
            encontrado=true;
            break;
        }
        indice++;
    }

    if(encontrado)
    {
        // se encontro el valor a elminar
        auto IteratorInicial = hola->begin();
        hola->erase(IteratorInicial + indice);
    }
}

void LibretaContactos::ModificarContacto(Contacto& contacto, std::string nombre, int edad, std::string telefono, std::string correo)
{
    contacto.nombre=nombre;
    contacto.edad=edad;
    contacto.correo=correo;
    contacto.telefono=telefono;
}

Contacto::Contacto(
    std::string nombre, int edad, 
    std::string telefono, std::string correo, 
    Sexo sexo) : nombre(nombre),
    edad(edad),telefono(telefono),correo(correo),sexo(sexo)
{}

LibretaContactos::LibretaContactos()
{
    hola= new std::vector<Contacto>();
}

void LibretaContactosXLM::Imprimir() const
{
    std::cout << "<contactos" << "\n";
    for(const auto& contacto:*hola)
    {
        std::cout << "contacto nombre='" << contacto.nombre << "'"
                  << " edad='" << contacto.edad 
                  << "' telefono='" << contacto.telefono << "'"
                  << " correo='" << contacto.correo 
                  << "' sexo= '" << int(contacto.sexo) << "/>" << '\n';
    }
    
}

void LibretaContactosXLM::FiltrarContacto(Sexo sexo) const
{
    for(const auto& contacto: *hola)
    {
        if(contacto.sexo==sexo)
        {
            std::cout << "contacto nombre='" << contacto.nombre << "'"
                  << " edad='" << contacto.edad 
                  << "' telefono='" << contacto.telefono << "'"
                  << " correo='" << contacto.correo 
                  << "' sexo= '" << int(contacto.sexo) << "/>" << '\n';
        }
    }
}

void LibretaContactosJSON::Imprimir() const
{
    std::cout << "[" << "\n";
    for(const auto& contacto:*hola)
    {
        std::cout << "\t{" << '\n';
        
        std::cout << "\t\t'nombre' : '" << contacto.nombre << "'," << '\n'
                  << "\t\t'edad=' : '" << contacto.edad << "'," << '\n'
                  << "\t\t'telefono' : '" << contacto.telefono << "'," <<'\n'
                  << "\t\t'correo' : '" << contacto.correo << "',"<< '\n'
                  << "\t\t'sexo' : " << int(contacto.sexo) << '\n';
        std::cout << "\t}" << '\n';
    }
    std::cout << "]" << '\n';
}

void LibretaContactosJSON::FiltrarContacto(Sexo sexo) const
{
    for(const auto& contacto: *hola)
    {
        if(contacto.sexo==sexo)
        {
            std::cout << "[" << "\n";
            std::cout << "\t{" << '\n';
            std::cout << "\t\t'nombre' : '" << contacto.nombre << "'," << '\n'
                  << "\t\t'edad=' : '" << contacto.edad << "'," << '\n'
                  << "\t\t'telefono' : '" << contacto.telefono << "'," <<'\n'
                  << "\t\t'correo' : '" << contacto.correo << "',"<< '\n'
                  << "\t\t'sexo' : " << int(contacto.sexo) << '\n';
            std::cout << "\t}" << '\n';  
            std::cout << "]" << '\n';
        }
    }
}
}
