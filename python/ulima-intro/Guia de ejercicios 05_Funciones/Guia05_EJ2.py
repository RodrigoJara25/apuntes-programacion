# -*- coding: utf-8 -*-
"""
2. Escriba una función que tome un carácter y devuelva True si es una vocal, 
de lo contrario devuelva False. Verifique mayúsculas y minúsculas.
"""

def vocal(letra):
    
    lista_vocales = ["A", "E", "I", "O", "U"]
    
    letra_mayus = letra.upper()
    
    if letra_mayus in lista_vocales:
        
        return True
        
    else: 
        
        return False
    

def main():
    
    letra = input("Ingresar letra: ")
    
    print(vocal(letra))
    
main()