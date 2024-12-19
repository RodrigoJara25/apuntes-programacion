#include <iostream>
#include <vector>
#include <string>

namespace ULContactos{

enum class Sexo
{
    Masculino, Femenino
};

        class Contacto{
        public:
        std::string nombre;
        int edad;
        std::string telefono;
        std::string correo;
        Sexo sexo;

        Contacto(
            std::string nombre,int edad,std::string telefono,std::string correo, Sexo sexo);   

    };
class LibretaContactos
{
protected:
std::vector<Contacto>* hola;
public:
    LibretaContactos();
    void AgregarContacto(std::string nombre,int edad,std::string telefono,std::string correo, Sexo sexo);
    
    virtual void Imprimir() const =0;
    Contacto* BuscarPorNombre(std::string nombre) const;
    void EliminarporNombre(std::string nombre);
    void ModificarContacto(Contacto& contacto, std::string nombre, int edad, std::string telefono, std::string email);
    virtual void FiltrarContacto(Sexo sexo) const =0;
};

class LibretaContactosXLM : public LibretaContactos
{
    public:
    void Imprimir() const override;
    void FiltrarContacto(Sexo sexo) const override;
};

class LibretaContactosJSON : public LibretaContactos
{
    public:
    void Imprimir() const override;
    void FiltrarContacto(Sexo sexo) const override;
};

}