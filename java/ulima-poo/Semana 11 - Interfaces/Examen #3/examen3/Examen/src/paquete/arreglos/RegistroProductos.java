/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.arreglos;

import paquete.clases.*;

/**
 *
 * @author o22234
 */
public class RegistroProductos 
{
    //Atributos
    private Producto[] arreglo;
    private int contador;
    
    //Constructor
    public RegistroProductos() 
    {
        this.arreglo = new Producto[150];
        this.contador = 0;
    }
    
    //Método
    public void IngresarProductos(Producto ref)
    {
        if (contador < this.arreglo.length) 
        {
            if (ref.getStock()<400) 
            {
                this.arreglo[contador] = ref;
            }
            else
            {
                float stock = ref.getStock() + ref.getStock()*0.1f;
                ref.setStock((int) stock);
            }
        }
    }
    
    public void MayorStock()
    {
        float mayor = 0;
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.arreglo[i].getStock()>mayor) 
            {
                mayor = this.arreglo[i].getStock();
            }
        }
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.arreglo[i].getStock()==mayor) 
            {
                System.out.println("El producto con el mayor stock es: " + this.arreglo[i].VerInfo());
            }
        }
    }
    
    public String BuscarProducto(int code)
    {
        String cad = "";
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.arreglo[i].getCode()==code) 
            {
                cad = cad + "El producto que busca es \n" + this.arreglo[i].VerInfo();
            }
        }
        return cad;
    }
}
