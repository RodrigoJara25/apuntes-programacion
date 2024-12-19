# -*- coding: utf-8 -*-
"""
7. Se le pide que escriba un programa que calcule de forma recursiva los 
primeros “m” términos de la siguiente serie:

Al finalizar el programa debe imprimir la sumatoria obtenida.

"""

def primeros_m(m):
    
    if m==1:
        return 1
    
    else:
        return (1/m) + primeros_m(m-1)


def main():
    
    m = int(input("Ingresar la cantidad de términos que desea: "))
    
    print("La suma de los",m,"primeros términos es",primeros_m(m))
    
main()