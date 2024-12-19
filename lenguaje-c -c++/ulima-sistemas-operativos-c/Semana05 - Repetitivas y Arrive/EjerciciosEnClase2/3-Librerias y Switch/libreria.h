#ifndef LIBRERIA_H_INCLUDED
#define LIBRERIA_H_INCLUDED

int mayor(int x, int y)
{
    if(x>y) return (x);
    else return (y);
}

int menor(int x, int y)
{
    if(x<y) return (x);
    else return (y);
}

float suma(float x, float y)
{
    return (x+y);
}

float resta(float x, float y)
{
    return (x-y);
}

float multiplicacion(float x,float y)
{
    return (x*y);
}

float division(float x, float y)
{
    return (x/y);
}

#endif // LIBRERIA_H_INCLUDED
