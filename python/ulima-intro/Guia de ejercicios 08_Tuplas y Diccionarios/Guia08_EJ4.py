# -*- coding: utf-8 -*-
"""
4. Escriba un programa que solicite el ingreso de las temperaturas de una semana 
(considere de Lunes a Domingo), y que luego del ingreso de datos seleccione e imprima 
la temperatura más baja – junto con el día en que se produjo, la temperatura más 
alta – junto con el día en que se produjo y la temperatura promedio de la semana.
"""

def main():
    
    
    temperaturas = {"Lunes":0, "Martes":0, "Miércoles":0, "Jueves":0, "Viernes":0, "Sábado":0, "Domingo":0}
    
    mayor = 0
    
    menor = 1000
    
    suma = 0
    
    for i in temperaturas:
        
        t = int(input("Ingresar temperatura el dia "+i+": "))
        
        temperaturas[i] = t
        
        if temperaturas[i] > mayor:
            mayor = temperaturas[i]
            diaMayor = i
            
        if temperaturas[i] < menor:
            menor = temperaturas[i]
            diaMenor = i
            
        suma = suma + t
        
        promedio = suma / 7
        
    print(temperaturas)
    
    print("La temperatura más alta fue",mayor,"en el dia",diaMayor)
    
    print("La temeperatura más baja fue",menor,"en el dia",diaMenor)
    
    print("la temepratura promedio de la semana fue",promedio)
    
    
main()