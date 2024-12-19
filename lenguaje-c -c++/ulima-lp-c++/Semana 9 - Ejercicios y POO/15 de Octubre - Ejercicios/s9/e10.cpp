#include "e10.h"

void Pregunta10(int n1, int n2, int *p)
{
    if (n1 % 2 == 0 && n2 % 2 == 0)
    {
        *p = n1 + n2;
    }
    else if(n1 % 2 != 0 && n2 % 2 != 0)
    {
        *p = n1 - n2;
    }
    else{
        *p = n1 * n2;
    }
    
}