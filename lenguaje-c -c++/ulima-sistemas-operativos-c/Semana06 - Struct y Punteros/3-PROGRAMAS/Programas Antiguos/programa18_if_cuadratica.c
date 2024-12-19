#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    // Declaracion de variables
    double a, b, c ; // Coeficientes y termino independiente de ecuacion cuadratica
    double d ;       // Discriminante

    // Lectura de variables
    printf("* Digite a: ") ; scanf("%lf", &a) ;
    printf("* Digite b: ") ; scanf("%lf", &b) ;
    printf("* Digite c: ") ; scanf("%lf", &c) ;

    // Calculo de las raices

    d = pow(b,2) - 4*a*c ;

    if(d>=0)
    {
        double x1, x2 ; // Raices reales
        x1 = (-b + sqrt(d))/(2*a) ;
        x2 = (-b - sqrt(d))/(2*a) ;
        printf("* X1 = %.6lf\n", x1) ;
        printf("* X2 = %.6lf\n", x2) ;
    }
    else
    {
        double x1, y1, x2, y2 ; // Raices complejas
        x1 = x2 = -b/(2*a) ;
        y1 = sqrt(abs(d))/(2*a) ;
        y2 = -sqrt(abs(d))/(2*a) ;
        printf("* X1 = %.6lf + i %.6lf\n", x1, y1) ;
        printf("* X2 = %.6lf + i %.6lf\n", x2, y2) ;
    }

}
