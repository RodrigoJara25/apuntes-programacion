#include "mh_p1.h"

std::vector<AlumnoTupla> GuardarCalificaciones()
{
    std::vector <AlumnoTupla> lista_alumnos;

    int cantidad_alumnos = 0; 
    std::cout << "Cuantos alumnos quieres ingresar? : ";
    std::cin >> cantidad_alumnos;

    for(int i = 0; i < cantidad_alumnos; i++)
    {
        std::string nombre = "";
        float nota = 0.0f;
        std::cout << "Datos alumno: " << (i+1) << '\n';
        std::cout << "Ingrese nombre: ";
        std::cin >> nombre;
        std::cout << "Ingrese nota: ";
        std::cin >> nota;

        AlumnoTupla tupla{nombre, nota};
        lista_alumnos.push_back(tupla);
    }

    return lista_alumnos;
}

float CalcularCalificacionesPromedio(const std::vector<AlumnoTupla>& alumnos)
{
    float suma = 0.0f;
    for(auto[nombre, nota] : alumnos)
    {
        suma += nota;
    }
    const float promedio = suma / alumnos.size();
    return promedio;
}

int ObtenerCantidadSuperiorPromedio(const std::vector<AlumnoTupla>& alumnos)
{
    const float promedio = CalcularCalificacionesPromedio(alumnos);
    int cont = 0;
    for(auto[nombre, nota] : alumnos)
    {
        if (nota > promedio)
        {
            cont++;
        }
    }
    return cont;
}

void ImprimirEstudianteMayorNota()
{
}

void ImprimirAlumnos(std::vector<AlumnoTupla> alumnos)
{
    /*for (AlumnoTupla alumno : alumnos)
    {
        std::string nombre = std::get<0>(alumno);
        float nota = std::get<1>(alumno);
        std::cout << "<alumno nombre = " << nombre << " notas = " << nota <<" />";
    }*/
    // pattern matching
    for (auto [nombre, nota] : alumnos)
    {
        std::cout << "<alumno nombre = " 
                  << nombre << " notas = " 
                  << nota <<" />\n";
    }
}
