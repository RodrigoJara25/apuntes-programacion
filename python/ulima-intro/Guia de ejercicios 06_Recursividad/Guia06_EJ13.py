# -*- coding: utf-8 -*-
"""
13. Escribir un programa con funciones recursivas que permita sumar si el número 
es par, los 10 anteriores números pares, si es impar los 5 anteriores números impares.
"""

def sumar_parimpar(num, cant):
    
    if cant == 0:
        return 0
    
    else:
        return num + sumar_parimpar(num-2, cant-1)


def main():
    
    num = 12

    cantpar = 10
    
    cantimpar = 5
    
    if num%2==0:
        
        print("Suma pares: ",sumar_parimpar(num,cantpar))
    
    else:
        
        print("Suma impares: ",sumar_parimpar(num,cantimpar))
    
main()