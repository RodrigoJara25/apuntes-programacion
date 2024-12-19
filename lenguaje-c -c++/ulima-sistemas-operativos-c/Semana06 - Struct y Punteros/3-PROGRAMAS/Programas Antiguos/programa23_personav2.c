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
    char t1[]="DNI" ;
    char t2[]="NOMBRE" ;
    char t3[]="APELLIDO" ;
    char t4[]="EDAD" ;
    printf("\n") ;
    printf("%15s %15s %15s %15s\n\n", t1, t2, t3, t4) ;
    printf("%15s %15s %15s %15d\n", dni, nombre, apellido, edad) ;
}
