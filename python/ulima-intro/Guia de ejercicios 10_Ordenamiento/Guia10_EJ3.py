# -*- coding: utf-8 -*-
"""
3. Implemente un programa en Python que reciba un valor N, genere N números aleatorios 
entre 2 y 300 y los agregue a una lista. Luego ordene la lista de menor a mayor utilizando 
el ordenamiento burbuja. Agregue a una nueva lista aquellos valores que sean primos. 
Finalmente, muestre el contenido de ambas listas e indique cuántos números están registrados 
en la lista original y cuántos números están en la lista de números primos.
"""

import random

def burbuja(lista):
    
    for i in range(0,len(lista)-1):
        for j in range(i+1,len(lista)):
            if lista[i]>lista[j]:
                aux=lista[i]
                lista[i]=lista[j]
                lista[j]=aux
    return lista

def primo(lista):
    listaPrimos=[]
    for i in range(0,len(lista)):
        divisores=0
        for j in range(1,lista[i]+1):
            if lista[i]%j==0:
                divisores=divisores+1
        if divisores==2:
            listaPrimos.append(lista[i])
    return listaPrimos


def main():
    
    N = int(input("Ingresar número: "))
    lista=[]
    for i in range(0,N):
        lista.append(random.randint(2, 300))
    print(lista)
    print("ordenado",burbuja(lista))
    print(primo(lista))
    
main()