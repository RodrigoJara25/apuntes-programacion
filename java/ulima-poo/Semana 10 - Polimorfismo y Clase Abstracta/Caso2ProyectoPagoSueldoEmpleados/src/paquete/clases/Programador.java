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
public class Programador extends Empleado
{
    //Atributos
    private String especialidad;
    private int gradoPro;
    
    //Constructor
    public Programador(String especialidad, int gradoPro, String nombre, String direc, float sueldoB) 
    {
        super(nombre, direc, sueldoB);
        this.especialidad = especialidad;
        this.gradoPro = gradoPro;
    }
    
    //Implement Method
    @Override
    public void CalcularBonificacion() 
    {
        if (this.gradoPro==0)
        {
            this.bonificacion = 50;
        }
        else if (this.gradoPro==1) 
        {
            this.bonificacion = 100;
        }
        else if (this.gradoPro==2) 
        {
            this.bonificacion = 250;
        }
        else if (this.gradoPro==3) 
        {
            this.bonificacion = 500;
        }
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo()+
                "\nEspecialidad: " + this.especialidad+
                "\nGrado de profesión: " + this.gradoPro;
    }
}
