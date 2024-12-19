# -*- coding: utf-8 -*-
"""
1. Escriba un programa que calcule la suma de los primeros “n” números a 
través del empleo de una función recursiva. El programa debe solicitar 
primero el número “n” y después de los cálculos imprimir la suma.

"""

def suma(n):
    
    if n==0:
        return 0
    
    else:
        return n + suma(n-1)




def main():
    
    n = int(input("Ingresar el último número: "))
    
    if n >=0:
    
        print("La suma es",suma(n))
    
main()