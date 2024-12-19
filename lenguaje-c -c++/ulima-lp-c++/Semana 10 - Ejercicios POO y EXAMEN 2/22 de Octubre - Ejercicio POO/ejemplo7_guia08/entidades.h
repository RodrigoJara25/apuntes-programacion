// Implementa las siguientes clases:

#include <iostream>
#include <cmath>

// a. Implementa una clase "Persona" con atributos de nombre y edad, y métodos para establecer y obtener estos atributos.
class Persona
{
    std::string nombre;
    int edad;
public:
    void SetNombre(std::string nombre);
    const std::string& GetNombre();
    void SetEdad(int edad);
    const int& GetEdad();
};

// b. Crea una clase "Rectángulo" con atributos de origen x, origen y, ancho y alto, y métodos para calcular el área y el perímetro.
class Rectangulo
{
    float origen_x;
    float origen_y;
    float ancho;
    float alto;
public:
    Rectangulo(float ancho, float alto);
    float CalcularArea() const;
    float CalcularPerimetro() const;
};

// c. Diseña una clase "Triángulo" con atributos de punto 1 x, punto 1 y, punto 2 x, punto 2 y, punto 3 x, punto 3 y, 
// y métodos para calcular su perímetro.
class Triangulo
{
    float p1_x;
    float p1_y;
    float p2_x;
    float p2_y;
    float p3_x;
    float p3_y;
public:
    Triangulo(float p1_x, float p1_y, float p2_x, float p2_y, float p3_x, float p3_y);
    float CalcularPerimetro();
};

// d. Diseña una clase "Círculo" con atributos de radio y métodos para calcular el área y la circunferencia.
class Circulo
{
    float radio;
public:
    Circulo(float radio);
    float CalcularArea();
    float CalcularCircunferencia();
};

// e. Diseña una clase "Fecha" con atributos de día, mes y año, y métodos para obtener y establecer la fecha, así 
// como para verificar si es una fecha válida. El algoritmo correcto de esFechaValida es opcional
class Fecha
{
    int dia;
    int mes;
    int year;
public:
    Fecha(int dia, int mes, int year);
    int GetDia();
    void SetDia(int day);
    int GetMes();
    void SetMes(int month);
    int GetYear();
    void SetYear(int anio);
    void FechaValida();
};

// f. Crea una clase "Libro" con atributos de título, autor y año de publicación, y métodos para mostrar la información del libro.
class Libro
{
    std::string titulo;
    std::string autor;
    int year_publicacion;
public:
    Libro(std::string titulo, std::string autor, int year_publicacion);
    void MostrarInfor();
};

// g. Implementa una clase "Calculadora" con métodos para realizar operaciones matemáticas básicas como suma, resta, 
// multiplicación y división.
class Calculadora
{
    float num1;
    float num2;
public:
    Calculadora(float sum1, float sum2);
    float Suma();
    float Resta();
    float Multiplicacion();
    float Division();
};

// h. Diseña una clase "CuentaBancaria" con atributos de número de cuenta, saldo y titular, y 
// métodos para depositar, retirar y mostrar el saldo actual.
class CuentaBancaria
{
    std::string nro_cuenta;
    float saldo;
    std::string titular;
public:
    CuentaBancaria(std::string nro_cuenta, float saldo, std::string titular);
    void Depositar(int cantidad);
    void Retirar(int cantidad);
    void MostrarSaldo();
};

// i. Crea una clase "Tiempo" con atributos de horas, minutos y segundos, y métodos para sumar y restar tiempos. 
// El algoritmo correcto de sumarTiempo y restarTiempo es opcional.
class Tiempo
{
    int horas;
    int minutos;
    int segundos;
public:
    Tiempo(int horas, int minutos, int segundos);
    void SumarTiempo(int horas, int minutos, int segundos);
    void restarTiempo(int horas, int minutos, int segundos);
    void MostrarTiempo();
};
