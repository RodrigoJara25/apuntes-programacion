# -*- coding: utf-8 -*-
"""
6. Escriba un programa que tenga una función que retorne factorial de un 
número ingresado por consola.
"""


def factorial(num):
    
    i = 1
    
    fact = 1
    
    while i <= num:
        
        fact = fact * i
        
        i = i + 1
    
    return fact


def main():
    
    num = int(input("Ingresar un número: "))
    
    print("El factorial es", factorial(num))
    
main()