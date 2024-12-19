#include "filesystems.h"

namespace filesystem
{
    Archivo::Archivo(std::string nombre, float tamanho, bool esDirectorio)
        : nombre(nombre), tamanho(tamanho), esDirectorio(esDirectorio)
    {}

    SistemaArchivo::SistemaArchivo()
        : archivo("/", 0.0f, true)
    {}
    void OldHorseFS::CrearArchivo(std::string padre, std::string nombre, float tamanho, bool esDirectorio)
    {
        if (padre == "/")
        {
            // Crear un archivo en primer nivel
            /*Archivo archivo = Archivo(nombre, tamanho, esDirectorio);
            archivo.hijos.push_back(archivo)*/
            archivo.hijos.emplace_back(nombre, tamanho, esDirectorio);
        }else 
        {
            // Crear un archivo en segundo nivel
            for (auto& archivo : archivo.hijos)
            {
                if (archivo.nombre == padre)
                {
                    archivo.hijos.emplace_back(nombre, tamanho, esDirectorio);
                    break;
                }
            }
        }
    }

    void OldHorseFS::ImprimirArchivos(std::string padre)
    {
        if (padre == "/")
        {
            for (const auto& a : archivo.hijos)
            {
                if (a.esDirectorio)
                {
                    std::cout << a.nombre << "\n";
                    for (const auto& hijo : a.hijos)
                    {
                        std::cout << "-" << hijo.nombre << "\n";
                    }
                }else 
                {
                    std::cout << "-" << a.nombre << "\n";
                }
            }
        }else
        {
            for (const auto& a : archivo.hijos)
            {
                if (a.nombre == padre)
                {
                    for (const auto& hijo : a.hijos)
                    {
                        std::cout << "-" << hijo.nombre << "\n";
                    }
                }
            }
        }
    }
}