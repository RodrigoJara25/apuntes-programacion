/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComposicionClases;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Fecha fechaNac = new Fecha(25,9,2004);
        System.out.println(fechaNac.VerInfo());
        
        Fecha fechaGra = new Fecha(12,12,2021);
        
        Persona persona1 = new Persona(71951873, "Rodrigo", fechaNac, fechaGra);
        
        System.out.println(persona1.VerInfo());
        
        //System.out.println(Persona.getIGV());
        
        Persona.getIGV();
    }
    
}
