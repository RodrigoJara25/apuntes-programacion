# -*- coding: utf-8 -*-
"""
7. Escriba una función llamada "eliminar_duplicados" que reciba una lista y 
devuelva una nueva lista con los elementos únicos (que no estén repetidos) 
de la lista original.
"""

def main():
    
    cantidad = int(input("Ingresar la cantidad de elementos: "))
    
    i = 0
    
    lista1 = []
    
    while i < cantidad:
        
        elemento = input("Ingresar elemento: ")
        
        lista1.append(elemento)
        
        i = i + 1
        
    lista_final = []
        
    for i in range(len(lista1)):
        
        if lista1[i] in lista_final:
            pass
        
        else:
            lista_final.append(lista1[i])
    
    print("Lista completa:", lista1)
    
    print("Lista sin duplicados:",lista_final)
    
    
    
main()