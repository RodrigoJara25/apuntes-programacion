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
        CPersona a = new CPersona("nom1","dire1","fecha1");
        System.out.println(a.VerInfo());
        
        System.out.println("\n\n");
        
        //crear un objeto de tipo CDocente, pero con la misma variable de CPersona
        a = new CDocente(14,15,"nom2","dire2","fecha2"); //Se sobrescribe, eso es polimorfimso
        System.out.println(a.VerInfo());
        
        System.out.println("\n\n");
        
        //Polimorfismo (conversión implicita, de 5 datos a 6)
        a = new CDocenteNom(20, 14,15,"nom2","dire2","fecha2");
        System.out.println(a.VerInfo());
        
        
        
        float numero = 10.85f;
        int b = (int) numero; 
        
        //Conversión Explícita (pasa de un objeto de 6 atributos a uno de 5)
        CDocenteNom z = new CDocenteNom(20, 14,15,"nom2","dire2","fecha2");
        CDocente x = (CDocente)z;
        
        
        
        
        
        
        
        
    }
    
}
