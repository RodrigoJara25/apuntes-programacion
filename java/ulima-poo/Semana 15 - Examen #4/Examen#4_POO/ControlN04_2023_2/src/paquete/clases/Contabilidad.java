/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Contabilidad extends Alumnos
{
    //Atrbutos
    
    //Constructor
    public Contabilidad(String code, String nombre, int edad) 
    {
        super(code, nombre, edad);
    }
    
    //Implement method
    @Override
    public void CalcularCreditos() 
    {
        Random rand = new Random();
        this.creditos = rand.nextInt(20-10+1)+10;
    }
    
    
}
