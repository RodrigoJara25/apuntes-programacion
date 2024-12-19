/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosObjetos1;

/**
 *
 * @author Usuario
 */
public class Persona 
{
    private int dni;
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(int dni, String nombre, String direccion, String telefono) 
    {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String VerInfo()
    {
        return "DNI: " + dni + 
                "\nNombre: " + nombre + 
                "\nDirección: " + direccion + 
                "\nTeléfono: " + telefono;
    }
    
    
}
