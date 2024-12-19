# -*- coding: utf-8 -*-
"""
9. Escriba un programa que trabaje en dos etapas. En la primera etapa solicitará el 
ingreso de los siguientes datos por cada alumno: código, nombre, apellido paterno, edad. 
Una vez que se haya ingresado los datos, se pasará a la segunda etapa, donde el programa 
permitirá mostrar los datos de un alumno solicitando solamente su código. Utilice una 
estructura de datos adecuada para facilitar las búsquedas.
"""

def main():
    
    alumnos=3
    
    dicci={}
    
    for i in range(0,alumnos):
        
        code = int(input("Ingresar código: "))
        nombre = input("Ingresar nombre: ")
        apellido = input("Ingresar apellido paterno: ")
        edad = int(input("Ingresar edad: "))
        
        tupla = (nombre, apellido, edad)
        
        dicci.setdefault(code,tupla)
    
    codigo = int(input("Ingrese código que desea buscar: "))
    
    for i in dicci:
        
        if codigo==i:
            
            print(dicci[i])
        
main()