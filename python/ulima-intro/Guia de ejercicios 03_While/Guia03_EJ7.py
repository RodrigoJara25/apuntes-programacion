# -*- coding: utf-8 -*-
"""
7. Implemente un programa que permita calcular e imprimir el producto siguiente:
P = (1*2*3*4*5*…*20) 

"""

def main():
    
    i=1
    producto=1
    while i<=20:
        producto=producto*i
        i=i+1
    print(producto)
       
main()
