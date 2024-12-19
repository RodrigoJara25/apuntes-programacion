#include <iostream>     // libreria estandar
#include <string>       // permite todas las funcionalidades de los string
#include <array>        // permite trabajr con arreglos modernos
#include <vector>       // array dinamico
#include <map>          // diccionarios
#include <tuple>        // tuplas

// un "enum" es como crear tu propia variable
enum class DiaSemana
{
    Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
};

// funciones : primera letra con mayusucla (por convencion)
void PintarArreglos()
{
    // contenido
}

int main()
{
    DiaSemana dia_semana = DiaSemana::Miercoles;

    // ....

    dia_semana = DiaSemana::Domingo;

    // "switch" se usa mucho con "enums"
    switch (dia_semana)
    {
        case DiaSemana::Lunes:
            std::cout << "Lunes" << '\n'; 
        break;
        case DiaSemana::Martes:
            std::cout << "Martes" << '\n'; 
        break;
        case DiaSemana::Miercoles:
            std::cout << "Miercoles" << '\n'; 
        break;
        case DiaSemana::Jueves:
            std::cout << "Jueves" << '\n'; 
        break;
        default:
            std::cout << "Dia de semana incorrecto" << '\n'; 
    }

    // es parte de la libreria <iostream>
    std::string nombre = "10";

    // uso de la libreria <string>
    int numero = std::stoi(nombre);

    std::string numeroStr = std::to_string(20);
    std::string subcadena = nombre.substr(1, 2);
    
    std::string numStr1 = "105";
    char numChar1[] = "105";

    // "sizeof" para ver cuál ocupa más espacio (bites)
    std::cout << "numStr1: " << sizeof(numStr1) << '\n';
    std::cout << "numChar1: " << sizeof(numChar1) << '\n';
    // Mayormente se usa String igualmente. Los arreglos de "char" son muy complicados


    // ARREGLOS

    // arreglo de 3 enteros
    std::array<int, 3> array_numeros{0, 0, 0};

    std::cout << array_numeros[0] << '\n';
    std::cout << array_numeros[1] << '\n';
    std::cout << array_numeros[2] << '\n';

    // arreglo de 10 enteros
    std::array<int, 10> array_numeros2{0, 0, 0};

    //for antiguo 
    for (int i=0; i < array_numeros2.size(); i++)
    {
        // std::cout << array_numeros2.at(i) << '\n';
        std::cout << array_numeros2[i] << '\n';
    }

    // for moderno
    for (int num : array_numeros2)
    {
        std::cout << num << '\n';
    }

    // arreglo dinámico
    //std::vector<int> lista_numeros;
    std::vector<int> lista_numeros{1, 3, 5};
    // lista_numeros.push_back(2);
    // lista_numeros.push_back(5);
    // lista_numeros.push_back(7);

    for (int num : lista_numeros)
    {
        std::cout << num << '\n';
    }


    // diccionarios
    std::map<std::string, int> mapaCursos;
    mapaCursos["LP"] = 39;
    mapaCursos["PW"] = 37;

    std::cout << mapaCursos["LP"] << '\n';

    // "for" con diccionarios (se usan tuplas)
    for (std::tuple<std::string, int> tupla : mapaCursos)
    {
        std::cout << std::get<0>(tupla) << ":" << std::get<1>(tupla) << '\n';
    }

    // "for" con pattern maching (x:xs)
    for (auto[llave, valor] : mapaCursos)
    {
        std::cout << llave << ":" << valor << '\n';
    }

    return 0;
}
