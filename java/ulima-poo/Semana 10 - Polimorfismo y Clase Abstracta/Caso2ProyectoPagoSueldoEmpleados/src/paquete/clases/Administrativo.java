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
public class Administrativo extends Empleado
{
    //Atributos
    private String cargo;
    
    //Constructor
    public Administrativo(String cargo, String nombre, String direc, float sueldoB) 
    {
        super(nombre, direc, sueldoB);
        this.cargo = cargo;
    }
    
    //Implement Method
    @Override
    public void CalcularBonificacion() 
    {
        if (cargo.equalsIgnoreCase("Secretaria")) 
        {
            this.bonificacion = this.sueldoB*0 + 30;
        }
        else if (cargo.equalsIgnoreCase("Jefe de sección")) 
        {
            this.bonificacion = this.sueldoB*0.05f + 150;
        }
        else if (cargo.equalsIgnoreCase("Gerente")) 
        {
            this.bonificacion = this.sueldoB*0.1f + 300;
        }
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo()+
                "\nCargo: " + this.cargo; 
    }
    
    
    
    
    
    
    
}
