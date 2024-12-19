# -*- coding: utf-8 -*-
"""
16. Implemente un programa que permita introducir los valores A, B y C y 
realice el cálculo de la expresión S. Muestre el resultado en pantalla.

Si A / B > 30
    S = (A / C) * B ^ 3
Si A / B <= 30
    S = 2 ^ 2 + 4 ^2 + 6 ^ 2 + … + 30 ^ 2

"""

def main():
    
    A = float(input("Ingrese un valor: "))
    
    B = float(input("Ingrese un valor: "))
    
    C = float(input("Ingrese un valor: "))
    
    S = 0
    
    i = 2
    
    if (A/B) > 30:
        
        S = (A / C) * (B**3)
        
    else:
        
        while i <= 30:
            
            S = S + i**2
            
            i = i + 2
            
    print("El resultado de la operación asignada es",S)
    
    
    
    
main()