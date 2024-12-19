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
public abstract class Libro 
{
    //Atributos
    protected String titulo;
    protected float precioUnit;
    protected Autor autor;
    
    protected float precioVenta;
    
    //Constructor
    public Libro(String titulo, float precio, Autor autor) 
    {
        this.titulo = titulo;
        this.precioUnit = precio;
        this.autor = autor;
    }
    
    //Getters and setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(float precio) {
        this.precioUnit = precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    //Método Abstracto
    public abstract void CalcularPrecioVenta();
    
    //Método
    public String VerInfo()
    {
        return "Título: " + this.titulo +
               "\nDatos del Autor: " + this.autor.VerInfo(); 
        
    }

    
}
