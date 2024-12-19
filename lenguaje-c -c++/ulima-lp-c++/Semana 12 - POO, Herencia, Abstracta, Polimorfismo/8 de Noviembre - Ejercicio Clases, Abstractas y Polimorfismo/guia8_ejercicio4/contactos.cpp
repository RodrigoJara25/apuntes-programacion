#include "contactos.h"

// ========================== Contacto ===================================
// Constructor de Contacto
Contacto::Contacto(
    std::string nombre, int edad, 
    std::string num_tel, std::string correo, 
    Sexo sexo) : nombre(nombre), edad(edad), num_tel(num_tel), correo(correo), sexo(sexo)
{}

void Contacto::editarContacto(Contacto &contacto_reemplazar, std::string nombre, int edad, std::string num_tel, std::string correo, Sexo sexo)
{
    contacto_reemplazar.nombre = nombre;
    contacto_reemplazar.edad = edad;
    contacto_reemplazar.num_tel = num_tel;
    contacto_reemplazar.correo = correo;
    contacto_reemplazar.sexo = sexo;
}

// =========================== Libreta Contactos ============================
LibretaContactos::LibretaContactos()
{
    contactos = new std::vector<Contacto>();    // se pone "new" porque es puntero
}

void LibretaContactos::AgregarContacto(std::string nombre, int edad, std::string num_tel, std::string correo, Sexo sexo)
{
    Contacto contacto (nombre, edad, num_tel, correo, sexo);
    contactos->push_back(contacto);
}

void LibretaContactos::mostrarContactos()
{
    int i = 0;
    for (auto contacto : *contactos){
        std::cout << "Contacto " << (i+1) << ": " << "\n";
        std::cout << "Nombre: " << contacto.nombre << "\n";
        std::cout << "Edad: " << contacto.edad << "\n";
        std::cout << "num_tel: " << contacto.num_tel << "\n";
        std::cout << "correo: " << contacto.correo << "\n";
        if (contacto.sexo == Sexo::Masculino)
        {
            std::cout << "sexo: Masculino" << "\n";
        }
        else{
            std::cout << "sexo: Femenino" << "\n";
        }
        i = i + 1;
    }
}

void LibretaContactos::buscarContacto(std::string nombre)
{
    for( auto contacto : *contactos ){
        if(contacto.nombre == nombre){
            std::cout << "Nombre: " << contacto.nombre << "\n";
            std::cout << "Edad: " << contacto.edad << "\n";
            std::cout << "num_tel: " << contacto.num_tel << "\n";
            std::cout << "correo: " << contacto.correo << "\n";
            if (contacto.sexo == Sexo::Masculino)
            {
                std::cout << "sexo: Masculino" << "\n";
            }
            else{
                std::cout << "sexo: Femenino" << "\n";
            }
            // (int)contacto.sexo
            break;
        }
    }
}

void LibretaContactos::eliminarContactos(std::string nombre)
{
    // Iteramos continuamente sobre el vector
    for (int i = 0; i < contactos->size();) {
        if ((*contactos)[i].nombre == nombre) {
            contactos->erase(contactos->begin() + i);  // Eliminamos el contacto
            // No incrementamos i para verificar el siguiente contacto que ocupa el lugar
        } else {
            ++i;  // Solo incrementamos i si no se elimina un contacto
        }
    }
}

void LibretaContactos::buscarSexo(Sexo sexo)
{
    for (auto contacto : *contactos){
        if(contacto.sexo == sexo){
            std::cout << "Nombre: " << contacto.nombre << "\n";
            // Deberias poner todos los datos dell contacto, pero me da flojera
        }
    }
}
