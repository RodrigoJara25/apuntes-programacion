/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiverCity;

/**
 *
 * @author Usuario
 */
public class Ciudadano 
{
    //Atributos
    private int cui;
    private int edad;
    private String nombres;
    private String apellidos;
    
    //Constructor
    public Ciudadano(int cui, int edad, String nombres, String apellidos) 
    {
        this.cui = cui;
        this.edad = edad;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    //Getters and setters
    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    //Métodos
    public String getDetalleC()
    {
        
        return "Cui: " + this.cui + "\nEdad: " + this.edad + "\nNombres: " + this.nombres + "\nApellidos: " + this.apellidos +"\n";
        
    }
    
}
