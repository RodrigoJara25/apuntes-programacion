/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author o22234
 */
public abstract class Producto 
{
    //Atributos
    protected int code;
    protected String nombre;
    protected int stock;
    protected float costo;
    
    protected float precioVenta;
    
    //Constructor
    public Producto(int code, String nombre, float costo) 
    {
        this.code = code;
        this.nombre = nombre;
        this.costo = costo;
    }
    
    //Getters and setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    //Método abstracto
    public abstract void CalcularStock();
    
    //Métodos
    public void CalcularPrecioVenta()
    {
        this.precioVenta = this.costo + this.costo*0.25f;
    }
    
    public String VerInfo()
    {
        return "Código: " + this.code+
                "\nNombre: " + this.nombre+
                "\nStock: " + this.stock+
                "\nCosto: " + this.costo;
    }
}
