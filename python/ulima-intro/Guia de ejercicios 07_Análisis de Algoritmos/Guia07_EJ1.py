# -*- coding: utf-8 -*-
"""
1. Se tiene el siguiente bloque de código que permite determinar si un número es primo o no:
def es_primo1(n):
    cant = 0
    for i in range(1, n + 1):
        if(n % i == 0):
            cant = cant + 1
    if(cant == 2):
        return True
    else:
        return False


Utilice el análisis experimental para poder contabilizar el tiempo de ejecución del algoritmo 
para distintos valores en el intervalo [104, 105]. Vaya incrementando los valores de 500 en 500 
y muestre resultados.
"""

import time

def es_primo1(n):
    cant = 0
    for i in range(1, n + 1):
        if(n % i == 0):
            cant = cant + 1
    if(cant == 2):
        return True
    else:
        return False
    
def main():
    
    for i in range(10**4,10**5,500):
        
        inicio = time.time()
        
        es_primo1(i)
        
        fin = time.time()
        
        print("Cuando i vale",i,"se demora",(fin-inicio)*1000)
    
main()