# -*- coding: utf-8 -*-
"""
5. Implemente un programa que permita calcular e imprimir la suma: 1+2+3+4+5+…+50
"""

def main():

    i = 0
    suma = 0
    while i < 50:
        i = i + 1
        suma = suma + i
    print(suma)
    
main()