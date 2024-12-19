# -*- coding: utf-8 -*-
"""
6. Escriba un programa en Python que, dada una lista de nombres y una letra, 
devuelva una lista con todos los nombres que empiezan por dicha letra.
"""

def main():
    
    n = int(input("Ingresar cantidad de nombres: "))
    
    i = 0
    
    lista_nombres = []
    
    while i < n:
        
        nombre = input("Ingresar nombre: ")
        
        lista_nombres.append(nombre)
        
        i = i + 1
        
    letra = input("Ingresar letra: ")
    
    lista_inciales = []
    
    for i in range(len(lista_nombres)):
        
        if letra == lista_nombres[i][0]:
            
            lista_inciales.append(lista_nombres[i])
        
    print(lista_nombres)
        
    print("Los nombres con esa inicial son:",lista_inciales)
    
main()