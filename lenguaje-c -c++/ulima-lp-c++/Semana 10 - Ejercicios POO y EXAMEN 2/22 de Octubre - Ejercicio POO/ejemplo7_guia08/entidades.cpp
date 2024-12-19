#include "entidades.h"

// a. Implementa una clase "Persona" con atributos de nombre y edad, y métodos para establecer y obtener estos atributos.
void Persona::SetNombre(std::string nombre)
{
    this->nombre = nombre;
}

const std::string& Persona::GetNombre()
{
    return this->nombre;
}

void Persona::SetEdad(int edad)
{
    this->edad = edad;
}

const int& Persona::GetEdad()
{
    return edad;
}


// b. Crea una clase "Rectángulo" con atributos de origen x, origen y, ancho y alto, y métodos para calcular el área y el perímetro.
Rectangulo::Rectangulo(float ancho, float alto)
{
    this->alto = alto;
    this->ancho = ancho;
}

float Rectangulo::CalcularArea() const
{
    return ancho*alto;
}

float Rectangulo::CalcularPerimetro() const
{
    return ancho*2 + alto*2;
}

// c. Diseña una clase "Triángulo" con atributos de punto 1 x, punto 1 y, punto 2 x, punto 2 y, punto 3 x, punto 3 y, 
// y métodos para calcular su perímetro.
Triangulo::Triangulo(float p1_x, float p1_y, float p2_x, float p2_y, float p3_x, float p3_y)
{
    this->p1_x = p1_x;
    this->p1_y = p1_y;
    this->p2_x = p2_x;
    this->p2_y = p2_y;
    this->p3_x = p3_x;
    this->p3_y = p3_y;
}

float Triangulo::CalcularPerimetro()
{
    float lado1 = sqrt(pow(p1_x - p2_x, 2) + pow(p1_y - p2_y, 2));
    float lado2 = sqrt(pow(p1_x - p3_x, 2) + pow(p1_y - p3_y, 2));
    float lado3 = sqrt(pow(p3_x - p2_x, 2) + pow(p3_y - p2_y, 2));
    return lado1 + lado2 + lado3;
}

// d. Diseña una clase "Círculo" con atributos de radio y métodos para calcular el área y la circunferencia.
Circulo::Circulo(float radio)
{
    this->radio = radio;
}

float Circulo::CalcularArea()
{
    return M_PI * pow(radio,2);
}

float Circulo::CalcularCircunferencia()
{
    return 2 * M_PI * radio;
}

// e. Diseña una clase "Fecha" con atributos de día, mes y año, y métodos para obtener y establecer la fecha, así 
// como para verificar si es una fecha válida. El algoritmo correcto de esFechaValida es opcional
Fecha::Fecha(int dia, int mes, int year)
{
    this->dia = dia;
    this->mes = mes;
    this->year = year;
}

int Fecha::GetDia()
{
    return dia;
}

void Fecha::SetDia(int day)
{
    this->dia = day;
}

int Fecha::GetMes()
{
    return mes;
}

void Fecha::SetMes(int month)
{
    this->mes = month;
}

int Fecha::GetYear()
{
    return year;
}

void Fecha::SetYear(int anio)
{
    this->year = anio;
}

void Fecha::FechaValida()
{
    bool esValida = false;
    if (dia>=1 && dia<=31)
    {
        esValida = true;
    }
    else{
        esValida = false;
    }
    if (mes >=1 && mes<=12)
    {
        esValida = true;
    }
    else{
        esValida = false;
    }
    if (year >=1)
    {
        esValida = true;
    }
    else{
        esValida = false;
    }
    
    if (esValida == true)
    {
        std::cout << "Fecha Valida" << '\n';
    }
    else{
        std::cout << "Fecha Incorrecta" << '\n';
    }
}

// f. Crea una clase "Libro" con atributos de título, autor y año de publicación, y métodos para mostrar la información del libro.
Libro::Libro(std::string titulo, std::string autor, int year_publicacion)
{
    this->titulo = titulo;
    this->autor = autor;
    this->year_publicacion = year_publicacion;
}

void Libro::MostrarInfor()
{
    std::cout << "Titulo: " << titulo << '\n';
    std::cout << "Autor: " << autor << '\n';
    std::cout << "Año de publicacion: " << year_publicacion << '\n';
}

// g. Implementa una clase "Calculadora" con métodos para realizar operaciones matemáticas básicas como suma, resta, 
// multiplicación y división.
Calculadora::Calculadora(float sum1, float sum2)
{
    this->num1 = sum1;
    this->num2 = sum2;
}

float Calculadora::Suma()
{
    return num1 + num2;
}

float Calculadora::Resta()
{
    return num1 - num2;
}

float Calculadora::Multiplicacion()
{
    return num1 * num2;
}

float Calculadora::Division()
{
    return num1 / num2;
}

// h. Diseña una clase "CuentaBancaria" con atributos de número de cuenta, saldo y titular, y métodos 
// para depositar, retirar y mostrar el saldo actual.
CuentaBancaria::CuentaBancaria(std::string nro_cuenta, float saldo, std::string titular)
{
    this->nro_cuenta = nro_cuenta;
    this->saldo = saldo;
    this->titular = titular;
}

void CuentaBancaria::Depositar(int cantidad)
{
    this->saldo = this->saldo + cantidad;
}

void CuentaBancaria::Retirar(int cantidad)
{
    this->saldo = this->saldo - cantidad;
}

void CuentaBancaria::MostrarSaldo()
{
    std::cout << "Saldo: " << this->saldo << '\n';
}

// i. Crea una clase "Tiempo" con atributos de horas, minutos y segundos, y métodos para sumar y restar tiempos. 
// El algoritmo correcto de sumarTiempo y restarTiempo es opcional.
Tiempo::Tiempo(int horas, int minutos, int segundos)
{
    this->horas = horas;
    this->minutos = minutos;
    this->segundos = segundos;
}

void Tiempo::SumarTiempo(int horas, int minutos, int segundos)
{
    this->segundos = this->segundos + segundos;
    if (this->segundos >= 60)
    {
        this->segundos = this->segundos - 60;
        this->minutos =this->minutos + 1;
    }

    this->minutos = this->minutos + minutos;
    if (this->minutos >= 60)
    {
        this->minutos = this->minutos - 60;
        this->horas = this->horas + 1;
    }

    this->horas = this->horas + horas;
    if (this->horas >= 24)
    {
        this->horas = this->horas - 24;
    }
}

void Tiempo::restarTiempo(int horas, int minutos, int segundos)
{
    this->segundos = this->segundos - segundos;
    if (this->segundos < 0)
    {
        this->segundos = 60 + this->segundos;
        this->minutos = this->minutos - 1;
    }

    this->minutos = this->minutos - minutos;
    if (this->minutos < 0)
    {
        this->minutos = 60 + this->minutos;
        this->horas = this->horas - 1;
    }
    this->horas = this->horas - horas;
    if (this->horas < 0)
    {
        this->horas = 24 + this->horas;
    }
}

void Tiempo::MostrarTiempo()
{
    std::cout << "Horas: " << horas << '\n';
    std::cout << "Minutos: " << minutos << '\n';
    std::cout << "Segundos: " << segundos << '\n';
}
