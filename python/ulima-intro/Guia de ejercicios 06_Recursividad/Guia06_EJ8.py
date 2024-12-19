# -*- coding: utf-8 -*-
"""
8.  Se le pide que escriba un programa que calcule de forma recursiva los 
primeros “m” términos de la siguiente serie:

Al finalizar el programa debe imprimir la sumatoria obtenida.

"""

def suma_m(m):
    
    if m==1:
        return 1/2
    
    else:
        return 1/(2**m) + suma_m(m-1)


def main():
    
    m = int(input("Ingresar cantidad de términos: "))
    
    print("La suma de los primeros",m,"términos es",suma_m(m))

main()