// Implementa las siguientes clases:

// a. Implementa una clase "Persona" con atributos de nombre y edad, y métodos para establecer y obtener estos atributos.
// b. Crea una clase "Rectángulo" con atributos de origen x, origen y, ancho y alto, y métodos para calcular el área y el perímetro.
// c. Diseña una clase "Triángulo" con atributos de punto 1 x, punto 1 y, punto 2 x, punto 2 y, punto 3 x, punto 3 y, y métodos para calcular su perímetro.
// d. Diseña una clase "Círculo" con atributos de radio y métodos para calcular el área y la circunferencia.
// e. Diseña una clase "Fecha" con atributos de día, mes y año, y métodos para obtener y establecer la fecha, así como para verificar si es una fecha válida. El algoritmo correcto de esFechaValida es opcional
// f. Crea una clase "Libro" con atributos de título, autor y año de publicación, y métodos para mostrar la información del libro.
// g. Implementa una clase "Calculadora" con métodos para realizar operaciones matemáticas básicas como suma, resta, multiplicación y división.
// h. Diseña una clase "CuentaBancaria" con atributos de número de cuenta, saldo y titular, y métodos para depositar, retirar y mostrar el saldo actual.
// i. Crea una clase "Tiempo" con atributos de horas, minutos y segundos, y métodos para sumar y restar tiempos. El algoritmo correcto de sumarTiempo y restarTiempo es opcional.

#include "entidades.h"

int main()
{
    // ======= Persona ========
    Persona p;
    std::string nombre = "Arturo";
    p.SetNombre(nombre);
    p.SetEdad(22);
    const std::string& nom = p.GetNombre();
    const int& age = p.GetEdad();
    std::cout << "Nombre: " << nom << '\n';
    std::cout << "Edad: " << age << '\n';

    // ======= Rectangulo ========
    Rectangulo r1(4.0f,3.0f);
    std::cout << "Area Rectangulo: " << r1.CalcularArea() << '\n';
    std::cout << "Perimetro Rectangulo: " << r1.CalcularPerimetro() << '\n';

    // ======= Triangulo ========
    Triangulo t1(0.0, 0.0, 3.0, 0.0, 3.0, 4.0);
    std::cout << "Perimetro Triangulo: " << t1.CalcularPerimetro() << '\n';

    // ======= Circulo ========
    Circulo c1(5.0);
    std::cout << "Area Circulo: " << c1.CalcularArea() << '\n';
    std::cout << "Circunferencia Circulo: " << c1.CalcularCircunferencia() << '\n';
    
    // ======= Libro ========
    Libro l1("Deep Work", "Carl Newport", 2015);
    l1.MostrarInfor();

    // ======= Calculadora ========
    Calculadora cal1(10.0f, 5.0f);
    std::cout << "Suma: " << cal1.Suma() << '\n';
    std::cout << "Resta: " << cal1.Resta() << '\n';
    std::cout << "Multiplicación: " << cal1.Multiplicacion() << '\n';
    std::cout << "Division: " << cal1.Division() << '\n';

    // ======= Cuenta Bancaria ========
    CuentaBancaria cb1("71951873", 2000.0, "Rodrigo");
    cb1.MostrarSaldo();
    cb1.Depositar(1000);
    cb1.MostrarSaldo();
    cb1.Retirar(500);
    cb1.MostrarSaldo();

    // ======= Tiempo ========
    Tiempo tiempo1(23, 19, 1);
    tiempo1.MostrarTiempo();
    tiempo1.SumarTiempo(1, 40, 5);
    tiempo1.MostrarTiempo();
    tiempo1.restarTiempo(4, 2, 40);
    tiempo1.MostrarTiempo();
}


