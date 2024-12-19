/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby,
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>

#define MAX 3

typedef struct persona
{
    char dni[10];
    char nombre[30];
    char apellido[30];
    int edad;
    char f_nac[12];
    char sexo; //M o F
}persona;

int main()
{

    persona a[MAX];
    int i;

    for(int i=0; i<MAX; i++)
    {
        printf("Ingrese DNI: "); gets(a[i].dni);

        printf("Ingrese Nombre: "); gets(a[i].nombre);

        printf("Ingrese Apellido: "); gets(a[i].apellido);

        printf("Ingrese Edad: "); scanf("%d",&a[i].edad);
        getchar(); //luego de pedir con scanf, si se quiere pedir un gets(), tienes que usar getchar()

        printf("Ingrese Fecha de Nacimiento: "); gets(a[i].f_nac);

        printf("Ingrese Sexo: "); //gets(a[i].sexo);
        scanf("%c",&a[i].sexo);
        getchar();

        printf("\n");
    }

    for(int j=0; j<MAX; j++)
    {
        printf("%15s %15s %15s %8d %8s %8c\n",
                a[j].dni, a[j].nombre,
                a[j].apellido, a[j].edad,
                a[j].f_nac, a[j].sexo);
    }
    return 0;
}
