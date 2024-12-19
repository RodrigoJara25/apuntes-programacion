#include <stdio.h>

#define MAX 2

struct persona
{
    char dni[10] ;
    char nombre[30] ;
    char apellido[30] ;
    int edad ;
} ;

int main()
{
    struct persona alumno ;
    // Lectura de datos
    for(int i=0;i<MAX;i++)
    {
        printf("dni:      ") ; gets(alumno.dni) ;
        printf("nombre:   ") ; gets(alumno.nombre) ;
        printf("apellido: ") ; gets(alumno.apellido) ;
        printf("edad:     ") ; scanf("%d", &alumno.edad) ;
        getchar() ; printf("\n") ;
    }

    // Reporte
    char t1[]="DNI" ;
    char t2[]="NOMBRE" ;
    char t3[]="APELLIDO" ;
    char t4[]="EDAD" ;
    printf("\n") ;
    printf("%15s %15s %15s %15s\n\n", t1, t2, t3, t4) ;
    for(int i=0;i<MAX;i++)
    {
        printf("%15s %15s %15s %15d\n",
                alumno.dni,
                alumno.nombre,
                alumno.apellido,
                alumno.edad) ;
    }

    return 0 ;
}
