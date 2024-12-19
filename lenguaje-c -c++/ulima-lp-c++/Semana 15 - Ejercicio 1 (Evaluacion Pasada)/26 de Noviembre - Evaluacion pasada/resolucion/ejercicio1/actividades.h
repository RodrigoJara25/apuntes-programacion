#include <iostream>

class Actividad
{
protected:
    std::string id;
    int tiempo;
    int complejidad;
    bool completado;
public:
    Actividad(std::string id, int tiempo, int complejidad, bool completado);

    // Metodos
    virtual void Imprimir() = 0;
};

enum class TipoActividad{
    Programacion,
    Planificacion,
    Configuracion,
    Investigacion
};

class ActividadGrupal : public Actividad
{
protected:
    TipoActividad tipo_activdad;
public:
    ActividadGrupal(std::string id, int tiempo, int complejidad, bool completado, TipoActividad tipo_activdad);
    void Imprimir() override;
};

class ActividadPersonal : public Actividad
{
protected:
    std::string responsable;
public:
    ActividadPersonal(std::string id, int tiempo, int complejidad, bool completado, std::string responsable);
    void Imprimir() override;
};

