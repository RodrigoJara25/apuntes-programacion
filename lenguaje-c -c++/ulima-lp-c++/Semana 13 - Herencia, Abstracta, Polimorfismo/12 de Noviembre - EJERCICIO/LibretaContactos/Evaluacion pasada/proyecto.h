
#include "actividad.h"
#include <vector>

namespace ULProyectos
{
    class Proyecto
    {
        
        int cantActividades;
        std:: vector<Actividad> listaActividades;
        public:
        Proyecto();
        void AgregarActividad(Actividad* actividad); // Recibe la direccion de memoria de un objeto de tipo actividad
        void CompletarActividad(const std::string codigo);
        void Imprimir();

    };

    class GestorProyecto
    {
        
        Proyecto proyecto;
        GestorProyecto();
        void IniciarProyecto();
        void CrearActividadGrupal();
        void CrearActividadPersonal();
        void CompletarActividad();
        void ImprimirReporteActividades();
    };
}