#pragma once
#include <vector>
#include <jugador.h>
#include <mazo.h>
#include <carta.h>

class Partida
{
    int m_NumParticipantes;
    std::vector<Jugador> m_Jugadores;
    Mazo m_Mazo;

    int m_SumaCartasCrupier;

    void JugarCrupier();
    void JugarJugador(Jugador& jugador);

public:
    Partida();
    void AgregarJugador(const std::string& nombre);
    void EliminarJugador(const std::string& nombre);
    void ImprimirResultados() const;
    void Iniciar();
};