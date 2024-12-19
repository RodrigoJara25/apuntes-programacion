/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDeAlmacen;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        ControlAlmacen obj1 = new ControlAlmacen();
        
        obj1.NumAlmacenesProductos();
        
        obj1.CantProductosXAlm();
        
        obj1.CalcularTotalxAlmProd();
        
        System.out.println(obj1.VerInfo());
        
    }
    
}
