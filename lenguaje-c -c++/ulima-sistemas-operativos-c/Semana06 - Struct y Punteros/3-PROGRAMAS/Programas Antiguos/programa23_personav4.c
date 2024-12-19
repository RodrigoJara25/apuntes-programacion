#include <stdio.h>

#define MAX 2

int main()
{
    // Datos de alumno
    char dni[MAX][10] ;
    char nombre[MAX][30] ;
    char apellido[MAX][30] ;
    int edad[MAX] ;

    // Lectura de datos
    for(int i=0;i<MAX;i++)
    {
        printf("dni:      ") ; gets(dni[i]) ;
        printf("nombre:   ") ; gets(nombre[i]) ;
        printf("apellido: ") ; gets(apellido[i]) ;
        printf("edad:     ") ; scanf("%d", &edad[i]) ;
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
                dni[i], nombre[i], apellido[i], edad[i]) ;
    }

    return 0 ;
}
