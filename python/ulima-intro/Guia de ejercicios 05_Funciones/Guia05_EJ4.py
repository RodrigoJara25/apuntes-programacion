# -*- coding: utf-8 -*-
"""
4. Implemente una función que reciba dos números enteros a y b, y calcule 
el resultado de ab utilizando operaciones de multiplicación. Tome en cuenta 
que tanto a como b también podrían tomar valores negativos
"""

def multip(a, b):
    
    multiplicacion = a**b
    
    return multiplicacion


def main():
    
    a = float(input("Ingresar un número: "))
    
    b = float(input("Ingresar un número: "))
    
    print(multip(a, b))
    
main()