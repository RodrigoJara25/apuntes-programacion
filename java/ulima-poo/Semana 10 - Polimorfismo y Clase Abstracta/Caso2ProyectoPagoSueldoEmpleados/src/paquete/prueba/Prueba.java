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
        Programador obj1 = new Programador("Programación en chips",3,"nombre1","direc1",1300.5f);
        obj1.CalcularBonificacion();
        obj1.CalcularSueldoTotal();
        
        Electrónico obj2 = new Electrónico(3,"nombre2","direc2",400);
        obj2.CalcularBonificacion();
        obj2.CalcularSueldoTotal();
        
        Administrativo obj3 = new Administrativo("Secretaria","nombre3","direc3",800); 
        obj3.CalcularBonificacion();
        obj3.CalcularSueldoTotal();
        
        System.out.println(obj1.VerInfo()+"\n");
        System.out.println(obj2.VerInfo()+"\n");
        System.out.println(obj3.VerInfo()+"\n");
    }
    
}
