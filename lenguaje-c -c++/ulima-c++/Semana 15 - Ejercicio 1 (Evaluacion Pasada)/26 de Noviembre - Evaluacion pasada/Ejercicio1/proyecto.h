#pragma once
#include "actividad.h"
#include <vector>

namespace ULProyectos
{
    class Proyecto
    {
    public:
        int cantActividades;
        std::vector<Actividad*> listaActividades;

        Proyecto();
        void AgregarActividad(Actividad* actividad);
        void CompletarActividad(const std::string& codigo);
        void Imprimir();
    };

    class GestorProyecto
    {
    public:
        Proyecto proyecto;

        GestorProyecto();
        void IniciarProyecto();
        void CrearActividadGrupal();
        void CrearActividadPersonal();
        void CompletarActividad();
        void ImprimirReporteActividades();
    };
}