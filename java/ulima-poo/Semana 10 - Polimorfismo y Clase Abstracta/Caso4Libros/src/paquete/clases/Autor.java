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
public class Autor 
{
    //Atributos
    private String nombre;
    private String lugarNac;
    
    //Constructor
    public Autor(String nombre, String lugarNac) 
    {
        this.nombre = nombre;
        this.lugarNac = lugarNac;
    }
    
    //Getters and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }
    
    //Método
    public String VerInfo()
    {
        return "\n  Nombre: " + this.nombre+
               "\n  Lugar de Nacimiento: " + this.lugarNac;
        
    }
    
    
}
