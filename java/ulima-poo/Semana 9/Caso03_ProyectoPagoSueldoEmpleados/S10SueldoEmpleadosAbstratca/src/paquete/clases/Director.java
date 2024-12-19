/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
Hasta que no se implemente el método abstracto, va a seguir saliendo error.
 */
public class Director extends Empleado
{
    private int numAcciones;

    public Director(int numAcciones, String nombre, String genero, String cargo, int numGrados, int añosServ, float sueldoB) 
    {
        super(nombre, genero, cargo, numGrados, añosServ, sueldoB);
        this.numAcciones = numAcciones;
    }

    public int getNumAcciones() {
        return numAcciones;
    }

    public void setNumAcciones(int numAcciones) {
        this.numAcciones = numAcciones;
    }
    
    //Implement Method 
    @Override
    public void CalcularBoni() 
    {
        int num5 = this.añosServ / 5; //se queda con la parte entera de la divisón
        this.boni = 0.035f * this.sueldoB * num5;
    }
    
    //Override
    @Override
    public String VerInfo() {
        return super.VerInfo()+
               "\nNum acciones: " + this.numAcciones ;     
    }
    
    
}
