#pragma once

#include <iostream>
#include <vector>

namespace filesystem
{
    class Archivo
    {
    public:
        std::string nombre;
        float tamanho;
        bool esDirectorio;
        std::vector<Archivo> hijos;

        Archivo(std::string nombre, float tamanho, bool esDirectorio);
    };
    class SistemaArchivo
    {
    public:
        Archivo archivo;

        SistemaArchivo();
        virtual void CrearArchivo(std::string padre, 
                          std::string nombre, 
                          float tamanho,
                          bool esDirectorio) = 0; // abstracto
        virtual void ImprimirArchivos(std::string padre) = 0; // abstracto
    };
    class OldHorseFS : public SistemaArchivo
    {
    public:
        void CrearArchivo(std::string padre, 
                          std::string nombre, 
                          float tamanho,
                          bool esDirectorio) override;
        void ImprimirArchivos(std::string padre) override;
    };
};