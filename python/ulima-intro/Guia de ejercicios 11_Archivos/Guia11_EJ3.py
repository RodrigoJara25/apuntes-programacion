# -*- coding: utf-8 -*-
"""
3. Escriba un programa en Python, que lea un archivo y muestre cuantas veces está 
escrita la palabra “UNA”, sea en mayúsculas o minúsculas.
"""


def main():
    
    archivo=open("Archivo01.txt","r")
    
    contador=0
    for linea in archivo:
        palabras=linea.split()
        for i in palabras:
            if i=="UNA" or i=="una":
                contador=contador+1
    print(contador)
    
    archivo.close()
    
main()