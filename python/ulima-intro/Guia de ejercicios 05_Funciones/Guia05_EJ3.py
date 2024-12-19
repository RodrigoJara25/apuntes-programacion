# -*- coding: utf-8 -*-
"""
3. Escriba una función sum() y una función multip() que sumen y multipliquen 
respectivamente todos los números que el usuario ingrese hasta que se digite 
cero. Luego de leer dicho valor, mustre en pantalla el resultado final.
"""

def sum(lista):
    
    suma = 0
    
    for i in range(len(lista)):
        
        suma = suma + lista[i]
    
    return suma
    
    
def multip(lista):
    
    multip = 1
    
    for i in range(len(lista)):
        
        multip = multip * lista[i]
        
    return multip


def main():
    
    num = float(input("Ingresar número: "))
    
    lista_num = []
    
    while num != 0:
        
        lista_num.append(num)
        
        num = float(input("Ingresar número: "))
        
    print("La suma es", sum(lista_num))
    
    print("La multiplicación es", multip(lista_num))
    
main()