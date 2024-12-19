# -*- coding: utf-8 -*-
"""
5. Escriba un programa que ayude a controlar el ingreso de empleados a una oficina. 
El programa debe tener ya cargados los apellidos de los empleados, y debe permitir que 
los empleados ingresen su código para registrar su ingreso. El programa se mantendrá aceptando 
códigos hasta que el Administrador del sistema ingrese un código maestro (7777), 
tras lo cual el programa imprimirá la lista de los empleados que no hayan registrado su ingreso.
"""

def main():
    
    empleados = {11:["Jara",0], 22:["Sovero",0], 33:["Ibañez",0]}
    
    code = int(input("Ingrese su código: "))
    
    while code != 7777:
        
        for i in empleados:
            
            if code == i:
                
                empleados[i][1]=1
            
        code = int(input("Ingrese su código: "))
    
    lista = []
    
    for i in empleados:
        
        if empleados[i][1]==0:
            
            lista.append(empleados[i][0])
            
    if len(lista) == 0:
                
                print("No hay faltas")
                
    else:
                
                print("Faltaron: ",lista)
    
main()