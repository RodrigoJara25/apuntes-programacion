# -*- coding: utf-8 -*-
"""
4. Escriba una función cargar_datos que reciba un nombre de archivo y lo procese. 
Cada línea del archivo tendrá 2 palabras separadas por un espacio. El programa debe 
devolver un diccionario que considere, por cada línea, la primera palabra como clave 
y la segunda como valor.
"""

def main():
    
    archivo=open("ArchivoNum.txt","r")
    
    dicci={}
    for linea in archivo:
        palabras=linea.split()
        dicci.setdefault(palabras[0],palabras[1])
    print(dicci)
    
    archivo.close()
    
main()