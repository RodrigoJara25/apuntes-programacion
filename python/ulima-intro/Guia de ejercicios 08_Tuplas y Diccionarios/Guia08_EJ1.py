# -*- coding: utf-8 -*-
"""
1. Escriba una función que reciba una lista de tuplas, y devuelva un diccionario 
en donde cada elemento se asocie a una tupla de la lista. Por cada tupla, debe crear 
un elemento en el diccionario considerando que la clave será el primer elemento de la
 tupla y el valor será el segundo.
"""


def dicci(lista):
    
    diccionario = {}
    
    for i in lista:
        
        diccionario.setdefault(i[0], i[1])
        
    return diccionario


def main():
    
    lista = [("a",100),("b",200),("c",300)]
    
    print(dicci(lista))
    
main()