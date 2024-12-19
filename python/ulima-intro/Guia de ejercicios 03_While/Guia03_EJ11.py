# -*- coding: utf-8 -*-
"""
11. Implemente un programa que imprima los números del 1 al 100 y 
calcule la suma de todos los números para por un lado (suma par) y 
por otro lado la de los impares (suma impar).
"""

def main():
    
    i=0
    suma_par=0
    suma_impar=0
    while i<10:
        i=i+1
        print(i)
        if i%2 == 0:
            suma_par=suma_par+i
        else:
            suma_impar=suma_impar+i
    print("Suma par:",suma_par)
    print("Suma impar",suma_impar)
    
main()