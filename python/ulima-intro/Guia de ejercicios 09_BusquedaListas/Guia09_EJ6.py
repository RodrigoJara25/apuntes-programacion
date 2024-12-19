# -*- coding: utf-8 -*-
"""
6. Escriba un programa en Python donde se generen 50 números aleatorios entre 1 y 500, y 
los agregue a una lista. Finalmente, solicite un numero al usuario y muestre un mensaje si el 
número ingresado o un múltiplo de dicho número se encuentra en la lista. Utilice el algoritmo 
de búsqueda secuencial.
"""
import random

def BusqSecuencial(lista,num):
    
    encontrado=False
    for i in range(0,len(lista)):
        if lista[i]==num:
            encontrado=True
        if lista[i]%num==0:
            encontrado=True
    return encontrado

def main():
    
    lista=[]
    for i in range(0,50):
        lista.append(random.randint(1, 500))
    print(lista)
    num = int(input("Ingrese número a buscar: "))
    if BusqSecuencial(lista, num)==True:
        print("Se encontró el número o su múltiplo en la lista")
    else:
        print("No se encontró")
    
main()