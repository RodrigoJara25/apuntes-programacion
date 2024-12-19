# -*- coding: utf-8 -*-
"""
2. Escriba un programa en Python que lea las notas de un grupo de estudiantes, 
muestre la mayor nota y luego llene una lista bajo el siguiente esquema:

“A” si la nota es >= (mayor nota – 2)
“B” si la nota es >= (mayor nota – 4)
“C” si la nota es >= (mayor nota – 6)
“D” si la nota es >= (mayor nota – 8)
“E” en otro caso

El programa debe solicitar el número de estudiantes y el usuario deberá ingresar 
cada nota hasta completar el número de estudiantes requerido. Finalmente, debe 
mostrar la lista con las calificaciones en letras.

"""

def main():
    
    n = int(input("Ingresar número de estudiantes: "))
    
    i = 0
    
    lista = []
    
    lista_notas = []
    
    while i < n:
        
        nota = int(input("Ingresar notas: "))
        
        lista.append(nota)
        
        i = i + 1
        
    mayor_nota = max(lista)    #max() es para calcular el máximo valor de algo
        
    for i in range(len(lista)):
        
        if lista[i] <= 2:
            
            lista_notas.append("A")
        
        elif lista[i] <= 4:
            
            lista_notas.append("B")
        
        elif lista[i] <= 6:
            
            lista_notas.append("C")
            
        elif lista[i] <= 8:
            
            lista_notas.append("D")
            
        else:
            
            lista_notas.append("E")
                  
    print("La mayor nota es", mayor_nota)
    
    print(lista)
    
    print(lista_notas)
    
main()