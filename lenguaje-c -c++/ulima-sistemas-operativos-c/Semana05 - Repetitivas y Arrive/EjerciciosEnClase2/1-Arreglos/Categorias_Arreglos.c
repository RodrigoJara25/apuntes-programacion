/*EJERCICIO: Se tienen dos escalas salariales en las que el empleado categoria C1 gana hasta
S/.5000.00 y el empleado categoria C2 gana hasta S/.8000.00. Los empleados C1 reciben una bonificacion del 15% del salario y los empleados C2 reciben 10%.
Aquellos empleados que exceden la categoria C2
reciben una bonificacion del 5%. Dado un salario, indicar las ganancias totales del empleado. Generar
5 muestras aleatorias de salarios entre S/.2500 y S/.15000, mostrando resultados por columnas.
Utilizar arreglos.*/

#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>

#define MAX 5

int main()
{
    float salario[MAX];
    char sal[]="Salario";

    char categoria[MAX][3]; //char categoria[n arreglos][tamaño de cada arreglo]----como es un CHAR, entonces debe tener un tamaño definido.
    char cat[]="Categoria";

    float bonificacion[MAX];
    char bon[]="Bonificacion";

    float ganancia[MAX];
    char gan[]="GananciaTotal";


    printf("%20s %20s %20s %20s \n",sal,cat,bon,gan);

    for(int i=0;i<MAX;i++)
    {
        salario[i]= (float)rand()/RAND_MAX*12500+2500;

        if(salario[i]<=5000)
        {
            strcpy(categoria[i],"C1");
            bonificacion[i]=0.15;
        }
        if(salario[i]>5000 && salario[i]<=8000)
        {
            strcpy(categoria[i], "C2");
            bonificacion[i]=0.10;
        }
        if(salario[i]>8000)
        {
            strcpy(categoria[i], "C3");
            bonificacion[i]=0.05;
        }

        ganancia[i]=salario[i] + bonificacion[i]*salario[i];
    }

    for(int i=0;i<MAX;i++)
    {
        printf("%20.2f %20s %20.2f %20.2f \n",salario[i],categoria[i],bonificacion[i],ganancia[i]);
    }
}
