#include "actividad.h"

namespace ULProyectos
{
ULProyectos::Actividad::Actividad
(std::string id, int tiempo, int complejidad): id(id),tiempo(tiempo),complejidad(complejidad),completado(false)
{

}

ActividadGrupal::ActividadGrupal(const std::string id, int tiempo, int complejidad, TipoActividad tipo)
                                :Actividad(id,tiempo,complejidad),tipo(tipo)
{

}

void ActividadGrupal::Imprimir() const
{
    std::string completadoStr = "X";
    if(completado==false)
    {
        completadoStr = "-";
    }
    std::cout << id << "\t"
    << tiempo << "\t"
    << complejidad << "\t"
    << (int)tipo << "\t"
    << completadoStr ;
}

ActividadPersonal::ActividadPersonal(const std::string id, int tiempo,
                                     int complejidad, std::string responsable)
                                     :Actividad(id,tiempo,complejidad),responsable(responsable)
{
}

void ActividadPersonal::Imprimir() const
{
}
}