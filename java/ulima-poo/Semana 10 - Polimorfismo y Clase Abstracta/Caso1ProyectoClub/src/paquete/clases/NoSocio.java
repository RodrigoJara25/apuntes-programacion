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
public class NoSocio extends Persona 
{
    //Atributos
    private int numEntradas;
    
    //Constructor
    public NoSocio(int numEntradas, String nombre, int dni, float totalConsumido, String medioPago) 
    {
        super(nombre, dni, totalConsumido, medioPago);
        this.numEntradas = numEntradas;
    }
    
    //Getters and setters
    public int getNumEntradas() {
        return numEntradas;
    }

    public void setNumEntradas(int numEntradas) {
        this.numEntradas = numEntradas;
    }
    
    //Implement Method
    @Override
    public void CalcularTotalPagar() 
    {
        if (this.numEntradas==1) 
        {
            this.totalPagar = this.totalConsumido + 250;
        }
        else if (this.numEntradas>=2 && this.numEntradas<=6) 
        {
            this.totalPagar = this.totalConsumido + 150;
        }
        else
        {
            this.totalPagar = this.totalConsumido + 100;            
        }
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo()+
                "\nNum Entradas: " + this.numEntradas+
                "\nTotal a pagar: " + this.totalPagar; 
    }
    
}
