# -*- coding: utf-8 -*-
"""
5. Escriba un programa que genere una lista con 200 números aleatorios entre 
1 y 20, y luego elimine los elementos que se encuentren repetidos. Debe generar 
una nueva lista.
"""

import random

def main():
    
    i = 0
    
    lista = []
    
    lista_no_repetidos = []
    
    while i < 200:
        
        numero = random.randint(1, 20)
        
        lista.append(numero)
        
        i = i + 1
        
    for i in range(len(lista)):
        
        if lista[i] in lista_no_repetidos:
            pass
        
        else:
            lista_no_repetidos.append(lista[i])
        
        
    
    print("Lista completa:",lista)
    
    print("Lista sin repetidos:",lista_no_repetidos)
    
    
main()