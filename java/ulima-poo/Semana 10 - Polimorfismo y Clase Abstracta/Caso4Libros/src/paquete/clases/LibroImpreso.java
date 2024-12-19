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
public class LibroImpreso extends Libro
{
    //Atributos
    private float ancho, largo, peso;
    
    private float area;
    
    //Constructor
    public LibroImpreso(float ancho, float largo, float peso, String titulo, float precio, Autor autor) 
    {
        super(titulo, precio, autor);
        this.ancho = ancho;
        this.largo = largo;
        this.peso = peso;
    }
    
    //Getters and setters
    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    //Métodos
    public void CalcularArea()
    {
        this.area = this.ancho * this.largo;
    }
    
    //Implement Method
    @Override
    public void CalcularPrecioVenta() 
    {
        this.precioVenta = this.precioUnit + this.area*0.5f + this.peso*5 + this.precioUnit*0.18f;
    }
    
    //Override
    @Override
    public String VerInfo() 
    {
        return super.VerInfo()+
                "\nÁrea: " + this.area + 
                "\nPrecio de Venta: " + this.precioVenta;
        
    }
    
    
    
    
    
    
    
}
