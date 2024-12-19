/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComposicionClases;

/**
 *
 * @author Usuario
 */
public class Persona 
{
    //Atributos
    private int dni;
    private String nombre;
    
    private Fecha fechaNac; //referenciar otra clase
    private Fecha fechaGra; //referenciar otra clase
    
    private static final float IGV = 0.18f; //atributo fijo (el "static" no permite que se cree el IGV por cada objeto)
    
    //Constructor
    public Persona(int dni, String nombre, Fecha fechaNac, Fecha fechaGra) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.fechaGra = fechaGra;
    }
    
    //Getters and Setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Fecha getFechaGra() {
        return fechaGra;
    }

    public void setFechaGra(Fecha fechaGra) {
        this.fechaGra = fechaGra;
    }

    public static float getIGV() {
        return IGV;
    }
    
    //Método
    public String VerInfo() //puede tener el mismo nombre porque están en clases diferentes
    {
        return "DNI: " + this.dni + "\nNombre: " + this.nombre + "\nFecha Nacimiento: " + this.fechaNac.VerInfo() + "\nFecha Graduación: " + this.fechaGra.VerInfo() + "\nIGV: " + IGV;
    }
    
    
}
