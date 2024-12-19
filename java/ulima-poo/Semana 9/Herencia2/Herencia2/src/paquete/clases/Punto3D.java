/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Usuario
 */
public class Punto3D extends Punto2D 
{
    //Atributos
    private double z;
    
    //Constructor
    public Punto3D() 
    {
        super();
        this.z = 0.0;
    }

    public Punto3D(double z, double x, double y) 
    {
        super(x, y);
        this.z = z;
    }
    
    //Métodos
    @Override
    public double distanciaAlOrigen() 
    {
        return Math.sqrt(x*x+y*y+z*z); 
    }

    @Override
    public String VerInfo() 
    {
        return super.VerInfo() + 
                "\nCoordenada Z: " + this.z; 
    }
}
