#pragma once
#include <iostream>

namespace ULProyectos
{
    enum class TipoActividad
    {
        Programacion,
        Planificacion,
        Configuracion,
        Investigacion
    };

    class Actividad
    {
    public:
        std::string id;
        int tiempo;
        int complejidad;
        bool completado;
    
        Actividad(const std::string id, 
                  int tiempo,
                  int complejidad);
        virtual void Imprimir() const = 0; // abstracto
    };

    class ActividadGrupal : public Actividad
    {
    public:
        TipoActividad tipo;

        ActividadGrupal(std::string id, 
                        int tiempo,
                        int complejidad,
                        TipoActividad tipo);

        void Imprimir() const override;
    };

    class ActividadPersonal : public Actividad
    {
    public:
        std::string responsable;

        ActividadPersonal(std::string id, 
                          int tiempo,
                          int complejidad,
                          std::string responsable);
        void Imprimir() const override;
    };
}