# -*- coding: utf-8 -*-
"""
4. Escriba un programa en Python que genere 300 números aleatorios entre 2 y 3000. 
Debe ingresar a una lista aquellos valores sean primos y ordenar la lista de mayor 
a menor utilizando el método sort().
Finalmente, muestre cuántos números de la lista son mayores que 100 utilizando 
búsqueda secuencial.

"""

import random

def primos(lista):
    
    listaPrimos=[]
    for i in range(0,len(lista)):
        divisores=0
        j = 1
        while j<=lista[i]:
            if lista[i]%j==0:
                divisores=divisores+1
            j=j+1
        if divisores==2:
            listaPrimos.append(lista[i])
    return listaPrimos

def BusqSecuencial(lista):
    
    listaMayores=[]
    for i in range(0,len(lista)):
        if lista[i]>100:
            listaMayores.append(lista[i])
    return listaMayores

def main():
    
    lista=[]
    for i in range(0,300):
        lista.append(random.randint(2, 3000))
    #print(lista)
    listaPrimos=primos(lista)
    listaPrimos.sort()
    print("primos: ",listaPrimos)
    print("mayores a 100",BusqSecuencial(listaPrimos))
    
main()