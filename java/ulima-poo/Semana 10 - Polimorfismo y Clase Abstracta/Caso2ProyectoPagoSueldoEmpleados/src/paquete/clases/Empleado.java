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
public abstract class Empleado 
{
    //Atributos
    protected String nombre;
    protected String direc;
    protected float sueldoB;
    protected float bonificacion;
    protected float sueldoT;
    
    //Constructor
    public Empleado(String nombre, String direc, float sueldoB) 
    {
        this.nombre = nombre;
        this.direc = direc;
        this.sueldoB = sueldoB;
    }
    
    //Métodos 
    public void CalcularSueldoTotal()
    {
        this.sueldoT = this.sueldoB + this.bonificacion;
    }
    
    public String VerInfo()
    {
        return "Nombre: " + nombre +
                "\nDirección: " + direc +
                "\nSueldo Básico: " + sueldoB +
                "\nBonificación: " + bonificacion+
                "\nSueldo Total: " + sueldoT;
    }
    
    //Método abstracto
    public abstract void CalcularBonificacion();
}
