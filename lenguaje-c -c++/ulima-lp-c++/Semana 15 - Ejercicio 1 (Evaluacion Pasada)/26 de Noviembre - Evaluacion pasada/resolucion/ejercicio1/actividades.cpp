#include "actividades.h"

// ======================================== Actividad =============================
Actividad::Actividad(std::string id, int tiempo, int complejidad, bool completado) 
                    : id(id), tiempo(tiempo), complejidad(complejidad), completado(completado)
{}

// ======================================== Actividad Grupal =============================
ActividadGrupal::ActividadGrupal(std::string id, int tiempo, int complejidad, bool completado, TipoActividad tipo_activdad)
                    : Actividad(id, tiempo, complejidad, completado), tipo_activdad(tipo_activdad)
{}

void ActividadGrupal::Imprimir()
{
}

// ======================================== Actividad Personal =============================
ActividadPersonal::ActividadPersonal(std::string id, int tiempo, int complejidad, bool completado, std::string responsable)
                    : Actividad(id, tiempo, complejidad, completado), responsable(responsable)
{}

void ActividadPersonal::Imprimir()
{
}
