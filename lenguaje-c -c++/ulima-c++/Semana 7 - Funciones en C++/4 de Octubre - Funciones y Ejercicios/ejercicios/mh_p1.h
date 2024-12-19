#include <iostream>
#include <vector>
#include <tuple>

using AlumnoTupla = std::tuple <std::string, float>;

std::vector<AlumnoTupla> GuardarCalificaciones();
float CalcularCalificacionesPromedio(const std::vector<AlumnoTupla>& alumnos);
int ObtenerCantidadSuperiorPromedio(const std::vector<AlumnoTupla>& alumnos);
void ImprimirEstudianteMayorNota();

void ImprimirAlumnos(std::vector<AlumnoTupla> alumnos);