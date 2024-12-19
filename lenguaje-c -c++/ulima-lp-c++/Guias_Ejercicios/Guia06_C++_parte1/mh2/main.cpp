// Implementa un programa que gestione un inventario de productos. Cada producto tiene un nombre, un código y un precio. 
// Usa un struct para definir un producto. El programa debe permitir:

// Implementar un sistema de menús para que el usuario pueda ingresar las opciones a realizar.
// Ingresar datos de productos.
// Mostrar el producto con el precio más alto y el más bajo.
// Imprimir un reporte con la lista de los productos ordenados por precio.

#include <iostream>
#include <vector>
#include <tuple>
#include <algorithm>

struct producto
{
    std::string nombre;
    std::string codigo;
    float precio;
};

int main()
{
    std::vector<std::tuple<std::string, std::string, float>> listaProductos;


    int tr = 1;
    while (tr != 0)
    {
        int option;
        std::cout << "MENU" << '\n';
        std::cout << "Opcion 1: Ingresar datos de productos" << '\n';
        std::cout << "Opcion 2: Mostrar precio mas alto y mas bajo" << '\n';
        std::cout << "Opcion 3: Imprimir reporte" << '\n';
        std::cout << "Seleccionar opcion: " << '\n';
        std::cin >> option;

        std::string nombre;
        std::string codigo;
        float precio;

        if (option == 1)
        {
            std::cout << "Ingresa nombre del producto: " << '\n';
            std::cin >> nombre;
            std::cout << "Ingresa codigo del producto: " << '\n';
            std::cin >> codigo;
            std::cout << "Ingresa el precio del producto: " << '\n';
            std::cin >> precio;
            listaProductos.push_back(std::make_tuple(nombre, codigo, precio));
        }
        else if (option == 2)
        {
            float precio_max = 0;
            float precio_min = 10000;
            for (auto[nombre, codigo, precio] : listaProductos)
            {
                if (precio >= precio_max)
                {
                    precio_max = precio;
                }  
                if (precio <= precio_min)
                {
                    precio_min = precio;
                }
            }
            for(auto[nombre, codigo, precio] : listaProductos)
            {
                if (precio == precio_max)
                {
                    std::cout << "Producto con el precio mas alto: " << '\n';
                    std::cout << "Nombre: " << nombre << '\n' <<
                                "Codigo: " << codigo << '\n' <<
                                "Precio: " << precio << '\n';    
                }
                if (precio == precio_min)
                {
                    std::cout << "Producto con el precio mas bajo: " << '\n';
                    std::cout << "Nombre: " << nombre << '\n' <<
                                "Codigo: " << codigo << '\n' <<
                                "Precio: " << precio << '\n';    
                }
                
            }   
        }
        else
        {
            std::vector<float> listaPrecios;
            for(auto[nombre, codigo, precio] : listaProductos)
            {
                listaPrecios.push_back(precio);
            }

            std::sort(listaPrecios.begin(), listaPrecios.end());

            for (float p : listaPrecios) {
            // Iterar sobre los productos
                for (auto [nombre, codigo, precioProducto] : listaProductos) 
                {
                    if (p == precioProducto) {
                        // Imprimir el producto si hay coincidencia
                        std::cout << "Nombre: " << nombre 
                                << ", Código: " << codigo 
                                << ", Precio: " << precioProducto << '\n';
                    }
                }
            }
        }
    }
    return 0;
}