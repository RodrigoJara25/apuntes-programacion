/*
Crea una funci�n que permita comparar dos n�meros y decidir cu�l es mayor, menor o si son iguales.
*/

#include <stdio.h>

int mayor(int x, int y)
{
    int r;

    if(x>y) r=x;
    else r=y;

    return r;
}

int menor(int x, int y)
{
    int l;

    if(x<y) l=x;
    else l=y;

    return l;
}


int main()
{
    int a,b;
    int r;
    int l;

    printf("Ingrese el primer numero: ");
    scanf("%d",&a);

    printf("Ingrese el segundo numero: ");
    scanf("%d",&b);

    r=mayor(a,b);
    l=menor(a,b);

    if(a==b) printf("Los numeros son iguales");
    else
    {
        printf("El mayor es %d \n",r);
        printf("El menor es %d",l);
    }



}
