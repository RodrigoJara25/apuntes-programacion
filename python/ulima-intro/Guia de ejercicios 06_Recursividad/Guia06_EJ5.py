# -*- coding: utf-8 -*-
"""
5. Escriba un programa que calcule los términos de la Serie de Fibonacci 
mediante el uso de una función recursiva.
Considere que el término “n” de la serie está dado por:   f(n) = f(n-1) + f(n-2).
Además, debe tener en cuenta que  f(0) = 0  y que  f(1) = 1. 

"""

def fibo(pos):
    
    if pos==0:
        return 0
    
    elif pos==1:
        return 1
    
    else:
        return fibo(pos-1) + fibo(pos-2)


def main():
    
    pos = int(input("Ingresar posición del valor que desea encontrar: "))
    
    print(fibo(pos))
    
main()