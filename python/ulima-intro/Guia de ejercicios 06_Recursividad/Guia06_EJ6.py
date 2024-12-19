# -*- coding: utf-8 -*-
"""
6. Escriba un programa que solicite un número decimal (en base 10) y que calcule la suma 
de los dígitos que lo componen. Al finalizar el programa debe imprimir la suma.
"""

def suma_digitos(num):
    
    if num < 10:
        return num
    
    else:
        return suma_digitos(num//10) + num%10


def main():
    
    num = int(input("Ingresar número: "))
    
    print("La suma es", suma_digitos(num))
    
main()