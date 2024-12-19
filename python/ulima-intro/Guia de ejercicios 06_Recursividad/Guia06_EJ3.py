# -*- coding: utf-8 -*-
"""
3. Escriba un programa que solicite un número y que calcule su factorial 
mediante el uso de una función recursiva.
Considere que   n! = n * (n-1)! , y que  0! = 1

"""

def factorial(n):
    
    if n == 1:
        return 1
    else:
        return n * factorial(n-1)


def main():
    
    n = int(input("Ingresar número: "))
    
    print("El factorial de",n,"es",factorial(n))
    
main()