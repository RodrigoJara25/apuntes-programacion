# -*- coding: utf-8 -*-
"""
9. Implemente un programa que calcule de forma recursiva la suma 
de elementos de una lista dada como parámetro.
"""

def suma(lista):
    
    if len(lista)==1:
        return lista[0]
    
    else:
        return lista[len(lista)-1] + suma(lista[:len(lista)-1])


def main():
    
    cant = int(input("Ingresar cantidad de elementos de la lista: "))
    
    lista = []
    
    for i in range(0,cant):
        
        num = int(input("Ingresar un número: "))
        
        lista.append(num)
    
    print(lista)
    
    print("La suma de los elementos de la lista es", suma(lista))
    
main()