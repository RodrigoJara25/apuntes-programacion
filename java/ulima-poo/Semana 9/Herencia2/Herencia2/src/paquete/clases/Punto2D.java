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
public class Punto2D 
{
    //Atributos
    protected double x;
    protected double y;
    
    //Constructor
    public Punto2D(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }

    public Punto2D() 
    {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    //Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //Métodos
    public double distanciaAlOrigen()
    {
        return Math.sqrt(x*x+y*y);
    }
    
    public String VerInfo()
    {
        return "Coordenada X: " + this.x +
               "Coordenad Y: " + this.y;
    }
    
    
    
    
    
}
