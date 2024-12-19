# -*- coding: utf-8 -*-
"""
5. Escriba una función que devuelva la media o promedio de dos números 
solicitados al usuario.
"""

def promedio(a, b):
    
    prom = (a + b) / 2  
    
    return prom


def main():
    
    a = int(input("Ingresar un número: "))
    b = int(input("Ingresar un número: "))
    
    result = promedio(a, b)
    
    print(result)
    
main()