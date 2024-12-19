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
public class Gerente extends Empleado
{
    //Atributos
    private int valesConsumo;
    
    //Constructor
    public Gerente(int valesConsumo, String nombre, String genero, String cargo, int numGrados, int añosServ, float sueldoB) 
    {
        super(nombre, genero, cargo, numGrados, añosServ, sueldoB);
        this.valesConsumo = valesConsumo;
    }
    
    //Getters and setters
    public int getValesConsumo() {
        return valesConsumo;
    }

    public void setValesConsumo(int valesConsumo) {
        this.valesConsumo = valesConsumo;
    }
    
    //Implement Method
    @Override
    public void CalcularBoni() 
    {
        if (this.numGrados<=5) 
        {
            this.boni = 0.045f * this.sueldoB * this.numGrados;
        }
        else
        {
            this.boni = 0.045f * this.sueldoB * 5;
        }
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo()+
                "\nVales: " + this.valesConsumo; 
    }
    
    
    
    
    
}
