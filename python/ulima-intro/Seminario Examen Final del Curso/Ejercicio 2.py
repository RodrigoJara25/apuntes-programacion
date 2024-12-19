# -*- coding: utf-8 -*-
"""
2.- (4 puntos) Escriba un programa que lea el archivo “nombres.txt” e ingrese los nombres 
a una lista, luego, realizar una búsqueda binaria de un nombre ingresado por el usuario en 
la lista, recuerde primero deberá ordenar la lista con el ordenamiento Quicksort. Finalmente 
crear el archivo “salida.csv” donde figure en cada línea el nombre y la cantidad total de letras. 
Ejemplo:
Luis, 4
Mateo,5
Maria,5 
HINT: utilice la función strip para eliminar el salto de línea. Ejemplo  linea=linea.strip('\n')

"""

def BusqBinaria(lista,buscar):
    izq=0
    der=len(lista)-1
    indice=-1
    while izq<=der:
        med=(izq+der)//2
        if lista[med]==buscar:
            indice=med
            break
        else:
            if buscar>lista[med]:
                izq=med+1
            else:
                der=med-1
    return indice


def Quicksort(lista):
    if len(lista)<=1:
        return lista
    else:
        pivot=lista[0]
        listaMa=[]
        listaIgu=[]
        listaMe=[]
        for i in range(0,len(lista)):
            if lista[i]>pivot:
                listaMa.append(lista[i])
            elif lista[i]<pivot:
                listaMe.append(lista[i])
            else:
                listaIgu.append(lista[i])
    listaMa=Quicksort(listaMa)
    listaMe=Quicksort(listaMe)
    return listaMe+listaIgu+listaMa


def main():
    
    archivo=open("nombres.txt","r")
    
    lista=[]
    for linea in archivo:
        lista.append(linea.strip("\n"))

    lista=Quicksort(lista)
    print(lista)
    
    nom=input("Ingresar nombre que desea buscar: ")
    if BusqBinaria(lista, nom)==-1:
        print("No se encontró")
    else:
        print("Se encontró")
    
    archivo2=open("salida.txt","w")
    
    for i in range(0,len(lista)):
        archivo2.write(lista[i]+","+str(len(lista[i]))+"\n")
    
    archivo2.close()
    
    archivo.close()
    
main()