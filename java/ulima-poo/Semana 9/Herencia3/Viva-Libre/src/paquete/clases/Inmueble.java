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
public class Inmueble 
{
    //Atributos
    protected float precioFinal;
    protected float area;
    
    public static float totalRecaudado; //suma total de los inmbueles vendidos (acumulador)
    
    //Constructor
    public Inmueble(float area) 
    {
        this.area = area;
    }
    
    //Getters and Setters
    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    //Métodos
    public String VerInfo()
    {
        return "Precio Final: "+this.precioFinal+
                "\nÁrea: " + this.area;
    }
    
    
    
}
