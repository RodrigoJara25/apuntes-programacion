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
public class CPersona 
{
    //Atributos
    protected String nombre, dire, fechaNac;
    
    //Constructor
    public CPersona(String nombre, String dire, String fechaNac) {
        this.nombre = nombre;
        this.dire = dire;
        this.fechaNac = fechaNac;
    }

    //Método
    public String VerInfo() 
    {
        return "Nombre: " + nombre +
               "\nDire: " + dire + 
                "\nFecha Nac: " + fechaNac;
    }
    
    
    
    
}
