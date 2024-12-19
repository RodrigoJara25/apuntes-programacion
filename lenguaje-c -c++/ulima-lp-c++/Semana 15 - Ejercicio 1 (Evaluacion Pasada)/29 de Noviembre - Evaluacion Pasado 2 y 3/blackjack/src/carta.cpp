#include "carta.h"

Carta::Carta(int valor, Simbolo simbolo)
    :m_Simbolo(simbolo), m_Valor(valor)
{
}

int Carta::GetValor() const
{
    return m_Valor;
}

const std::string Carta::GetSimbolo() const
{
    switch (m_Simbolo)
    {
        case Simbolo::Corazon:
            return "Corazon";
        case Simbolo::Diamante: 
            return "Diamante";
        case Simbolo::Trebol:
            return "Trebol";
        case Simbolo::Espada:
            return "Espada";
        default:
            return "";
    }
}

void Carta::SetValor(int valor)
{
    m_Valor = valor;
}

void Carta::SetSimbolo(Simbolo palo)
{
    m_Simbolo = palo;
}

void Carta::Imprimir() const
{
    std::cout << "{";
    std::cout << "'valor' : " << m_Valor 
              << ", 'simbolo' : " << "'" << GetSimbolo() << "'";
    std::cout << "}" << "\n";
}

Simbolo Carta::IntToSimbolo(int num)
{
    switch (num)
    {
        case 0:
            return Simbolo::Corazon;
        case 1: 
            return Simbolo::Diamante;
        case 2:
            return Simbolo::Trebol;
        case 3:
            return Simbolo::Espada;
        default:
            return Simbolo::Corazon;
    }
}
