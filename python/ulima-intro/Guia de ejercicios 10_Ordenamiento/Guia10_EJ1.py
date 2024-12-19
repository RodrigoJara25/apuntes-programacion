# -*- coding: utf-8 -*-
"""
1. Implemente un programa que genere 100 números aleatorios (entre 0 y 9) y los 
ingrese a una lista. Posteriormente, ordene los valores e ingrese los primeros 50 en una nueva lista. 
Utilice el ordenamiento de burbuja.
"""

import random

def burbuja(lista):
    
    for i in range(0,len(lista)-1):
        for j in range(i+1,len(lista)):
            if lista[i]>lista[j]:
                aux=lista[i]
                lista[i]=lista[j]
                lista[j]=aux
    return lista

def main():
    
    lista=[]
    for i in range(0,100):
        lista.append(random.randint(0, 9))
    print(lista)
    print("ordenada",burbuja(lista))
    print("primeros 50",burbuja(lista[:50]))
    
main()