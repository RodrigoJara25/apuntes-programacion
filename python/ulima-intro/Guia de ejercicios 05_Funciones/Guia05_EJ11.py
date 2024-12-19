# -*- coding: utf-8 -*-
"""
11. Implemente una función en Python que reciba una lista L y retorne una nueva 
lista considerando solamente aquellos elementos que sean mayores que el elemento 
situado a su izquierda y que el elemento situado a su derecha. 
Ejemplo:
L = [10, 32, 22, 55, 21]
Para estos valores el programa retornará [32, 55].
El valor 32 es mayor que 10 y 22. De igual forma, el valor 55 es mayor que 22 y 21.

"""

def mayor(L):
    
    lista = []
    for i in range(1,len(L)):
        if L[i-2] < L[i-1] and L[i-1] > L[i]:
            lista.append(L[i-1])
            
    return lista
            

def main():
    cant = int(input("Ingresar cantidad de elementos: "))
    i = 0
    L = []
    while i < cant:
        n = int(input("Ingresar un número: "))
        i=i+1
        L.append(n)
    print(L)
    print(mayor(L))
    
main()