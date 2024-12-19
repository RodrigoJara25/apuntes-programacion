/******************************************************************************
Problema N°02:
Supongamos que la bolsa de un kilo de azúcar y un paquete de 500g de café molido están a 4.30 y 26.90
soles respectivamente, desarrollar en primer término un algoritmo y luego un programa en lenguaje C que
permita efectuar lo siguiente:
1. Solicitar por teclado una cantidad soles, pudiendo expresarlo en céntimos inclusive (por ejemplo,
100.80)
2. Si la tercera parte de la cantidad introducida se destina a comprar azúcar, la mitad a comprar café, y el
resto no se gasta. Calcule cuántos kilos de azúcar y café (datos reales) se pueden comprar con dicha
cantidad de dinero, así como la cantidad (dato real) de dinero sobrante
3. Muestre por pantalla los resultados, expresado en datos reales
*******************************************************************************/

#include <stdio.h>

#define kg_azucar 4.30
#define kg_cafe 53.80

int main() 
{
    float dinero;
    float azucar;
    float cafe;
    float sobrante;
    
    printf("Ingrese cantidad en soles: \n");
    scanf("%f",&dinero);
    
    printf("Cúanto dinero para azucar: \n");
    scanf("%f",&azucar);
    
    printf("Cúanto dinero para café: \n");
    scanf("%f",&cafe);
    
    sobrante = dinero-(azucar+cafe);
    
    printf("Puedes comprar %.2f kilos de azucar\n",azucar/kg_azucar);
    
    printf("Puedes comprar %.2f kilos de café\n",cafe/kg_cafe);
    
    printf("El sobrante es %.2f soles",sobrante);
    
    return 0;
}