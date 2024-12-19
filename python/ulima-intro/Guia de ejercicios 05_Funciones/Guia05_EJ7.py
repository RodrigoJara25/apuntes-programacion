# -*- coding: utf-8 -*-
"""
7. 
Escriba una función con la siguiente definición:
           imprimirMatriz(n)
Lo que hará esta función será imprimir una matriz cuadrada de dimensiones n x n. 
Considere que cada elemento de la matriz será el carácter asterisco (*).

"""


def imprimirMatriz(n):
    
    
    filas = n * "*"
    i = 0
    while i < n:
        print(filas)
        i = i + 1


def main():
    
    n = int(input("Ingresar las filas y columnas de la matriz: "))
    
    imprimirMatriz(n)
    
main()