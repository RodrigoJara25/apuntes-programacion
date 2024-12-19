/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.clases.*;
import paquete.gestion.Gestion;

/**
 *
 * @author Usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        //no se puede crear objetos de una clase abstracta
        //Empleado obj1 = new Empleado("nom1","gene1","cargo1",4,10,2500f)
        
        Director obj1 = new Director(20,"nom1","gene1","cargo1",4,10,2500f);
        obj1.CalcularBoni();
        obj1.CalcularSueldoTotal();
       //System.out.println(obj1.VerInfo());
        
        //no se puede hacer polimorfismo hacia los costados, solo hacia arriba o abajo
        //obj1 = new Ejecutivo(10,"nom1","gene1","cargo1",4,10,2500f);
        
        Ejecutivo obj2 = new Ejecutivo(10,"nom1","gene1","cargo1",4,10,2500f);
        obj2.CalcularBoni();
        obj2.CalcularSueldoTotal();
        //System.out.println(obj2.VerInfo());
        
        Ejecutivo obj3 = new Ejecutivo(25,"nom3","gene3","cargo3",4,10,2500f);
        obj3.CalcularBoni();
        obj3.CalcularSueldoTotal();
        
        Gestion refG = new Gestion();
        refG.Ingresar(obj1);
        refG.Ingresar(obj2);
        refG.Ingresar(obj3);
        
        System.out.println(refG.VerInfo());
        
        refG.EjecutivoMayorEntradaCine();
        
        refG.EmpleadoSueldoTotalMayor();
        
    }
    
}
