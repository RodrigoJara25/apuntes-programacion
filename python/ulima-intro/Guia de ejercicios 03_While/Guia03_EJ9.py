# -*- coding: utf-8 -*-
"""
9. Implemente un programa que permita introducir un número entero positivo 
a través del teclado e imprima en pantalla un mensaje indicando si es par o impar. 
El programa deberá continuar leyendo hasta que el usuario ingrese un valor -1.
"""

def main():
    
    n = int(input("Ingresar un número: "))
    while n >= 0:
        if n % 2 == 0:
            print("Es par")
            n = int(input("Ingresar un número: "))
        else:
            print("Es impar")
            n = int(input("Ingresar un número: "))
    
    
main()