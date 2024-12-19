#include <stdio.h>

int main()
{
    int *ptr ; //creamos una dirección de memoria compatible con el tipo de dato entero (un puntero)
    int dato = 30 ;
    printf("Dato = %d\n",dato);

    ptr = &dato ;
    *ptr = 50 ;

    printf("Dato = %d\n", dato) ;

    return 0 ;
}
