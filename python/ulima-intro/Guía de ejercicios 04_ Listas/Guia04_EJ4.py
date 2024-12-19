# -*- coding: utf-8 -*-
"""
4. Escriba un programa que genere 100 números aleatorios, calcule el 
promedio y luego cuente cuántos de estos números están por encima del 
promedio y cuantos están por debajo del promedio.
"""

import random

def main():
    
    i = 0
    
    lista = []
    
    while i < 3:
     
        n = random.randint(0, 10)
     
        lista.append(n)
        
        i = i + 1
        
    suma = 0
        
    for i in range(len(lista)):
        
        suma = suma + lista[i]
        
    promedio = suma / (len(lista))
    
    contador_up = 0
    
    contador_down = 0
    
    for i in range(len(lista)):
        
        if lista[i] > promedio:
            
            contador_up = contador_up + 1
            
        elif lista[i] < promedio:
            
            contador_down = contador_down + 1
    
    print(lista)
    
    print("El promedio es",promedio)    
    
    print("Arriba del promedio:",contador_up)
    
    print("Debajo del promedio:", contador_down)
     
main()