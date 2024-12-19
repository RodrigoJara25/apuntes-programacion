/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;
import paquete.interfaz.Taller;

/**
 *
 * @author Usuario
 */
public class Construccion extends Alumnos implements Taller
{
    //atributos
    private int horasTaller;
    
    //Constructor
    public Construccion(String code, String nombre, int edad) 
    {
        super(code, nombre, edad);
    }
    
    //Getters and setters
    public int getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(int horasTaller) {
        this.horasTaller = horasTaller;
    }
    
    //Implement Method
    @Override
    public void CalcularCreditos() 
    {
        Random rand = new Random();
        this.creditos = rand.nextInt(24-12+1)+12;
        while(this.creditos%2 == 0)
        {
            this.creditos = rand.nextInt(24-12+1)+12;
        }
    }

    @Override
    public void CalcularHorasTaller() 
    {
        Random rand = new Random();
        this.horasTaller = rand.nextInt(58-36+1)+36;
        while(this.creditos%2 != 0)
        {
            this.creditos = rand.nextInt(58-36+1)+36;
        }
    }
    
    
    
}
