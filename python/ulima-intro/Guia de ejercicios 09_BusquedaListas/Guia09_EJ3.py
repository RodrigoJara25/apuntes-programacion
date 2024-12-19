# -*- coding: utf-8 -*-
"""
3. Escriba un programa que solicite al usuario ingresar un determinado número de 
pesos (valores enteros) hasta que se ingrese 0 y los almacene en una lista.
El programa debe mostrar el promedio de los pesos ingresados y ordenar la lista 
(para ello puede utilizar el método sort).
Finalmente, debe mostrar un mensaje en caso el valor 50 se encuentre en la lista. 
Para ello utilice el algoritmo de búsqueda binaria.

"""
def BusqBinaria(lista,buscar):
    indice=-1
    izq=0
    der=len(lista)-1
    while izq<=der:
        med=(izq+der)//2
        if lista[med]==buscar:
            indice=med
            break
        else:
            if lista[med]>buscar:
                der=med-1
            else:
                izq=med+1
    return indice
        

def main():
    
    lista=[]
    num = int(input("Ingresar número: "))
    suma=0
    while num!=0:
        lista.append(num)
        suma=suma+num
        num = int(input("Ingresar número: "))
    promedio=suma/len(lista)
    lista.sort()
    print("promedio: ",promedio)
    print(lista)
    if BusqBinaria(lista, 50)==-1:
        print("No se encontró el número 50")
    else:
        print("Si se encontró el número 50")
        
main()