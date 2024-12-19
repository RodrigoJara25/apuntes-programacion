# -*- coding: utf-8 -*-
"""
9. Genere dos listas que tengan el mismo tamaño (solicitará el tamaño por teclado). 
En una de ellas almacene nombres de personas como cadenas, en la otra lista debe 
ir almacenando la longitud de cada nombre.
Luego del ingreso de datos, su programa debe mostrar por pantalla cada nombre y 
la longitud que tiene

"""

def main():
    
    tamaño = int(input("Ingresar la cantidad de nombres: "))
    
    i = 0
    
    lista_nombres = []
    
    lista_longitud = []
    
    while i < tamaño:
        
        nombre = input("Ingresar nombre: ")
        
        lista_nombres.append(nombre)
        
        longitud_nombre = len(nombre)
        
        lista_longitud.append(longitud_nombre)
        
        i = i + 1
        
    for i in range(len(lista_nombres)):
        
        print(lista_nombres[i]," ",lista_longitud[i])
    
main()