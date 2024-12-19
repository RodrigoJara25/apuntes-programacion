#include "entidades.h"

void Perro::HacerSonido()
{
    std::cout << "guau guau" << '\n';
}

void Perro::Caminar()
{
    std::cout << "Perro caminando..." << '\n';
}



void Gato::HacerSonido()
{
    std::cout << "miau miau" << '\n';
}

// void Gato::Caminar()
// {
//     std::cout << "Gato caminando..." << '\n';
// }



void Animal::Cumple()
{
    std::cout << "+1 ano de vida" << '\n';
}

void Animal::Caminar()
{
    std::cout << "Animal caminando..." << '\n'; 
}
