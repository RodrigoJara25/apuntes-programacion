#pragma once
#include <iostream>

class Jugador
{
    std::string m_Nombre;
    int m_SumaCartas;
    int m_CantidadPartidasGanadas;
public:    
    Jugador(const std::string& nombre);
    void Imprimir() const;
    void SetSumaCartas(int sumaCartas);
    int GetSumaCartas() const;
    int GetCantidadPartidasGanadas() const;
    void SetCantidadPartidasGanadas(int cantidadPartidasGanadas);
    const std::string& GetNombre() const;
};