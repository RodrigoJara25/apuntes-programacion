# -*- coding: utf-8 -*-
"""
12. Implemente un programa que permita introducir dos números por teclado e 
imprimir los números que hay entre ellos comenzando por el más pequeño. Muestre 
cuántos números son, cuántos de ellos son pares y la suma de valores pares que 
hay en el grupo mencionado.
"""

def main():
    
    a = int(input("Ingresar número: "))
    b = int(input("Ingresar número: "))
    contador=0
    contador_par=0
    suma_par=0
    if a>b:
        diff=a-(a-1)+b
        while diff<a:
            print(diff)
            contador = contador +1
            if diff %2 == 0:
                contador_par= contador_par+1
                suma_par=suma_par+diff
            diff = diff +1
                
    else:
         diff=b-(b-1)+a
         while diff<b:
             print(diff) 
             contador=contador+1
             if diff %2 == 0:
                 contador_par= contador_par+1
                 suma_par=suma_par+diff
             diff = diff +1  
             
                 
    print("La cantidad de números entre",a,"y",b,"es:",contador)
    print("Numeros pares:",contador_par)
    print("Suma de pares:", suma_par)
    
main()