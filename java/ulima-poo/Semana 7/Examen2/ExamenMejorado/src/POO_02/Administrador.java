/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_02;

/**
 *
 * @author Usuario
 */
public class Administrador 
{
    private String nombre;
    private String apellido;
    private int edad;

    public Administrador(String nombre, String apellido, int edad) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String VerInfo()
    {
        return "Datos del Administrador: \n"+
                "Nombre: " + this.nombre +
                "\nApellido: " + this.apellido+
                "\nEdad: " + this.edad;
    }
}
