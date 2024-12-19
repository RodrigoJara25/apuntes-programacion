/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Seguro extends Producto
{
    //Constructor
    public Seguro(String code, String descripcion) 
    {
        super(code, descripcion);
    }
    
    //Implement Method
    @Override
    public void CalcularMontoMAX() 
    {
        Random rand = new Random();
        
        this.montoMAX = (rand.nextInt(25-15+1)+15) * (rand.nextInt(69000-67000+1)+67000);
    }
}
