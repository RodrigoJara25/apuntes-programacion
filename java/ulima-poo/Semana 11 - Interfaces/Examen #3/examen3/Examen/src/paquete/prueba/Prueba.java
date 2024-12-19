/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.arreglos.*;
import paquete.clases.*;

/**
 *
 * @author o22234
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Insumos obj1 = new Insumos("Si",3344,"nom1",2000);
        obj1.CalcularDiasManteniiento();
        obj1.CalcularPrecioVenta();
        obj1.CalcularStock();
        
        Utensilios obj2 = new Utensilios("03/11",2211,"nom2",3000);
        obj2.CalcularPrecioVenta();
        obj2.CalcularStock();
        
        Especies obj3 = new Especies(700,2311,"nom2",1000);
        obj3.CalcularPrecioVenta();
        obj3.CalcularStock();
        
        RegistroProductos refG = new RegistroProductos();
        
        refG.IngresarProductos(obj1);
        refG.IngresarProductos(obj2);
        refG.IngresarProductos(obj3);
        
        System.out.println(refG.BuscarProducto(3344));
        refG.MayorStock();
    }
    
    
    
}
