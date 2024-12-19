#include "actividad.h"
#include "proyecto.h"

int main()
{
    ULProyectos::ActividadGrupal a1("A1", 4, 5, ULProyectos::TipoActividad::Investigacion);
    ULProyectos::ActividadPersonal a2("AP1", 3, 2, "Arturo");
    ULProyectos::ActividadGrupal a3("A2", 8, 6, ULProyectos::TipoActividad::Configuracion);

    ULProyectos::Proyecto proyecto;
    proyecto.AgregarActividad(&a1);
    proyecto.AgregarActividad(&a2);
    proyecto.AgregarActividad(&a3);

    proyecto.CompletarActividad("AP1");

    proyecto.Imprimir();

    return 0;
}