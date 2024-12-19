#pragma once
#include <iostream>

enum class Simbolo
{
    Corazon,
    Diamante,
    Trebol,
    Espada
};

class Carta
{
    int m_Valor;
    Simbolo m_Simbolo;
public:
    Carta(int valor, Simbolo simbolo);
    int GetValor() const;
    const std::string GetSimbolo() const;
    void SetValor(int valor);
    void SetSimbolo(Simbolo palo);
    void Imprimir() const;
    static Simbolo IntToSimbolo(int num);
};