#include "mh_p1.h"

int main()
{
    std::vector<AlumnoTupla> lista = GuardarCalificaciones();
    // ImprimirAlumnos(lista);
    const float promedio = CalcularCalificacionesPromedio(lista);
    std::cout << '\n' << "Promedio: " << promedio << '\n';
    const int cant_mayores_promedio = ObtenerCantidadSuperiorPromedio(lista);
    std::cout << "Cantidad mayores prom: " << cant_mayores_promedio << '\n';

    return 0;
}