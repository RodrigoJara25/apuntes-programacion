#include <stdio.h>

int main()
{
    // Datos de alumno
    char dni[10] ;
    char nombre[30] ;
    char apellido[30] ;
    int edad ;

    // Lectura de datos
    printf("dni:      ") ; gets(dni) ;
    printf("nombre:   ") ; gets(nombre) ;
    printf("apellido: ") ; gets(apellido) ;
    printf("edad:     ") ; scanf("%d", &edad) ;

    // Reporte
    printf("%-15s %-15s %-15s %-15d\n", dni, nombre, apellido, edad) ;
}
