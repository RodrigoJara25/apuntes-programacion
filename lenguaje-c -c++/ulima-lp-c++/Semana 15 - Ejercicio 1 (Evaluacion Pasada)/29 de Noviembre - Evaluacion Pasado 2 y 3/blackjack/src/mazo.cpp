#include "mazo.h"

Mazo::Mazo()
{
    m_Cartas.reserve(52); // Reservamos espacio para 52 cartas (13 x 4)
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 13; j++)
        {
            m_Cartas.emplace_back(j + 1, Carta::IntToSimbolo(i));
        }
    }
}

void Mazo::Barajar()
{
    for (int i=0; i < 52; i++)
    {
        int j = rand() % 52;
        std::swap(m_Cartas[i], m_Cartas[j]);
    }
}

Carta Mazo::TomarCarta()
{
    Carta carta = m_Cartas[0];
    m_Cartas.erase(m_Cartas.begin());
    return carta;
}

bool Mazo::EstaVacio() const
{
    return m_Cartas.empty();
}

void Mazo::Imprimir() const
{
    for (const Carta& carta : m_Cartas)
    {
        carta.Imprimir();
    }
}
