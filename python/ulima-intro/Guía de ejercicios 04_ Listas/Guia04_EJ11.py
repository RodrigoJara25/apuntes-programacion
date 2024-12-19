# -*- coding: utf-8 -*-
"""
11. Realice la búsqueda de un número ingresado como parámetro en la lista 
ordenada “2, 4, 6, 8, 10, 12, 14, 16, 18, 20”. Si se encuentra, muestre el 
mensaje “Se encontró el número”, en caso contrario muestre: “No se encontró.”. 
Adicionalmente, responda a la pregunta: ¿Necesita recorrer la lista completa 
para poder realizar la búsqueda de forma exitosa? Justifique su respuesta.
"""

def main():
    
    lista = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
    
    numero = int(input("Ingresar número que desea buscar: "))
    
    for i in range(len(lista)):
        
        if numero == lista [i]:
            
            encontrado = True
        
        else:
            
            encontrado = False
    
    if encontrado == True:
        
        print("Se encontró")
        
    else:
        
        print("No se encontró")
    
    
""" 
    if numero in lista:
        
        print("Se encontró")
        
    else:
        
        print("No se encontró")
"""
    
    
    
    
    
main()