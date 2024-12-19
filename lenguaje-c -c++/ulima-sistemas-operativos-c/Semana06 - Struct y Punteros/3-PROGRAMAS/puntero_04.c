#include <stdio.h>

void intercambio(int *px,int *py)
{
    int temp ;
    temp = *px ;  /* temp contiene el valor de px        */
    *px = *py  ;  /* px y py contienen el mismo valor    */
    *py = temp ;  /* py contienen el valor inicial de px */
}

int main()
{
    int a, b ;
    printf("a = " ) ; scanf("%d", &a) ;
    printf("b = " ) ; scanf("%d", &b) ;
    intercambio(&a,&b) ;
    printf("a = %d\tb = %d", a, b) ;
}
