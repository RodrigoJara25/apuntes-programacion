# -*- coding: utf-8 -*-
"""
5. Escriba una función guardar_datos que reciba un diccionario y un nombre de archivo, 
y guarde el contenido del diccionario en un archivo con el nombre dado como parámetro. 
Cada elemento del diccionario deberá almacenarse en una línea del archivo, tomando en 
cuenta el formato “clave, valor” (separados por una coma).
"""


def main():
    
    nom_archivo=input("Ingresar nombre del archivo: ")
    archivo=open(nom_archivo+".txt","w")
    
    dicci={}
    cant=int(input("Ingresar cantidad de elementos del diccionario: "))
    for i in range(0,cant):
        key=input("Ingresar llave: ")
        valor=input("Ingresar valor: ")
        dicci.setdefault(key,valor)
    print(dicci)
    for i in dicci:
        archivo.write(i+","+dicci[i]+"\n")
        
    archivo.close()
    
main()