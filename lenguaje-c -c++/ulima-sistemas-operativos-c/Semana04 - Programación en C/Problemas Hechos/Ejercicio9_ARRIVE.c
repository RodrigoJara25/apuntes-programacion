/******************************************************************************
Problema N°04:
Desarrollar en primer término un algoritmo y luego un programa en lenguaje C un programa que cumpla
con las siguientes indicaciones:
1. Solicitar por teclado tres números (datos enteros) y almacenarlos en tres variables, llamadas v1, v2 y v3
2. Intercambie los valores de las variables del siguiente modo:
a. El contenido de v1 pasa a v2
b. El contenido de v3 pasa a v1
c. El contenido de v2 pasa a v3
3. Mostrar en pantalla los valores de las variables antes y después del intercambio
*******************************************************************************/
 #include <stdio.h>
 #define MAX 32
 
 int main()
 {
     int v1[MAX];
     int v2[MAX];
     int v3[MAX];
     int i;
     
     i=1;
     printf("Ingrese un número: ");
     scanf("%d",&v1[i]);
     
     printf("Ingrese un número: ");
     scanf("%d",&v2[i]);
     
     printf("Ingrese un número: ");
     scanf("%d",&v3[i]);
     
     i=2;
     v2[i]=v1[i-1];
     v1[i]=v3[i-1];
     v3[i]=v2[i-1];
     
     printf("Antes \na=%i \nb=%i \nc=%i \n",v1[1],v2[1],v3[1]);
     printf("Despues \na=%i \nb=%i \nc=%i \n",v1[2],v2[2],v3[2]);
 }