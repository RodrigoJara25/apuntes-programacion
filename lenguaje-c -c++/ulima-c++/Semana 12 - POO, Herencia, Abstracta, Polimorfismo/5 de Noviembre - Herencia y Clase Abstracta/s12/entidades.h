#include <iostream>

// En C++ puedes tener más de 1 una clase padre para un hijo

class Animal
{
protected:  // nadie puede acceder desde fuera de clase, pero si puede heredarse
    std::string nombre;
public:     // cualquiera puede usarlo
    int edad;
    void Cumple();
    virtual void HacerSonido() = 0; // metodo abstracto (se define en cada hijo obligatoriamente, si no el hijo es clase abstracta y no se puede instanciar)
    virtual void Caminar();     // ya tiene una definición por defecto y puede ser o no override en cada clase hija 
    // (esto indica que tiene polimorfismo, osea que si llamo al padre, se va a llamar la funcion del hijo si es que tiene su propia version)
};

class Mamifero
{
protected:
    int edad;
};

// class Perro: Animal
class Perro: public Animal
{
public:
    void HacerSonido() override;
    void Caminar() override;

};

class Gato : public Animal
{
public:   
    void HacerSonido() override;
    // void Caminar() override;
};

