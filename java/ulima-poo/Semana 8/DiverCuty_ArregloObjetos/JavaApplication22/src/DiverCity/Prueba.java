/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiverCity;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Ciudadano obj1 = new Ciudadano(71951873, 19, "Rodrigo", "Jara Espinoza");
        //System.out.println(obj1.getDetalleC());
        Ciudadano obj2 = new Ciudadano(71951876, 29, "Gerson", "Jara Espinoza");
        //System.out.println(obj2.getDetalleC());
        Ciudadano obj3 = new Ciudadano(71951879, 11, "Salvador", "Jara Espinoza");
        //System.out.println(obj3.getDetalleC());
        Ciudadano obj4 = new Ciudadano(71951879, 11, "Salvador", "Jara Espinoza");
        
        DiverCity ref1 = new DiverCity("Lima");
        
        ref1.IngresarCiudadano(obj1);
        ref1.IngresarCiudadano(obj2);
        ref1.IngresarCiudadano(obj3);
        ref1.IngresarCiudadano(obj4);
        
        System.out.println(ref1.getDetalleTC());
        
        System.out.println("\nSorteo");
        
        ref1.Sorteo();
        
        
    }
    
}
