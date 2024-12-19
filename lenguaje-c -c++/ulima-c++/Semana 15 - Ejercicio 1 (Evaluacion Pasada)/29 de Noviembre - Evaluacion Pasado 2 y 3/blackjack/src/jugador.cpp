#include <jugador.h>

Jugador::Jugador(const std::string &nombre)
    : m_Nombre(nombre), m_CantidadPartidasGanadas(0), m_SumaCartas(0)
{}

void Jugador::Imprimir() const
{
    std::string separationLine(20, '-');
    std::cout << separationLine << std::endl;
    std::cout << "Nombre: " << m_Nombre << std::endl;
    std::cout << "Suma de cartas: " << m_SumaCartas << std::endl;
    std::cout << "Cantidad de partidas ganadas: " << m_CantidadPartidasGanadas << std::endl;
    std::cout << separationLine << std::endl;
}

void Jugador::SetSumaCartas(int sumaCartas)
{
    m_SumaCartas = sumaCartas;
}

int Jugador::GetSumaCartas() const
{
    return m_SumaCartas;
}

int Jugador::GetCantidadPartidasGanadas() const
{
    return m_CantidadPartidasGanadas;
}

void Jugador::SetCantidadPartidasGanadas(int cantidadPartidasGanadas)
{
    m_CantidadPartidasGanadas = cantidadPartidasGanadas;
}

const std::string& Jugador::GetNombre() const
{
    return m_Nombre;
}
