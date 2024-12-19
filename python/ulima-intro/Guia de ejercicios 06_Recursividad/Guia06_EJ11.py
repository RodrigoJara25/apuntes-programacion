# -*- coding: utf-8 -*-
"""
11. Implemente un programa que reciba una lista y un valor X, y calcule de 
forma recursiva la cantidad de elementos que son mayores que X.
"""

def mayores_x(lista,x):
    
    if len(lista) == 1:
        
        if lista[0] > x:
            return 1
        
        else:
            return 0
        
    else:
        
        if lista[len(lista)-1] > x:
            return 1 + mayores_x(lista[:len(lista)-1], x)
        
        else: 
            return mayores_x(lista[:len(lista)-1], x)


def main():
    
    lista = [10,20,30,40]
    
    x = 5
    
    print("La canitdad de números mayores a",x,"es",mayores_x(lista, x))
    
main()

