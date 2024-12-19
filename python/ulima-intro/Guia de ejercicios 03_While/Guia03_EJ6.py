# -*- coding: utf-8 -*-
"""
6. Implemente un programa que permita calcular e imprimir la suma siguiente: 
S = 1 + 4 + 7 + 10 + … + 52

"""

def main():
    
    i=1
    suma=0
    while i <= 52:
        suma=suma+i
        i=i+3
    print(suma)
    
main()