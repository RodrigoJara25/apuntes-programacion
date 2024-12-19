/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploenclase;

/**
 *
 * @author Usuario
 */
public class Alumno 
{
    //Atributos
    private int codigo;
    private String nombre;
    private int edad;
    
    //Método Constructor
    public Alumno(int codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Alumno() 
    {
        this.codigo = 0;
        this.nombre = "";
        this.edad = 0;
    }
    
    

    //Setters and Getters
    
    
    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
    
}
