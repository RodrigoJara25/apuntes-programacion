# -*- coding: utf-8 -*-
"""
14. Implemente un programa que determine el conjunto de números que hay entre 
la unidad y un determinado número introducido por el teclado. Tomando en cuenta 
el grupo de números mencionado, su programa debe imprimir, sumar y contar los 
números del grupo que son a la vez múltiplos de 2 y de 3.
"""

def main():
    
    n = float(input("Ingrese un número: "))
    
    i = 1
    
    suma = 0
    
    contador = 0
    
    while 1 <= i <= n:
        
        if i % 2 == 0 and i % 3 == 0:
            
            print(i)
            
            suma = suma + i
            
            contador = contador + 1
            
        i = i + 1
        
    print("El cantidad de números múltiplos de 2 y 3 es", contador)    
    
    print("La suma de los es números múltiplos de 2 y 3 es", suma)
    
main()