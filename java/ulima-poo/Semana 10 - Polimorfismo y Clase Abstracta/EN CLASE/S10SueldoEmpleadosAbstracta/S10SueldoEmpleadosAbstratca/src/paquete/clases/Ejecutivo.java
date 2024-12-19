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
public class Ejecutivo extends Empleado 
{
    //Atributos
    private int entradasCinemar;
    
    //Constructor
    public Ejecutivo(int entradasCinemar, String nombre, String genero, String cargo, int numGrados, int añosServ, float sueldoB) 
    {
        super(nombre, genero, cargo, numGrados, añosServ, sueldoB);
        this.entradasCinemar = entradasCinemar;
    }
    
    //Getters and setters
    public int getEntradasCinemar() {
        return entradasCinemar;
    }

    public void setEntradasCinemar(int entradasCinemar) {
        this.entradasCinemar = entradasCinemar;
    }
    
    //Implement Method
    @Override
    public void CalcularBoni() 
    {
        this.boni = this.sueldoB * 0.02f;
    }
    
    //Override
    @Override
    public String VerInfo() 
    {
        return super.VerInfo() + 
                "\nNum Entradas: " + this.entradasCinemar; 
    }
    
    
    
    
    
}
