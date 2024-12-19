# -*- coding: utf-8 -*-
"""
2. Se presenta una versión modificada del algoritmo anterior con el siguiente contenido:
def es_primo2(n):
    i = 3
    res = True
    while(i < n):
        if(n % i == 0):                                
            res = False
        i = i + 2
    if(n == 1):
        res = False
    elif(n != 2 and n % 2 == 0):
        res = False
    return res
Utilice el análisis experimental para poder contabilizar el tiempo de ejecución del algoritmo 
para distintos valores en el intervalo [105, 106]. Vaya incrementando los valores de 
10000 en 10000 y muestre resultados.
"""

import time

def es_primo2(n):
    i = 3
    res = True
    while(i < n):
        if(n % i == 0):                                
            res = FalseS
        i = i + 2
    if(n == 1):
        res = False
    elif(n != 2 and n % 2 == 0):
        res = False
    return res


def main():
    
    for i in range(10**5,10**6,10000):
        
        inicio = time.time()
        
        es_primo2(i)
        
        fin = time.time()
        
        print("Cuando i vale",i,"se demora", (fin-inicio)*1000)
        
main()

