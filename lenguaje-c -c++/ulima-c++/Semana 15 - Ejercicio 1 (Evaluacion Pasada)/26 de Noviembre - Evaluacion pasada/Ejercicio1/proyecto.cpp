#include "proyecto.h"
namespace ULProyectos
{
    // ================================== Proyecto ==================================

    Proyecto::Proyecto()
        : cantActividades(0)
    {}

    void Proyecto::AgregarActividad(Actividad *actividad)
    {
        listaActividades.push_back(actividad);
    }

    // CompletarActividad("A1")
    void Proyecto::CompletarActividad(const std::string& codigo)
    {
        for (auto& actividad : listaActividades)
        {
            if (actividad->id == codigo)
            {
                actividad->completado = true;
            }
        }
    }

    void Proyecto::Imprimir()
    {
        std::cout << "=============================" << '\n';
        std::cout << "REPORTE DE AVANCE DE PROYECTO" << '\n';
        std::cout << "=============================" << '\n';
        int cont = 0;
        for (auto& actividad : listaActividades)
        {
            std::cout << "(" << cont + 1 << ") ";
            actividad->Imprimir();
            std::cout << "\n";
        }
    }

    // ================================== GestorProyecto ==================================

    GestorProyecto::GestorProyecto()
    {
    }
    void GestorProyecto::IniciarProyecto()
    {
    }
    void GestorProyecto::CrearActividadGrupal()
    {
    }
    void GestorProyecto::CrearActividadPersonal()
    {
    }
    void GestorProyecto::CompletarActividad()
    {
    }
    void GestorProyecto::ImprimirReporteActividades()
    {
    }
}