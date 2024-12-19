# -*- coding: utf-8 -*-
"""
4. Implemente una función que permita mostrar dos opciones de ingreso de datos al usuario. 
La primera de ellas es “Ingreso Automático” y la segunda de ellas es “Ingreso Manual”. 
Para la opción de ingreso automático, el programa solicitará al usuario el ingreso de un 
número entero “n” y generará una lista con “n” valores aleatorios entre 1 y 200. Para el 
caso del ingreso manual, el usuario ingresará un entero “n”, el programa leerá del teclado 
cada uno de estos “n” valores de forma individual y los agregará a una lista. 

Para ambas opciones de ingreso de datos, el programa debe ordenar los valores de la lista generada 
utilizando el algoritmo de la burbuja. Finalmente, debe mostrar en pantalla el valor de la mediana 
para el conjunto de datos. Recuerde que, en la lista ordenada, la mediana será el valor central 
cuando el tamaño de la lista es impar y el promedio de los 2 valores centrales cuando el tamaño de 
la lista es par.

"""
import random
import statistics

def burbuja(lista):
    for i in range(0,len(lista)-1):
        for j in range(i+1,len(lista)):
            if lista[i]>lista[j]:
                aux=lista[i]
                lista[i]=lista[j]
                lista[j]=aux
    return lista

def main():
    
    print("Cuál opción desea?")
    print("1: Ingreso Automático")
    print("2: Ingreso Manual")
    opcion=int(input("Ingresar opción que desea: "))
    if opcion==1:
        lista=[]
        n=int(input("Ingresar cantidad de números a generar: "))
        for i in range(0,n):
            lista.append(random.randint(1, 200))
        lista=burbuja(lista)
        print(lista)
        print("La mediana es: ",statistics.median(lista))
    elif opcion==2:
        lista=[]
        n=int(input("Ingresar número: "))
        while n!=777:
            lista.append(n)
            n=int(input("Ingresar número: "))
        lista=burbuja(lista)
        print(lista)
        print("La mediana es: ",statistics.median(lista))
    
main()