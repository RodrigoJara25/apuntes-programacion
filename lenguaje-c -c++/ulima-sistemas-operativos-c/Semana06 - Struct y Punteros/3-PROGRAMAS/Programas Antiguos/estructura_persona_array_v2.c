/*
    EJERCICIO: Incorporar fecha de nacimiento
*/

#include <stdio.h>

#define MAX 2

struct persona
{
    char dni[10] ;
    char nombre[30] ;
    char apellido[30] ;
    int edad ;
    char f_nac[12] ;
} ;

int main()
{
    struct persona alumno[MAX] ;
    // Lectura de datos
    for(int i=0;i<MAX;i++)
    {
        printf("dni:      ") ; gets(alumno[i].dni) ;
        printf("nombre:   ") ; gets(alumno[i].nombre) ;
        printf("apellido: ") ; gets(alumno[i].apellido) ;
        printf("edad:     ") ; scanf("%d", &alumno[i].edad) ;
        getchar() ;
        printf("f.nac:    ") ; gets(alumno[i].f_nac) ;
        printf("\n") ;
    }

    // Reporte
    char t1[]="DNI" ;
    char t2[]="NOMBRE" ;
    char t3[]="APELLIDO" ;
    char t4[]="EDAD" ;
    char t5[]="FECHA" ;
    printf("\n") ;
    printf("%15s %15s %15s %15s %15s\n\n", t1, t2, t3, t4, t5) ;
    for(int i=0;i<MAX;i++)
    {
        printf("%15s %15s %15s %15d %15s\n",
                alumno[i].dni,
                alumno[i].nombre,
                alumno[i].apellido,
                alumno[i].edad,
                alumno[i].f_nac) ;
    }

    return 0 ;
}
