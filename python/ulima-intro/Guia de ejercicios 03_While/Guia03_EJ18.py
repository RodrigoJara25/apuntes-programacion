# -*- coding: utf-8 -*-
"""
18. Implemente un programa que lea desde el teclado una cadena de caracteres, 
un valor “n” que representa el orden de una matriz y permita mostrar el siguiente 
patrón en pantalla (se muestran resultados para n = 3 🡪 matriz de 3 x 3).
Si  n = 3

palabra = "hola"

hola  hola  hola
hola  hola  hola
hola  hola  hola
"""

def main():
    
    palabra = input("Ingresar una palabra: ")
    
    n = int(input("Ingresar el orden de la matriz cuadrada: "))
    
    i = 0
    
    while i < n:
        
        print((palabra+" ")*n)
        
        i = i + 1
    
main()