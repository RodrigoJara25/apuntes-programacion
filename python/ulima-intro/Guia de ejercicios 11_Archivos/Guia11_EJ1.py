# -*- coding: utf-8 -*-
"""
1. Escriba un programa en Python, que lea un archivo llamado “Archivo01.txt”, 
solicite al usuario un número N e imprima las primeras N líneas del archivo. 
Considere que el programa imprimirá como máximo 11 líneas del archivo.
"""


def main():
    
    archivo=open("Archivo01.txt","r")
    
    N=int(input("Ingresar cantidad de lineas: "))
    cont=0
    for linea in archivo:
        print(linea)
        cont=cont+1
        if cont==N:
            break    
    
    archivo.close()
    
main()