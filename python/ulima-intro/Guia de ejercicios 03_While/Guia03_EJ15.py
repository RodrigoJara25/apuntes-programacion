# -*- coding: utf-8 -*-
"""
15. Implemente un programa que permita introducir dos valores A y B y realice 
el cálculo de la expresión S. Muestre el resultado en pantalla.

Si A >= B
    S = 10 + 14 + 18 + … + 50
Si (A / B) <= 30
    S = A ^ 2 + B ^ 2

"""

def main():
    
    A = float(input("Ingresar un número: "))
              
    B = float(input("Ingresar un número: "))
    
    i = 10
    
    S = 0
    
    if A >= B:
        
        while i <= 18:
            
            S = S + i
            
            i = i + 4
            
        print(S)
    
    elif (A/B) <= 30:
        
        S = A**2 + B**2
        
        print(S)
        
    else:
        
        print("No hay operación asignada")
        
        
        
        
        
    
    
    
    
    
    
main()