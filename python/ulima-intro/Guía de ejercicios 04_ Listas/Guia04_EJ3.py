# -*- coding: utf-8 -*-
"""
3. Escriba un programa que lea 10 números enteros y luego los muestre en orden 
inverso al que fueron ingresados.
"""

def main():
    
    i = 0
    
    lista = []
    
    while i < 10:
        
        n = int(input("Ingrese un número entero: "))
        
        i = i + 1
    
        lista.append(n)
        
    lista.reverse()
        
    print(lista)
    
main()