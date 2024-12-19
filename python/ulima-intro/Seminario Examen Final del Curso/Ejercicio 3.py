# -*- coding: utf-8 -*-
"""
3.- (4 puntos) Escriba un programa que dada una lista inicial con valores numéricos 
permita buscar mediante al algoritmo secuencial un valor ingresado por el usuario, a 
continuación, elimine ese valor trabajando con las posiciones de la lista, todos los 
valores que están a la derecha del valor a eliminar, tienen que pasar a la posición 
anterior. Solo utilice las funciones pop() o remove(), para eliminar el último valor. 
Ejemplo
Lista inicial [10,15,18,20,58,26,22]
Valor a buscar para eliminar: 20
Lista final [10,15,18,58,26,22 ]
"""


def BusqSecuencial(lista,num):
    indice=-1
    for i in range(0,len(lista)):
        if num==lista[i]:
            indice=i
    return indice

def main():
    

    lista=[10,15,18,20,58,26,22]
    num=int(input("Ingresar número a buscar: "))
    
    if BusqSecuencial(lista, num)==-1:
        print("No se encontró el número")
        
    else:
        indice=BusqSecuencial(lista, num)
        print("Se encontró el número en la posición",indice)
        
        for j in range(indice,len(lista)-1):
            lista[j]=lista[j+1]
        lista.pop(len(lista)-1)
        
        
        print("la nueva lista es: ",lista)
    
main()




