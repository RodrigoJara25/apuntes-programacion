/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.clases.*;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Departamento refD1 = new Departamento(250000,3,180);
        refD1.CalcularPrecioDepa();
        System.out.println(refD1.VerInfo());
        
        System.out.println("\n");
        
        Casa refC1 = new Casa(1500,180);
        refC1.CalcularPrecioCasa();
        System.out.println(refC1.VerInfo());
        
        System.out.println("\nTotal Recaudado: " + Inmueble.totalRecaudado);
        
    }
    
}
