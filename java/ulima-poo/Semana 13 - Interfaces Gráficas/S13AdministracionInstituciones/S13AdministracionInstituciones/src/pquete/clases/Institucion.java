/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pquete.clases;

/**
 *
 * @author Usuario
 */
public abstract class Institucion 
{
    protected int cod, cantAlum;
    protected String nombre, ubicacion;

    public Institucion(int cod, String nombre, String ubicacion) {
        this.cod = cod;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCantAlum() {
        return cantAlum;
    }

    public void setCantAlum(int cantAlum) {
        this.cantAlum = cantAlum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public abstract void CalcularCantAlum();
    
}
