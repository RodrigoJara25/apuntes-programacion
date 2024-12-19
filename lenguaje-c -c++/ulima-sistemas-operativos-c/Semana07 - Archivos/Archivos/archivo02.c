#include <stdio.h>
#include <stdlib.h>


typedef struct persona
{
    char dni[10];
    char nombre[30];
    char apellido[30];
    int edad;
    //char f_nac[12];
    //char sexo; //M o F
}persona;

int MAX;

int main()
{
    //Definición de archivo
    FILE *archivo = fopen("datos.txt","r");

    if(archivo==NULL)
    {
        printf("Error! No se puede abrir el archivo");
        exit(-1);
    }
    else
    {
        fscanf(archivo,"%d",&MAX);
    printf("Cantidad de datos: %d\n\n",MAX);
    }

    //Datos del alumno
    persona a[MAX];

    //Lectura de datos
    for(int i=0; i<MAX; i++)
    {
        fscanf(archivo,"%s\t%s\t%s\t%d", a[i].dni,
                                         a[i].nombre,
                                         a[i].apellido,
                                         a[i].edad);

    }
    fclose(archivo);

    //Reporte
    printf("%-15s %-15s %-15s %-15s %-15s %-15s\n\n",
           "DNI","Nombre","Apellido",
           "Edad","F.Nac.","Sexo");

    for(int j=0; j<MAX; j++)
    {
        printf("%-15s %-15s %-15s %-15d %-15s %-15c\n",
                a[j].dni, a[j].nombre,
                a[j].apellido, a[j].edad,
                a[j].f_nac, a[j].sexo);
    }
    return 0;
}
