# -*- coding: utf-8 -*-
"""
5. Escriba un programa en Python donde el usuario ingrese un número de inicio, un 
número de fin y un incremento. Luego, con la información proporcionada, debe generar una 
secuencia de números y cargar una lista con los cuadrados de los números de dicha secuencia. 
Finalmente busque en la lista generada todos los valores en el intervalo [Inicio2, Fin2] que 
sean múltiplos de 3. Utilice búsqueda secuencial.
Ejemplo: 
Para Inicio = 10, Fin = 20, Incremento = 2.
La secuencia generada sería: 10, 12, 14, 16, 18, 20.
La lista generada (con los cuadrados) sería: [100, 144, 196, 256, 324, 400]
En el intervalo [100, 400], los siguientes valores múltiplos de 3 se encuentran 
en la lista: 144 y 324.

"""
def BusqSecuencial(lista):
    lista3=[]
    for i in range(0,len(lista)):
        if lista[i]%3==0:
            lista3.append(lista[i])
    return lista3


def main():
    
    inicio=int(input("Ingresar número de inicio: "))
    fin=int(input("Ingresar número de fin: "))
    incremento=int(input("Ingresar número de incremento: "))
    lista=[]
    for i in range(inicio,fin+1,incremento):
        lista.append(i**2)
    print(lista)
    print("multiplos de 3",BusqSecuencial(lista))
    
main()