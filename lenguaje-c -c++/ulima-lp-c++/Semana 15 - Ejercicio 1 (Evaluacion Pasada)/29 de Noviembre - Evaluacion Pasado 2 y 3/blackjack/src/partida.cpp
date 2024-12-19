#include <partida.h>

void Partida::JugarCrupier()
{
    Carta carta = m_Mazo.TomarCarta();
    m_SumaCartasCrupier += carta.GetValor();
}

void Partida::JugarJugador(Jugador &jugador)
{
    Carta carta = m_Mazo.TomarCarta();
    jugador.SetSumaCartas(jugador.GetSumaCartas() + carta.GetValor());
}

Partida::Partida()
    : m_SumaCartasCrupier(0), m_NumParticipantes(0)
{
}

void Partida::AgregarJugador(const std::string &nombre)
{
    m_Jugadores.emplace_back(nombre);
    m_NumParticipantes++;
}

void Partida::EliminarJugador(const std::string &nombre)
{
    for (auto it = m_Jugadores.begin(); it != m_Jugadores.end(); ++it)
    {
        if (it->GetNombre() == nombre)
        {
            m_Jugadores.erase(it);
            m_NumParticipantes--;
            break;
        }
    }
}

void Partida::ImprimirResultados() const
{
    for (const auto &jugador : m_Jugadores)
    {
        jugador.Imprimir();
    }
}

void Partida::Iniciar()
{
    m_SumaCartasCrupier = 0;
    m_Mazo.Barajar();

    // Una carta por jugador
    JugarCrupier();
    for (auto &jugador : m_Jugadores)
    {
        JugarJugador(jugador);
    }

    // Jugar con dada jugador hasta que se plante (>= 17)
    for (auto &jugador : m_Jugadores)
    {
        while (jugador.GetSumaCartas() < 17)
        {
            JugarJugador(jugador);
        }
    }

    // Verificar ganadores
    if (m_SumaCartasCrupier > 21)
    {
        std::cout << "Crupier ha perdido" << "\n";
    }
    else
    {
        for (auto &jugador : m_Jugadores)
        {
            if (jugador.GetSumaCartas() > 21)
            {
                std::cout << jugador.GetNombre() << " ha perdido" << "\n";
            }
            else if (jugador.GetSumaCartas() > m_SumaCartasCrupier)
            {
                std::cout << jugador.GetNombre() << " ha ganado" << "\n";
                jugador.SetCantidadPartidasGanadas(jugador.GetCantidadPartidasGanadas() + 1);
            }
            else
            {
                std::cout << jugador.GetNombre() << " ha perdido" << "\n";
            }
        }
    }
    
    
}
