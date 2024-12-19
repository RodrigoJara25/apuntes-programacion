# -*- coding: utf-8 -*-
"""
13. Implemente un programa que permita imprimir y contar los números 
múltiplos de 3 que hay entre 1 y 100.

"""

def main():
    
    i = 1
    contador=0
    while i <= 100:
        if i % 3 == 0:
            print(i)
            contador = contador + 1
        i = i + 1
    print("Hay",contador,"números múltiplos de 3")
    
main()