# -*- coding: utf-8 -*-
"""
2. Escriba un programa que calcule la potencia de un número a través del 
empleo de una función recursiva. El programa debe solicitar primero el número 
que representa la base y luego el número que representa al exponente. Al 
finalizar el programa, se debe imprimir la potencia solicitada. 
"""

def potencia(base,exponente):
    
    if exponente == 1:
        return base
    
    else:
        return base * potencia(base,(exponente-1))


def main():
    
    base = int(input("Ingresar el número base: "))
    
    exponente = int(input("Ingresar el exponente: "))
    
    print(potencia(base, exponente))
    
main()