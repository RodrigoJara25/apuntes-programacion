# -*- coding: utf-8 -*-
"""
1. Defina una función max() que tome como argumentos dos números y devuelva 
el mayor de ellos. Luego genere una nueva función que pueda recibir 3 números 
en vez de dos.
"""
"""
def max(a, b):
    
    if a > b:
        
        mayor = a
        
    else:
        
        mayor = b
        
    return mayor
"""
def max1(a, b, c):
    
    lista = [a, b, c]

    mayor = max(lista)

    return mayor



def main():
    
    a = float(input("Ingresar un número: "))
    
    b = float(input("Ingresar un número: "))
    
    c = float(input("Ingresar un número: "))
    
    print("El mayor es", max1(a, b, c))
    
main()