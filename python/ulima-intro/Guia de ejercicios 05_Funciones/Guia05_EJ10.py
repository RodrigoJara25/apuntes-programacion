# -*- coding: utf-8 -*-
"""
10. Implemente una función en Python que reciba una lista de números enteros 
y un exponente “n”. Su función deberá modificar cada uno de los elementos de 
la lista, elevándolos a la potencia “n”.
"""

def potencia(lista, n):
    
    lista_potencia = []
    
    for i in range(len(lista)):
        
        elevar = (lista[i])**(n)
        
        lista_potencia.append(elevar)
    
    return lista_potencia


def main():
    
    cant = int(input("Ingresar la cantidad de números: "))
    
    n = int(input("Ingresar exponente: "))
    
    i = 0
    
    lista = []
    
    while i < cant:
        
        num = int(input("Ingresar número: "))
        
        lista.append(num)
        
        i = i + 1
    
    print(lista)
        
    final = potencia(lista, n)
    
    print(final)
    
main()