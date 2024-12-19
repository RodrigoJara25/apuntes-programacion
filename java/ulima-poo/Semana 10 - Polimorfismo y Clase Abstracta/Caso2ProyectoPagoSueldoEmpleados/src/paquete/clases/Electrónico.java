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
public class Electrónico extends Empleado 
{
    //Atributos
    private int antiguedad;
    
    //Constructor
    public Electrónico(int antiguedad, String nombre, String direc, float sueldoB) 
    {
        super(nombre, direc, sueldoB);
        this.antiguedad = antiguedad;
    }
    
    //Implement Method
    @Override
    public void CalcularBonificacion() 
    {
        if (this.antiguedad<3) 
        {
            this.bonificacion = this.sueldoB * 0.005f;
        }
        else if (this.antiguedad<5) 
        {
            this.bonificacion = this.sueldoB * 0.05f;
        }
        else if (this.antiguedad<7) 
        {
            this.bonificacion = this.sueldoB * 0.07f;
        }
        else
        {
            this.bonificacion = this.sueldoB * 0.11f;   
        }
    }
    
    //Override

    @Override
    public String VerInfo() {
        return super.VerInfo()+
                "\nAntiguedad: " + this.antiguedad; 
    }
    
    
    
         
    
}
