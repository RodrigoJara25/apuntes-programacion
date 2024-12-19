# -*- coding: utf-8 -*-
"""
12. Los pedidos de una tienda se encuentran representados utilizando 2 
listas: P y C. La primera contiene el precio unitario en soles de cada uno 
de los productos y la segunda la cantidad de unidades que se solicitó. 
Implemente una función en Python que reciba ambas listas, muestre el subtotal 
por cada producto y retorne el monto total del pedido. Considere que los precios 
tienen incluido el impuesto.

Ejemplo:
P = [2.55, 8, 10.5]
C = [3, 2, 2]
Tendremos entonces, por ejemplo, que se adquirieron 3 unidades 
Producto 1 a 2.55 soles cada una.
El subtotal se obtendrá multiplicando los valores correspondientes en las listas P y C.

La función mostrará:
Subtotal producto 1: 5.1 soles
Subtotal producto 2: 16 soles
Subtotal producto 3: 21 soles

Adicionalmente, la función retornará 42.1.
"""


def tot(lista_precio, lista_producto, cant):
    
    #for i in range(0,cant):
    i = 0
    
    total = 0
    
    while i < cant:
        
         subtotal = lista_precio[i] * lista_producto[i]
         
         print("El subtotal del pedido", (i+1), "es:", subtotal)
         
         total = total + subtotal
         
         i = i + 1
    
    print("El monto final es:",total)
    


def main():
    
    cant = int(input("Ingresar la cantidad de pedidos: "))
    
    i=0
    
    lista_producto = []
    
    lista_precio = []
    
    while i < cant:
        producto = int(input("Ingresar la cantidad de unidades: "))
        lista_producto.append(producto)
        precio = int(input("Ingresar el precio por unidad: "))
        lista_precio.append(precio)
        i = i + 1
    
    print("precios:",lista_precio)
    print("cantidad de unidades:",lista_producto)
    
    tot(lista_precio, lista_producto, cant)
        
main()