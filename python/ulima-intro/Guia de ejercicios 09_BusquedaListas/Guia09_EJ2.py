# -*- coding: utf-8 -*-
"""
2. Escriba un programa que genere 100 números aleatorios (entre 0 y 9) y los ingrese a una lista. 
Posteriormente debe buscar los valores pares e ingresar estos números a una nueva lista. Utilice 
una búsqueda secuencial.
"""
import random

def BusqSecuencial(lista):
    listaPar=[]
    for i in range(0,len(lista)):
        if i%2==0:
            listaPar.append(lista[i])
    return listaPar

def main():
    lista=[]
    for i in range(0,10):
        lista.append(random.randint(0, 9)) 
    #print(lista)
    print(BusqSecuencial(lista))
    
main()