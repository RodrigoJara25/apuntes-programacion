# -*- coding: utf-8 -*-
"""
4. Escriba un programa que solicite dos números, y que convierta el primer 
número a la base representada por el segundo número. (La base podría ser 
hasta 16, es decir se podría pasar hasta hexadecimal).
"""

def convertir(numero,base):
    
    if numero < base:
        return numero
    
    else:
        return str(convertir(numero//base, base)) + str(numero%base)


def main():
    
    numero = int(input("Ingresar número: "))
    
    base = int(input("Ingresar la base a la que desea convertir el número: "))
    
    if base <= 16:
        
        print(convertir(numero, base))

main()