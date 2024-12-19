# -*- coding: utf-8 -*-
"""
3. Una tercera versión del algoritmo contempla lo siguiente:
def es_primo3(n):
    cont = 3
    res = True
    if(n != 2 and (n == 1 or n % 2 == 0)):
        res = False
    else:
        while(cont * cont <= n and res == True):
                if(n % cont == 0):                                
                    res = False
                cont += 2
    return res


Comente lo siguiente:
¿Qué modificaciones presenta este algoritmo respecto de los anteriores? ¿Considera que es más eficiente o menos eficiente?
Pruebe distintos valores según su preferencia y evalúe los tiempos de duración. 
¿Se comprueba su afirmación de la pregunta anterior?

"""

import time

def es_primo3(n):
    cont = 3
    res = True
    if(n != 2 and (n == 1 or n % 2 == 0)):
        res = False
    else:
        while(cont * cont <= n and res == True):
                if(n % cont == 0):                                
                    res = False
                cont += 2
    return res



def main():
    
    for i in range(10**5,10**6,10000):
        
        inicio = time.time()
        
        es_primo3(i)
        
        fin = time.time()
        
        print("Cuando i vale",i,"se demora", (fin-inicio)*1000)
        
main()