# -*- coding: utf-8 -*-
"""
1. Escriba una función que tome una lista de números y devuelva la suma 
acumulada, es decir, una nueva lista donde el primer elemento es el mismo, 
el segundo elemento es la suma del primero con el segundo, el tercer elemento 
es la suma del resultado anterior con el tercer elemento y así sucesivamente. 
Por ejemplo, la suma acumulada de [1,2,3] es [1, 3, 6].
"""

def main():
    
    n = int(input("Ingresar cantidad de números: "))
    
    i = 0
    
    lista = []
    
    lista_suma = []
    
    suma = 0
    
    while i < n:
        
        numero = int(input("Ingresar número: "))
        
        lista.append(numero)
        
        suma = suma + numero
        
        lista_suma.append(suma)
    
        i = i + 1
        
    print(lista)
    
    print(lista_suma)
    
main()