#include "pregunta1.h"


void Pregunta1(filesystem::SistemaArchivo* fs)
{
    int cantArchivos;
    std::vector<std::string> nombres;
    std::vector<bool> listaEsDirectorios;
    std::vector<float> tamanhos;

    std::cin >> cantArchivos;

    for (int i=0; i < cantArchivos; i++)
    {
        std::string nombre;
        std::cin >> nombre;
        nombres.push_back(nombre);
    }

    for (int i=0; i < cantArchivos; i++)
    {
        std::string tipo;
        std::cin >> tipo;
        listaEsDirectorios.push_back(tipo == "d");
    }

    for (int i=0; i < cantArchivos; i++)
    {
        float tam;
        std::cin >> tam;
        tamanhos.push_back(tam);
    }

    for (int i=0; i < cantArchivos; i++)
    {
        fs->CrearArchivo("/", nombres[i], tamanhos[i], listaEsDirectorios[i]);
    }
}