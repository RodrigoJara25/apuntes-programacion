# -*- coding: utf-8 -*-
"""
8. Implemente un programa que permita calcular e imprimir la suma siguiente:
S = 50 + 48 + 46 + 44 + … + 20

"""

def main():
    
    i=50
    suma=0
    while i>=20:
        suma=suma+i
        i=i-2
    print(suma)
      
main()