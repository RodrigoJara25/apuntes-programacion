# -*- coding: utf-8 -*-
"""
2. Implemente un programa que solicite al usuario ingresar un determinado número 
de pesos (valores enteros) hasta que se ingrese 0, calcule el promedio de valores, 
agregue dicho valor al final de la lista y finalmente ordene dicha lista. Utilice el 
ordenamiento Quicksort.
"""

def Quicksort(lista):
    
    if len(lista)<=1:
        return lista
    else:
        pivot=lista[0]
        listaMa=[]
        listaMe=[]
        listaIgua=[]
        for i in range(0,len(lista)):
            if lista[i]>pivot:
                listaMa.append(lista[i])
            elif lista[i]<pivot:
                listaMe.append(lista[i])
            else:
                listaIgua.append(lista[i])
        listaMe=Quicksort(listaMe)
        listaMa=Quicksort(listaMa)
        return listaMe+listaIgua+listaMa

def main():
    
    lista=[]
    suma=0
    num = int(input("Ingresar número: "))
    while num!=0:
        lista.append(num)
        suma=suma+num
        num = int(input("Ingresar número: "))
    promedio=suma/len(lista)
    print(lista)
    print("promedio",promedio)
    print("ordenado",Quicksort(lista))
    
main()