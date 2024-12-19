# -*- coding: utf-8 -*-
"""
10. Implemente un programa que calcule de forma recursiva el elemento máximo 
de una lista dada como parámetro.
"""

def elemento_maximo(lista):
    
    if len(lista)==1:
        return lista[0]
    
    else:
        m = elemento_maximo(lista[1:]) 
        if m > lista[0]:
            return m
        else:
            return lista[0]

def main():
    
    lista = [50, 20, 40, 70]
    
    print("Elemento máximo es",elemento_maximo(lista))
    
main()