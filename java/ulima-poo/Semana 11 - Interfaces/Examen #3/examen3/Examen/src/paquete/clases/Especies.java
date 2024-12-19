/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author o22234
 */
public class Especies extends Producto 
{
    //Atributos
    private float cantSodio;
    
    //Constructor
    public Especies(float cantSodio, int code, String nombre, float costo) 
    {
        super(code, nombre, costo);
        this.cantSodio = cantSodio;
    }
    
    //Getters and Setters
    public float getCantSodio() {
        return cantSodio;
    }

    public void setCantSodio(float cantSodio) {
        this.cantSodio = cantSodio;
    }
    
    //Implement Method
    @Override
    public void CalcularStock() 
    {
        Random rand = new Random();
        this.stock = rand.nextInt(750-350+1)+350;
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo()+
                "\nCantidad de Sodio: " + this.cantSodio; 
    }
    
    
    
    
    
    
    
}
