#pragma once
#include <carta.h>
#include <vector>


class Mazo
{
    std::vector<Carta> m_Cartas;
public:
    Mazo();
    void Barajar();
    Carta TomarCarta();
    bool EstaVacio() const;
    void Imprimir() const;
};