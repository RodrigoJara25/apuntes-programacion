# -*- coding: utf-8 -*-
"""
9.  Implemente una función en Python que reciba como entrada un número de 
segundos inferior a un millón y calcule su equivalente considerando días, 
horas, minutos y segundos. Tome en cuenta que: 
1 minuto = 60 segundos. 
1 hora = 60 minutos = 3600 segundos. 
1 día = 24 horas = 1440 minutos = 86400 segundos

"""
def segundos(seg):
    
    r = seg % 86400
    
    dias = (seg - r) / 86400
    
    #print("El número de días es:",dias)
    
    r1 = r % 3600
 
    horas = (r - r1)  / 3600
    
    #print("El número de horas es", horas)
    
    r2 = r1 % 60
    
    minutos = (r1 - r2) / 60
    
    #print("El número de minutos es", minutos)

    s = r2 % 60

    print ("El tiempo es igual a", dias, "dias,", horas,"horas,", minutos, "minutos,", s, "segundos.")


def main():
    
    seg = int(input("Ingresar segundos: "))
    
    if seg < 1000000000:
        
        segundos(seg)
    
main()