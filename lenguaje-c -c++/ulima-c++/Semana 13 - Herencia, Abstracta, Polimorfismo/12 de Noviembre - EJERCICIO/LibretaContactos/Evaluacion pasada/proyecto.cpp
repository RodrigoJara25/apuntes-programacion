#include "proyecto.h"
#include <iostream>
namespace ULProyectos{

Proyecto::Proyecto():cantActividades(0)
{
    
}

void ULProyectos::Proyecto::AgregarActividad(Actividad *actividad)
{
    listaActividades.push_back(*actividad);
}

void ULProyectos::Proyecto::CompletarActividad(const std::string codigo)
{
    for(auto& actividad: listaActividades)
    {
        if(actividad.id==codigo)
        {
            actividad.completado=true;
        }
    }
}

void Proyecto::Imprimir()
{
    std::cout << "==================================================" << '\n';
    std::cout <<              "REPORTE AVANCE DE PROYECTO" << '\n';
    std::cout << "================================================" << '\n';
    int cont=0;
    for(const auto& actividad: listaActividades)
    {
        std::cout << "("<< cont +1 << ")" ;
        actividad.Imprimir();
        std::cout << '\n';
    }
}








void ULProyectos::GestorProyecto::IniciarProyecto()
{
}

void ULProyectos::GestorProyecto::CrearActividadGrupal()
{

}

void ULProyectos::GestorProyecto::CrearActividadPersonal()
{
}

void ULProyectos::GestorProyecto::CompletarActividad()
{
}

void ULProyectos::GestorProyecto::ImprimirReporteActividades()
{
}
}