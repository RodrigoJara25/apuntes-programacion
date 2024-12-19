# -*- coding: utf-8 -*-
"""
8. Un número es capicúa si se lee igual de izquierda a derecha y de derecha a 
izquierda. Por ejemplo: 232 es capicúa, pero 123 no lo es. Desarrolle un programa 
que imprima un mensaje diciendo si un número es capicúa o no. Para ello programe 
dos funciones con las siguientes definiciones:
invertir(n)
es_palindromo(n)



La función es_palindromo recibirá como argumento un número entero n y luego 
lo enviará a la función inversa(n), la cual retornará el número invertido. 
Luego comparará ambos números, el original y el invertido, e imprimirá un 
mensaje diciendo si el número cumple o no con ser capicúa.

"""

def invertir(n):
 
    lista = []
    
    for i in range(len(n)):
        
        lista.append(n[i])
        
    lista.reverse()
        
    return lista


def es_palindromo():
    
    
    n = input("Ingresar número: ")
    
    lista = []
    
    for i in range(len(n)):
        
        lista.append(n[i])
    
    if lista == invertir(n):
        
        print("Es capicua")
        
    else:
        
        print("No es capicua")
    
es_palindromo()