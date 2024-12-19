/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author Evento
 */
public class CPersona 
{
    protected String nombre;
    protected String direccion;
    protected String fechaNac;
    protected int edad;
    protected int peso;

    public CPersona(String nombre, String direccion, String fechaNac) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public void CalcularEdad()
    {
        Random rand = new Random();
        this.edad = rand.nextInt(25-15+1)+15;
    }

    
    public String VerInfo() {
        return "Nombre: " + nombre + 
                "\nDireccion: " + direccion + 
                "\nFecha Nac: " + fechaNac + 
                "\nEdad: " + edad;
    }
    
    
    
}
