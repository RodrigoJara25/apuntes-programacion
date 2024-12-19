# -*- coding: utf-8 -*-
"""
10. Genere una lista con los nombres de los asistentes a un evento 
(utilice la función. upper() para convertir el nombre en mayúsculas). 
Luego realice la búsqueda de un nombre ingresado como parámetro.
Si el nombre ingresado se encuentra en la lista de asistentes, muestre 
el mensaje “Estuvo en el evento”, en caso contrario muestre: “No estuvo 
en el evento”.

"""

def main():
    
    cant = int(input("Ingresar cantidad de asistentes: "))
    
    i = 0
     
    lista_asistentes = []
     
    while i < cant:
         
        nombre = input("Ingresar nombre: ")
        
        nombre_mayus = nombre.upper()
         
        lista_asistentes.append(nombre_mayus)
         
        i = i + 1
        
    buscador = input("Ingresar nombre que desea buscar: ")
    
    buscador_mayus = buscador.upper()
        
    #for i in range(len(lista_asistentes)):
        
    if buscador_mayus in lista_asistentes:
            
            print("Estuvo en el evento")
            
    else:
            
            print("No estuvo en el evento")    
    
main()