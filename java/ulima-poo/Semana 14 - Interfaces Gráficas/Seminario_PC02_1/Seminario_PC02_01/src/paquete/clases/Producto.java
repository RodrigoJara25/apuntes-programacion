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
public abstract class Producto 
{
    //Atributos
    protected String code;
    protected String descripcion;
    protected int montoMAX;
    
    //Constructor
    public Producto(String code, String descripcion) 
    {
        this.code = code;
        this.descripcion = descripcion;
    }
    
    //Getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMontoMAX() {
        return montoMAX;
    }

    public void setMontoMAX(int montoMAX) {
        this.montoMAX = montoMAX;
    }
    
    //Método abstracto
    public abstract void CalcularMontoMAX();
}
