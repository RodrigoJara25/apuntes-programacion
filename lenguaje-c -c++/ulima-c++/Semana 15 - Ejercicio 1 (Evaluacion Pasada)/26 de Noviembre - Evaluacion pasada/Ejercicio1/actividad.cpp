#include "actividad.h"
namespace ULProyectos
{
    Actividad::Actividad(const std::string id, 
                         int tiempo, 
                         int complejidad) 
        : id(id), 
          tiempo(tiempo), 
          complejidad(complejidad), 
          completado(false)
    {}

    ActividadGrupal::ActividadGrupal(std::string id, 
                                     int tiempo, 
                                     int complejidad, 
                                     TipoActividad tipo)
        : Actividad(id, tiempo, complejidad), 
          tipo(tipo)
    {}

    void ActividadGrupal::Imprimir() const
    {
        /*std::string completadoStr = "X";
        if (completado == false)
        {
            completadoStr = "-";
        }*/
        std::cout << this->id << "\t" 
                  << tiempo << "\t" 
                  << complejidad << "\t" 
                  << (int)tipo << "\t"  // TODO
                  //<< completadoStr ; 
                  << (completado == true ? "X" : "-");
    }

    ActividadPersonal::ActividadPersonal(std::string id, 
                                         int tiempo, 
                                         int complejidad, 
                                         std::string responsable)
        : Actividad(id, tiempo, complejidad),
          responsable(responsable)
    {}
    void ActividadPersonal::Imprimir() const
    {
        std::cout << this->id << "\t" 
                  << tiempo << "\t" 
                  << complejidad << "\t" 
                  << responsable << "\t"  // TODO
                  //<< completadoStr ; 
                  << (completado == true ? "X" : "-");
    }
}