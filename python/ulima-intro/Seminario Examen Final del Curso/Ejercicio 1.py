# -*- coding: utf-8 -*-
"""
1. (4 puntos) Escribir un programa en Python que permita leer el archivo “Texto.txt” 
y genere un diccionario donde la clave es el número de fila y el valor la cantidad de 
palabras de esa línea. Ejemplo dicc={1:20,2:15,3:45}
"""

def main():
    
    archivo=open("Texto.txt","r")
    
    dicci={}
    llave=0
    for linea in archivo:
        llave=llave+1
        palabras=linea.split()      #PALABRAS
        dicci.setdefault(llave,len(palabras))
    print(dicci)
    
    archivo.close()
    
main()