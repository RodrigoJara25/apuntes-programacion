# -*- coding: utf-8 -*-
"""
2. Escriba un programa en Python, que copie todo el contenido del archivo llamado 
“Archivo01.txt” a otro llamado “ArchivoCopia.txt”, de modo que quede exactamente igual.
"""



def main():
    
    archivo=open("Archivo01.txt","r")
    archivoCopia=open("ArchivoCopia.txt","w")
    
    for linea in archivo:
        archivoCopia.write(linea)
    
    
    archivoCopia.close()
    archivo.close()
    
main()