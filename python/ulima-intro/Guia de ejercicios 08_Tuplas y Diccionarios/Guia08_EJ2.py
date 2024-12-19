# -*- coding: utf-8 -*-
"""
2. Cartas como tuplas:

a. Proponga una representación con tuplas para las cartas de la baraja francesa. 
Observe que debe almacenar tanto el valor de la carta como el palo al que 
pertenece (corazones, rombos, tréboles o picas).

b. Escriba una función hay_poker que reciba cinco cartas de la baraja francesa 
(con la representación propuesta en la pregunta anterior) e informe si esas cartas 
forman o no un poker, es decir, si hay 4 cartas con el mismo número. 
Su función debe retornar True o False
"""
import random

def hay_poker(c,r,t,p):
    
    if c[random.randint(0, 12)]==r[random.randint(0, 12)]==t[random.randint(0, 12)]==p[random.randint(0, 12)]:
        
        print("Hay poker")
        
    else:
        
        print("No hay poker")


def main():
    
    c = (1,2,3,4,5,6,7,8,9,10,11,12,13)
    r = (1,2,3,4,5,6,7,8,9,10,11,12,13)
    t = (1,2,3,4,5,6,7,8,9,10,11,12,13)
    p = (1,2,3,4,5,6,7,8,9,10,11,12,13)
    
    hay_poker(c,r,t,p)
    
main()