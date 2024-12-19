#include <stdio.h>

int main()
{
    int Dato = 5, *PtrDato ;

    PtrDato = &Dato ;

    printf("\nLa direccion de Dato es %p\n", &Dato) ;
    printf("\nLa direccion de PtrDato es %p\n\n", PtrDato) ;

    printf("\nEl valor de Dato es %d\n", Dato) ;
    printf("\nEl valor de PtrDato es %d\n\n", *PtrDato) ;

    printf("Note la relacion entre * y & \n") ;
    printf("&*PtrDato = %p\n *&PtrDato = %p\n", &*PtrDato, *&PtrDato) ;

    return 0 ;
}
