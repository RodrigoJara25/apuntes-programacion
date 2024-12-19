# -*- coding: utf-8 -*-
"""
17. Implemente un programa que permita imprimir en pantalla el siguiente 
patrón tomando como entrada un valor “n” que determina la cantidad de líneas 
que se imprimirán (el ejemplo muestra lo que debe mostrarse para 
para n = 3 🡪 3 líneas):

***     #3
*****        #5
*********        #9

"""

def main():
    
    n = int(input("Ingresar el número de filas: "))
    
    i = 1
    
    numero_por_fila = 0
    
    while i <= n:
        
        numero_por_fila = 1 + 2**i
        
        print("*"*numero_por_fila)
    
        i = i + 1
    
main()