/******************************************************************************
Problema N°03:
Escribir en lenguaje C un programa que cumpla con las siguientes indicaciones:
1. Solicitar por teclado dos números (datos enteros) y almacenarlos en dos variables, llamadas v1 y v2
2. Intercambie los valores de las variables
3. Mostrar en pantalla los valores de las variables antes y después del intercambio
*******************************************************************************/
 #include <stdio.h>
 #define MAX 32
 
 int main()
 {
     int v1[MAX];
     int v2[MAX];
     int i;
     
     i=1;
     printf("Ingrese un número: ");
     scanf("%d",&v1[i]);
     
     printf("Ingrese un número: ");
     scanf("%d",&v2[i]);
     
     i=2;
     v1[i]=v2[i-1];
     v2[i]=v1[i-1];
     
     printf("Antes \na=%i \nb=%i \n",v1[1],v2[1]);
     printf("Después \na=%i \nb=%i \n",v1[2],v2[2]);
 }