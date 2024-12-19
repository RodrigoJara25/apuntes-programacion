# -*- coding: utf-8 -*-
"""
3. Se desea preparar un programa que ayude a los alumnos de primaria a estudiar 
las capitales de los países de la región (Perú, Ecuador, Chile, Argentina, Brasil, 
Uruguay, Colombia, Paraguay y Venezuela).
El programa les debe mostrar un país y solicitar al alumno que ingrese la ciudad capital 
correspondiente. La operación deberá repetirse para todos los países.
Al finalizar el programa se debe indicar al alumno cuántos aciertos tuvo sobre el total. 
Observe que las respuestas correctas deben estar almacenadas en una estructura de datos 
adecuada que permita una búsqueda sencilla. Además, tome en cuenta que el alumno podría 
ingresar su respuesta totalmente en mayúsculas y el programa debe poder manejar estos casos.

"""


def main():
    
    dicci = {"Perú":"LIMA", "Argentina":"BUENOS AIRES", "Brasil":"BRASILIA"}
    
    correctas = 0
    
    for i in dicci:
        
        pregunta = input("Cuál es la capital de "+i+"? ")
        
        pregunta=pregunta.upper()
        
        if pregunta==dicci[i]:
            
            correctas = correctas + 1
        
    print("Has acertado",correctas,"capitales")
    
main()
